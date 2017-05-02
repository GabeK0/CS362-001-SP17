package edu.osu.cs362;
/**
 * This class provides a basic set of test cases for the
 * CalDay class.
 */

import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.Iterator;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalDayTest {


    @Test
    public void test01() throws Throwable {
        GregorianCalendar gCal = new GregorianCalendar();
        CalDay cal = new CalDay(gCal);
        int hour = 25;
        int min = 65;
        int day = 35;
        int startMonth = 13;
        int startYear = 1917;
        Appt appt = new Appt(hour,
                min,
                day,
                startMonth,
                startYear,
                null,
                null);
        cal.addAppt(appt);
        cal.toString();
    }

    @Test
    public void test02() throws Throwable {
        GregorianCalendar gCal = new GregorianCalendar();
        CalDay cal = new CalDay(gCal);
        int hour = 13;
        int min = 30;
        int day = 10;
        int startMonth = 4;
        int startYear = 1917;
        String title = "a";
        String description = "aa";

        Appt appt = new Appt(hour,
                min,
                day,
                startMonth,
                startYear,
                title,
                description);
        cal.addAppt(appt);
        assertTrue(cal.isValid());
        cal.getSizeAppts();
        Iterator<?> cal_iter = cal.iterator();
    }

    @Test
    public void test03() throws Throwable {
        GregorianCalendar gCal = new GregorianCalendar();
        CalDay cal = new CalDay(gCal);
        int hour = 13;
        int min = 30;
        int day = 10;
        int startMonth = 4;
        int startYear = 1917;
        String title = "a";
        String description = "aa";

        Appt appt = new Appt(hour,
                min,
                day,
                startMonth,
                startYear,
                title,
                description);
        cal.addAppt(appt);
        assertTrue(cal.isValid());
    }

    @Test
    public void test04() throws Throwable {
        CalDay cal = new CalDay();
        Iterator<?> cal_iter = cal.iterator();
        cal.toString();
    }

    @Test
    public void test05() throws Throwable {
        GregorianCalendar gCal = new GregorianCalendar();
        CalDay cal = new CalDay(gCal);
        int hour = 13;
        int min = 30;
        int day = 10;
        int startMonth = 4;
        int startYear = 1917;
        String title = "a";
        String description = "aa";

        Appt app = new Appt(hour,
                min,
                day,
                startMonth,
                startYear,
                title,
                description);
        Appt app2 = new Appt(hour + 1,
                min + 1,
                day + 1,
                startMonth + 1,
                startYear + 1,
                title,
                description);
        Appt app3 = new Appt(hour - 1,
                min - 1,
                day - 1,
                startMonth - 1,
                startYear - 1,
                title,
                description);
        cal.addAppt(app);
        cal.addAppt(app2);
        cal.addAppt(app3);
        assertTrue(cal.isValid());
        cal.toString();
    }


    @Test
    public void test08() throws Throwable {
        GregorianCalendar gregorianOne = new GregorianCalendar();
        CalDay day2 = new CalDay(gregorianOne);
        Appt appt = new Appt(-1, 12, 22, 03, 1917,
                "merry", "Need to merry");

        assertEquals(false, appt.getValid());

        day2.addAppt(appt);


    }

    @Test
    public void test06() throws Throwable {
        GregorianCalendar gregorianOne = new GregorianCalendar();
        CalDay day2 = new CalDay(gregorianOne);
        Appt app = new Appt(10, 12, 22, 03, 1917,
                "merry", "Need to merry");
        Appt app2 = new Appt(12, 12, 22, 03, 1917,
                "merry", "Need to merry");

        day2.addAppt(app);
        day2.addAppt(app2);
        day2.iterator();
        day2.toString();

    }


    @Test
    public void test07() throws Throwable {
        CalDay day = new CalDay();
        day.iterator();


    }

    @Test
    public void test8() throws Throwable {
        GregorianCalendar gregorianOne = new GregorianCalendar();
        CalDay day2 = new CalDay(gregorianOne);
        Appt app = new Appt(12, 12, 22, 03, 1917,
                "merry", "Need to merry");
        Appt app2 = new Appt(10, 12, 22, 03, 1917,
                "merry", "Need to merry");

        day2.addAppt(app);
        day2.addAppt(app2);
        assertEquals(2, day2.getSizeAppts());


    }

    @Test
    public void test9() throws Throwable {
        CalDay day = new CalDay();
        day.toString();

    }

    @Test
    public void test10() throws Throwable {
        Appt appt = new Appt(10, 12, 22, 03, 1917,
                "merry", "Need to merry");

        GregorianCalendar gregorianOne = new GregorianCalendar();
        CalDay day2 = new CalDay(gregorianOne);
        day2.addAppt(appt);
        day2.iterator();

    }

    @Test
    public void test11() throws Throwable {


        CalDay day = new CalDay();
        assertFalse(day.isValid());

        GregorianCalendar gregorianOne = new GregorianCalendar();
        CalDay day2 = new CalDay(gregorianOne);

        assertEquals(day2.getDay(), gregorianOne.get(gregorianOne.DAY_OF_MONTH));
        assertEquals(day2.getMonth(), gregorianOne.get(gregorianOne.MONTH));
        assertEquals(day2.getYear(), gregorianOne.get(gregorianOne.YEAR));

    }


}
