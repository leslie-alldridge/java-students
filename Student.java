import java.util.Scanner;
/**
 * Student class where we define a student.
 *
 * @author Leslie
 * @version 1.0
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("1- First year\n2- Second year\n3- Third year\n4- Final year\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();

    }
    
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    
    public void enroll(){
        do {
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else { 
                break; 
            }
       } while (1 != 0);
    }
    
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
    }
}
