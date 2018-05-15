package com.jakezuehlke;

/**
 * This finishes a checked in ticket, unless it's a LOST ticket.
 * In the case of a LOST ticket, generate a new ticket.
 * @author Jake Zuehlke
 */
public class CheckOutTicket
{
    private FeeFactory feeFactory = new FeeFactory();
    private GenerateCheckOutTime checkOutTime = new GenerateCheckOutTime();
    private CalculateHoursParked calculateHoursParked = new CalculateHoursParked();

    /**
     * Finish a ticket by setting the checkOutTime, hoursParked, and amountDue.
     * Find these values by using GenerateCheckOutTime, CalculateHoursParked, and FeeFactory respectively.
     * @return Completed ParkingBill.
     */
    public ParkingBill getCheckOutTicket(ParkingBill parkingBill)
    {
        double hoursParked = 0.0;

        //find hours parked with CalculateHoursParked class, ignore for LOST tickets
        if(parkingBill.getTicketType() != TicketType.LOST)
        {
            hoursParked = calculateHoursParked.getHoursParked(
                parkingBill.getCheckInTime(),
                checkOutTime.getCheckOutTime());
        }


        //switch on parkingBill's TicketType to modify the ParkingBill in the Garage ArrayList
        switch (parkingBill.getTicketType())
        {
            case STANDARD: //set newly generated checkout time, get fee using FeeFactory
                parkingBill.setCheckOutTime(checkOutTime.getCheckOutTime());
                parkingBill.setHoursParked(hoursParked);
                feeFactory.findFee(TicketType.STANDARD).getFee(parkingBill);
                break;
            case SPECIAL: //set newly generated checkout time, get fee using FeeFactory
                parkingBill.setCheckOutTime(checkOutTime.getCheckOutTime());
                parkingBill.setHoursParked(hoursParked);
                feeFactory.findFee(TicketType.SPECIAL).getFee(parkingBill);
                break;
            case LOST: //lost tickets have same check out time as check in time, which is the default. use FeeFactory
                parkingBill.setHoursParked(hoursParked);
                feeFactory.findFee(TicketType.LOST).getFee(parkingBill);
                break;
            // new Enum TicketTypes here
        }
        return parkingBill;
    }
}