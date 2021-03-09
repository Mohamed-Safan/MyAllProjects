package com.sports;

import java.io.*;
import java.util.*;

public class PremierLeagueManager implements LeagueManager {

    private List<FootballClub> playList = new ArrayList<>();
    private int nmr = playList.size();
    private final ArrayList<LeagueMatch> tournmnt = new ArrayList<>();
    private String name;
    ;


    // ---------------adding clubs----------------------
    @Override
    public void addClub(FootballClub player) {

        if (playList.contains(player)) {     //  if the team is already in the league
            System.out.println("This club is already in the league");

        } else if (nmr == 20) {  //  if the number of clubs is above 20
            System.out.println("can't add more teams");
        }

        else {              // otherwise
            playList.add(player);
            System.out.println("Number of free space :" + (20 - playList.size()));
            System.out.println("Done This teams is added to the league");
        }
    }



    //------------------Deleting clubs------------------------
    @Override
    public void deleteClub(String nameOfTheClub) {


        if (playList.isEmpty()) {  //if no teams is in the league
            System.out.println("No Clubs are in the League");
        } else {
            boolean mgr = false;

            for (FootballClub players : playList) {
                if (players.getNameOfTheClub().equals(nameOfTheClub)) {  //getting team name
                    mgr = true;
                    playList.remove(players);
                    System.out.println("Successfully removed");

                    break;

                }
            }
            if (!mgr) {  // if user entered team name is not in the league
                System.out.println("Please enter the valid name");

            }
        }


    }

    //----------------Displaying statistics-----------------------
    @Override
    public void displayState() {


        if (playList.isEmpty()) {     // if no teams in the league
            System.out.println("No Teams are in the League");
        } else {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the club name:"); // asking from the user which teams statistics you need to see
            String ln = scanner.nextLine();
            for (FootballClub sportsClub : playList) {
                if (sportsClub.getNameOfTheClub().equals(ln)) {

                    System.out.println("Name of the club           :     " + sportsClub.getNameOfTheClub());
                    System.out.println("Number of matches played   :     " + sportsClub.getNumberOfMatchesPlayed());
                    System.out.println("Number of won matches      :     " + sportsClub.getNumberOfWins());
                    System.out.println("Number of lost matches     :     " + sportsClub.getNumberOfDefeats());
                    System.out.println("number of drawn matches    :     " + sportsClub.getNumberOfDraws());
                    System.out.println("Number of goals received   :     " + sportsClub.getNumberOfGoalsReceived());
                    System.out.println("Number of goals scored     :     " + sportsClub.getNumberOfGoalsScored());
                    System.out.println("Points                     :     " + sportsClub.getNumberOfPoints());
                    System.out.println("");
                }

                else   //if the wrong team's name is entered
                    System.out.println("Sorry! Please check the club's name and Try again later");
                    System.out.println("");

            }
        }


    }




//---------------------------Displaying premierLeague table-------------------------------
    @Override
    public void premierTable() {

                           // table headings :- Club name  ,  Played matches ,  Matches win, matches played , draw matches,  points , goal difference
        System.out.printf("%-6s%10s%6s%12s%10s%15s%20s\n\n", "ClubName", "P.M", "M.W", "M.L", "M.D", "Points", "G.D");


        // Club details
        Collections.sort(playList, new table1());
        for (FootballClub std : playList) {

            System.out.printf("%-8s%10d%6d%12d%10d%15f%20d\n", std.getNameOfTheClub(), std.getNumberOfMatchesPlayed(), std.getNumberOfWins(), std.getNumberOfDefeats(), std.getNumberOfDraws(), std.getNumberOfPoints(), (std.getNumberOfGoalsScored() - std.getNumberOfGoalsReceived()));
        }
    }




