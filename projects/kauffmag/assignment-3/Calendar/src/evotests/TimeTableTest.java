package edu.osu.cs362;
/**
 * This class provides a basic set of test cases for the
 * TimeTable class.
 */

import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import static junit.framework.TestCase.*;

public class TimeTableTest {


    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        TimeTable timeTable0 = new TimeTable();
        // Undeclared exception!
        try {
            timeTable0.getApptRange((LinkedList<Appt>) null, (GregorianCalendar) null, (GregorianCalendar) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("edu.osu.cs362.TimeTable", e);
        }
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        TimeTable timeTable0 = new TimeTable();
        LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, (Appt) null);
        assertNull(linkedList0);
    }

}
