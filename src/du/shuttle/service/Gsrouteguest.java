package du.shuttle.service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Gsrouteguest extends JFrame implements ActionListener{
    
    JButton backg;
    
    Gsrouteguest(){
    
        setLayout(null);
        setTitle("As A Guest");
        Color darkGreen = new Color(0, 100, 0);
        JLabel text = new JLabel ("Green Shuttle Route ");
        text.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        text.setBounds(700,10,400,70);
        text.setForeground(darkGreen);
        add (text);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("photoes/3.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(10, 100, 1500, 600);
        add(label);
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(1350, 0, 200, 80);
        add(logo);
        
        JLabel text1 = new JLabel ("Pickup Points->Shahbag->Kazi Nazrul Ave->KolaVobon->VC->JH Field->Motaher Gate->Mokarram Gate");
        text1.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        text1.setBounds(300,50,1200,50);
        text1.setForeground(darkGreen);
        add (text1);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(1600,800);
        setLocation(10,10);
        setVisible(true);
        
        backg = new JButton("Back");
        backg.setBackground(Color.BLACK);
        backg.setForeground(Color.WHITE);
        backg.setBounds(660, 700, 150, 30);
        backg.addActionListener(this);
        add(backg);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==backg){
            setVisible(false);
            new Guest().setVisible(true);
        }
        
    }
    public static void main(String[] args) {
        new Gsrouteguest();
    }
}

