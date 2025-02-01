package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener {
    JTextField regnoField, mobileField;
    JPasswordField newPasswordField, confirmPasswordField;
    JButton submitButton, backButton;

    ForgotPassword() {
        setTitle("Forgot Password");
        setLayout(null);

        JLabel title = new JLabel("Reset Your Password");
        title.setFont(new Font("Eras Bold ITC", Font.BOLD, 24));
        title.setBounds(220, 20, 400, 30);
        add(title);

        JLabel regnoLabel = new JLabel("Registration Number:");
        regnoLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        regnoLabel.setBounds(50, 80, 200, 30);
        add(regnoLabel);
        regnoField = new JTextField();
        regnoField.setBounds(250, 80, 300, 30);
        regnoField.addActionListener(e -> mobileField.requestFocus());
        add(regnoField);

        JLabel mobileLabel = new JLabel("Mobile Number:");
        mobileLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        mobileLabel.setBounds(50, 130, 200, 30);
        add(mobileLabel);
        mobileField = new JTextField();
        mobileField.setBounds(250, 130, 300, 30);
        mobileField.addActionListener(e -> newPasswordField.requestFocus());
        add(mobileField);

        JLabel newPasswordLabel = new JLabel("New Password:");
        newPasswordLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        newPasswordLabel.setBounds(50, 180, 200, 30);
        add(newPasswordLabel);
        newPasswordField = new JPasswordField();
        newPasswordField.setBounds(250, 180, 300, 30);
        newPasswordField.addActionListener(e -> confirmPasswordField.requestFocus());
        add(newPasswordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        confirmPasswordLabel.setBounds(50, 230, 200, 30);
        add(confirmPasswordLabel);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(250, 230, 300, 30);
        confirmPasswordField.addActionListener(e -> submitButton.doClick());
        add(confirmPasswordField);

        submitButton = new JButton("Reset Password");
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.setBounds(250, 280, 150, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        backButton = new JButton("Back");
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(420, 280, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(650, 400);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            setVisible(false);
            new Signin().setVisible(true);
        } else if (ae.getSource() == submitButton) {
            String regno = regnoField.getText();
            String mobile = mobileField.getText();
            String newPassword = new String(newPasswordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (regno.equals("") || mobile.equals("")) {
                JOptionPane.showMessageDialog(null, "Registration Number and Mobile Number are required");
                return;
            }
            if (!newPassword.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match");
                return;
            }
            try {
                Conn c = new Conn();
                String query = "SELECT * FROM createanaccout1 WHERE regno='" + regno + "' AND mobileno='" + mobile + "'";
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    String updateQuery = "UPDATE createanaccout1 SET password='" + newPassword + "' WHERE regno='" + regno + "'";
                    c.s.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "Password Reset Successfully");
                    setVisible(false);
                    new Signin().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Registration Number or Mobile Number");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ForgotPassword();
    }
}

