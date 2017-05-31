package edu.osu.cs362;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Random;


/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

    /**
     * Generate Random Tests that tests TimeTable Class.
     */
    @Test
    public void radnomtest() throws Throwable {
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            TimeTable table = new TimeTable();
            LinkedList<Appt> appts = new LinkedList<Appt>();
            Appt appt = null;
            for (int j = 0; j < 50; j++) {
                if (random.nextBoolean()) {
                    appt = new Appt(random.nextInt(30) - 3, random.nextInt(70) - 7, random.nextInt(40) - 5, random.nextInt(15) - 2, random.nextInt(3000) - 500, random.nextInt(1000) + "", random.nextInt(1000) + "");
                    appts.add(appt);
                } else if (random.nextBoolean())
                    table.deleteAppt(appts, appt);
                else
                    table.deleteAppt(appts, new Appt(random.nextInt(30) - 3, random.nextInt(70) - 7, random.nextInt(40) - 5, random.nextInt(15) - 2, random.nextInt(3000) - 500, random.nextInt(1000) + "", random.nextInt(1000) + ""));
            }
        }

    }


}
