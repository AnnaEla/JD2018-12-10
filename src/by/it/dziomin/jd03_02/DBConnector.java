package by.it.dziomin.jd03_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnector {

    private static Statement statement;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e);
        }
    }

    DBConnector() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:2016/dziomin" +
                            "?useUnicode=true&characterEncoding=UTF-8",
                    "root",
                    "");
            statement = connection.createStatement();


        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }


    public static Statement getStatement() {
        return statement;
    }

}
