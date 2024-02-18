package fitstic.Step01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleQuery {

    public static void main(String[] args){
        Connection connection = null;
        String query = "SELECT Name FROM Students";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver")
                    .getDeclaredConstructor()
                    .newInstance();

            connection = DriverManager.getConnection(
                    "jdbc:mysql://172.17.0.2:3306/university",
                    "root",
                    "root"
            );

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }

            connection.close();
        } catch (Exception e){
            System.out.println("SQLException: " + e.getMessage());
        }

    }

}
