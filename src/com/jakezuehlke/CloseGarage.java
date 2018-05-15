package com.jakezuehlke;

import java.util.Calendar;

/**
 * This class contains the methods an administrator would use to close out the application at the end of the day.
 * @author Jake Zuehlke
 */
public class CloseGarage
{
    private Writer consoleWriter = new ConsoleWriter();

    /**
     * Outputs summary info for the day's ParkingBills to console.
     */
    public void getSummary()
    {
        int standardTickets = 0, specialTickets = 0, lostTickets = 0;
        double standardTotal = 0.0, specialTotal = 0.0, lostTotal = 0.0;

        for(ParkingBill pb : Garage.INSTANCE.getParkingBills())
        {
            switch (pb.getTicketType())
            {
                case STANDARD:
                    standardTickets++;
                    standardTotal += pb.getAmountDue();
                    break;
                case SPECIAL:
                    specialTickets++;
                    specialTotal += pb.getAmountDue();
                    break;
                case LOST:
                    lostTickets++;
                    lostTotal += pb.getAmountDue();
                    break;
            }
        }

        double grandTotal = standardTotal + specialTotal + lostTotal;

        consoleWriter.writeLine("\nBest Value Parking Garage"
                + "\n=== Today's Activity ===="
                + "\n$" + standardTotal + " was collected from " + standardTickets + " Check-Ins"
                + "\n$" + specialTotal + " was collected from " + specialTickets + " Special Events"
                + "\n$" + lostTotal + " was collected from " + lostTickets + " Lost Tickets"
                + "\n$" + grandTotal + " was collected overall");
    }

    /**
     * Writes the ArrayList collection of ParkingBills to a file using ParkingBill's overridden toString method.
     */
    public void saveToFile()
    {
        Writer fileWriter = new GarageFileWriter();

        //Output date for file, use first ParkingBill collected
        fileWriter.writeLine(
                "\n----------\n"
                + Garage.INSTANCE.getParkingBill(0).getCheckInTime().get(Calendar.MONTH )
                + "/" + Garage.INSTANCE.getParkingBill(0).getCheckInTime().get(Calendar.DAY_OF_MONTH)
                + "/" + Garage.INSTANCE.getParkingBill(0).getCheckInTime().get(Calendar.YEAR)
                + "\n----------");

        for(ParkingBill pb : Garage.INSTANCE.getParkingBills())
        {
            fileWriter.writeLine(pb.toString());
        }

        //output saved message
        consoleWriter.writeLine("\nToday's activity saved!");
    }
}