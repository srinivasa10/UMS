package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(760, 500);
        setLocation(400, 150);
      
       setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(390, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management<br/>System</html>");
        heading.setBounds(70, 100, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("OOPS LAB PROJECT");
        name.setBounds(70, 20, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
   
      
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
