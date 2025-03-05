package university.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Project extends JFrame implements ActionListener {
     
        JMenuItem facultyInfo, studentInfo,facultydetails, studentdetails,facultyleave,studentleave,facultyleavedetails,studentleavedetails,examinationdetails,updatefacultyinfo,entermarks,updatestudentinfo ,feestructure,feeform,ab,ex,h;
        
    Project(){
        
        setSize(1920,1080);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons\\third.jpg"));//to load an image file through  creating obj
        Image i2=i1.getImage().getScaledInstance(1880, 980,Image.SCALE_DEFAULT);//scale to fit in frame,this will return an image object i2 which is scaled
        ImageIcon i3=new ImageIcon(i2);//converting image object to imageicon
        JLabel image=new JLabel(i3);//pass only imageicon,creates a JLabel that will display the image represented by the ImageIcon i3.we can then add this JLabel to a container (such as a JFrame) to display the image in your graphical user interface
       
        add(image);
JMenuBar jm=new JMenuBar();
//new information
JMenu newInfo=new JMenu("New Information");
newInfo.setForeground(Color.BLUE);
jm.add(newInfo);
 facultyInfo=new JMenuItem("New Faculty Information");
facultyInfo.setBackground(Color.WHITE);
facultyInfo.addActionListener(this);
newInfo.add(facultyInfo);
 studentInfo=new JMenuItem("New Student Information");
studentInfo.setBackground(Color.WHITE);
studentInfo.addActionListener(this);
newInfo.add(studentInfo);
//view details
JMenu details=new JMenu(" View Details");
details.setForeground(Color.RED);
jm.add(details);
facultydetails=new JMenuItem("View Faculty Details");
facultydetails.setBackground(Color.WHITE);
facultydetails.addActionListener(this);
details.add(facultydetails);
 studentdetails=new JMenuItem("View Student Details");
studentdetails.setBackground(Color.WHITE);
studentdetails.addActionListener(this);
details.add(studentdetails);
  // UpdateInfo
  JMenu updateInfo = new JMenu("Update Details");
  updateInfo.setForeground(Color.BLUE);
  jm.add(updateInfo);
  
   updatefacultyinfo = new JMenuItem("Update Faculty Details");
  updatefacultyinfo.setBackground(Color.WHITE);
  updatefacultyinfo.addActionListener(this);
  updateInfo.add(updatefacultyinfo);
  
  updatestudentinfo = new JMenuItem("Update Student Details");
  updatestudentinfo.setBackground(Color.WHITE);
  updatestudentinfo.addActionListener(this);
  updateInfo.add(updatestudentinfo);
  
// Leave
JMenu leave = new JMenu("Apply Leave");
leave.setForeground(Color.RED);
jm.add(leave);

facultyleave = new JMenuItem("Faculty Leave");
facultyleave.setBackground(Color.WHITE);
facultyleave.addActionListener( this);
leave.add(facultyleave);

studentleave = new JMenuItem("Student Leave");
studentleave.setBackground(Color.WHITE);
studentleave.addActionListener(this);
leave.add(studentleave);

// Leave Details
JMenu leaveDetails = new JMenu("Leave Details");
leaveDetails.setForeground(Color.BLUE);
jm.add(leaveDetails);
facultyleavedetails = new JMenuItem("Faculty Leave Details");
facultyleavedetails.setBackground(Color.WHITE);
facultyleavedetails.addActionListener(this);
leaveDetails.add(facultyleavedetails);

 studentleavedetails = new JMenuItem("Student Leave Details");
studentleavedetails.setBackground(Color.WHITE);
studentleavedetails.addActionListener(this);
leaveDetails.add(studentleavedetails);

// Exams
JMenu exam = new JMenu("Examination");
exam.setForeground(Color.RED);
jm.add(exam);
 examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
         entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
      
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        jm.add(fee);
        
        feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
      
        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.RED);
        jm.add(about);
        
        ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        jm.add(exit);
        
        ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        




setJMenuBar(jm);
        setVisible(true);


    }

public void actionPerformed(ActionEvent e){
if(e.getSource() ==ex ){
setVisible(false);
}
else if(e.getSource() == facultyInfo){
 new AddTeacher();
}
else if(e.getSource() == studentInfo){
    new AddStudent();
}
else if(e.getSource()== studentleave){
 new StudentLeave();
}
else if(e.getSource()== facultyleave){
 new TeacherLeave();
}
else if(e.getSource()==ab){
    new About();
}
else if(e.getSource() == facultydetails){
    new TeacherDetails();
   }
   else if(e.getSource() == studentdetails){
       new StudentDetails();
   }
   else if(e.getSource()== studentleavedetails){
    new StudentLeaveDetails();
   }
   else if(e.getSource()== facultyleavedetails){
    new TeacherLeaveDetails();
   }
   else if(e.getSource()== feestructure){
   new FeeStructure();
   }
   else if (e.getSource()== entermarks) {
    new EnterMarks();
   }
   else if(e.getSource() == feeform){
    new StudentFeeForm();
}
else if(e.getSource()==examinationdetails ){
new ExaminationDetails();
}
else if(e.getSource()==updatestudentinfo){
new UpdateStudent();
}
else if(e.getSource()==updatefacultyinfo){
new UpdateTeacher();
}

   


}
    public static void main(String[] args) {
        new Project();
    }
}
