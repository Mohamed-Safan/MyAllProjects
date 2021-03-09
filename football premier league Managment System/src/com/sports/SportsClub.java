package com.sports;

import java.io.Serializable;
import java.util.Objects;

public abstract class SportsClub implements Serializable {

    private String nameOfTheClub;
    private String locationOfTheClub;
    private String nameOfTheManager;
    private String registrationNumber;
    private int contactNumberOfTheClub;

    public SportsClub(String nameOfTheClub, String locationOfTheClub, String nameOfTheManager, String registrationNumber, int contactNumberOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
        this.locationOfTheClub = locationOfTheClub;
        this.nameOfTheManager = nameOfTheManager;
        this.registrationNumber = registrationNumber;
        this.contactNumberOfTheClub = contactNumberOfTheClub;
    }

    public String getNameOfTheClub() {
        return nameOfTheClub;
    }

    public void setNameOfTheClub(String nameOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
    }

    public String getLocationOfTheClub() {
        return locationOfTheClub;
    }

    public void setLocationOfTheClub(String locationOfTheClub) {
        this.locationOfTheClub = locationOfTheClub;
    }

    public String getNameOfTheManager() {
        return nameOfTheManager;
    }

    public void setNameOfTheManager(String nameOfTheManager) {
        this.nameOfTheManager = nameOfTheManager;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getContactNumberOfTheClub() {
        return contactNumberOfTheClub;
    }

    public void setContactNumberOfTheClub(int contactNumberOfTheClub) {
        this.contactNumberOfTheClub = contactNumberOfTheClub;
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "nameOfTheClub='" + nameOfTheClub + '\'' +
                ", locationOfTheClub='" + locationOfTheClub + '\'' +
                ", nameOfTheManager='" + nameOfTheManager + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", contactNumberOfTheClub=" + contactNumberOfTheClub +
                '}';
    }

    @Override
    public boolean equals(Object sc) {
        if (this == sc) return true;
        if (!(sc instanceof SportsClub)) return false;
        SportsClub that = (SportsClub) sc;
        return contactNumberOfTheClub == that.contactNumberOfTheClub &&
                Objects.equals(nameOfTheClub, that.nameOfTheClub) &&
                Objects.equals(locationOfTheClub, that.locationOfTheClub) &&
                Objects.equals(nameOfTheManager, that.nameOfTheManager) &&
                Objects.equals(registrationNumber, that.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheClub, locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub);
    }
}
