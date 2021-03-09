package com.sports;

import java.io.IOException;
import java.util.Scanner;

public class Console {

    private final static PremierLeagueManager premierManager = new PremierLeagueManager();
    final static Scanner scanner = new Scanner(System.in);
    public static int value = 0;

    public static void main(String[] args) throws IOException, ClassNotFoundException
     {

        Scanner input = new Scanner(System.in);
        try {
            raadInfo();
        }catch (Exception e){}

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
            System.out.println("⨁ Quit--------------------------------------->  7");
            System.out.println(" ");
            System.out.println("   ⭕       Please enter your choice  : ");


            method = Integer.parseInt(input.next());
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
                    premierManager.saveMatch("ClubDetails.txt");
                    break;

                case 7:
                    System.out.println("Wait...............");
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;


            }
            if (method == 7) {
                input.close();
                System.exit(0);
            }

        }


    }

    private static void raadInfo() {


    }


    private static void addClub() {

        FootballClub players = null;

        if (value < 20) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of the club:");
            String nameOfTheClub = scanner.next();

            System.out.println("Please enter the Location of the Club");
            String locationOfTheClub = scanner.next();

            System.out.println("please enter the name of the Manager");
            String nameOfTheManager = scanner.next();

            System.out.println("Please enter the registration Number");
            String registrationNumber = scanner.next();

            System.out.println("Please enter the Contact Number of the club:");
            Integer contactNumberOfTheClub = Integer.valueOf(scanner.next());


            players = new FootballClub(nameOfTheClub, locationOfTheClub, nameOfTheManager, registrationNumber, contactNumberOfTheClub);
            premierManager.addClub(players);
            value++;
        }
    }
    private static void deleteClub(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Club name :");
        String str = scanner.next();
        premierManager.deleteClub(str);

    }

    private static void displayState() {

        premierManager.displayState();

    }

    private static void premierTable(){

        premierManager.premierTable();

    }

    private static void playedMatch() throws IOException, ClassNotFoundException {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter the year :");
        Integer year=scanner.nextInt();

        System.out.println("Please enter the month :");
        Integer month = scanner.nextInt();

        System.out.println("Please enter the day :");
        Integer day = scanner.nextInt();

        System.out.println("Please enter the home team name :");
        String team1=scanner.next();

        System.out.println("Please enter the away team name :");
        String team2=scanner.next();

        System.out.println("Please enter the home team scored goales :");
        Integer homeGoals =scanner.nextInt();

        System.out.println("Please enter the awate team scored goales : ");
        Integer awayGoals = scanner.nextInt();


        premierManager.playedMatch(year,month,day,team1,team2,homeGoals,awayGoals);




    }





}