package com.jakezuehlke;

import java.util.Calendar;

/**
 * Creates a Calendar object of the current day and time.
 * Generates a random check-out time between the hours of 1pm and 11pm.
 * Returns the Calendar object with set HOUR_OF_DAY, MINUTE, AND SECOND.
 * @author Jake Zuehlke
 */
public class GenerateCheckOutTime
{
    private Calendar checkOutTime = Calendar.getInstance();

    /**
     * Generates and sets random numbers to HOUR_OF_DAY, MINUTE, and SECOND.
     */
    public GenerateCheckOutTime()
    {
        this.checkOutTime.set(Calendar.HOUR_OF_DAY, ((int)(Math.random() * 10 + 13)));
        this.checkOutTime.set(Calendar.MINUTE, ((int)(Math.random() * 60)));
        this.checkOutTime.set(Calendar.SECOND, ((int)(Math.random() * 60)));
    }

    /**
     * @return Calendar object with set HOUR_OF_DAY, MINUTE, AND SECOND.
     */
    public Calendar getCheckOutTime()
    {
        return this.checkOutTime;
    }
}