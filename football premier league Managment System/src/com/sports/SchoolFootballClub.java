package com.sports;

import java.util.Objects;

public class SchoolFootballClub extends FootballClub {

    private String nameOfTheSchool;

    public SchoolFootballClub(String nameOfTheClub, String locationOfTheClub, String nameOfTheManager, String registrationNumber, int contactNumberOfTheClub, int numberOfWins, int numberOfDraws, int numberOfDefeats, int numberOfGoals, int numberOfGoalsReceived, int numberOfGoalsScored, double numberOfPoints, int numberOfMatchesPlayed, String nameOfTheSchool) {
        super(nameOfTheClub, locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub);
        this.nameOfTheSchool = nameOfTheSchool;
    }

    public String getNameOfTheSchool() {
        return nameOfTheSchool;
    }

    public void setNameOfTheSchool(String nameOfTheSchool) {
        this.nameOfTheSchool = nameOfTheSchool;
    }

    @Override
    public String toString() {
        return "SchoolFootballClub{" +
                "nameOfTheSchool='" + nameOfTheSchool + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object fb) {
        if (this == fb) return true;
        if (!(fb instanceof SchoolFootballClub)) return false;
        if (!super.equals(fb)) return false;
        SchoolFootballClub that = (SchoolFootballClub) fb;
        return Objects.equals(nameOfTheSchool, that.nameOfTheSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfTheSchool);
    }
}
