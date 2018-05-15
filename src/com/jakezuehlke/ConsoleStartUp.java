package com.jakezuehlke;

/**
 * This class directs the application's logic flow by utilizing the CheckInConsole's and CheckOutConsole's
 * methods and input String.  This class also adds to the Garage Singleton's parkingBills ArrayList.
 * @author Jake Zuehlke
 */
public class ConsoleStartUp
{
    private ParkingBill parkingBill;
    private CloseGarage closeGarage = new CloseGarage();
    private TicketOutput ticketOutput = new TicketOutput();
    private TicketFactory ticketFactory = new TicketFactory();
    private CheckOutTicket checkOutTicket = new CheckOutTicket();

    /**
     * Use do while loop, an if statement, and switch cases to direct the application's logic flow.
     */
    public void runParkingGarage()
    {
        do //loop app as long as option 3 (close garage) is not selected from the check in console
        {
            //run check-in console
            CheckInConsole.INSTANCE.displayConsole();

            //switch on check-in console's validated user input
            switch(CheckInConsole.INSTANCE.getInput())
            {
                case "1": //use TicketFactory to generate and add a standard ticket to the ArrayList Singleton
                    parkingBill = ticketFactory.findTicket(TicketType.STANDARD).generateTicket();
                    Garage.INSTANCE.addParkingBill(parkingBill);
                    break;
                case "2": //use TicketFactory to generate and add a special event ticket to the ArrayList Singleton
                    parkingBill = ticketFactory.findTicket(TicketType.SPECIAL).generateTicket();
                    Garage.INSTANCE.addParkingBill(parkingBill);
                    break;
                case "3": //close garage
                    closeGarage.getSummary();
                    closeGarage.saveToFile();
                    break;
            }

            //only continue if garage isn't closed
            if(!CheckInConsole.INSTANCE.getInput().equals("3"))
            {
                //output checked in ticket for customer
                ticketOutput.outputCheckInTicket(parkingBill);

                //run check-out console
                CheckOutConsole.INSTANCE.displayConsole();

                //switch on check-out console's validated user input
                switch(CheckOutConsole.INSTANCE.getInput())
                {
                    case "1": //complete the checked-in ticket using GenerateCheckOutTicket, add completed ParkingBill to Garage
                        parkingBill = checkOutTicket.getCheckOutTicket(parkingBill);
                        Garage.INSTANCE.setParkingBill(parkingBill.getVehicleID() - 1, parkingBill);
                        break;
                    case "2": //use TicketFactory to generate and add a lost ticket to the ArrayList Singleton
                        parkingBill = ticketFactory.findTicket(TicketType.LOST).generateTicket();
                        parkingBill = checkOutTicket.getCheckOutTicket(parkingBill);
                        Garage.INSTANCE.addParkingBill(parkingBill);
                        break;
                }

                //output invoice
                ticketOutput.outputInvoice(parkingBill);
            }
        } while(!CheckInConsole.INSTANCE.getInput().equals("3"));
    }
}