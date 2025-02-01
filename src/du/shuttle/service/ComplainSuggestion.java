package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ComplainSuggestion extends JFrame implements ActionListener {
    JButton complainGmail, complainFacebook, complainAnonymous,backg;
    String regnoo;

    ComplainSuggestion(String regnoo) {
        
        this.regnoo=regnoo;
        setLayout(null);
        setTitle("Complain and Suggestion");

        // description
        JLabel description = new JLabel("<html>Send your complaints and suggestions to us.<br>Please choose your preferred method.</html>");
        description.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        description.setBounds(50, 20, 500, 60); // Adjust bounds for visibility and spacing
        add(description);
        
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(550,5, 70,70 );
        add(logo);
        
        // Button for Gmail
        complainGmail = new JButton("COMPLAIN VIA GMAIL");
        complainGmail.setBounds(150, 110, 300, 50); // Position the button
        complainGmail.setBackground(Color.BLACK);
        complainGmail.setForeground(Color.WHITE);
        complainGmail.setFont(new Font("Eras Bold ITC", Font.BOLD, 17));
        complainGmail.addActionListener(this);
        add(complainGmail);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("photoes/8.png"));
        Image i2 = i1.getImage().getScaledInstance(80,40, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(450,110,80,40);
        add(label);
        
        // Button for Facebook
        complainFacebook = new JButton("COMPLAIN VIA FACEBOOK");
        complainFacebook.setBounds(150, 170, 300, 50); // Position the button
        complainFacebook.setBackground(Color.BLACK);
        complainFacebook.setForeground(Color.WHITE);
        complainFacebook.setFont(new Font("Eras Bold ITC", Font.BOLD, 17));
        complainFacebook.addActionListener(this);
        add(complainFacebook);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("photoes/fb.png"));
        Image i5 = i4.getImage().getScaledInstance(80,40, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel label1= new JLabel(i6);
        label1.setBounds(450,170,80,40);
        add(label1);
        
        // Button for ano
        complainAnonymous = new JButton("COMPLAIN ANONYMOUSLY");
        complainAnonymous.setBounds(150, 230, 300, 50); // Position the button
        complainAnonymous.setBackground(Color.BLACK);
        complainAnonymous.setForeground(Color.WHITE);
        complainAnonymous.setFont(new Font("Eras Bold ITC", Font.BOLD, 17));
        complainAnonymous.addActionListener(this);
        add(complainAnonymous);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("photoes/ano.jpg"));
        Image i8 = i7.getImage().getScaledInstance(80,40, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel label2= new JLabel(i9);
        label2.setBounds(450,230,80,40);
        add(label2);
        
        backg = new JButton("Back");
        backg.setBackground(Color.BLACK);
        backg.setForeground(Color.WHITE);
        backg.setBounds(50,300,80, 30);
        backg.addActionListener(this);
        add(backg);
        

        getContentPane().setBackground(Color.WHITE);

        setSize(640, 380);
        setLocation(500, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == complainGmail) {
            setVisible(false);
            // Opening Gmail
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://mail.google.com/mail/u/0/#inbox?compose=jrjtXPWjlLwdJvMbXRscqDRpbhfLskPDvXcJhpMLpJmzvmJbkGkklMHcgvXvpcxWNjsXKNfj"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == complainFacebook) {
            setVisible(false);
            // Opening Facebook page
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://www.facebook.com/univdhaka.ac.bd?rdid=VZMUO8hIHRU4Adsz&share_url=https%3A%2F%2Fwww.facebook.com%2Fshare%2F1BMp3Suxis%2F#"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == complainAnonymous) {
            setVisible(false);
            // Opening a page for anonymous complaints 
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://docs.customer.io/journeys/anonymous-in-app/"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==backg){
            setVisible(false);
            new Profile(regnoo).setVisible(true);
        }
        
    }

    public static void main(String[] args) {
        // Run the application
        new ComplainSuggestion("");
    }
}
