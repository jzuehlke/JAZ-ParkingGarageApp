package com.jakezuehlke;

import java.util.Calendar;

/**
 * ParkingBill is an object which represents the physical bill printed out to the customer for payment.
 * @author Jake Zuehlke
 */
public class ParkingBill
{
    private int vehicleID;
    private TicketType ticketType;
    private Calendar checkInTime;
    private Calendar checkOutTime;
    private double hoursParked;
    private double amountDue;

    private static int idCount = 0;

    /**
     * Constructor for check-in ticket, which is really just an unfinished ParkingBill.
     * @param ticketType
     * @param checkInTime
     * @param checkOutTime
     */
    public ParkingBill(TicketType ticketType, Calendar checkInTime, Calendar checkOutTime)
    {
        idCount++;
        this.vehicleID = idCount;
        this.ticketType = ticketType;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime; //this must be set initially, but will be changed depending on ticket type
    }

    //Getters
    public int getVehicleID()
    {
        return vehicleID;
    }
    public TicketType getTicketType()
    {
        return ticketType;
    }
    public Calendar getCheckInTime()
    {
        return checkInTime;
    }
    public String getCheckInTimeString()
    {
        return checkInTime.get(Calendar.HOUR_OF_DAY)
                + ":" + checkInTime.get(Calendar.MINUTE)
                + ":" + checkInTime.get(Calendar.SECOND);
    }
    public Calendar getCheckOutTime()
    {
        return checkOutTime;
    }
    public String getCheckOutTimeString()
    {
        return checkOutTime.get(Calendar.HOUR_OF_DAY)
                + ":" + checkOutTime.get(Calendar.MINUTE)
                + ":" + checkOutTime.get(Calendar.SECOND);
    }
    public double getHoursParked()
    {
        return hoursParked;
    }
    public double getAmountDue()
    {
        return amountDue;
    }

    //Setters
    public void setCheckOutTime(Calendar checkOutTime)
    {
        this.checkOutTime = checkOutTime;
    }
    public void setHoursParked(double hoursParked)
    {
        this.hoursParked = hoursParked;
    }
    public void setAmountDue(double amountDue)
    {
        this.amountDue = amountDue;
    }

    /**
     * Overridden toString method for formatted output.
     * @return Detailed and formatted String.
     */
    @Override
    public String toString()
    {
        return "\nVehicle ID: " + vehicleID
            + "\nTicket Type: " + ticketType
            + "\nCheck-In Time: " + getCheckInTimeString()
            + "\nCheck-Out Time: " + getCheckOutTimeString()
            + "\nHours Parked: " + String.format("%.1f", hoursParked)
            + "\nAmount Due: $" + String.format("%.2f", amountDue);
    }
}