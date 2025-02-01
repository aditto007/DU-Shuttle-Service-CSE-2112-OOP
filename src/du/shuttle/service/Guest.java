package du.shuttle.service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guest extends JFrame implements ActionListener {
    JButton quickbotButton, redRouteButton, greenRouteButton,back;

    Guest() {
        setLayout(null);
        setTitle("Guest Page");

        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("photoes/bg.jpg"));
        Image bgImage = bgIcon.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon bgScaledIcon = new ImageIcon(bgImage);

        JLabel background = new JLabel(bgScaledIcon);
        background.setBounds(0, 0, 500, 400);
        add(background);

        quickbotButton = new JButton("Quickbot");
        quickbotButton.setBounds(100, 50, 300, 60);
        quickbotButton.setBackground(Color.BLACK);
        quickbotButton.setForeground(Color.WHITE);
        quickbotButton.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        quickbotButton.addActionListener(this);
        background.add(quickbotButton);

        redRouteButton = new JButton("Red Shuttle Route");
        redRouteButton.setBounds(100, 130, 300, 60);
        redRouteButton.setBackground(Color.BLACK);
        redRouteButton.setForeground(Color.WHITE);
        redRouteButton.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        redRouteButton.addActionListener(this);
        background.add(redRouteButton);

        greenRouteButton = new JButton("Green Shuttle Route");
        greenRouteButton.setBounds(100, 210, 300, 60);
        greenRouteButton.setBackground(Color.BLACK);
        greenRouteButton.setForeground(Color.WHITE);
        greenRouteButton.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        greenRouteButton.addActionListener(this);
        background.add(greenRouteButton);
        
        back = new JButton("BACK");
        back.setBounds(200, 300, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Eras Bold ITC", Font.BOLD, 15));
        back.addActionListener(this);
        background.add(back);

        setSize(500, 400);
        setLocation(600, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == quickbotButton) {
            setVisible(false);
            new Quickbotguest().setVisible(true);
        } else if (ae.getSource() == redRouteButton) {
            setVisible(false);
            new Rsrouteguest().setVisible(true);
        } else if (ae.getSource() == greenRouteButton) {
            setVisible(false);
            new Gsrouteguest().setVisible(true);
        }
        else if (ae.getSource() == back) {
            setVisible(false);
            new Startpage().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Guest();
    }
}
