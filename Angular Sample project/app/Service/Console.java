package Service;

import entities.FootballClub;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;

public class Console extends Application {


    private final static PremierLeagueManager premierManager = new PremierLeagueManager();
    public static int value = 0;

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Scanner input = new Scanner(System.in);
        try {

            premierManager.SaveFootballClub();
            premierManager.readInfoMatches("MatchInfo.txt");
            premierManager.SaveFootballMatch();
        }catch (Exception e){
        }


        int method = 0;
        while (true) {
            //OPTIONS TABLE
            System.out.println("⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀WELCOME⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀ ");
            System.out.println("⨀                                       ⨀");
            System.out.println("⨀                                       ⨀");
            System.out.println("⨀⨀⨀⨀⨀PREMIER LEAGUE CHAMPIONSHIP⨀⨀⨀⨀⨀");
            System.out.println("⨀                                       ⨀");
            System.out.println("⨀                 2020                  ⨀");
            System.out.println("⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀⨀");
            System.out.println("");
            System.out.println("   ⭕         Please choose any Option :   ");
            System.out.println("");
            System.out.println("⨁ Add a new Football club-------------------->  1");
            System.out.println("");
            System.out.println("⨁ Delete a club ----------------------------->  2");
            System.out.println("");
            System.out.println("⨁ Display the statistics--------------------->  3");
            System.out.println("");
            System.out.println("⨁ Display the Premier league table----------->  4");
            System.out.println("");
            System.out.println("⨁ Add a played match------------------------->  5");
            System.out.println("");
            System.out.println("⨁ Save--------------------------------------->  6");
            System.out.println("");
            System.out.println("⨁ GUI---------------------------------------->  7");
            System.out.println("");
            System.out.println("⨁ Quit--------------------------------------->  8");
            System.out.println(" ");
            System.out.println("   ⭕       Please enter your choice  : ");



try {
    method = Integer.parseInt(input.next());

}catch (Exception e){}

            switch (method) {

                case 1:
                    addClub();
                    break;

                case 2:
                    deleteClub();
                    break;

                case 3:
                    displayState();
                    break;

                case 4:
                    premierTable();
                    break;

                case 5:
                    playedMatch();
                    break;

                case 6:
                    premierManager.saveClub("ClubInfo.txt");
                    premierManager.saveMatch("MatchInfo.txt");
                    premierManager.realSave();


                    break;

                case 7:
                    launch(GUI.class);
                    break;


                case 8:
                    System.out.println("Wait...............");
                    break;


                default:
                    System.out.println("Invalid Option");
                    //    main();



            }
            if (method == 8) {
                input.close();
                System.exit(0);
            }

        }



    }
// method for adding a club
    private static void addClub() {

        FootballClub players = null;

        if (value < 20) {
            if (value < 20) {

               //asking the club name from the user
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the name of the club:");
                String nameOfTheClub = scanner.next();

                // validation part for the name
                while (!nameOfTheClub.matches("[a-zA-Z]+")) {
                    //Displaying a message
                    System.out.println("don't use integer value or Symbols! Please enter the club name again...");
                    System.out.println("Please enter the club name again : ");
                    nameOfTheClub = scanner.next();
                }

           //asking the club location from the user
                  System.out.println("Please enter the Location of the Club");
                  String locationOfTheClub = scanner.next();
                // validation part for the location
                while (!locationOfTheClub.matches("[a-zA-Z]+")) {
                    //Displaying a message
                    System.out.println("don't use integer value or Symbols! Please enter the location again...");
                    System.out.println("Please enter the location again : ");
                    locationOfTheClub = scanner.next();
                }


                System.out.println("please enter the name of the Manager");
                String nameOfTheManager = scanner.next();
                // validation part for the manager name
                while (!nameOfTheManager.matches("[a-zA-Z]+")) {
                    //Displaying a message
                    System.out.println("don't use integer value or Symbols! Please enter the manager name again...");
                    System.out.println("Please enter the manager name again: ");
                    nameOfTheManager = scanner.next();
                }


                //Asking the registration number
                System.out.println("Please enter the registration Number :");
                String registrationNumber = scanner.next();




               //Asking the contact number
               System.out.println("Please enter the Contact Number of the club:");
               String contactNumberOfTheClub = scanner.next();

//    validation part for the Contact number
                while (!contactNumberOfTheClub.matches("[0-9]+")) {
                    System.out.println("Invalid format  ");

                    System.out.println("Please enter the Contact number again");
                    contactNumberOfTheClub = scanner.next();
                }



                int numberOfWins=0;
                int numberOfDraws=0;
                int numberOfDefeats =0;
                int numberOfGoalsReceived =0;
                int numberOfPoints =0;
                int numberOfGoalsScored =0;
                int numberOfMatchesPlayed =0;
                double GD=0;
                players = new FootballClub(nameOfTheClub,locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub, numberOfWins, numberOfDraws, numberOfDefeats, numberOfGoalsReceived,  numberOfPoints,  numberOfGoalsScored, numberOfMatchesPlayed,GD);


            };
            premierManager.addClub(players);
            value++;
        }
    }

    //deleting a team
    private static void deleteClub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Club name :");
        String str = scanner.next();
        premierManager.deleteClub(str);

    }

    // display the statistics
    private static void displayState() {
        premierManager.displayState();

    }

    //display the table
    private static void premierTable(){
        premierManager.premierTable();

    }

    //played match
    private static void playedMatch() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);


    //Asking the year
        System.out.println("Please enter the year :");
        Integer year = scanner.nextInt();

    // Validation part for the year
        if (year > 1949 && year < 2023) ;
    else {
        System.out.println("Please enter the year in correct format (1950-2022)");
            year = scanner.nextInt();
        }


    //Asking the month
         System.out.println("Please enter the month :");
         Integer month = scanner.nextInt();

    // Validation part for the month
        if (month > 0 && month < 12) ;
        else {
            System.out.println("Please enter the month in correct format (1-12)");
            month = scanner.nextInt();
        }

    // Asking the day
        System.out.println("Please enter the day :");
        Integer day = scanner.nextInt();

    // Validation part for the day
        if (day > 0 && day < 32) ;
        else {
            System.out.println("Please enter the day in correct format (1-31)");
            day = scanner.nextInt();
        }
    //Asking the name of the teams
          //Team A
            System.out.println("Please enter the name of the team A :");
            String team1 = scanner.next();
            // validation part for the name
            while (!team1.matches("[a-zA-Z]+")) {
                System.out.println("don't use integer value or Symbols! Please enter the home team name again...");
                System.out.println("Please enter the team A name again : ");
                team1 = scanner.next();
            }

            //Team B
            System.out.println("Please enter the name of the team B:");
            String team2 = scanner.next();
            // validation part for the name
            while (!team2.matches("[a-zA-Z]+")) {
                System.out.println("don't use integer value or Symbols! Please enter the away team name again...");
                System.out.println("Please enter the team B name again : ");
                team2 = scanner.next();
            }

    //asking the number of goals scored by team A
            System.out.println("Please enter the team A Goals :");
            Integer homeGoals = scanner.nextInt();
//            while(!homeGoals.matches("[0-9]+"))

     // asking the number of goals scored by team B
            System.out.println("Please enter the team B goals : : ");
            Integer awayGoals = scanner.nextInt();


            premierManager.playedMatch(year, month, day, team1, team2, homeGoals, awayGoals);


        }



    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}

