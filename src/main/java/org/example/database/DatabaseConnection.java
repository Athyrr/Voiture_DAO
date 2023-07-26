package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton Connection
public class DatabaseConnection {
    private static Connection connection = null;

    public static Connection getConnection(){
        if (connection==null){
            initConnection();
        }
        return connection;
    }

    private static void initConnection() {
        String url = "jdbc:sqlite:src/main/java/org/example/database/database.db";
        String user = "";
        String password = "";

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("erreur de connection à la base donnée" + e);
        }
    }



}
