package jdbc.introduction;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCIntroduction {
    private static Statement stmt = null;  //tworzone query nie są zabezpieczone przed SQL Injection
    private static Connection conn = Configuration.connectToDB();

    static {
        //Configuration.setupNewConnection();  //jednorazowo, tworzy plik xml z properties
    }


    public static void main(String[] args) {
        //connect to DB
        initializeStatement();

        //queries
        String newDatabase = "CREATE DATABASE IF NOT EXISTS jdbc_example;";
        executeAnyUpdate(newDatabase);
        String dropDatabase = "DROP DATABASE jdbc_example;";
        //executeAnyUpdate(dropDatabase);
        String createTable =
                "CREATE TABLE IF NOT EXISTS jdbc_example.Users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "first_name VARCHAR(16) NOT NULL," +
                "last_name VARCHAR(24) NOT NULL," +
                "age INT NOT NULL," +
                "language ENUM('PL','EN','FR','DE','ES'));";
        executeAnyUpdate(createTable);

        String recordsForDB =
                "INSERT INTO jdbc_example.Users (first_name, last_name, age, language)" +
                "VALUES ('Bob','Wood',22,'EN'), ('Anna','Colt',26,'PL'), ('Rob','Bold',33,'EN');";
        //executeAnyUpdate(recordsForDB);

        String displayTableContent = "SELECT * FROM jdbc_example.Users;";
        executeAndDisplayQuery(displayTableContent);


        //close connection
        Configuration.closeConnection();
    }

    public static void executeAndDisplayQuery(String statement) {
        ResultSet rs;
        try {
            rs = stmt.executeQuery(statement);
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " " +
                        rs.getString("last_name") + ", age: " +
                        rs.getInt("age") + ", language: " +
                        rs.getString("language"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void executeAnyUpdate(String statement) {
        try {
            stmt.executeUpdate(statement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void initializeStatement(){
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
