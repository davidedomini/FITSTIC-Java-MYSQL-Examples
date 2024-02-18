package fitstic.Step03.View;

import fitstic.Step03.Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

    private JTextField name;
    private JTextField surname;
    private JTextField email;
    private JButton signupButton;
    private Controller controller;

    public GUI(Controller controller){
        this.controller = controller;

        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2));

        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);
        name = new JTextField();
        panel.add(name);

        JLabel surnameLabel = new JLabel("Surname:");
        panel.add(surnameLabel);
        surname = new JTextField();
        panel.add(surname);

        JLabel emailLabel = new JLabel("Email:");
        panel.add(emailLabel);
        email = new JTextField();
        panel.add(email);

        signupButton = new JButton("Signup");
        signupButton.addActionListener(e -> {
            String nameText = name.getText();
            String surnameText = surname.getText();
            String emailText = email.getText();
            controller.signupNewUser(nameText, surnameText, emailText);
        });
        panel.add(signupButton);

        add(panel);
        setVisible(true);
    }
}
