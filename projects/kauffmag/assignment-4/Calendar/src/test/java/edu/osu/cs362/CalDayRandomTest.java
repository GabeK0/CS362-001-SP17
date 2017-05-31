package edu.osu.cs362;


import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.Random;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

    /**
     * Generate Random Tests that tests CalDay Class.
     */
    @Test
    public void radnomtest() throws Throwable {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            GregorianCalendar calendar = new GregorianCalendar(random.nextInt(3000) - 500, random.nextInt(15) - 2, random.nextInt(40) - 5, random.nextInt(30) - 3, random.nextInt(70) - 7);
            CalDay calDay = new CalDay(calendar);
            for (int j = 0; j < random.nextInt(10); j++)
                calDay.addAppt(new Appt(random.nextInt(30) - 3, random.nextInt(70) - 7, random.nextInt(40) - 5, random.nextInt(15) - 2, random.nextInt(3000) - 500, random.nextInt(1000) + "", random.nextInt(1000) + ""));
        }


    }


}
