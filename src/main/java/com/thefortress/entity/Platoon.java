package com.thefortress.entity;

import java.util.List;

public class Platoon {
    private int platoonNumber;
    private Soldier commandingOfficer;
    private List<Soldier> members;

    public Platoon() {

    }

    public int getPlatoonNumber() {
        return platoonNumber;
    }

    public void setPlatoonNumber(int platoonNumber) {
        this.platoonNumber = platoonNumber;
    }

    public Soldier getCommandingOfficer() {
        return commandingOfficer;
    }

    public void setCommandingOfficer(Soldier commandingOfficer) {
        if (commandingOfficer.getSoldierRank() == "Lieutenant"){

            this.commandingOfficer = commandingOfficer;
        }//Need to throw some kind of exception if the rank is wrong
    }
}
