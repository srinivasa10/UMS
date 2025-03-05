package university.management.system;
import javax.swing.*;//Jframe class in this pacakage
import java.awt.*;//for image class ,abstract window toolkit,for building GUI applications

public class Splash extends JFrame {
    
    // thread is a class,we will create an thread obj ,and then multitasking using it obj.start(),excecution  of thread obj starts
    Splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/cambridge-university.jpg"));//to load an image file through  creating obj(address in system )
        Image i2=i1.getImage().getScaledInstance(1050, 700,Image.SCALE_DEFAULT);//scale to fit in frame,this will return an image object i2 which is scaled
        ImageIcon i3=new ImageIcon(i2);//converting image object to imageicon
        JLabel image=new JLabel(i3);//pass only imageicon,creates a JLabel that will display the image represented by the ImageIcon i3.we can then add this JLabel to a container (such as a JFrame) to display the image in your graphical user interface
        add(image);//adding the Jlabel to the Jframe
        setVisible(true);//By default visibility of frame is hidden
           
            int x = 1;
            for (int i = 2; i <= 600; i+=4, x+=1) {
                setLocation(590 - ((i + x)/2), 350 - (i/2));//setlocation(from left,from up)
                setSize(i + 3*x, i + x/2);//(l,b)
            try{
                Thread.sleep(4);//to open slowly stop 2 milliseconds,catch if any thead interrupts sleeping thraed
            }catch(Exception e){
                //exception occcured interrupted
            }
            }
            try {
                Thread.sleep(4000);//stop code of exceution for 4 sec ,4000 millisec
                setVisible(false);//moving to next Frame
                new login();
            } catch (Exception e) {
            //exception occurred
            }
    }
    public static void main(String args[]){
    new Splash();
    }
}
