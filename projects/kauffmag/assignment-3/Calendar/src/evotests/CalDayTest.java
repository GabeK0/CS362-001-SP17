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


    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        Appt appt0 = new Appt(7, 1, 15, 2, 6, (String) null, "");
        Appt appt1 = new Appt(1, 1, 1, 7, 7, "*7", (String) null);
        calDay0.addAppt(appt1);
        calDay0.addAppt(appt0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        Appt appt0 = new Appt(7, 1, 15, 2, 6, (String) null, "");
        linkedList0.add(appt0);
        calDay0.addAppt(appt0);
        calDay0.addAppt(appt0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        calDay0.valid = true;
        calDay0.iterator();
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        calDay0.isValid();
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        calDay0.year = 1;
        calDay0.getYear();
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        calDay0.year = (-2162);
        calDay0.getYear();
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        calDay0.getSizeAppts();
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        Appt appt0 = new Appt(1, 1, 1, 0, 0, "UnknownField", " ");
        linkedList0.offerFirst(appt0);
        calDay0.getSizeAppts();
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(58, 58, (-483), (-1586), (-1586), (-2992));
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        calDay0.getMonth();
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        calDay0.month = (-536);
        calDay0.getMonth();
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        calDay0.getDay();
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-7), (-7), (-7), (-40), (-40));
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        calDay0.day = (-7);
        calDay0.getDay();
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Locale locale0 = Locale.KOREAN;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        calDay0.getAppts();
        assertEquals(2014, calDay0.getYear());
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        Appt appt0 = new Appt(1, 1, 1, 0, 0, "UnknownField", " ");
        linkedList0.offerFirst(appt0);
        LinkedList<Appt> linkedList1 = calDay0.getAppts();
        assertEquals(1, linkedList1.size());
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Locale locale0 = Locale.CANADA;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        calDay0.appts = null;
        // Undeclared exception!
        try {
            calDay0.toString();
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("edu.osu.cs362.CalDay", e);
        }
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        CalDay calDay0 = null;
        try {
            calDay0 = new CalDay((GregorianCalendar) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("edu.osu.cs362.CalDay", e);
        }
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-266), (-266), (-266), 0, (-266));
        mockGregorianCalendar0.setLenient(false);
        CalDay calDay0 = null;
        try {
            calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // YEAR
            //
            assertThrownBy("java.util.GregorianCalendar", e);
        }
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        int int0 = calDay0.getYear();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        int int0 = calDay0.getDay();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        int int0 = calDay0.getMonth();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = calDay0.getAppts();
        assertNull(linkedList0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
        Locale locale0 = Locale.JAPANESE;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((TimeZone) zoneInfo0, locale0);
        CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
        boolean boolean0 = calDay0.isValid();
        assertTrue(boolean0);
        assertEquals(2014, calDay0.getYear());
        assertEquals(14, calDay0.getDay());
        assertEquals(1, calDay0.getMonth());
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        calDay0.valid = true;
        Appt appt0 = new Appt(1, 1, 1, 0, 0, "UnknownField", " ");
        linkedList0.offerFirst(appt0);
        String string0 = calDay0.toString();
        assertEquals("\t --- 0/0/0 --- \n --- -------- Appointments ------------ --- \nnull \n", string0);
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        calDay0.valid = true;
        // Undeclared exception!
        try {
            calDay0.iterator();
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("edu.osu.cs362.CalDay", e);
        }
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        Iterator<?> iterator0 = calDay0.iterator();
        assertNull(iterator0);
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
        calDay0.appts = linkedList0;
        Appt appt0 = new Appt(89, 1, 15, 15, 6, (String) null, "");
        linkedList0.add(appt0);
        Appt appt1 = new Appt(1, 1, 1, 7, 7, "*7", (String) null);
        calDay0.addAppt(appt1);
        calDay0.addAppt(appt1);
        assertEquals("", appt1.getDescription());
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        Appt appt0 = new Appt(89, 1, 15, 15, 6, (String) null, "");
        calDay0.addAppt(appt0);
        assertEquals(89, appt0.getStartHour());
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        // Undeclared exception!
        try {
            calDay0.getSizeAppts();
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("edu.osu.cs362.CalDay", e);
        }
    }

    @Test(timeout = 4000)
    public void test28()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        Appt appt0 = new Appt(1, 1, 1, 7, 7, "*7", (String) null);
        // Undeclared exception!
        try {
            calDay0.addAppt(appt0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            assertThrownBy("edu.osu.cs362.CalDay", e);
        }
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        CalDay calDay0 = new CalDay();
        String string0 = calDay0.toString();
        assertEquals("", string0);
    }


}
