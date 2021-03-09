package entities;

import java.io.Serializable;
import java.util.Objects;

public abstract class SportsClub implements Serializable {  //Super class

    //variables
    private String nameOfTheClub;
    private String locationOfTheClub;
    private String nameOfTheManager;
    private String registrationNumber;
    private String contactNumberOfTheClub;


//constructor

    public SportsClub(String nameOfTheClub, String locationOfTheClub, String nameOfTheManager, String registrationNumber, String contactNumberOfTheClub ) {
        this.nameOfTheClub = nameOfTheClub;
        this.locationOfTheClub = locationOfTheClub;
        this.nameOfTheManager = nameOfTheManager;
        this.registrationNumber = registrationNumber;
        this.contactNumberOfTheClub = contactNumberOfTheClub;
    }

    // getters and setters

    //get method for the name of the club
    public String getNameOfTheClub() {
        return nameOfTheClub;
    }
     //set method for the name of the club
    public void setNameOfTheClub(String nameOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
    }


    //get method for the location of the club
    public String getLocationOfTheClub() {
        return locationOfTheClub;
    }
    //set method for the location of the club
    public void setLocationOfTheClub(String locationOfTheClub) {
        this.locationOfTheClub = locationOfTheClub;
    }

    //get method for the name of the manager
    public String getNameOfTheManager() {
        return nameOfTheManager;
    }
    //set method for the name of the manager
    public void setNameOfTheManager(String nameOfTheManager) {
        this.nameOfTheManager = nameOfTheManager;
    }


    //get method for the Registration number
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    //set method for the registration number
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    //get method for the contact number
    public String getContactNumberOfTheClub() {
        return contactNumberOfTheClub;
    }

    //set method for the contact number
    public void setContactNumberOfTheClub(String contactNumberOfTheClub) { this.contactNumberOfTheClub = contactNumberOfTheClub;
    }


//toString
    @Override
    public String toString() {
        return "Sports Club{" +
                "name of The Club='" + nameOfTheClub + '\'' +
                ", location of the club='" + locationOfTheClub + '\'' +
                ", name of the manager='" + nameOfTheManager + '\'' +
                ", registration number='" + registrationNumber + '\'' +
                ", contact number of the club=" + contactNumberOfTheClub +
                '}';
    }


    //equal method
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


    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheClub, locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub);
    }
}
