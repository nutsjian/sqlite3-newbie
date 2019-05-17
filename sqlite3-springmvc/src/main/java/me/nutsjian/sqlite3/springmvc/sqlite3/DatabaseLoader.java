package me.nutsjian.sqlite3.springmvc.sqlite3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseLoader {

    public synchronized static void load(String name, String dbPath) throws SQLite3LoadException {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);

            System.out.println("123");
        } catch (Exception e) {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    throw new SQLite3LoadException(ex);
                }
            }
            throw new SQLite3LoadException(e);
        }
    }

}
