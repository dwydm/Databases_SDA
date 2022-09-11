package jdbc.introduction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Configuration {
/*
    //Connection and saving to xml file
    private static final String DB_URL = "jdbc:mysql://localhost:3306/?useSSL=false";
    private static String propertiesFile = "src/main/resources/jdbc_properties.xml";
    private static Properties jdbcProps = new Properties();
    private static Connection conn = null;

    //Properties setup
    private static void setProperties() {
        jdbcProps.put("user","root");
        jdbcProps.put("password","root");
        jdbcProps.put("serverTimezone","CET");
    }

    //Saving and loading properties from xml file
    private static void savePropertiesToFile() {
        try {
            jdbcProps.storeToXML(new FileOutputStream(propertiesFile),"JDBC Properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void loadPropertiesFromFile() {
        try {
            jdbcProps.loadFromXML(new FileInputStream(propertiesFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Connecting with DB
    private static void setDBConnection() {
        loadPropertiesFromFile();
        try {
            conn = DriverManager.getConnection(DB_URL,jdbcProps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setupNewConnection() {
        setProperties();
        savePropertiesToFile();
    }

    public static Connection connectToDB() {
        if(conn != null) {
            return conn;
        }
        setDBConnection();
        return conn;
    }

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
*/

}
