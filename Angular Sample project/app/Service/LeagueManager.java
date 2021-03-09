package Service;

import entities.FootballClub;
import entities.LeagueMatch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface LeagueManager {

    public void addClub(FootballClub player);
    public void deleteClub(String nameOfTheClub);
    public void displayState();
    public void premierTable();
    public void realSave();



    public static ArrayList<FootballClub> saveMatchFile1() {
        return null;
    }
    public void saveClub(String fileName)throws IOException;

    //---------------------Adding played match-----------------------------------
    void playedMatch(Integer year, Integer month, Integer day, String team1, String team2, Integer homeGoals, Integer awayGoals);

    public void saveMatch(String fileName)throws IOException;

    public ArrayList<LeagueMatch> SaveFootballMatch();


    public List<FootballClub> getLeader();
}