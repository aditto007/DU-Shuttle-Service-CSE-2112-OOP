package du.shuttle.service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startpage extends JFrame implements ActionListener, Runnable {
    JButton login1, login2, login3;

    Startpage() {
        setLayout(null);
        setTitle("DU SHUTTLE SERVICE");

        // Load background image
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("photoes/bg.jpg"));
        Image bgImage = bgIcon.getImage().getScaledInstance(1000, 680, Image.SCALE_DEFAULT);
        ImageIcon bgScaledIcon = new ImageIcon(bgImage);
        
        JLabel background = new JLabel(bgScaledIcon);
        background.setBounds(0, 0, 1000, 680);
        add(background);

        // DU Shuttle Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("photoes/icon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(new ImageIcon(i2));
        label.setBounds(420, 70, 150, 150);
        background.add(label);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("photoes/2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(180, 130, Image.SCALE_DEFAULT);
        JLabel label1 = new JLabel(new ImageIcon(i5));
        label1.setBounds(800, 20, 180, 130);
        background.add(label1);

        JLabel text = new JLabel("Welcome To DU SHUTTLE SERVICE");
        text.setFont(new Font("Eras Bold ITC", Font.BOLD, 28));
        text.setForeground(Color.WHITE);
        text.setBounds(230, 150, 600, 200);
        background.add(text);

        login1 = new JButton("SIGN IN");
        login1.setBounds(350, 310, 300, 60);
        login1.setBackground(Color.BLACK);
        login1.setForeground(Color.WHITE);
        login1.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        login1.addActionListener(this);
        background.add(login1);

        login2 = new JButton("CREATE ACCOUNT");
        login2.setBounds(350, 380, 300, 60);
        login2.setBackground(Color.BLACK);
        login2.setForeground(Color.WHITE);
        login2.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        login2.addActionListener(this);
        background.add(login2);

        login3 = new JButton("AS A GUEST");
        login3.setBounds(350, 450, 300, 60);
        login3.setBackground(Color.BLACK);
        login3.setForeground(Color.WHITE);
        login3.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        login3.addActionListener(this);
        background.add(login3);

        setSize(1000, 680);
        setLocation(300, 100);
        setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login1) {
            setVisible(false);
            new Signin().setVisible(true);
        } else if (ae.getSource() == login2) {
            setVisible(false);
            new Signup().setVisible(true);
        } else if (ae.getSource() == login3) {
            setVisible(false);
            new Guest().setVisible(true);
        }
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Background thread running...");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Startpage();
    }
}

