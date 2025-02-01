package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class BaseScreen extends JFrame implements ActionListener {
    String regnoo;
    
    BaseScreen(String regnoo) {
        this.regnoo = regnoo;
        setLayout(null);
        setTitle("DU SHUTTLE SERVICE");
    }
    
    protected void styleButton(JButton button) {
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        button.addActionListener(this);
    }

    protected void styleSmallButton(JButton button) {
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Eras Bold ITC", Font.BOLD, 12));
        button.addActionListener(this);
    }
}

public class Profile extends BaseScreen {
    JButton pay, recharge, checkbal, routedet, exit, ecall, cs, logout, cbot;

    Profile(String regnoo) {
        super(regnoo);
        
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("photoes/bg.jpg"));
        Image bgImage = bgIcon.getImage().getScaledInstance(700, 550, Image.SCALE_DEFAULT);
        JLabel background = new JLabel(new ImageIcon(bgImage));
        background.setBounds(0, 0, 700, 550);
        add(background);

        JLabel text = new JLabel("Welcome! You are logged in.");
        text.setFont(new Font("Eras Bold ITC", Font.BOLD, 25));
        text.setForeground(Color.WHITE);
        text.setBounds(170, 10, 400, 70);
        background.add(text);

        pay = new JButton("MAKE PAYMENT");
        pay.setBounds(200, 70, 300, 50);
        styleButton(pay);
        background.add(pay);

        recharge = new JButton("ADD MONEY");
        recharge.setBounds(200, 130, 300, 50);
        styleButton(recharge);
        background.add(recharge);

        checkbal = new JButton("CHECK BALANCE");
        checkbal.setBounds(200, 190, 300, 50);
        styleButton(checkbal);
        background.add(checkbal);

        routedet = new JButton("ROUTE DETAILS");
        routedet.setBounds(200, 250, 300, 50);
        styleButton(routedet);
        background.add(routedet);

        ecall = new JButton("Emergency Call");
        ecall.setBounds(200, 310, 300, 50);
        styleButton(ecall);
        background.add(ecall);

        cs = new JButton("Complain/Suggestion");
        cs.setBounds(200, 370, 300, 50);
        styleButton(cs);
        background.add(cs);

        exit = new JButton("EXIT");
        exit.setBounds(470, 450, 100, 30);
        styleSmallButton(exit);
        background.add(exit);

        logout = new JButton("Log Out");
        logout.setBounds(130, 450, 100, 30);
        styleSmallButton(logout);
        background.add(logout);

        cbot = new JButton("QuickBot");
        cbot.setBounds(300, 450, 100, 30);
        styleSmallButton(cbot);
        background.add(cbot);

        setSize(700, 550);
        setVisible(true);
        setLocation(450, 150);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == recharge) {
            setVisible(false);
            new Addmoney(regnoo).setVisible(true);
        } else if (ae.getSource() == pay) {
            setVisible(false);
            new Payment(regnoo).setVisible(true);
        } else if (ae.getSource() == checkbal) {
            setVisible(false);
            new Balancecheck(regnoo).setVisible(true);
        } else if (ae.getSource() == routedet) {
            setVisible(false);
            new Rsrouteid(regnoo).setVisible(true);
        } else if (ae.getSource() == ecall) {
            setVisible(false);
            new Emergencycall(regnoo).setVisible(true);
        } else if (ae.getSource() == cs) {
            setVisible(false);
            new ComplainSuggestion(regnoo).setVisible(true);
        } else if (ae.getSource() == logout) {
            setVisible(false);
            new Startpage().setVisible(true);
        } else if (ae.getSource() == cbot) {
            setVisible(false);
            new Quickbotid(regnoo).setVisible(true);
        } else if (ae.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Profile("");
    }
}
