package university.management.system;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar,tfdob;
    JLabel labelempId;
    
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;
    JDateChooser dcdob;
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddTeacher() {
        
        setSize(900, 700);
        setLocation(350, 50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel lblempId = new JLabel("Employee Id");
        lblempId.setBounds(50, 200, 200, 30);
        lblempId.setFont(new Font("serif", Font.BOLD, 20));
        add(lblempId);
        
        labelempId = new JLabel("101"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("serif", Font.BOLD, 20));
        add(labelempId);
        
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);
        dcdob=new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
       
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel lblx = new JLabel("Class X (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 20));
        add(lblx);
        
        tfx = new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);
        
        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif", Font.BOLD, 20));
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);
        
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("serif", Font.BOLD, 20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel lblcourse = new JLabel("Qualification");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcourse);
        
        String course[] = {"B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200, 400, 150, 30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        JLabel lblbranch = new JLabel("Department");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(lblbranch);
        
        String branch[] = {"Computer Science", "Electronics", "Mechanical", "Civil", "IT"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            if (tfname.getText().isEmpty() || tffname.getText().isEmpty() || tfphone.getText().isEmpty()
                    || tfemail.getText().isEmpty() || tfx.getText().isEmpty() || tfxii.getText().isEmpty()
                    || tfaadhar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return;
            }
             // Validation checks for alphanumeric input
             if (!tfname.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid name (alphabets only).");
                return;
            }
            if (!tffname.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid father's name (alphabets only).");
                return;
            }
            if (!tfaddress.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid address's name (alphabets only).");
                return;
            }
            if (!tfphone.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid phone number (numbers only).");
                return;
            }
            if (tfphone.getText().length() != 10) {
                JOptionPane.showMessageDialog(this, "Phone number should contain exactly 10 digits.");
                return;
            }
            if (!tfemail.getText().endsWith("gmail.com")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid email address.");
                return;
            }
            if (!tfx.getText().matches("[0-9]+") || Integer.parseInt(tfx.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "Please enter valid Class X percentage (numbers only, maximum 100).");
                return;
            }
            if (!tfxii.getText().matches("[0-9]+") || Integer.parseInt(tfxii.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "Please enter valid Class XII percentage (numbers only, maximum 100).");
                return;
            }
            if (!tfx.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Please enter valid Class X percentage (numbers only).");
                return;
            }
            if (!tfxii.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Please enter valid Class XII percentage (numbers only).");
                return;
            }
            if (!tfaadhar.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid Aadhar number (numbers only).");
                return;
            }
            if (!tfaadhar.getText().matches("[0-9]+") ||tfaadhar.getText().length() != 12) {
                JOptionPane.showMessageDialog(this, "Please enter a valid Aadhar number (numbers only m and 12 digits).");
                return;
            }


            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelempId.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            
            try {
                String query = "insert into teacher values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"')";

                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddTeacher();
    }
}