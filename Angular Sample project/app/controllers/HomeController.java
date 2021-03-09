package controllers;

import Service.PremierLeagueManager;
import com.fasterxml.jackson.databind.JsonNode;
import entities.FootballClub;
import play.libs.Json;
import play.mvc.*;
import utils.ApplicationUtil;


import java.util.ArrayList;
import java.util.List;

class AppSummary {


    ArrayList<FootballClub> footballClubList = new ArrayList<>();
    private String content;

    AppSummary(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

public class HomeController extends Controller {



    public Result appSummary() {
        List<FootballClub> result = PremierLeagueManager.getInstance().getLeader();
        //logger.debug("In LeagueController.showLeaderboard(), result is: {}", result.toString());
        JsonNode jsonObject = Json.toJson(result);
        return ok(ApplicationUtil.createResponse(jsonObject, true));
    }

    public Result postTest() {
        JsonNode jsonNode = Json.toJson(new AppSummary("Sample Post Request => Data has been sent successfully"));
        return ok(jsonNode).as("application/json");
    }




    }
