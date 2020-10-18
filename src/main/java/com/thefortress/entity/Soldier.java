package com.thefortress.entity;

import javax.persistence.*;


@Entity (name = "Soldier")
@Table (name = "Soldier")
public class Soldier {
    private String firstName;
    private String lastName;
    private String userName;
    private String rank;
    private int platoonNumber;

    @Id
    private int soldierID; //using an int makes sorting logical

    public Soldier() {

    }

    public Soldier(String first, String last, String user, String rank, int id, int platoon) {
        this.setFirstName(first);
        this.setLastName(last);
        this.setUserName(user);
        this.setSoldierID(id);
        this.setRank(rank);
        this.setPlatoonNumber(platoon);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPlatoonNumber() {
        return platoonNumber;
    }

    public void setPlatoonNumber(int platoonNumber) {
        this.platoonNumber = platoonNumber;
    }

    public int getSoldierID() {
        return soldierID;
    }

    public void setSoldierID(int soldierID) {
        this.soldierID = soldierID;
    }
}
