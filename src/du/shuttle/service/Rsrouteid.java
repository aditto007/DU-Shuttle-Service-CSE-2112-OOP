
package du.shuttle.service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Rsrouteid extends JFrame implements ActionListener{
    
    JButton backg,nextg;
    String regnoo;
    Rsrouteid(String regnoo){
        this.regnoo=regnoo;
        setLayout(null);
        setTitle("Red Shuttle Route");
        
        JLabel text = new JLabel ("Red Shuttle Route ");
        text.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        text.setBounds(700,5,400,70);
        add (text);
        text.setForeground(Color.RED);
        
        JLabel text1 = new JLabel ("Pickup Points->Neelkhet->Polashir Mor->DMC Gate->SH Hall->Curzon->TSC->SK Hall ");
        text1.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        text1.setBounds(300,50,1100,50);
        add (text1);
        
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(1350, 0, 200, 80);
        add(logo);
        
        text1.setForeground(Color.RED);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("photoes/1.png"));
        Image i2 = i1.getImage().getScaledInstance(1500, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(10, 100, 1500, 600);
        add(label);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(1600,800);
        setLocation(10,10);
        setVisible(true);
        
        backg = new JButton("Back");
        backg.setBackground(Color.BLACK);
        backg.setForeground(Color.WHITE);
        backg.setBounds(300, 700, 150, 30);
        backg.addActionListener(this);
        add(backg);
        
        nextg = new JButton("Next");
        nextg.setBackground(Color.BLACK);
        nextg.setForeground(Color.WHITE);
        nextg.setBounds(1100, 700, 150, 30);
        nextg.addActionListener(this);
        add(nextg);    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==backg){
            setVisible(false);
            new Profile(regnoo).setVisible(true);
        }

        if(ae.getSource()==nextg){
            setVisible(false);
            new Gsrouteid(regnoo).setVisible(true);
        }        
    }
    public static void main(String[] args) {
        new Rsrouteid("");
    }
}
