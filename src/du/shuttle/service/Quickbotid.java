package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Quickbotid extends JFrame implements ActionListener {
    JButton ShuttleTimings, AreaCoverage, PaymentInfo, PetPolicy, WifiFacilities, CustomerService,back;
    JTextArea txtArea;
    String regnoo;

    Quickbotid(String regnoo) {
        this.regnoo=regnoo;

        setLayout(null);
        setTitle("Shuttle Quickchatboot ");

        JLabel lblIntro = new JLabel("Find all the details about the shuttle service below.");
        lblIntro.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        lblIntro.setBounds(150, 30, 600, 60); 
        add(lblIntro);

        ShuttleTimings = new JButton("Shuttle Timings");
        ShuttleTimings.setBounds(50, 120, 200, 30);
        ShuttleTimings.setBackground(Color.BLACK);
        ShuttleTimings.setForeground(Color.WHITE);
        ShuttleTimings.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        ShuttleTimings.addActionListener(this);
        add(ShuttleTimings);

        AreaCoverage = new JButton("Area Coverage");
        AreaCoverage.setBounds(50, 160, 200, 30);
        AreaCoverage.setBackground(Color.BLACK);
        AreaCoverage.setForeground(Color.WHITE);
        AreaCoverage.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        AreaCoverage.addActionListener(this);
        add(AreaCoverage);

        PaymentInfo = new JButton("Payment Info");
        PaymentInfo.setBounds(50, 200, 200, 30);
        PaymentInfo.setBackground(Color.BLACK);
        PaymentInfo.setForeground(Color.WHITE);
        PaymentInfo.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        PaymentInfo.addActionListener(this);
        add(PaymentInfo);

        PetPolicy = new JButton("Pet Policy");
        PetPolicy.setBounds(50, 240, 200, 30);
        PetPolicy.setBackground(Color.BLACK);
        PetPolicy.setForeground(Color.WHITE);
        PetPolicy.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        PetPolicy.addActionListener(this);
        add(PetPolicy);

        WifiFacilities = new JButton("WiFi Facilities");
        WifiFacilities.setBounds(50, 280, 200, 30);
        WifiFacilities.setBackground(Color.BLACK);
        WifiFacilities.setForeground(Color.WHITE);
        WifiFacilities.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        WifiFacilities.addActionListener(this);
        add(WifiFacilities);

        CustomerService = new JButton("Customer Service");
        CustomerService.setBounds(50, 320, 200, 30);
        CustomerService.setBackground(Color.BLACK);
        CustomerService.setForeground(Color.WHITE);
        CustomerService.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        CustomerService.addActionListener(this);
        add(CustomerService);
        
        back = new JButton("BACK");
        back.setBounds(350, 400, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);

        txtArea = new JTextArea();
        txtArea.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
        txtArea.setBounds(300, 120, 450, 250);
        txtArea.setEditable(false);  // Make it non-editable
        txtArea.setWrapStyleWord(true);  // Ensure that long lines wrap properly within the text field
        txtArea.setLineWrap(true);  // Enable line wrapping
        add(txtArea);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ShuttleTimings) {
            txtArea.setText("Shuttle Timings:\n\nThe shuttle service operates daily from 8:00 AM to 10:00 PM. "
                    + "There are regular shuttles every 10 minutes during peak hours (8:00 AM to 2:00 PM) "
                    + "and every 20 minutes after that.");
        } else if (ae.getSource() == AreaCoverage) {
            txtArea.setText("Area Coverage:\n\nOur shuttle service mainly covers the following areas:\n"
                    + "- Shahbag\n"
                    + "- Tsc\n"
                    + "- Curzon\n"
                    + "- VC Chattar\n"
                    + "- Nilkhetmor\n"
                    + "- Polashir Mor\n"
                    + "- Kolabhobon\n\n"
                    + "The service is available for all students within the covered areas.");
        } else if (ae.getSource() == PaymentInfo) {
            txtArea.setText("Payment Information:\n\n- Red Shuttle ride costs 10 Taka per person.\n"
                    + "- Green Shuttle ride costs 5 Taka per person.\n\n"
                    + "Payment Methods:\n"
                    + "- Cash(In-Person)\n"
                    + "- BKash\n"
                    + "- Nagad");
        } else if (ae.getSource() == PetPolicy) {
            txtArea.setText("Pet Policy:\n\nPets are allowed on the shuttle service but must be kept in carriers at all times. "
                    + "There is a limit of one pet per passenger. Please ensure your pet does not disturb other passengers.");
        } else if (ae.getSource() == WifiFacilities) {
            txtArea.setText("WiFi Facilities:\n\nOur shuttle service provides free WiFi . "
                    );
        } else if (ae.getSource() == CustomerService) {
            txtArea.setText("Customer Service:\n\nIf you have any questions or concerns, please contact us at:\n"
                    + "- Phone: 01717034644\n"
                    + "- Email: shuttle@du.ac.bd\n"
                    + "- Visit us on register building room no-201.");
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Profile(regnoo).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Quickbotid("");
    }
}
