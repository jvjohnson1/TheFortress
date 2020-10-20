package com.thefortress.entity;

/**
 * Defined bridge table for many to many relationship
 * Between soldiers and duties
 * This is an incomplete class with no methods and is not currently used at
 * the time of Checkpoint 2
 */

public class Assignment {
    private int soldierID;
    private int dutyID;

    /**
     * Constructs basic Assignment object
     */
    public Assignment() {
    }

    /**
     * Standard get method for soldier ID
     * @return soldierID
     */
    public int getSoldierID() {
        return soldierID;
    }

    /**
     * Standard set method for soldier ID
     * @param soldierID
     */
    public void setSoldierID(int soldierID) {
        this.soldierID = soldierID;
    }

    /**
     * Standard get method for duty.
     * @return duty
     */
    public int getDutyID() {
        return dutyID;
    }

    /**
     * Standard set method for duty
     * @param dutyID
     */
    public void setDutyID(int dutyID) {
        this.dutyID = dutyID;
    }


}
