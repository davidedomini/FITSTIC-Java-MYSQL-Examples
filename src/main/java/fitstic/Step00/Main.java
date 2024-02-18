package fitstic.Step00;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
                .getDeclaredConstructor()
                .newInstance();
            connection = DriverManager.getConnection(
                "jdbc:mysql://172.17.0.2:3306/university",
                "root",
                "root"
            );

            System.out.println("Connected!");
        } catch (Exception e){
            System.out.println("SQLException: " + e.getMessage());
        }

    }
}