package Service.entities;

import Service.GUI;
import Service.PremierLeagueManager;
import entities.FootballClub;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TeamDetailsUI extends Application {

    private final static PremierLeagueManager LEAGUE_MANAGER = new PremierLeagueManager();

    public static void stage2() {

        Stage window = new Stage(); //
        window.setTitle("Premier League");


        //-----------------------Adding Background Image------------------------------------------------------
        Image image = new Image("file:fb1.jpg");
        ImageView ms = new ImageView(image);
        //set background image image size
        ms.setFitWidth(1300);
        ms.setFitHeight(1000);


        //---------------------creating the button for sorting the league details----------------------------------

        Button bt1 = new Button("Sort by goals scored");
        //adding style to the button 1
        bt1.setStyle("-fx-base: #260033; -fx-text-fill:#ffffff; -fx-border-color:white;");
        // setting the button position
        bt1.setLayoutX(300);
        bt1.setLayoutY(580);
// button width and height
        bt1.setMinSize(80, 40);


        //---------------------creating the button for sorting the league details
        Button bt2 = new Button("Sort by points");
        bt2.setStyle("-fx-base: #260033; -fx-text-fill:white; -fx-border-color:white;");

        bt2.setLayoutX(100);
        bt2.setLayoutY(580);
        bt2.setMinSize(80, 40);

        //---------------------creating button for sorting the table by wins
        Button bt3 = new Button("Sort by wins");
        bt3.setStyle("-fx-base: #260033; -fx-text-fill:white; -fx-border-color:white;");
        bt3.setLayoutX(500);
        bt3.setLayoutY(580);
        bt3.setMinSize(80, 40);

        //Back button
        Button backbutton = new Button("Back");
        backbutton.setLayoutX(850);
        backbutton.setLayoutY(630);

        backbutton.setStyle("-fx-base: #ffffff; -fx-text-fill:#000000; -fx-font-weight:bold;-fx-border-color:#000000;");

        //Back button action
        backbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.close();
                try {
                    GUI.show();
                } catch (Exception e) {

                }
            }
        });
// --------------------------------------------------creating the table------------------------------------------------------
        TableView<FootballClub> tb = new TableView<FootballClub>();
        ObservableList<FootballClub> observableList = FXCollections.observableArrayList(LEAGUE_MANAGER.SaveFootballClub());


        //Creating the column for Club name
        TableColumn<FootballClub, String> clubName = new TableColumn<>("Club Name");
        //adding style
        clubName.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold; ");
        //width
        clubName.setMinWidth(150);
        clubName.setCellValueFactory(new PropertyValueFactory<>("nameOfTheClub"));


        //Creating thetable column for Matches played
        TableColumn<FootballClub, Integer> matchesPlayed = new TableColumn<>("PM");
        //adding style
        matchesPlayed.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        //width
        matchesPlayed.setMinWidth(120);
        matchesPlayed.setCellValueFactory(new PropertyValueFactory<>("numberOfMatchesPlayed"));


        //Creating table column for Matches wins
        TableColumn<FootballClub, Integer> wins = new TableColumn<>("MW");
        //adding style
        wins.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        //width
        wins.setMinWidth(120);
        wins.setCellValueFactory(new PropertyValueFactory<>("numberOfWins"));


        //Creating table column for Drawn matches
        TableColumn<FootballClub, Integer> draw = new TableColumn<>("MD");
        //width
        draw.setMinWidth(120);
        //adding style
        draw.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        draw.setCellValueFactory(new PropertyValueFactory<>("numberOfDraws"));


        //Creating table column for Lost matches
        TableColumn<FootballClub, Integer> loss = new TableColumn<>("ML");
        loss.setMinWidth(120);
        //adding style
        loss.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        loss.setCellValueFactory(new PropertyValueFactory<>("numberOfDefeats"));


        //Creating table column for Points
        TableColumn<FootballClub, Double> points = new TableColumn<>("Points");
        points.setMinWidth(120);
        //adding style
        points.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        points.setCellValueFactory(new PropertyValueFactory<>("numberOfPoints"));


        //Creating table column for Goals scored
        TableColumn<FootballClub, Integer> goalScored = new TableColumn<>("GS");
        goalScored.setMinWidth(120);
        //adding style
        goalScored.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        goalScored.setCellValueFactory(new PropertyValueFactory<>("numberOfGoalsScored"));


        //Creating table column for Received goals
        TableColumn<FootballClub, Integer> goalReceived = new TableColumn<>("GR");
        goalReceived.setMinWidth(120);
        //adding style
        goalReceived.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        goalReceived.setCellValueFactory(new PropertyValueFactory<>("numberOfGoalsReceived"));


        //Creating table column for goal difference
        TableColumn<FootballClub, Integer> goalDif = new TableColumn<>("GD");
        goalDif.setMinWidth(120);
        //adding style
        goalDif.setStyle("-fx-base:PowderBlue;-fx-font-weight: bold; ");
        goalDif.setCellValueFactory(new PropertyValueFactory<>("GD"));

       //adding columns in table
        tb.getColumns().addAll(clubName, matchesPlayed, wins, draw, loss, points, goalScored, goalReceived, goalDif);
        for (FootballClub std : observableList) {
            FootballClub addRecord = new FootballClub(std.getNameOfTheClub(), std.getLocationOfTheClub(), std.getNameOfTheManager(), std.getRegistrationNumber(), std.getContactNumberOfTheClub(), std.getNumberOfWins(), std.getNumberOfDraws(), std.getNumberOfDefeats(), std.getNumberOfGoalsReceived(), (int) std.getNumberOfPoints(), std.getNumberOfGoalsScored(), std.getNumberOfMatchesPlayed(), std.getGD());
            tb.getItems().addAll(addRecord);


            //-------------------------button action-------------------------------------------------------------------------

            //giving action to the button(goal scored)
            bt1.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    try {
                                        //Sort
                                        goalScored.setSortType(TableColumn.SortType.DESCENDING);
                                        tb.getSortOrder().setAll(goalScored);


                                    } catch (Exception e) {
                                    }
                                }
                            }

            );

            //giving action to the button(points sort)
            bt2.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    try {
                                   //Sort
                                        points.setSortType(TableColumn.SortType.DESCENDING);
                                        tb.getSortOrder().setAll(points);


                                    } catch (Exception e) {
                                    }
                                }
                            }
            );

            //giving action to the button(Wins)
            bt3.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    try {
                                        //Sort
                                        wins.setSortType(TableColumn.SortType.DESCENDING);
                                        tb.getSortOrder().setAll(wins);


                                    } catch (Exception e) {
                                    }
                                }
                            }
            );




        }

// set the table size
    tb.setPrefSize(1200,450);
        //table position
    tb.setLayoutX(100);
        //table position
    tb.setLayoutY(100);
    Pane root=new Pane();
    //adding buttons in the GUI window
    root.getChildren().addAll(ms,tb,bt1,bt2,bt3,backbutton);
    //set the size of the gui window
    Scene scene = new Scene(root, 1200, 700);
    window.setScene(scene);
    window.show();

}

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}