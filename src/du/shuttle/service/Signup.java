
package du.shuttle.service;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    
 JTextField name1, regno1, deptname1, hallname1, email1, mobileno1;
    JRadioButton male, female, resid, nonresid;
    JDateChooser date;
    JButton b,back;
    JComboBox bloodgroup1;
    JPasswordField pass1, repass1;

    Signup() {
        setTitle("Create An Account");
        setLayout(null);

        JLabel studentdetails = new JLabel("Student Details");
        studentdetails.setFont(new Font("Eras Bold ITC", Font.BOLD, 28));
        studentdetails.setBounds(300, 20, 600, 40);
        add(studentdetails);
        ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("photoes/logo.png"));
        Image l2 = l1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon l3=new ImageIcon(l2);
        JLabel logo = new JLabel(l3);
        logo.setBounds(680, 5, 200, 80);
        add(logo);

        JLabel name = new JLabel("Student Name*  ");
        name.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        name.setBounds(40, 90, 300, 30);
        add(name);
        name1 = new JTextField();
        name1.setFont(new Font("Raleway", Font.BOLD, 18));
        name1.setBounds(300, 90, 400, 30);
        name1.addActionListener((ActionEvent e) -> regno1.requestFocus());
        add(name1);

        JLabel regno = new JLabel("Registration Number* ");
        regno.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        regno.setBounds(40, 130, 300, 30);
        add(regno);
        regno1 = new JTextField();
        regno1.setFont(new Font("Raleway", Font.BOLD, 18));
        regno1.setBounds(300, 130, 400, 30);
        regno1.addActionListener((ActionEvent e) -> deptname1.requestFocus());
        add(regno1);

        JLabel deptname = new JLabel("Department Name ");
        deptname.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        deptname.setBounds(40, 170, 300, 30);
        add(deptname);
        deptname1 = new JTextField();
        deptname1.setFont(new Font("Raleway", Font.BOLD, 18));
        deptname1.setBounds(300, 170, 400, 30);
        deptname1.addActionListener((ActionEvent e) -> hallname1.requestFocus());
        add(deptname1);

        JLabel hallname = new JLabel("Hall Name ");
        hallname.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        hallname.setBounds(40, 210, 300, 30);
        add(hallname);
        hallname1 = new JTextField();
        hallname1.setFont(new Font("Raleway", Font.BOLD, 18));
        hallname1.setBounds(300, 210, 400, 30);
        hallname1.addActionListener((ActionEvent e) -> email1.requestFocus());
        add(hallname1);

        JLabel resudent = new JLabel("Hall Residential Status ");
        resudent.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        resudent.setBounds(40, 260, 300, 30);
        add(resudent);

        resid = new JRadioButton("Resident");
        resid.setBounds(300, 260, 90, 40);
        resid.setBackground(Color.WHITE);
        resid.setFont(new Font("Eras Bold ITC", Font.BOLD, 13));
        add(resid);

        nonresid = new JRadioButton("Non-Resident");
        nonresid.setBounds(450, 260, 150, 40);
        nonresid.setBackground(Color.WHITE);
        nonresid.setFont(new Font("Eras Bold ITC", Font.BOLD, 13));
        add(nonresid);

        ButtonGroup residgroup = new ButtonGroup();
        residgroup.add(resid);
        residgroup.add(nonresid);

        JLabel gender = new JLabel("Gender ");
        gender.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        gender.setBounds(40, 310, 300, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 310, 60, 40);
        male.setBackground(Color.WHITE);
        male.setFont(new Font("Eras Bold ITC", Font.BOLD, 13));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(410, 310, 100, 40);
        female.setBackground(Color.WHITE);
        female.setFont(new Font("Eras Bold ITC", Font.BOLD, 13));
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel dateofbirth = new JLabel("Date Of Birth ");
        dateofbirth.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        dateofbirth.setBounds(40, 360, 300, 30);
        add(dateofbirth);
        date = new JDateChooser();
        date.setBounds(300, 360, 400, 30);
        add(date);

        JLabel email = new JLabel("Educational mail* ");
        email.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        email.setBounds(40, 410, 300, 30);
        add(email);
        email1 = new JTextField();
        email1.setFont(new Font("Raleway", Font.BOLD, 18));
        email1.setBounds(300, 410, 400, 30);
        email1.addActionListener((ActionEvent e) -> mobileno1.requestFocus());
        add(email1);

        JLabel mobileno = new JLabel("Mobile Number* ");
        mobileno.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
        mobileno.setBounds(40, 460, 300, 30);
        add(mobileno);
        mobileno1 = new JTextField();
        mobileno1.setFont(new Font("Raleway", Font.BOLD, 18));
        mobileno1.setBounds(300, 460, 400, 30);
        mobileno1.addActionListener((ActionEvent e) -> pass1.requestFocus());
        add(mobileno1);

        JLabel bloodgroup = new JLabel("Blood Group ");
        bloodgroup.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        bloodgroup.setBounds(40, 510, 300, 30);
        add(bloodgroup);

        String blood[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        bloodgroup1 = new JComboBox(blood);
        bloodgroup1.setBounds(300, 510, 300, 30);
        bloodgroup1.setBackground(Color.WHITE);
        add(bloodgroup1);

        JLabel password = new JLabel("Enter Password* ");
        password.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        password.setBounds(40, 550, 300, 30);
        add(password);

        pass1 = new JPasswordField();
        pass1.setFont(new Font("Raleway", Font.BOLD, 18));
        pass1.setBounds(300, 550, 400, 30);
        pass1.addActionListener((ActionEvent e) -> repass1.requestFocus());
        add(pass1);

        JLabel repassword = new JLabel("Re-enter Password To Verify* ");
        repassword.setFont(new Font("Eras Bold ITC", Font.BOLD, 16));
        repassword.setBounds(40, 590, 300, 30);
        add(repassword);

        repass1 = new JPasswordField();
        repass1.setFont(new Font("Raleway", Font.BOLD, 18));
        repass1.setBounds(300, 590, 400, 30);
        repass1.addActionListener((ActionEvent e) -> b.doClick());
        add(repass1);
        back = new JButton("BACK");
        back.setBounds(50, 680, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        b = new JButton("SUBMIT");
        b.setFont(new Font("Eras Bold ITC", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(620, 680, 100, 30);
        add(b);
        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae){
    if (ae.getSource() == back) {
            setVisible(false);
            new Startpage().setVisible(true);  // Navigate back to SignSecond screen
        }
        
    String name=name1.getText();
    String regno=regno1.getText();
    String deptname=deptname1.getText();
    String hallname=hallname1.getText();
    String dateofbirth = ((JTextField) date.getDateEditor().getUiComponent()).getText();
    String gender=null;
    
    if(male.isSelected()){
        gender="Male";
    }
    else if(female.isSelected()){
        gender="Female";
    }
    String resudent=null;
    if(resid.isSelected()){
        resudent="Resident";
    }
    else if(nonresid.isSelected()){
        resudent="Non-Resident";
    }
    
    String email=email1.getText();
    String mobileno=mobileno1.getText();
    String bloodgroup= (String)bloodgroup1.getSelectedItem();
    String password=new String(pass1.getPassword());
    String repassword= new String (repass1.getPassword());
    if (ae.getSource() != back){
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Student Name is required ");
        }
        else if(regno.equals("")){
            JOptionPane.showMessageDialog(null, "Registration Number is required ");
        }
        else if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Educational mail is required ");
        }
        else if(mobileno.equals("")){
            JOptionPane.showMessageDialog(null, "Mobile Number is required ");
        }
        else if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Password is required ");
        }
        else if(repassword.equals("")){
            JOptionPane.showMessageDialog(null, "Re-Password is required ");
        }
        else if(!password.equals(repassword)){
            JOptionPane.showMessageDialog(null, "Password And Re-enterd Password Don't Match");
        }
        else{
        Conn c=new Conn();
        String query1="insert into createanaccout1 values('"+name+"' , '"+regno+"','"+hallname+"','"+deptname+"','"+dateofbirth+"','"+gender+"','"+resudent+"','"+email+"','"+mobileno+"','"+bloodgroup+"','"+password+"')";
        c.s.executeUpdate(query1);
        }
    }
    catch(Exception e){
        System.out.println(e);}
    if(ae.getSource()==b){
            if(!(name.equals("")||regno.equals("")||email.equals("")||password.equals("")||repassword.equals("")||mobileno.equals(""))){
            setVisible(false);
            new Startpage().setVisible(true);
        }}
    
    
    }}
    public static void main(String[] args) {
        new Signup();
    }
}
