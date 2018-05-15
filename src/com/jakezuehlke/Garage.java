package com.jakezuehlke;

import java.util.ArrayList;

/**
 * Enum Singleton for an ArrayList of ParkingBill objects
 * @author Jake Zuehlke
 */
public enum Garage
{
    INSTANCE;

    //global ArrayList of ParkingBills
    private static ArrayList<ParkingBill> parkingBills = new ArrayList<>();

    /**
     * Add a ParkingBill object to the ArrayList collection.
     * @param parkingBill
     */
    public void addParkingBill(ParkingBill parkingBill)
    {
        parkingBills.add(parkingBill);
    }

    /**
     * Set ParkingBill data to a specific ParkingBill at position i.
     * @param i
     * @param parkingBill
     */
    public void setParkingBill(int i, ParkingBill parkingBill)
    {
        parkingBills.set(i, parkingBill);
    }

    /**
     * Get ParkingBill at position i.
     * @param i
     * @return
     */
    public ParkingBill getParkingBill(int i)
    {
        return parkingBills.get(i);
    }

    /**
     * Get entire ArrayList collection object.
     * @return
     */
    public ArrayList<ParkingBill> getParkingBills()
    {
        return parkingBills;
    }
}