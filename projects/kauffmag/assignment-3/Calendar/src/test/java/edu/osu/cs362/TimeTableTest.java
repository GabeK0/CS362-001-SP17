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


    @Test
    public void test01() throws Throwable {
        int hour = 13;
        int min = 30;
        int day = 11;
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

        app.setStartHour(14);
        app.setStartMinute(31);
        app.setStartDay(13);
        app.setStartMonth(05);
        app.setStartYear(1918);
        app.setTitle("x");
        app.setDescription("xx");

        assertTrue(app.getValid());
        assertEquals(14, app.getStartHour());
        assertEquals(31, app.getStartMinute());
        assertEquals(13, app.getStartDay());
        assertEquals(05, app.getStartMonth());
        assertEquals(1918, app.getStartYear());
        assertEquals("x", app.getTitle());
        assertEquals("xx", app.getDescription());
        app.toString();
    }

    @Test
    public void test02() throws Throwable {
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
        app.setStartDay(13);
        assertFalse(app.getValid());
        app.setStartMonth(05);
        assertTrue(app.getValid());
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
        app.setStartDay(13);
        assertFalse(app.getValid());
        app.setStartMonth(05);
        assertTrue(app.getValid());
    }

    @Test
    public void test04() throws Throwable {
        int hour = 13;
        int min = 30;
        int day = 11;
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
        assertEquals(11, app.getStartDay());
        assertEquals(04, app.getStartMonth());
        assertEquals(1917, app.getStartYear());
        assertEquals("a", app.getTitle());
        assertEquals("aa", app.getDescription());
    }

    @Test
    public void test05() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = null;
        Appt app = new Appt(19, 11, 3, 4, 1916, "Joeo", "need to go");
        table.deleteAppt(apps, app);

    }

    @Test
    public void test06() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = new LinkedList<Appt>();
        Appt app = new Appt(-1, 11, 3, 4, 1916, "Joeo", "need to go");
        table.deleteAppt(apps, app);

    }

    @Test
    public void test07() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = new LinkedList<Appt>();
        Appt app = new Appt(11, 11, 3, 4, 1916, "Joeo", "need to go");
        Appt app2 = new Appt(5, 11, 3, 4, 1916, "boeing", "need to build");
        apps.add(app);
        apps.add(app2);
        GregorianCalendar gregOne = new GregorianCalendar(1916, 4, 3);
        GregorianCalendar gregTwo = new GregorianCalendar(1916, 5, 4);
        table.getApptRange(apps, gregOne, gregTwo);
    }

    @Test
    public void test08() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = new LinkedList<Appt>();
        Appt app = new Appt(11, 11, 3, 4, 1916, "Joeo", "need to go");
        Appt app2 = new Appt(-1, 11, 3, 4, 1916, "boeing", "need to build");
        apps.add(app);
        apps.add(app2);
        GregorianCalendar gregOne = new GregorianCalendar(1916, 4, 3);
        GregorianCalendar gregTwo = new GregorianCalendar(1916, 5, 4);
        table.getApptRange(apps, gregOne, gregTwo);
    }

    @Test
    public void test09() throws Throwable {
        TimeTable table = new TimeTable();

    }

    @Test
    public void test10() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = new LinkedList<Appt>();
        Appt app = new Appt(11, 12, 22, 03, 1917,
                "Joe", "a");
        Appt app2 = new Appt(12, 12, 22, 03, 1917,
                "Bro", "b");
        Appt app3 = new Appt(12, 12, 22, 03, 1917,
                "Go", "c");
        apps.add(app);
        apps.add(app2);
        apps.add(app3);
        table.getApptRange(apps, new GregorianCalendar(1917, 3, 1), new GregorianCalendar(1917, 3, 25));
        table.deleteAppt(apps, app3);
        table.deleteAppt(apps, new Appt(-1,0,0,0,0,"",""));

    }


    @Test
    public void test11() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = new LinkedList<Appt>();
        Appt app = null;
        apps.add(app);
        table.deleteAppt(apps, app);

    }

    @Test
    public void test12() {
        TimeTable table = new TimeTable();
        LinkedList<Appt> apps = new LinkedList<Appt>();
        Appt app = new Appt(19, 11, 3, 4, 1916, "a", "aa");
        table.deleteAppt(apps, app);

    }

}
