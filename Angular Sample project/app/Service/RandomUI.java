package Service;

import entities.LeagueMatch;
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

public class RandomUI extends Application {

    private final static PremierLeagueManager leaguemanager = new PremierLeagueManager();

    public static void stage3() {

        Stage window = new Stage();
        window.setTitle("Premier League");


        //-----------------------Adding Background Image------------------------------------------------------
        Image image = new Image("file:fb1.jpg");
        ImageView ms = new ImageView(image);
        //set background image image size
        ms.setFitWidth(1300);
        ms.setFitHeight(1000);

//random button
        //Back button
        Button rdm = new Button("Random matches");
        rdm.setPrefSize(200,20);
        rdm.setLayoutX(900);
        rdm.setLayoutY(200);




        //Back button
        Button backbutton = new Button("Back");
        backbutton.setLayoutX(850);
        backbutton.setLayoutY(630);
        backbutton.setStyle("-fx-base: #fafafa; -fx-text-fill:#000000; -fx-font-weight:bold;");

        //-------------------------button action-------------------------------------------------------------------------

        //giving action to the button(back)

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
        TableView<LeagueMatch> tb = new TableView<LeagueMatch>();
        ObservableList<LeagueMatch> observableList = FXCollections.observableArrayList(leaguemanager.SaveFootballMatch());


        //Creating the column for Club name
        TableColumn<LeagueMatch, String> team1 = new TableColumn<>("Team A");
        //adding style
        team1.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold; ");
        //width
        team1.setMinWidth(150);
        team1.setCellValueFactory(new PropertyValueFactory<>("team1"));


        //Creating the table column for Matches played
        TableColumn<LeagueMatch, String> team2 = new TableColumn<>("Team B");
        //adding style
        team2.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        //width
        team2.setMinWidth(120);
        team2.setCellValueFactory(new PropertyValueFactory<>("team2"));


        //Creating table column for Matches wins
        TableColumn<LeagueMatch, Integer> team1Score = new TableColumn<>("Team A goals");
        //adding style
        team1Score.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        //width
        team1Score.setMinWidth(120);
        team1Score.setCellValueFactory(new PropertyValueFactory<>("team1Score"));


        //Creating table column for Drawn matches
        TableColumn<LeagueMatch, Integer> team2Score = new TableColumn<>("Team B goals");
        //width
        team2Score.setMinWidth(120);
        //adding style
        team2Score.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        team2Score.setCellValueFactory(new PropertyValueFactory<>("team2Score"));


        //Creating table column for Drawn matches
        TableColumn<LeagueMatch, Integer> date = new TableColumn<>("date");
        //width
        date.setMinWidth(120);
        //adding style
        date.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold;");
        date.setCellValueFactory(new PropertyValueFactory<>("date"));




        tb.getColumns().addAll(team1,team2,team1Score,team2Score,date);
        for (LeagueMatch std : observableList) {
            LeagueMatch addRecord = new LeagueMatch(std.getTeam1(), std.getTeam2(), std.getTeam1Score(), std.getTeam2Score(), std.getDate());
            tb.getItems().addAll(addRecord);




        }



        tb.setPrefSize(625,450);
        tb.setLayoutX(100);
        tb.setLayoutY(100);
        Pane root=new Pane();
        root.getChildren().addAll(ms,tb,backbutton,rdm);
        Scene scene = new Scene(root, 1200, 700);
        window.setScene(scene);
        window.show();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
