package com.jakezuehlke;

import java.util.Calendar;

/**
 * Creates a Calendar object of the current day and time.
 * Generates a random check-in time between the hours of 7am and 12pm.
 * Returns the Calendar object with set HOUR_OF_DAY, MINUTE, AND SECOND.
 * @author Jake Zuehlke
 */
public class GenerateCheckInTime
{
    private Calendar checkInTime = Calendar.getInstance();

    /**
     * Generates and sets random numbers to HOUR_OF_DAY, MINUTE, and SECOND.
     */
    public GenerateCheckInTime()
    {
        this.checkInTime.set(Calendar.HOUR_OF_DAY, ((int)(Math.random() * 5 + 7)));
        this.checkInTime.set(Calendar.MINUTE, ((int)(Math.random() * 60)));
        this.checkInTime.set(Calendar.SECOND, ((int)(Math.random() * 60)));
    }

    /**
     * @return Calendar object with set HOUR_OF_DAY, MINUTE, AND SECOND.
     */
    public Calendar getCheckInTime()
    {
        return checkInTime;
    }
}