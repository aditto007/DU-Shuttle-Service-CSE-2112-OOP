package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Signin extends JFrame implements ActionListener {
    JTextField fillregno1;
    JPasswordField logpass1;
    JButton Signlogin1, signsignup, signback, fp;
    
    Signin() {
        setLayout(null);
        setTitle("SIGN IN PAGE");

        // Background Image
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("photoes/bg.jpg"));
        Image bgImage = bgIcon.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
        ImageIcon bgScaledIcon = new ImageIcon(bgImage);
        JLabel background = new JLabel(bgScaledIcon);
        background.setBounds(0, 0, 800, 480);
        add(background);

        JLabel text = new JLabel("Log In To Your Account ");
        text.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        text.setForeground(Color.WHITE); // Changed text color to white
        text.setBounds(270, 10, 400, 70);
        background.add(text);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(600, 10, 200, 100);
        background.add(logo);

        JLabel fillregno = new JLabel("Registration No  ");
        fillregno.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        fillregno.setForeground(Color.WHITE);
        fillregno.setBounds(40, 100, 300, 30);
        background.add(fillregno);
        
        fillregno1 = new JTextField();
        fillregno1.setFont(new Font("Raleway", Font.BOLD, 18));
        fillregno1.setBounds(210, 100, 400, 30);
        fillregno1.addActionListener((ActionEvent e) -> logpass1.requestFocus());
        background.add(fillregno1);

        JLabel password = new JLabel("Enter Password ");
        password.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        password.setForeground(Color.WHITE);
        password.setBounds(40, 150, 300, 30);
        background.add(password);

        logpass1 = new JPasswordField();
        logpass1.setFont(new Font("Raleway", Font.BOLD, 18));
        logpass1.setBounds(210, 150, 400, 30);
        logpass1.addActionListener((ActionEvent e) -> Signlogin1.doClick());
        background.add(logpass1);

        JLabel signupto = new JLabel("Don't have any account? Click the Sign Up Button");
        signupto.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        signupto.setForeground(Color.WHITE);
        signupto.setBounds(40, 250, 600, 30);
        background.add(signupto);

        Signlogin1 = new JButton("LOG IN");
        Signlogin1.setBounds(600, 350, 150, 60);
        Signlogin1.setBackground(Color.BLACK);
        Signlogin1.setForeground(Color.WHITE);
        Signlogin1.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        Signlogin1.addActionListener(this);
        background.add(Signlogin1);

        signsignup = new JButton("SIGN UP");
        signsignup.setBackground(Color.BLACK);
        signsignup.setForeground(Color.WHITE);
        signsignup.setBounds(350, 350, 150, 60);
        signsignup.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        signsignup.addActionListener(this);
        background.add(signsignup);

        signback = new JButton("BACK");
        signback.setBackground(Color.BLACK);
        signback.setForeground(Color.WHITE);
        signback.setBounds(80, 350, 150, 60);
        signback.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        signback.addActionListener(this);
        background.add(signback);

        fp = new JButton("Forgot Password?");
        fp.setBackground(Color.BLACK);
        fp.setForeground(Color.WHITE);
        fp.setBounds(400, 200, 200, 30);
        fp.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        fp.addActionListener(this);
        background.add(fp);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Signlogin1) {
            Conn conn = new Conn();
            String regnoo = fillregno1.getText();
            String passwordd = new String(logpass1.getPassword());
            String query2 = "select * from createanaccout1 where regno = '" + regnoo + "' and password = '" + passwordd + "'";

            try {
                ResultSet rs = conn.s.executeQuery(query2);
                if (rs.next()) {
                    setVisible(false);
                    new Profile(regnoo).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Registration Number Or Password");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == signsignup) {
            setVisible(false);
            new Signup().setVisible(true);
        } else if (ae.getSource() == signback) {
            setVisible(false);
            new Startpage().setVisible(true);
        } else if (ae.getSource() == fp) {
            setVisible(false);
            new ForgotPassword().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Signin();
    }
}


