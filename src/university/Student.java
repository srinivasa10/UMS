package university.management.system;



public class Student extends Person {
    private String rollNo;
    private String course;
    private String branch;

    public Student(String name, String address, String phone, String email,
                   String rollNo, String course, String branch) {
        super(name, address, phone, email);
        this.rollNo = rollNo;
        this.course = course;
        this.branch = branch;
    }

    // Getter and Setter for Student attributes
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Branch: " + branch);
    }
}
