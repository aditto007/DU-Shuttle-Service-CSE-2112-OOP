package du.shuttle.service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Payment extends JFrame implements ActionListener {
    
    JButton donee,backk,logout;
   
    JComboBox shuttletype,person;
    String regnoo;
    Payment(String regnoo){
        this.regnoo=regnoo;
        setLayout(null);
        setTitle("PAY MONEY");
        Color darkGreen = new Color(0, 100, 0);
         JLabel methodd= new JLabel("Shuttle Type :");
        methodd.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        methodd.setBounds(40,60,300,30);
        add (methodd);
        
        String shuttletypee[]={"GREEN","RED"};
        shuttletype = new JComboBox(shuttletypee);
        shuttletype.setBounds(270,60,300,30);
        shuttletype.setBackground(Color.WHITE);
        add (shuttletype);
        
        JLabel mobileno= new JLabel("Passenger numbers :");
        mobileno.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        mobileno.setBounds(40,120,300,30);
        add (mobileno);
        
        String shuttletypeee[]={"1","2","3","4","5","6","7","8"};
        person = new JComboBox(shuttletypeee);
        person.setBounds(270,120,300,30);
        person.setBackground(Color.WHITE);
        add (person);
        
        JLabel redroad1 = new JLabel ("Green Shuttle Ticket Price(Per Passanger): TK 5");
        redroad1.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        redroad1.setForeground(darkGreen);
        redroad1.setBounds(70,200,800,100);
        add (redroad1);
        
        JLabel redroad = new JLabel ("Red Shuttle Ticket Price(Per Passanger): TK 10");
        redroad.setFont(new Font("Eras Bold ITC",Font.BOLD,20));
        redroad.setForeground(Color.RED);
        redroad.setBounds(70,260,800,100);
        add (redroad);
        
        
       donee = new JButton("DONE");
        donee.setBounds(640,500, 100, 30);
        donee.setBackground(Color.BLACK);
        donee.setForeground(Color.WHITE);
        donee.addActionListener(this);
        add(donee);
        
         backk = new JButton("BACK");
        backk.setBackground(Color.BLACK);
        backk.setForeground(Color.WHITE);
        backk.setBounds(70,500, 100, 30);
       backk.addActionListener(this);
        add(backk);
        
        logout = new JButton("LOG OUT");
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setBounds(350,500, 100, 30);
       logout.addActionListener(this);
        add(logout);
        
         getContentPane().setBackground(Color.WHITE);
        setSize(800,600);
        setVisible(true);
        setLocation(450,160);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==donee){
        String color=(String)shuttletype.getSelectedItem();
        String per = (String)person.getSelectedItem();
        Date date=new Date();
        int i=0;
        if(color.equals("GREEN")){
            i=5;
        }
        else {i=10;}
        i=i*Integer.parseInt(per);
        String ammountt=String.valueOf(i);
        Conn c3=new Conn();
       
            try{
                ResultSet rs=c3.s.executeQuery("select * from bank where regno='"+regnoo+"'");
                int balance=0;
                while(rs.next()){
                if(rs.getString("type").equals("add")){
                balance+=Integer.parseInt(rs.getString("amount"));
                }
                else{
                 balance-=Integer.parseInt(rs.getString("amount"));
                }
                }
                
                if(balance<i){
                  JOptionPane.showMessageDialog(null, "Insufficient Balace");
                  
                }
                else{
                 String query3="insert into bank values('"+regnoo+"' , '"+date+"','min','"+ammountt+"','"+per+"')";
        c3.s.executeUpdate(query3);
        JOptionPane.showMessageDialog(null, "Tk "+ammountt+" Successfully paid from your account");
        setVisible(false);
        new Profile(regnoo).setVisible(true);}
        
            }
             catch(Exception e){
        System.out.println(e);}
        }
        
        else if(ae.getSource()==backk){
        setVisible(false);
        new Profile(regnoo).setVisible(true);
        }
         else if(ae.getSource()==logout){
        setVisible(false);
        new Startpage().setVisible(true);
        }
        }
        
    
    
    public static void main(String[] args) {
        new Payment("");
    }
    
}
