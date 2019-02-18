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
    private String courses;
    private int tuitionBalance;
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
        
        System.out.print("1 - First year\n2- Second year\n3- Third year\n4- Final year\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        
        setStudentID();
        
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
        
        
    }
    
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        return costOfCourse;
    }
}
