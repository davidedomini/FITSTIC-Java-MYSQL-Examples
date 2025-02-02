package fitstic.Step02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args){
        Connection connection = null;
        String query = "INSERT INTO Students(Name) VALUES ('Giacomo')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
                    .getDeclaredConstructor()
                    .newInstance();

            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/university",
                    "root",
                    "FITSTIC"
            );

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Query executed!");
            connection.close();
        } catch (Exception e){
            System.out.println("SQLException: " + e.getMessage());
        }

    }
}
