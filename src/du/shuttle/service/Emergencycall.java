package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Emergencycall extends JFrame implements ActionListener {
    JButton callproctor, callambulance,backg;
    String regnoo;

    Emergencycall(String regnoo) {
        this.regnoo=regnoo;

        setLayout(null);
        setTitle("Emergency Call");

        JLabel text = new JLabel("<html>DU Proctorial Team<br> Mobile number - +88-09666911463");
        text.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        text.setBounds(100, 30, 400, 60);
        add(text);

        callproctor = new JButton("CALL PROCTOR");
        callproctor.setBounds(200, 100, 200, 50); 
        callproctor.setBackground(Color.BLACK);
        callproctor.setForeground(Color.WHITE);
        callproctor.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        callproctor.addActionListener(this);
        add(callproctor);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("photoes/7.jpg"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel label1 = new JLabel(i6);
        label1.setBounds(130,100,50, 50);
        add(label1);
        
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(500,5, 70,70 );
        add(logo);

        JLabel text2 = new JLabel("<html>DMC Ambulance <br>mobile no - 01919-339689</html>");
        text2.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        text2.setBounds(100, 160, 400, 60); // Adjusted bounds for proper spacing
        add(text2);

        callambulance = new JButton("CALL AMBULANCE");
        callambulance.setBounds(200, 230, 200, 50);
        callambulance.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        callambulance.setBackground(Color.BLACK);
        callambulance.setForeground(Color.WHITE);
        callambulance.addActionListener(this);
        add(callambulance);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("photoes/6.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(50,150,150, 150);
        add(label);
        
        backg = new JButton("Back");
        backg.setBackground(Color.BLACK);
        backg.setForeground(Color.WHITE);
        backg.setBounds(50,300,80, 30);
        backg.addActionListener(this);
        add(backg);

        getContentPane().setBackground(Color.WHITE);

        setSize(600, 380);
        setLocation(550, 200); // Set window location
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == callproctor) {
            // proctor
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://web.whatsapp.com"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == callambulance) {
           
            // Ambulance
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://web.whatsapp.com/"));
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
        new Emergencycall("");
    }
}
