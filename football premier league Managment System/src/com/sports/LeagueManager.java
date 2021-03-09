package com.sports;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface LeagueManager {

    public void addClub(FootballClub player);
    public void deleteClub(String nameOfTheClub);
    public void displayState();
    public void premierTable();
    public void playedMatch(Integer year, Integer month,Integer day,String team1, String team2, Integer homeGoals, Integer awayGoals);
    public void saveMatch(String fileName) throws IOException;

//    void saveMatch(String name) throws IOException hrows IOException;

    //--------------------- Saving club details in a file-----------------
//    void saveMatch()//String name) throws IOException
//    ;

    public void readInfo(String name) throws IOException, ClassNotFoundException;;




}
