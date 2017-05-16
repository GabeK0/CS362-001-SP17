package edu.osu.cs362;
/**
 * This class provides a basic set of test cases for the
 * Appt class.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {

    public void test00()  throws Throwable  {
        Appt appt0 = new Appt(5, 31, 31, 5, 5, "", "");
        String string0 = appt0.toString();
        assertEquals("\t5/31/5 at 5:31am ,, \n", string0);
        assertNotNull(string0);
    }

    public void test01()  throws Throwable  {
        Appt appt0 = new Appt(8, 8, 0, 8, 0, "`jNe7X,P0/Q1p41pPh", "`jNe7X,P0/Q1p41pPh");
        assertEquals(0, appt0.getStartDay());

        appt0.setStartDay(8);
        boolean boolean0 = appt0.getValid();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Appt appt0 = new Appt(10, 59, 59, 59, 31, (String) null, (String) null);
        String string0 = appt0.getTitle();
        assertEquals(10, appt0.getStartHour());
        assertEquals(31, appt0.getStartYear());
        assertNotNull(string0);
        assertEquals(59, appt0.getStartMonth());
        assertFalse(appt0.getValid());
        assertEquals(59, appt0.getStartDay());
        assertEquals(59, appt0.getStartMinute());
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Appt appt0 = new Appt((-939), 0, 0, 0, 0, (String) null, "");
        int int0 = appt0.getStartYear();
        assertEquals(0, appt0.getStartMinute());
        assertEquals(0, appt0.getStartDay());
        assertFalse(appt0.getValid());
        assertEquals(0, int0);
        assertEquals(-939, appt0.getStartHour());
        assertEquals(0, appt0.getStartMonth());
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Appt appt0 = new Appt(0, 0, 0, 0, 11, " at ", (String) null);
        int int0 = appt0.getStartYear();
        assertEquals(0, appt0.getStartHour());
        assertEquals(" at ", appt0.getTitle());
        assertFalse(appt0.getValid());
        assertEquals(11, int0);
        assertEquals(0, appt0.getStartMonth());
        assertEquals(0, appt0.getStartDay());
        assertEquals(0, appt0.getStartMinute());
        assertEquals("", appt0.getDescription());
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Appt appt0 = new Appt((-510), (-510), (-510), (-510), (-510), "/", "/");
        int int0 = appt0.getStartMonth();
        assertEquals(-510, appt0.getStartDay());
        assertEquals(-510, appt0.getStartMinute());
        assertEquals("/", appt0.getTitle());
        assertEquals(-510, appt0.getStartYear());
        assertFalse(appt0.getValid());
        assertEquals(-510, appt0.getStartHour());
        assertEquals("/", appt0.getDescription());
        assertEquals((-510), int0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        Appt appt0 = new Appt(0, 0, 0, 0, 68, "QyA", "QyA");
        int int0 = appt0.getStartMinute();
        assertEquals(0, appt0.getStartMonth());
        assertEquals(0, int0);
        assertEquals("QyA", appt0.getTitle());
        assertFalse(appt0.getValid());
        assertEquals("QyA", appt0.getDescription());
        assertEquals(0, appt0.getStartHour());
        assertEquals(0, appt0.getStartDay());
        assertEquals(68, appt0.getStartYear());
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        Appt appt0 = new Appt((-3366), 2426, 2426, 0, (-3366), "", "");
        int int0 = appt0.getStartMinute();
        assertEquals(2426, int0);
        assertEquals(-3366, appt0.getStartYear());
        assertEquals(-3366, appt0.getStartHour());
        assertFalse(appt0.getValid());
        assertEquals(0, appt0.getStartMonth());
        assertEquals(2426, appt0.getStartDay());
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        Appt appt0 = new Appt(0, 0, 0, 0, 68, "QyA", "QyA");
        int int0 = appt0.getStartHour();
        assertEquals(0, int0);
        assertEquals(0, appt0.getStartMinute());
        assertEquals(0, appt0.getStartDay());
        assertEquals(0, appt0.getStartMonth());
        assertEquals("QyA", appt0.getDescription());
        assertEquals("QyA", appt0.getTitle());
        assertEquals(68, appt0.getStartYear());
        assertFalse(appt0.getValid());
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        Appt appt0 = new Appt(60, (-1055), 60, (-1055), (-1055), "", "");
        int int0 = appt0.getStartHour();
        assertEquals(-1055, appt0.getStartMinute());
        assertEquals(-1055, appt0.getStartMonth());
        assertFalse(appt0.getValid());
        assertEquals(60, int0);
        assertEquals(60, appt0.getStartDay());
        assertEquals(-1055, appt0.getStartYear());
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        Appt appt0 = new Appt((-1680), 0, (-1680), (-1680), 59, "", "5");
        assertEquals(-1680, appt0.getStartDay());

        appt0.setStartDay(0);
        int int0 = appt0.getStartDay();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        Appt appt0 = new Appt(72, 0, 12, 1, 12, "2o6/F53 L`>4", "rQ2^Es");
        int int0 = appt0.getStartDay();
        assertEquals(12, int0);
        assertEquals(72, appt0.getStartHour());
        assertEquals(12, appt0.getStartYear());
        assertEquals(0, appt0.getStartMinute());
        assertEquals(1, appt0.getStartMonth());
        assertEquals("rQ2^Es", appt0.getDescription());
        assertEquals("2o6/F53 L`>4", appt0.getTitle());
        assertFalse(appt0.getValid());
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Appt appt0 = new Appt((-2255), (-2255), (-2255), (-2255), (-2255), "", "");
        appt0.setDescription("");
        assertEquals(-2255, appt0.getStartDay());
        assertFalse(appt0.getValid());
        assertEquals(-2255, appt0.getStartYear());
        assertEquals(-2255, appt0.getStartMonth());
        assertEquals(-2255, appt0.getStartHour());
        assertEquals(-2255, appt0.getStartMinute());
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Appt appt0 = new Appt((-1427), (-1427), (-1427), (-1881), (-1427), "", ", ");
        assertEquals(", ", appt0.getDescription());

        appt0.setDescription((String) null);
        appt0.getDescription();
        assertEquals(-1427, appt0.getStartHour());
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        Appt appt0 = new Appt(17, 17, 17, 17, 17, (String) null, (String) null);
        appt0.setTitle((String) null);
        assertEquals(17, appt0.getStartMonth());
        assertEquals(17, appt0.getStartDay());
        assertFalse(appt0.getValid());
        assertEquals(17, appt0.getStartYear());
        assertEquals(17, appt0.getStartHour());
        assertEquals(17, appt0.getStartMinute());
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        Appt appt0 = new Appt((-510), (-510), (-510), (-510), (-510), "/", "/");
        String string0 = appt0.getTitle();
        assertEquals(-510, appt0.getStartDay());
        assertEquals(-510, appt0.getStartYear());
        assertEquals(-510, appt0.getStartHour());
        assertEquals("/", string0);
        assertFalse(appt0.getValid());
        assertEquals(-510, appt0.getStartMinute());
        assertEquals("/", appt0.getDescription());
        assertEquals(-510, appt0.getStartMonth());
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        Appt appt0 = new Appt((-1298), (-1298), (-869), (-869), (-781), "dL\"d4a`Qy", "dL\"d4a`Qy");
        int int0 = appt0.getStartDay();
        assertEquals(-781, appt0.getStartYear());
        assertEquals((-869), int0);
        assertEquals("dL\"d4a`Qy", appt0.getTitle());
        assertEquals(-1298, appt0.getStartMinute());
        assertEquals(-1298, appt0.getStartHour());
        assertEquals("dL\"d4a`Qy", appt0.getDescription());
        assertEquals(-869, appt0.getStartMonth());
        assertFalse(appt0.getValid());
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        Appt appt0 = new Appt(0, 0, 0, 1761, 0, "YPqg`", "YPqg`");
        boolean boolean0 = appt0.getValid();
        assertFalse(boolean0);
        assertEquals(0, appt0.getStartDay());
        assertEquals(0, appt0.getStartHour());
        assertEquals(0, appt0.getStartMinute());
        assertEquals(1761, appt0.getStartMonth());
        assertEquals("YPqg`", appt0.getTitle());
        assertEquals("YPqg`", appt0.getDescription());
        assertEquals(0, appt0.getStartYear());
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Appt appt0 = new Appt((-1427), (-1427), (-1427), (-1881), (-1427), "", ", ");
        int int0 = appt0.getStartHour();
        assertEquals(-1427, appt0.getStartDay());
        assertEquals(-1427, appt0.getStartMinute());
        assertEquals(-1881, appt0.getStartMonth());
        assertEquals(-1427, appt0.getStartYear());
        assertEquals("", appt0.getTitle());
        assertFalse(appt0.getValid());
        assertEquals((-1427), int0);
        assertEquals(", ", appt0.getDescription());
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        Appt appt0 = new Appt((-1427), (-1427), (-1427), (-1881), (-1427), "", ", ");
        int int0 = appt0.getStartYear();
        assertFalse(appt0.getValid());
        assertEquals(-1427, appt0.getStartMinute());
        assertEquals(-1427, appt0.getStartDay());
        assertEquals(-1427, appt0.getStartHour());
        assertEquals(-1881, appt0.getStartMonth());
        assertEquals("", appt0.getTitle());
        assertEquals((-1427), int0);
        assertEquals(", ", appt0.getDescription());
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        Appt appt0 = new Appt((-510), (-510), (-510), (-510), (-510), "/", "/");
        int int0 = appt0.getStartMinute();
        assertEquals(-510, appt0.getStartMonth());
        assertEquals("/", appt0.getTitle());
        assertFalse(appt0.getValid());
        assertEquals(-510, appt0.getStartDay());
        assertEquals((-510), int0);
        assertEquals(-510, appt0.getStartYear());
        assertEquals(-510, appt0.getStartHour());
        assertEquals("/", appt0.getDescription());
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        Appt appt0 = new Appt((-1427), (-1427), (-1427), (-1881), (-1427), "", ", ");
        String string0 = appt0.getDescription();
        assertEquals(-1427, appt0.getStartMinute());
        assertEquals(-1427, appt0.getStartYear());
        assertEquals(-1427, appt0.getStartHour());
        assertEquals(-1427, appt0.getStartDay());
        assertEquals(-1881, appt0.getStartMonth());
        assertEquals("", appt0.getTitle());
        assertEquals(", ", string0);
        assertFalse(appt0.getValid());
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        Appt appt0 = new Appt(23, 0, 1500, 0, 23, "", "/p6s<+=AaO*Yf{*&-V");
        int int0 = appt0.getStartMonth();
        assertFalse(appt0.getValid());
        assertEquals(23, appt0.getStartHour());
        assertEquals(1500, appt0.getStartDay());
        assertEquals("/p6s<+=AaO*Yf{*&-V", appt0.getDescription());
        assertEquals(23, appt0.getStartYear());
        assertEquals(0, int0);
        assertEquals(0, appt0.getStartMinute());
        assertEquals("", appt0.getTitle());
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        Appt appt0 = new Appt(12, 12, 12, 12, (-10), ">{ecu~-v*4ZgZ\u0002/", ">{ecu~-v*4ZgZ\u0002/");
        String string0 = appt0.toString();
        assertNotNull(string0);
        assertEquals("\t12/12/-10 at 12:12pm ,>{ecu~-v*4ZgZ\u0002/, >{ecu~-v*4ZgZ\u0002/\n", string0);
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        Appt appt0 = new Appt((-1427), (-1427), (-1427), (-1881), (-1427), "", ", ");
        String string0 = appt0.toString();
        assertEquals(-1427, appt0.getStartHour());
        assertEquals(-1427, appt0.getStartYear());
        assertEquals(-1427, appt0.getStartMinute());
        assertNull(string0);
        assertEquals("", appt0.getTitle());
        assertEquals(-1881, appt0.getStartMonth());
        assertEquals(-1427, appt0.getStartDay());
        assertEquals(", ", appt0.getDescription());
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        Appt appt0 = new Appt(12, 12, 12, 944, 12, "E", "E");
        int int0 = appt0.getStartMonth();
        assertEquals(12, appt0.getStartYear());
        assertEquals(944, int0);
        assertEquals(12, appt0.getStartHour());
        assertEquals(12, appt0.getStartMinute());
        assertEquals(12, appt0.getStartDay());
        assertFalse(appt0.getValid());
        assertEquals("E", appt0.getDescription());
        assertEquals("E", appt0.getTitle());
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        Appt appt0 = new Appt(0, 1414, 0, 0, 2269, "", "");
        assertEquals(2269, appt0.getStartYear());
        assertEquals(0, appt0.getStartHour());
        assertEquals(0, appt0.getStartDay());
        assertEquals(0, appt0.getStartMonth());
        assertFalse(appt0.getValid());
        assertEquals(1414, appt0.getStartMinute());
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        Appt appt0 = new Appt(6, (-2472), 6, 6, (-2472), (String) null, (String) null);
        assertFalse(appt0.getValid());
        assertEquals(-2472, appt0.getStartYear());
        assertEquals(6, appt0.getStartHour());
        assertEquals(6, appt0.getStartDay());
        assertEquals(-2472, appt0.getStartMinute());
        assertEquals(6, appt0.getStartMonth());
    }

    @Test(timeout = 4000)
    public void test28()  throws Throwable  {
        Appt appt0 = new Appt((-510), (-510), (-510), (-510), (-510), "/", "/");
        appt0.setStartHour(871);
        assertEquals(871, appt0.getStartHour());
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        Appt appt0 = new Appt((-1680), 0, (-1680), (-1680), 59, "", "5");
        assertEquals("", appt0.getTitle());

        appt0.setTitle("5");
        assertEquals("5", appt0.getTitle());
    }

    @Test(timeout = 4000)
    public void test30()  throws Throwable  {
        Appt appt0 = new Appt(11, 31, 0, 11, 31, "", "");
        assertEquals(31, appt0.getStartMinute());

        appt0.setStartMinute(0);
        assertEquals(31, appt0.getStartYear());
    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable  {
        Appt appt0 = new Appt(11, 31, 0, 11, 31, "", "");
        appt0.setStartYear(31);
        assertFalse(appt0.getValid());
        assertEquals(0, appt0.getStartDay());
        assertEquals(11, appt0.getStartMonth());
        assertEquals(31, appt0.getStartYear());
        assertEquals(11, appt0.getStartHour());
        assertEquals(31, appt0.getStartMinute());
    }

    @Test(timeout = 4000)
    public void test32()  throws Throwable  {
        Appt appt0 = new Appt(12, 12, 12, 12, (-10), ">{ecu~-v*4ZgZ\u0002/", ">{ecu~-v*4ZgZ\u0002/");
        assertEquals(12, appt0.getStartMonth());

        appt0.setStartMonth((-10));
        assertEquals(12, appt0.getStartHour());
    }

    @Test(timeout = 4000)
    public void test33()  throws Throwable  {
        Appt appt0 = new Appt(11, 31, 0, 11, 31, "", "");
        assertEquals(0, appt0.getStartDay());

        appt0.setStartDay(11);
        String string0 = appt0.toString();
        assertEquals("\t11/11/31 at 11:31am ,, \n", string0);
    }
}
