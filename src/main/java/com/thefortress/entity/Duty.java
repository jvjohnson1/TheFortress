package com.thefortress.entity;


/**
 * Defines the Duty class
 * Not yet used at the time of Checkpoint 2
 * The simple string variable equipment is a placeholder for a version that is clearly
 * beyond MVP
 */
public class Duty {
    private String dutyTitle;
    private int dutyID;
    private String equipment; //Just a variable until Equipment class is added

    /**
     * Creates a basic duty object
     */
    public Duty() {
    }

    /**
     * Standard get method for dutyTitle
     * @return dutyTitle
     */
    public String getDutyTitle() {
        return dutyTitle;
    }

    /**
     * Standard set method for dutyTitle
     * @param dutyTitle
     */
    public void setDutyTitle(String dutyTitle) {
        this.dutyTitle = dutyTitle;
    }

    /**
     * Standard get method for Duty ID
     * @return dutyID
     */
    public int getDutyID() {
        return dutyID;
    }

    /**
     * Standard set method for dutyID
     * @param dutyID
     */
    public void setDutyID(int dutyID) {
        this.dutyID = dutyID;
    }

    /**
     * Standard get method for equipment
     * @return equipmetn
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Standard set method for equipment
     * @param equipment
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
