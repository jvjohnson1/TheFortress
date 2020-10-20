package com.thefortress.entity;

import java.util.List;

/**
 * A platoon (in this simplified military theme)consists of many privates and one Lieutenant
 * as Commanding Officer.  No squads or non-commissioned officers are used.
 * Note that the Captain is not part of any platoon
 */
public class Platoon {
    private int platoonNumber;
    private Soldier commandingOfficer;
    private List<Soldier> members;

    /**
     * Construct a basic Platoon object
     */
    public Platoon() {

    }

    /**
     * Standard get method for platoonNumber
     * @return platoonNumber
     */
    public int getPlatoonNumber() {
        return platoonNumber;
    }

    /**
     * Standard set method for platoonNumber
     * @param platoonNumber
     */
    public void setPlatoonNumber(int platoonNumber) {
        this.platoonNumber = platoonNumber;
    }

    /**
     * Standard get method for commandingOfficer
     * @return Soldier commandingOfficer
     */
    public Soldier getCommandingOfficer() {
        return commandingOfficer;
    }

    /**
     * Set method for commanding officer check to make sure the soldier sent as a parameter
     * is a Lieutenant
     * @param commandingOfficer
     */
    public void setCommandingOfficer(Soldier commandingOfficer) {
        if (commandingOfficer.getSoldierRank() == "Lieutenant"){

            this.commandingOfficer = commandingOfficer;
        }//Need to throw some kind of exception if the rank is wrong
    }
}
