import java.util.Scanner;
/**
 * Main program
 *
 * @author Leslie
 * @version 1
 */
public class StudentDatabaseApp
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main (String[] args)
    {
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        
        for (int n = 0; n < numOfStudents; n++) {
        students[n] = new Student();
        students[n].enroll();
        students[n].payTuition();
        System.out.println(students[n].toString());
    }
   }   
}
