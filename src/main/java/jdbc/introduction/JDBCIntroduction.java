package jdbc.introduction;


import java.sql.Connection;
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
        executeAnyUpdate(dropDatabase);


        //close connection
        Configuration.closeConnection();
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
