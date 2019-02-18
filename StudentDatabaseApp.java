
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
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());
    }
}
