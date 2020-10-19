package com.thefortress.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity (name = "Soldier")
@Table (name = "Soldier")
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

    public String getSoldierRank() {
        return soldierRank;
    }

    public void setSoldierRank(String rank) {
        this.soldierRank = rank;
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

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, soldierRank, platoonNumber, soldierID);
    }
}
