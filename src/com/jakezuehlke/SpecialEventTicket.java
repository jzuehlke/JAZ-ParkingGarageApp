package com.jakezuehlke;

/**
 * Implements Ticket to modify generateTicket to return a ParkingBill that is generated by the constructor.
 * A check-in ticket for a special event is created by utilizing GenerateCheckInTime and a TicketType enum
 * in ParkingBill's constructor.
 * @author Jake Zuehlke
 */
public class SpecialEventTicket implements Ticket
{
    private ParkingBill parkingBill;

    /**
     * Constructor.  Utilizes GenerateCheckInTime to set a checkInTime and checkOutTime for ParkingBill's Constructor.
     * Additionally, a TicketType enum value (in this case, SPECIAL) is also used to build the ParkingBill.
     */
    public SpecialEventTicket()
    {
        GenerateCheckInTime checkInTime = new GenerateCheckInTime();

        this.parkingBill =
                new ParkingBill(TicketType.SPECIAL, checkInTime.getCheckInTime(), checkInTime.getCheckInTime());
    }

    /**
     * Override interface's method, generateTicket, to return parkingBill.
     * @return A newly constructed ParkingBill.
     */
    @Override
    public ParkingBill generateTicket()
    {
        return parkingBill;
    }
}