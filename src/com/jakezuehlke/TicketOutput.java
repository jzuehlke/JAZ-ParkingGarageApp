package com.jakezuehlke;

/**
 * Output ParkingBill as a dashboard item or as an invoice.
 * @author Jake Zuehlke
 */
public class TicketOutput
{
    private Writer consoleWriter = new ConsoleWriter();

    /**
     * This output represents a printed out check-in ticket.
     * @param parkingBill
     */
    public void outputCheckInTicket(ParkingBill parkingBill)
    {
        consoleWriter.writeLine("\nBest Value Parking Garage"
            + "\n===== Place On Dash ====="
            + "\nVehicle ID: " + parkingBill.getVehicleID()
            + "\nRate: " + parkingBill.getTicketType()
            + "\nCheck-In Time: " + parkingBill.getCheckInTimeString()
            + "\nDo not lose this ticket!  Lost fee is $25");
    }

    /**
     * This output represents a printed out invoice.
     * @param parkingBill
     */
    public void outputInvoice(ParkingBill parkingBill)
    {
        consoleWriter.writeLine("\nBest Value Parking Garage"
            + "\n======== Invoice ========"
            + "\nVehicle ID: " + parkingBill.getVehicleID()
            + "\nRate: " + parkingBill.getTicketType()
            + "\nCheck-In Time: " + parkingBill.getCheckInTimeString()
            + "\nCheck-Out Time: " + parkingBill.getCheckOutTimeString()
            + "\nHours Parked: " + String.format("%.1f", parkingBill.getHoursParked())
            + "\nAmount Due: $" + String.format("%.2f",parkingBill.getAmountDue()));
    }
}
