package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Balancecheck extends JFrame implements ActionListener {
    JButton back;
    String regnoo;

    Balancecheck(String regnoo) {
        this.regnoo = regnoo;
        setLayout(null);
        setTitle("DU SHUTTLE SERVICE");

        Conn c5 = new Conn();
        int balance = 0;
        int lastadd=0;
        int lastpay=0;
        
        try {
            ResultSet rs = c5.s.executeQuery("SELECT * FROM bank WHERE regno='" + regnoo + "' ");

            while (rs.next()) {
                String type = rs.getString("type");
                String amount = rs.getString("amount");
                String date = rs.getString("date");

                if (type.equals("add")) {
                    lastadd=Integer.parseInt(amount);
                    balance += Integer.parseInt(amount);  // Update balance with added money
                }                
                if (type.equals("min")) {
                    lastpay=Integer.parseInt(amount);
                    balance -= Integer.parseInt(amount);  // Update balance with ticket payment
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // Display current balance
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(570, 10, 100, 70);
        add(logo);
        ImageIcon t1=new ImageIcon(ClassLoader.getSystemResource("photoes/tk.png"));
        Image t2 = t1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon t3=new ImageIcon(t2);
        JLabel tk = new JLabel(t3);
        tk.setBounds(335, 60, 30, 30);
        add(tk);
        
        
        
        JLabel text1 = new JLabel("Balance");
        text1.setFont(new Font("Eras Bold ITC", Font.BOLD, 25));
        text1.setBounds(300, 30, 200, 30);
        add(text1);
        JLabel text = new JLabel("Your Current Account Balance: Tk " + balance);
        text.setFont(new Font("Eras Bold ITC", Font.BOLD, 25));
        text.setBounds(110, 120, 600, 30);
        add(text);

        // Display last added money transaction
        JLabel lastAddedMoneyLabel = new JLabel("Your last added Balance: Tk " + lastadd);
        lastAddedMoneyLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        lastAddedMoneyLabel.setBounds(180, 180, 600, 30);
        add(lastAddedMoneyLabel);

        // Display last ticket payment transaction
        JLabel lastTicketPaymentLabel = new JLabel("Your last paid Balance: Tk " + lastpay);
        lastTicketPaymentLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        lastTicketPaymentLabel.setBounds(180, 220, 600, 30);
        add(lastTicketPaymentLabel);

       
        back = new JButton("BACK");
        back.setBounds(300, 270, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        
        getContentPane().setBackground(Color.WHITE);
        setSize(700, 350);
        setVisible(true);
        setLocation(450, 200);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Profile(regnoo).setVisible(true);  
        }
    }

    public static void main(String[] args) {
        new Balancecheck("");  
    }
}


