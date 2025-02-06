package fitstic.Step03.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Controller {

    public void signupNewUser(String name, String surname, String email){
        Connection connection = null;
        String query = createQuery(name, surname, email);

        System.out.println(query);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver")
                    .getDeclaredConstructor()
                    .newInstance();

            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/university",
                    "root",
                    "root"
            );

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Query executed!");
            connection.close();
        } catch (Exception e){
            System.out.println("SQLException: " + e.getMessage());
        }
    }

    private String createQuery(String name, String surname, String email) {
        return  "INSERT INTO Teachers(Name, Surname, Email) VALUES (" +
                "'" + name + "'" + ", " +
                "'" + surname + "'" + ", " +
                "'" + email + "'" +
                ")";
    }

}
