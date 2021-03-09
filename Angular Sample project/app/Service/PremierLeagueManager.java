package Service;

import entities.FootballClub;
import entities.LeagueMatch;


import java.io.*;
import java.util.*;

public class PremierLeagueManager implements LeagueManager {


    public List<FootballClub> playList = new ArrayList<>();
    private int nmr = playList.size();
    private ArrayList<LeagueMatch> tournment = new ArrayList<>();
    private String name;




    public static PremierLeagueManager getInstance() {
        PremierLeagueManager instance = null;
        if (instance == null) {
            instance = new PremierLeagueManager();
        }
        return instance;
    }


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


    //--------------------- Saving Clubs-----------------------

    public void saveClub(String fileName)throws IOException{
        try {
            FileOutputStream lms=new FileOutputStream(fileName);
            ObjectOutputStream clme=new ObjectOutputStream(lms);



            clme.writeObject(playList);
            clme.close();

        }catch (IOException e){


        }
    }



    //----------------Displaying statistics-----------------------
    @Override
    public void displayState() {


        if (playList.isEmpty()) {     // if no teams in the league
            System.out.println("No Teams are in the League");
        } else {

            Scanner scanner = new Scanner(System.in);
            // asking from the user which teams statistics you need to see
            System.out.println("Please enter the club name:");
            String ln = scanner.nextLine();

            for (FootballClub sportsClub : playList) {
                //get the club name
                if (sportsClub.getNameOfTheClub().equals(ln)) {
                         //if that club name is equal
                    //display the club name
                    System.out.println("Name of the club           :     " + sportsClub.getNameOfTheClub());
                    //display the played matches
                    System.out.println("Number of matches played   :     " + sportsClub.getNumberOfMatchesPlayed());
                    //display the won matches
                    System.out.println("Number of won matches      :     " + sportsClub.getNumberOfWins());
                    //display the lost matches
                    System.out.println("Number of lost matches     :     " + sportsClub.getNumberOfDefeats());
                    //display the drawn matches
                    System.out.println("number of drawn matches    :     " + sportsClub.getNumberOfDraws());
                    //display the received goals
                    System.out.println("Number of goals received   :     " + sportsClub.getNumberOfGoalsReceived());
                    //display the Scored goals
                    System.out.println("Number of goals scored     :     " + sportsClub.getNumberOfGoalsScored());
                    //display the Scored points
                    System.out.println("Points                     :     " + sportsClub.getNumberOfPoints());
                    //add a line
                    System.out.println("");

                    return;   //if the wrong team's name is entered
                }
            }
             // if the user entered name is wrong
            System.out.println("Sorry! Please check the club's name and Try again later");
                System.out.println("");

            }



    }




    //---------------------------Displaying premierLeague table-------------------------------
    @Override
    public void premierTable() {

        // table headings :- Club name  ,  Played matches ,  Matches win, matches played , draw matches,  points , goal difference
        System.out.printf("%8s   %12s   %12s   %14s   %12s   %17s   %20s   %23s   %17s\n", "ClubName", "P.M", "M.W", "M.L", "M.D", "GS", "GR", "Points", "GD");
        System.out.println("*******************************************************************************************************************************************************************\n");


        // Club details
        Collections.sort(playList, new table1());
        for (FootballClub std : playList) {

            System.out.printf("%8s   %12s   %12s   %14s   %12s   %17s   %20s   %23s   %17s\n", std.getNameOfTheClub(), std.getNumberOfMatchesPlayed(), std.getNumberOfWins(), std.getNumberOfDefeats(), std.getNumberOfDraws(),std.getNumberOfGoalsScored(),std.getNumberOfGoalsReceived(), std.getNumberOfPoints(), (std.getNumberOfGoalsScored() - std.getNumberOfGoalsReceived()));
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        }
    }




