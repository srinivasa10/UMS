package university.management.system;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JButton login,cancel;//scope
    JTextField  tusername=new JTextField();//// making input field for taking input from user
    JPasswordField tpassword=new JPasswordField();////so that it is not visible to user user passwordfield

    login(){
        setLayout(null);//making the frame null format
        JLabel lusername=new JLabel("Username");//for adding text and images to frame use Jlabel
        lusername.setBounds(40,20,100,20);//place explictly on frame using setbounds(dis from left of frame,--from top,widhth of label.height of label)
        add(lusername);
        
      
        tusername.setBounds(150,20,150,20);
        add(tusername);//adding the input to the frame
        JLabel lpassword=new JLabel("Password");//for adding text and images to frame use Jlabel
        lpassword.setBounds(40,80,100,20);//place explictly on frame using setbounds(dis from left of frame,--from top,widhth of label.height of label)
        add(lpassword);//adding label password
        
        tpassword.setBounds(150,80,150,20);
        add(tpassword);//input from user and add
        login=new JButton("Login");//making button and parameter inside button will be visible on it
        login.setBounds(45,140,120,30);
        login.addActionListener(this);//this will tell if user clicks on login button and calls the function actionperformed method
        add(login);
        cancel=new JButton("Cancel");//making button and parameter inside button will be visible on it
        cancel.setBounds(200,140,120,30);
        cancel.addActionListener(this);
        add(cancel);

 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\second.jpg"));//to load an image file through  creating obj
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);//scale to fit in frame,this will return an image object i2 which is scaled
        ImageIcon i3=new ImageIcon(i2);//converting image object to imageicon
        JLabel image=new JLabel(i3);//pass only imageicon,creates a JLabel that will display the image represented by the ImageIcon i3.we can then add this JLabel to a container (such as a JFrame) to display the image in your graphical user interface
        image.setBounds(350,20,200,200)  ;//we selected layout explictly we need to setbounds for image
        add(image);

        setSize(600,300);
        setLocation(500,250);
        setVisible(true);   }
    public static void main(String[] args) {
        new login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            String username=tusername.getText();
            char[] password=tpassword.getPassword();
            String stringPassword="";
            for( int i =0;i<password.length;i++){
                stringPassword += password[i];

            }
            stringPassword +="";
            String query = "select * from login where username='"+username+"' and password='"+stringPassword+"'";//getting mySQL query
try {
     Conn con =new Conn();//establishing connection by creating obj
     ResultSet rs = con.s.executeQuery(query);//rs gets if the data is present is in database ,.next() returns true if it is there else false
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    new login();
                   
                }
/*JOptionPane: This is a class in the javax.swing package that provides methods to create and display standard dialogs.
showMessageDialog: This method is used to display a modal dialog with a message.
null: The first parameter represents the parent component of the dialog. In this case, passing null means that the dialog is not attached to any specific parent component.
This is the message that will be displayed in the dialog box. */

} catch (Exception e1) {
    
    e1.printStackTrace();
}

 
        }
        else if(e.getSource() == cancel){
setVisible(false);////tells if user presses cancel

        }
    }
}
