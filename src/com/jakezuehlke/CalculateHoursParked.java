package com.jakezuehlke;

import java.util.Calendar;

/**
 * This class accepts two Calendar objects, then converts their HOUR_OF_DAY, MINUTE, and SECOND to a double.
 * Returns the difference between the two Calendar conversions as a double.
 * @author Jake Zuehlke
 */
public class CalculateHoursParked
{
    /**
     * Converts Calendar objects' HOUR_OF_DAY, MINUTE, and SECOND to a double.
     * @param checkInTime
     * @param checkOutTime
     * @return Difference between checkInTime and checkOutTime as a double.
     */
    public double getHoursParked(Calendar checkInTime, Calendar checkOutTime)
    {
        //convert checkInTime calendar to double
        double checkIn = checkInTime.get(Calendar.HOUR_OF_DAY)
                + (checkInTime.get(Calendar.MINUTE) / 60.0)
                + (checkInTime.get(Calendar.SECOND) / 3600.0);

        //convert checkOutTime calendar to double
        double checkOut = checkOutTime.get(Calendar.HOUR_OF_DAY)
                + (checkOutTime.get(Calendar.MINUTE) / 60.0)
                + (checkOutTime.get(Calendar.SECOND) / 3600.0);

        return (checkOut - checkIn);
    }
}