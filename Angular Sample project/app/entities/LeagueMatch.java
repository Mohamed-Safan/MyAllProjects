package entities;



import java.io.Serializable;
import java.util.Date;

public class LeagueMatch implements Serializable {
//variables
    private FootballClub team1;
    private FootballClub team2;
    private int team1Score;
    private int team2Score;
    private Date date;
//    private int year;
//    private int month;
//    private int day;


    //constructor
    public LeagueMatch(FootballClub team1, FootballClub team2, int team1Score, int team2Score, Date date)  {
        this.team1 = team1;
        this.team2 = team2;
        this.team1Score = team1Score;
        this.team2Score = team2Score;
        this.date = date;
//        this.year = year;
//        this.month = month;
//        this.day = day;

    }
    //getters and setters
    //get method for the year
//    public int getYear() {
//        return year;
//    }
//    //set method for the year
//    public void setYear(int year) {
//        this.year = year;
//    }
//    //get method for the month
//    public int getMonth() {
//        return month;
//    }
//    //set method for the month
//    public void setMonth(int month) {
//        this.month = month;
//    }
//    //get method for the day
//    public int getDay() {
//        return day;
//    }
//    //set method for the day
//    public void setDay(int day) { this.day = day; }
    //get method for the date
    public Date getDate(){return date; }
    //set method for the date
    public void setDate(Date date) {this.date=date;}
    //get method for the team1
    public FootballClub getTeam1() {
        return team1;
    }
    //set method for the team1
    public void setTeam1(FootballClub team1) {
        this.team1 = team1;
    }
    //get method for the team2
    public FootballClub getTeam2() {
        return team2;
    }
    //set method for the team2
    public void setTeam2(FootballClub team2) {
        this.team2 = team2;
    }
    //get method for the team1 score
    public int getTeam1Score() {
        return team1Score;
    }
    //set method for the team1 score
    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }
    //get method for the team2 score
    public int getTeam2Score() {
        return team2Score;
    }
    //set method for the team2 score
    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }
}