    //---------------------Adding played match-----------------------------------
    @Override
    public void playedMatch(Integer year, Integer month, Integer day, String team1, String team2, Integer homeGoals, Integer awayGoals) {

        if (playList.isEmpty()) {// if no teams in the league
            System.out.println("No clubs in the league");
        }

        else {
            boolean mgr1 = false;
            FootballClub teamSA = null;
            FootballClub teamsSB = null;


            //Team 1
            for (FootballClub players : playList) {
                //get the club name  1
                if (players.getNameOfTheClub().equals(team1))
                    teamSA = players;
            }

            // if user entered name is not in the league
            if(teamSA==null){
                //error message
                System.out.println("Please check the team name");
                return;

            }

            //Team 2
            for (FootballClub players2 : playList) {
                //get the club name 2
                if (players2.getNameOfTheClub().equals(team2))
                    teamsSB = players2;
            }
            // if user entered name is not in the league
            if(teamsSB==null){
                //error message
                System.out.println("Please check the team name");
                return;
            }

            int Agoals = -1;
                Agoals = Integer.parseInt(String.valueOf(homeGoals));

            int Bgoals = -1;
                Bgoals = Integer.parseInt(String.valueOf(awayGoals));



    LeagueMatch match = new LeagueMatch(teamSA, teamsSB, homeGoals, awayGoals, new Date(day, month, year));

//team 1
    match.setTeam1(teamSA);
//team 2
    match.setTeam2(teamsSB);

    match.setTeam1Score(Agoals);
    match.setTeam2Score(Bgoals);
    tournment.add(match);

    //scored goals  team 1
    teamSA.setNumberOfGoalsScored(teamSA.getNumberOfGoalsScored() + Agoals);
    //scored goals  team 2
    teamsSB.setNumberOfGoalsScored(teamsSB.getNumberOfGoalsScored() + Bgoals);
    //received goals team 1
    teamSA.setNumberOfGoalsReceived(teamSA.getNumberOfGoalsReceived() + Bgoals);
    //received goals team 2
    teamsSB.setNumberOfGoalsReceived(teamsSB.getNumberOfGoalsReceived() + Agoals);


           // Increase the number of matches played after the  match
    teamSA.setNumberOfMatchesPlayed(teamSA.getNumberOfMatchesPlayed() + 1);
            // Increase the number of matches played after the  match
    teamsSB.setNumberOfMatchesPlayed(teamsSB.getNumberOfMatchesPlayed() + 1);

            //adding scores /points


            //if team 1 goals greater than team 2
            if (Agoals > Bgoals) {

               // 3 points awarded for a winning match
                teamSA.setNumberOfPoints(teamSA.getNumberOfPoints() + 3);
                //To increase the number of matches won
                teamSA.setNumberOfWins(teamSA.getNumberOfWins() + 1);
                //To increase the number of matches lost
                teamsSB.setNumberOfDefeats(teamsSB.getNumberOfDefeats() + 1);
            }
            //if team 2 goals greater than team 1
            else if (Agoals < Bgoals) {
                // 3 points awarded for a winning match
                teamsSB.setNumberOfPoints(teamsSB.getNumberOfPoints() + 3);
                //To increase the number of matches won
                teamsSB.setNumberOfWins(teamsSB.getNumberOfWins() + 1);
                //To increase the number of matches lost
                teamSA.setNumberOfDefeats(teamSA.getNumberOfDefeats() + 1);
            }

            //If the matches end in a draw
            else {
                //1 points for team 1
                teamSA.setNumberOfPoints(teamSA.getNumberOfPoints() + 1);
                //1 points for team 2
                teamsSB.setNumberOfPoints(teamsSB.getNumberOfPoints() + 1);
                // To increase the number of matches drawn
                teamSA.setNumberOfDraws(teamSA.getNumberOfDraws() + 1);
                //To increase the number of matches drawn
                teamsSB.setNumberOfDraws(teamsSB.getNumberOfDraws() + 1);
            }


        }
    }


    public ArrayList<LeagueMatch> SaveFootballMatch() {

        // adding a file
        File file = new File("MatchInfo.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);

            tournment = (ArrayList<LeagueMatch>) inputStream1.readObject();
            inputStream1.close();
            return tournment;

        } catch (Exception e) {
            return tournment;
        }
    }


