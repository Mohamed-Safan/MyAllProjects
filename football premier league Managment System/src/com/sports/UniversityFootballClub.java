package com.sports;

import java.util.Objects;

public class UniversityFootballClub extends FootballClub{

    private String nameOfTheUniversity;
    private int contactNumberOfTheUniversity;

    public UniversityFootballClub(String nameOfTheClub, String locationOfTheClub, String nameOfTheManager, String registrationNumber, int contactNumberOfTheClub, int numberOfWins, int numberOfDraws, int numberOfDefeats, int numberOfGoals, int numberOfGoalsReceived, int numberOfGoalsScored, double numberOfPoints, int numberOfMatchesPlayed, String nameOfTheUniversity, int contactNumberOfTheUniversity) {
        super(nameOfTheClub, locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub);
        this.nameOfTheUniversity = nameOfTheUniversity;
        this.contactNumberOfTheUniversity = contactNumberOfTheUniversity;
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public int getContactNumberOfTheUniversity() {
        return contactNumberOfTheUniversity;
    }

    public void setContactNumberOfTheUniversity(int contactNumberOfTheUniversity) {
        this.contactNumberOfTheUniversity = contactNumberOfTheUniversity;
    }

    @Override
    public String toString() {
        return "UniversityFootballClub{" +
                "nameOfTheUniversity='" + nameOfTheUniversity + '\'' +
                ", contactNumberOfTheUniversity=" + contactNumberOfTheUniversity +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object fb) {
        if (this == fb) return true;
        if (!(fb instanceof UniversityFootballClub)) return false;
        if (!super.equals(fb)) return false;
        UniversityFootballClub that = (UniversityFootballClub) fb;
        return contactNumberOfTheUniversity == that.contactNumberOfTheUniversity &&
                Objects.equals(nameOfTheUniversity, that.nameOfTheUniversity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfTheUniversity, contactNumberOfTheUniversity);
    }
}
