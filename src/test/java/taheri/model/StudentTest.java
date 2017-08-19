package taheri.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Student's test
 */
public class StudentTest {

    public static final String USER = "user";
    public static final String PASSWORD = "password";

    @Test
    public void simpleTest() {
        Student student = new Student(USER, PASSWORD);
        assertEquals(USER, student.getUsername());
        assertEquals(PASSWORD, student.getPassword());
    }

}