package com.thefortress.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity (name = "Soldier")
@Table (name = "Soldier")
/**
 * Defines Soldier class, the most basic data used
 */
public class Soldier {
    private String firstName;
    private String lastName;
    private String userName;
    private String soldierRank;
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
        this.setSoldierRank(rank);
        this.setPlatoonNumber(platoon);
    }

    /**
     * Standard get method for first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Standard set method for first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Standard get method for last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Standard set method for last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Standard get method for user name
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Standard set method for user name
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Standard get method for a soldier's rank
     * @return soldierRank
     */
    public String getSoldierRank() {
        return soldierRank;
    }

    /**
     * Standard set method for soldierRank
     * @param rank
     */
    public void setSoldierRank(String rank) {
        this.soldierRank = rank;
    }

    /**
     * Standard get method for platoonNumber
     * @return platoonNumber
     */
    public int getPlatoonNumber() {
        return platoonNumber;
    }

    /**
     * Standard set method for platoon number
     * @param platoonNumber
     */
    public void setPlatoonNumber(int platoonNumber) {
        this.platoonNumber = platoonNumber;
    }

    /**
     * Standard get method for a soldier's ID
     * @return
     */
    public int getSoldierID() {
        return soldierID;
    }

    /**
     * Standard set method for a soldier's ID
     * @param soldierID
     */
    public void setSoldierID(int soldierID) {
        this.soldierID = soldierID;
    }

    /**
     * Customized toString method
     * @return Soldier class in string format
     */
    @Override
    public String toString() {
        return "Soldier{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", soldierRank='" + soldierRank + '\'' +
                ", platoonNumber=" + platoonNumber +
                ", soldierID=" + soldierID +
                '}';
    }

    /**
     * Compares two soldier objects based on equalivent values
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soldier)) return false;
        Soldier soldier = (Soldier) o;
        return platoonNumber == soldier.platoonNumber &&
                soldierID == soldier.soldierID &&
                Objects.equals(firstName, soldier.firstName) &&
                Objects.equals(lastName, soldier.lastName) &&
                Objects.equals(userName, soldier.userName) &&
                Objects.equals(soldierRank, soldier.soldierRank);
    }

    /**
     * Converts Soldier object to hash code
     * @return hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, soldierRank, platoonNumber, soldierID);
    }
}
