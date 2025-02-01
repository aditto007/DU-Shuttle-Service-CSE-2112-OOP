package du.shuttle.service;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Addmoney extends JFrame implements ActionListener {
    
    JButton donee, backk;
    JTextField ammount, mobno1;
    JComboBox<String> method;
    String regnoo;
    
    Addmoney(String regnoo) {
        this.regnoo = regnoo;
        setLayout(null);
        setTitle("ADD MONEY");
        
        JLabel methodd = new JLabel("METHOD ");
        methodd.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        methodd.setBounds(40, 60, 300, 30);
        add(methodd);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("photoes/11.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 188, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(100, 280, 600, 188);
        add(label1);
        
        String[] mmethod = {"BKASH", "ROCKET", "NAGAD"};
        method = new JComboBox<>(mmethod);
        method.setBounds(220, 60, 300, 36);
        method.setBackground(Color.WHITE);
        method.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        add(method);
        
        JLabel mobileno = new JLabel("Mobile Number ");
        mobileno.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        mobileno.setBounds(40, 120, 300, 30);
        add(mobileno);
        
        mobno1 = new JTextField();
        mobno1.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        mobno1.setBounds(220, 120, 400, 30);
        add(mobno1);
        
        JLabel password = new JLabel("Enter PIN ");
        password.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        password.setBounds(40, 180, 300, 30);
        add(password);
        
        JPasswordField pass11 = new JPasswordField();
        pass11.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        pass11.setBounds(220, 180, 400, 30);
        add(pass11);
        
        JLabel ammountt = new JLabel("Amount ");
        ammountt.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        ammountt.setBounds(40, 240, 300, 30);
        add(ammountt);
        
        ammount = new JTextField();
        ammount.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
        ammount.setBounds(220, 240, 400, 30);
        add(ammount);
        
        donee = new JButton("DONE");
        donee.setBounds(640, 500, 100, 30);
        donee.setBackground(Color.BLACK);
        donee.setForeground(Color.WHITE);
        donee.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        donee.addActionListener(this);
        add(donee);
        
        backk = new JButton("BACK");
        backk.setBackground(Color.BLACK);
        backk.setForeground(Color.WHITE);
        backk.setBounds(70, 500, 100, 30);
        backk.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        backk.addActionListener(this);
        add(backk);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 600);
        setVisible(true);
        setLocation(450, 160);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == donee) {
            String ammountt = ammount.getText();
            Date date = new Date();
            if (ammountt.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            } else {
                try {
                    Conn conn1 = new Conn();
                    String query3 = "INSERT INTO bank (regno, date, type, amount) VALUES ('"+regnoo+"', '"+date+"', 'add', '"+ammountt+"')";
                    conn1.s.executeUpdate(query3);
                    JOptionPane.showMessageDialog(null, "Tk " + ammountt + " Successfully recharged in your account");
                    setVisible(false);
                    new Profile(regnoo).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == backk) {
            setVisible(false);
            new Profile(regnoo).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Addmoney("");
    }
}
