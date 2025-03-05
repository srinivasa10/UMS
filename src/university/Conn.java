package university.management.system;
import java.sql.Connection;//for connection interface
import java.sql.DriverManager;//for class DriverManager
import java.sql.Statement;//

public class Conn {
    Connection c;//creating connection string,saying infomation about database we are connecting,creating variable of interface
Statement s;//for creating statement
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//Driver is our class in that pacakage com.mysql.cj.jdbc we are "registering our driver class" to use jdbc driver
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Satya@23");//class.(method from which we are connecting database,which database we are connecting,where MYSQL is running,port number, database we made)
            s=c.createStatement();
            
        } catch (Exception e){
            e.printStackTrace();//exception due to mysql is external entry if any error occurs 
        }
    }
    public static void main(String[] args) {
        
    }
}