    ///Saving Club Details in a file
    public List<FootballClub> SaveFootballClub() {
        ArrayList<FootballClub> footballClubList = new ArrayList<>();

         //adding a file
        File file = new File("clubInfo.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);

            playList = (ArrayList<FootballClub>) inputStream1.readObject();
            inputStream1.close();
            return playList;

        } catch (Exception e) {
            return playList;
        }
    }

    //Saving Match Details
    public void saveMatch(String fileName)throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);


        for (LeagueMatch match : tournment) {
            oos.writeObject(match);
        }
        oos.flush();
        //close the file
        fos.close();
        oos.close();

    }




    //---------------retrieving Match details
    public void readInfoMatches(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream inputStream=new FileInputStream(fileName);
        ObjectInputStream inputStream1=new ObjectInputStream(inputStream);
        for (;;){

            try {
                LeagueMatch match1=(LeagueMatch) inputStream1.readObject();
                tournment.add(match1);
            }catch (EOFException e){
                break;
            }
        }
        //close the file
        inputStream.close();
        inputStream1.close();
        System.out.println("Data retrieved successfully");
    }











    ///============================


    public List<FootballClub> getLeader()
    {


        FootballClub f = new FootballClub("aaaa","hghh","fernf","1345","077",5,5,4,3,2,1,5,4);
   playList.add(f);
System.out.println(playList.size());
Collections.sort(playList, Collections.reverseOrder());
    return playList;

    }

    //read the match details in real value
    public void realSave() {
        FootballClub[] a = playList.toArray(new FootballClub[]{});
        File fle = new File("TeamDetails.txt");
        Writer out;
        try (
                FileWriter wri = new FileWriter(fle)) {
            out = new PrintWriter(wri);

            int d = playList.size();
            for (int i = 0; i < d; i++) {
                out.write("Club name: " + playList.get(i).getNameOfTheClub() + "\n Location of the club :" + playList.get(i).getLocationOfTheClub() + "\n Name of the manager :" + playList.get(i).getNameOfTheManager() + "\n Contact Number of the club :" + playList.get(i).getContactNumberOfTheClub() + "\n Number of matches Played :" + playList.get(i).getNumberOfMatchesPlayed() + "\n Number of win Matches :" + playList.get(i).getNumberOfWins() + "\n Number of Lost matches :" + playList.get(i).getNumberOfDefeats() + "\n Number of Draws :" + playList.get(i).getNumberOfDraws() + "\n number of Scored goals :" + playList.get(i).getNumberOfGoalsScored() + "\n Number of received goals :" + playList.get(i).getNumberOfGoalsReceived() + "\n Points : " + playList.get(i).getNumberOfPoints()+"\n"+"\n");


                out.flush();
            }
            System.out.println("Successfully saved....");
        } catch (IOException exception) {
            System.out.println("No data to show");
        }

    }





    ///////////////-----------------------------Private Class-----------------------------//////////////////////////////

    //Comparable interface for sorting results
    public class table1 implements Comparator<FootballClub> {
        @Override
        public int compare(FootballClub nmbr1, FootballClub nmbr2) {

            if (nmbr1.getNumberOfPoints() > nmbr2.getNumberOfPoints())
                return -1;

            else if (nmbr1.getNumberOfPoints() < nmbr2.getNumberOfPoints())
                return 1;

            else {

                //checking goal difference
                int gf = nmbr1.getNumberOfGoalsScored() - nmbr1.getNumberOfGoalsReceived();  //goal difference
                int gf2 = nmbr2.getNumberOfGoalsScored() - nmbr2.getNumberOfGoalsReceived();//goal difference 2

                if (gf > gf2)
                    return -1;

                else if (gf2 > gf)
                    return 1;

                else return 0;
            }
        }


        //-------------Date innerclass------------------
        public class Date implements Serializable{
//variables
            private int year;
            private int month;
            private int day;

            //Constructor
            public Date(int year, int month, int day) {
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
    }}