    //---------------------Adding played match-----------------------------------
    @Override
    public void playedMatch(Integer year, Integer month, Integer day, String team1, String team2, Integer homeGoals, Integer awayGoals) {

        if (playList.isEmpty()) {// if no teams in the league
            System.out.println("No clubs in the leage");
        }

        else {
            boolean mgr1 = false;
            FootballClub h = null;
            FootballClub a = null;
            for (FootballClub players : playList) {

                if (players.getNameOfTheClub().equals(team1))
                    h = players;

            }
            for (FootballClub players2 : playList) {
                if (players2.getNameOfTheClub().equals(team2))
                    a = players2;

            }

            int hgoals = -1;

            try {
                hgoals = Integer.parseInt(String.valueOf(homeGoals));

            } catch (Exception exception) {
                System.out.println("Goales scored by home team");

            }

            if (hgoals == -1) {
                System.out.println("Number of goales scored");
                return;
            }


            int agoals = -1;
            try {
                agoals = Integer.parseInt(String.valueOf(awayGoals));

            } catch (Exception exception) {
                System.out.println("Please enter the number of goals scored by away team :");

            }

            if (agoals == -1) {
                System.out.println("Number of goals scored");
                return;
            }


            LeagueMatch match = new LeagueMatch(h, a, homeGoals, awayGoals, new Date(day, month, year));

            match.setTeam1(h);

            match.setTeam2(a);
            match.setTeam1Score(hgoals);
            match.setTeam2Score(agoals);
            tournmnt.add(match);
            assert h != null;
            h.setNumberOfGoalsScored(h.getNumberOfGoalsScored() + hgoals);
            assert a != null;
            a.setNumberOfGoalsScored(a.getNumberOfGoalsScored() + agoals);
            h.setNumberOfGoalsReceived(h.getNumberOfGoalsReceived() + agoals);
            a.setNumberOfGoalsReceived(a.getNumberOfGoalsReceived() + hgoals);

            h.setNumberOfMatchesPlayed(h.getNumberOfMatchesPlayed() + 1);
            a.setNumberOfMatchesPlayed(a.getNumberOfMatchesPlayed() + 1);

            //adding scores /points



            if (hgoals > agoals) {
                h.setNumberOfPoints(h.getNumberOfPoints() + 3);
                h.setNumberOfWins(h.getNumberOfWins() + 1);
                a.setNumberOfDefeats(a.getNumberOfDefeats() + 1);
            }

            else if (hgoals < agoals) {
                a.setNumberOfPoints(a.getNumberOfPoints() + 3);
                a.setNumberOfWins(a.getNumberOfWins() + 1);
                h.setNumberOfDefeats(h.getNumberOfDefeats() + 1);
            }

            else {
                h.setNumberOfPoints(h.getNumberOfPoints() + 1);
                a.setNumberOfPoints(a.getNumberOfPoints() + 1);
                h.setNumberOfDraws(h.getNumberOfDraws() + 1);
                a.setNumberOfDraws(a.getNumberOfDraws() + 1);
            }


        }
    }



   // --------------------- Saving club details in a file-----------------
    @Override
    public void saveMatch(String fileName)throws IOException
    {

        FileOutputStream fileOutputStreams = new FileOutputStream(fileName);

        ObjectOutputStream objectOutputStreams = new ObjectOutputStream(fileOutputStreams);


        for(FootballClub club:playList ){
            objectOutputStreams.writeObject(club);
        }

        for (LeagueMatch newMatch : tournmnt){
            objectOutputStreams.writeObject(newMatch);
        }

        objectOutputStreams.flush();
        fileOutputStreams.close();
        objectOutputStreams.close();
        System.out.println("Saved successfully");

    }


    // ---------------Loading previous data-----------------
    @Override
    public void readInfo(String name) throws IOException, ClassNotFoundException {


        File fle =new File(name);
        FileInputStream lms = new FileInputStream(fle);
        ObjectInputStream stream = new ObjectInputStream(lms);



        for (;; ) {
            try {
                FootballClub fb = (FootballClub) stream.readObject();
                playList.add(fb);
            } catch (EOFException e) {
                break;
            }
        }
        lms.close();
        stream.close();
        System.out.println("Data retrieved successfully");



    }

    ///////////////-----------------------------Private Class-----------------------------//////////////////////////////


    //Comparable interface for sorting results
    private class table1 implements Comparator<FootballClub> {
        @Override
        public int compare(FootballClub nmbr1, FootballClub nmbr2) {


            if (nmbr1.getNumberOfPoints() > nmbr2.getNumberOfPoints())
                return -1;

            else if (nmbr1.getNumberOfPoints() < nmbr2.getNumberOfPoints())
                return 1;

            else {

                //checking goal difference
                int gf = nmbr1.getNumberOfGoalsScored() - nmbr1.getNumberOfGoalsReceived();  //goal difference
                int gf2 = nmbr2.getNumberOfGoalsScored() - nmbr2.getNumberOfGoalsReceived();//goal diiference 2

                if (gf > gf2)
                    return -1;

                else if (gf2 > gf)
                    return 1;

                else return 0;
            }


        }





        //-------------Date innerclass------------------
        public class Date {

            private int year;
            private int month;
            private int day;

            public Date(int year, int month, int day) { //Constructor
                this.year = year;
                this.month = month;
                this.day = day;
            }

            //getters setters method

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }


            //to String
            @Override
            public String toString() {
                return "Date{" +
                        "year=" + year +
                        ", month=" + month +
                        ", day=" + day +
                        '}';
            }

            //equals method
            @Override
            public boolean equals(Object dte) {
                if (this == dte) return true;
                if (!(dte instanceof Date)) return false;
                Date date = (Date) dte;
                return year == date.year &&
                        month == date.month &&
                        day == date.day;
            }

            //hashcode method
            @Override
            public int hashCode() {
                return Objects.hash(year, month, day);
            }
        }
    }
}




