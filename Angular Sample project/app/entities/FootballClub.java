 package entities;

import java.util.Objects;

 public class FootballClub extends SportsClub { //sub class

     //variables
     private int numberOfWins;
     private int numberOfDraws;
     private int numberOfDefeats;
     private int numberOfGoalsReceived;
     private int numberOfGoalsScored;
     private double numberOfPoints;
     private int numberOfMatchesPlayed;
     private double GD;

    // constructor
     public FootballClub(String nameOfTheClub, String locationOfTheClub, String nameOfTheManager, String registrationNumber, String contactNumberOfTheClub, int numberOfWins, int numberOfDraws, int numberOfDefeats, double numberOfGoalsReceived, int numberOfPoints, int numberOfGoalsScored, int numberOfMatchesPlayed, double GD) {
         super(nameOfTheClub,locationOfTheClub,nameOfTheManager,registrationNumber,contactNumberOfTheClub);
         this.numberOfWins = numberOfWins;
         this.numberOfDraws = numberOfDraws;
         this.numberOfDefeats = numberOfDefeats;
         this.numberOfGoalsReceived = (int) numberOfGoalsReceived;
         this.numberOfGoalsScored = numberOfGoalsScored;
         this.numberOfPoints = numberOfPoints;
         this.numberOfMatchesPlayed = numberOfMatchesPlayed;
         this.GD=numberOfGoalsScored-numberOfGoalsReceived;
     }


    //getters and setters
     //get method for the number of wins
     public int getNumberOfWins() {
         return numberOfWins;
     }
     //set method for the number of wins
     public void setNumberOfWins(int numberOfWins) {
         this.numberOfWins = numberOfWins;
     }


     //get method for the draws
     public int getNumberOfDraws() { return numberOfDraws; }
     //set method for the draws
     public void setNumberOfDraws(int numberOfDraws) {
         this.numberOfDraws = numberOfDraws;
     }


     //get method for the lost
     public int getNumberOfDefeats() {
         return numberOfDefeats;
     }
     //set method for the lost
     public void setNumberOfDefeats(int numberOfDefeats) {
         this.numberOfDefeats = numberOfDefeats;
     }


     //get method for the goals received
     public int getNumberOfGoalsReceived() {
         return numberOfGoalsReceived;
     }
     //set method for the goals received
     public void setNumberOfGoalsReceived(int numberOfGoalsReceived) { this.numberOfGoalsReceived = numberOfGoalsReceived; }


     //get method for the goals scored
     public int getNumberOfGoalsScored() {
         return numberOfGoalsScored;
     }
     //set method for the goals scored
     public void setNumberOfGoalsScored(int numberOfGoalsScored) {
         this.numberOfGoalsScored = numberOfGoalsScored;
     }


     //get method for the points
     public double getNumberOfPoints() {
         return numberOfPoints;
     }
     //set method for the points
     public void setNumberOfPoints(double numberOfPoints) {
         this.numberOfPoints = numberOfPoints;
     }


     //get method for played matches
     public int getNumberOfMatchesPlayed() {
         return numberOfMatchesPlayed;
     }
     //set method for played matches
     public void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) { this.numberOfMatchesPlayed = numberOfMatchesPlayed; }


     //get method for the goal difference
     public double getGD() {return GD;}
     //set method for the goal difference
     public void setGD(double GD){ GD= (numberOfGoalsScored - numberOfGoalsReceived);}


     //toString method
     @Override
     public String toString() {
         return "Football Club{" +
                 "number of Wins=" + numberOfWins +
                 ", number of daws=" + numberOfDraws +
                 ", number of defeats=" + numberOfDefeats +
                 ", number of goals received=" + numberOfGoalsReceived +
                 ", number of goals scored=" + numberOfGoalsScored +
                 ", number of points=" + numberOfPoints +
                 ", number of matches played=" + numberOfMatchesPlayed +
                 "} " + super.toString();
     }


     //equals method
     @Override
     public boolean equals(Object fb) {
         if (this == fb) return true;
         if (!(fb instanceof FootballClub)) return false;
         if (!super.equals(fb)) return false;
         FootballClub that = (FootballClub) fb;
         return numberOfWins == that.numberOfWins &&
                 numberOfDraws == that.numberOfDraws &&
                 numberOfDefeats == that.numberOfDefeats &&
                 numberOfGoalsReceived == that.numberOfGoalsReceived &&
                 numberOfGoalsScored == that.numberOfGoalsScored &&
                 Double.compare(that.numberOfPoints, numberOfPoints) == 0 &&
                 numberOfMatchesPlayed == that.numberOfMatchesPlayed;
     }

     // hashcode method
     @Override
     public int hashCode() {
         return Objects.hash(super.hashCode(), numberOfWins, numberOfDraws, numberOfDefeats, numberOfGoalsReceived, numberOfGoalsScored, numberOfPoints, numberOfMatchesPlayed);
     }
 }




