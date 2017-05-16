package edu.osu.cs362;
/**
 * This class provides a basic set of test cases for the
 * Appt class.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {

    @Test
    public void test01() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setTitle(null);
        assertEquals("", app.getTitle());

    }

    @Test
    public void test02() throws Throwable {
        int hour = 13;
        int min = 30;
        int day = 10;
        int month = 4;
        int year = 1917;
        String title = "x";
        String description = "xx";

        Appt app = new Appt(hour,
                min,
                day,
                month,
                year,
                title,
                description);

        app.setStartHour(hour + 1);
        app.setStartMinute(min + 1);
        app.setStartDay(day + 1);
        app.setStartMonth(month + 1);
        app.setStartYear(year + 1);
        app.setTitle(title + "x");
        app.setDescription(description + "x");

        assertTrue(app.getValid());
        assertEquals(hour + 1, app.getStartHour());
        assertEquals(min + 1, app.getStartMinute());
        assertEquals(day + 1, app.getStartDay());
        assertEquals(month + 1, app.getStartMonth());
        assertEquals(year + 1, app.getStartYear());
        assertEquals(title + "x", app.getTitle());
        assertEquals(description + "x", app.getDescription());
        app.toString();
    }

    @Test
    public void test03() throws Throwable {
        int hour = -1;
        int min = -1;
        int day = -1;
        int month = -1;
        int year = 1917;
        Appt app = new Appt(hour,
                min,
                day,
                month,
                year,
                null,
                null);

        assertFalse(app.getValid());
        app.setStartHour(0);
        assertFalse(app.getValid());
        app.setStartMinute(31);
        assertFalse(app.getValid());
        app.setStartDay(11);
        assertFalse(app.getValid());
        app.setStartMonth(05);
        assertTrue(app.getValid());
    }

    @Test
    public void test04() throws Throwable {
        int hour = 25;
        int min = 65;
        int day = 35;
        int month = 13;
        int year = 1917;
        Appt app = new Appt(hour,
                min,
                day,
                month,
                year,
                null,
                null);

        assertFalse(app.getValid());
        app.setStartHour(0);
        assertFalse(app.getValid());
        app.setStartMinute(31);
        assertFalse(app.getValid());
        app.setStartDay(11);
        assertFalse(app.getValid());
        app.setStartMonth(05);
        assertTrue(app.getValid());
    }

    @Test
    public void test05() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setStartDay(-1);
        assertEquals(false, app.getValid());
        app.setStartDay(32);
        assertEquals(false, app.getValid());
    }

    @Test
    public void test06() throws Throwable {
        int hour = 13;
        int min = 30;
        int day = 10;
        int month = 4;
        int year = 1917;
        String title = "a";
        String description = "aa";

        Appt app = new Appt(hour,
                min,
                day,
                month,
                year,
                title,
                description);

        assertTrue(app.getValid());
        assertEquals(hour, app.getStartHour());
        assertEquals(min, app.getStartMinute());
        assertEquals(day, app.getStartDay());
        assertEquals(month, app.getStartMonth());
        assertEquals(year, app.getStartYear());
        assertEquals(title, app.getTitle());
        assertEquals(description, app.getDescription());
    }

    @Test
    public void test07() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setDescription(null);
        assertEquals("", app.getDescription());

    }

    @Test
    public void test08() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setStartYear(1917);

    }

    @Test
    public void test09() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setStartMinute(79);
        assertEquals(false, app.getValid());
        app.setStartMinute(-1);
        assertEquals(false, app.getValid());

    }

    @Test
    public void test10() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setStartHour(-1);
        assertEquals(false, app.getValid());
        app.setStartHour(24);
        assertEquals(false, app.getValid());

    }

    @Test
    public void test11() throws Throwable {
        Appt app = new Appt(23, 45, 10, 8, 1916, "x", "xx");
        app.setStartMonth(1900);
        assertEquals(false, app.getValid());
        app.setStartMonth(-1);
        assertEquals(false, app.getValid());

    }

    @Test
    public void test12() throws Throwable {
        int hour = 13;
        int min = 30;
        int day = 10;
        int month = 4;
        int year = 1917;
        String title = "a";
        String description = "aa";

        Appt app = new Appt(hour,
                min,
                day,
                month,
                year,
                title,
                description);

        assertTrue(app.getValid());
        assertEquals(13, app.getStartHour());
        assertEquals(30, app.getStartMinute());
        assertEquals(10, app.getStartDay());
        assertEquals(04, app.getStartMonth());
        assertEquals(1917, app.getStartYear());
        assertEquals("a", app.getTitle());
        assertEquals("aa", app.getDescription());
        assertEquals("\t4/10/1917 at 1:30pm ,a, aa\n", app.toString());

    }


}
