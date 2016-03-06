package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
   // testing object
    @Test
    public void testObject(){
        Student student = new Student("Kk");
        Student student1 = new Student("Nn");

        Assert.assertSame(student,student);
    }
}
