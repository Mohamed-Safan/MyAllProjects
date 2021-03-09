package com.sports;

import java.util.Objects;

public class FootballClub extends SportsClub {

    private int numberOfWins;
    private int numberOfDraws;
    private int numberOfDefeats;
    private int numberOfGoals;
    private int numberOfGoalsReceived;
    private int numberOfGoalsScored;
    private double numberOfPoints;
    private int numberOfMatchesPlayed;

    public FootballClub(String nameOfTheClub, String locationOfTheClub, String nameOfTheManager, String registrationNumber, int contactNumberOfTheClub) {
        super(nameOfTheClub, locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub);
        this.numberOfWins = numberOfWins;
        this.numberOfDraws = numberOfDraws;
        this.numberOfDefeats = numberOfDefeats;
        this.numberOfGoals = numberOfGoals;
        this.numberOfGoalsReceived = numberOfGoalsReceived;
        this.numberOfGoalsScored = numberOfGoalsScored;
        this.numberOfPoints = numberOfPoints;
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfDraws() {
        return numberOfDraws;
    }

    public void setNumberOfDraws(int numberOfDraws) {
        this.numberOfDraws = numberOfDraws;
    }

    public int getNumberOfDefeats() {
        return numberOfDefeats;
    }

    public void setNumberOfDefeats(int numberOfDefeats) {
        this.numberOfDefeats = numberOfDefeats;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getNumberOfGoalsReceived() {
        return numberOfGoalsReceived;
    }

    public void setNumberOfGoalsReceived(int numberOfGoalsReceived) {
        this.numberOfGoalsReceived = numberOfGoalsReceived;
    }

    public int getNumberOfGoalsScored() {
        return numberOfGoalsScored;
    }

    public void setNumberOfGoalsScored(int numberOfGoalsScored) {
        this.numberOfGoalsScored = numberOfGoalsScored;
    }

    public double getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(double numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfMatchesPlayed() {
        return numberOfMatchesPlayed;
    }

    public void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) {
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "numberOfWins=" + numberOfWins +
                ", numberOfDraws=" + numberOfDraws +
                ", numberOfDefeats=" + numberOfDefeats +
                ", numberOfGoals=" + numberOfGoals +
                ", numberOfGoalsReceived=" + numberOfGoalsReceived +
                ", numberOfGoalsScored=" + numberOfGoalsScored +
                ", numberOfPoints=" + numberOfPoints +
                ", numberOfMatchesPlayed=" + numberOfMatchesPlayed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object fb) {
        if (this == fb) return true;
        if (!(fb instanceof FootballClub)) return false;
        if (!super.equals(fb)) return false;
        FootballClub that = (FootballClub) fb;
        return numberOfWins == that.numberOfWins &&
                numberOfDraws == that.numberOfDraws &&
                numberOfDefeats == that.numberOfDefeats &&
                numberOfGoals == that.numberOfGoals &&
                numberOfGoalsReceived == that.numberOfGoalsReceived &&
                numberOfGoalsScored == that.numberOfGoalsScored &&
                Double.compare(that.numberOfPoints, numberOfPoints) == 0 &&
                numberOfMatchesPlayed == that.numberOfMatchesPlayed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWins, numberOfDraws, numberOfDefeats, numberOfGoals, numberOfGoalsReceived, numberOfGoalsScored, numberOfPoints, numberOfMatchesPlayed);
    }
}
