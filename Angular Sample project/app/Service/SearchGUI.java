package Service;


import entities.FootballClub;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SearchGUI extends Application {

    private final static PremierLeagueManager LEAGUE_MANAGER = new PremierLeagueManager();

    public static void stage4() {

        Stage window = new Stage(); //
        window.setTitle("Premier League");


        //-----------------------Adding Background Image------------------------------------------------------
        Image image = new Image("file:fb1.jpg");
        ImageView ms = new ImageView(image);
        //set background image image size
        ms.setFitWidth(1300);
        ms.setFitHeight(1000);


        //Back button
        Button backbutton = new Button("Back");
        backbutton.setLayoutX(850);
        backbutton.setLayoutY(630);

        backbutton.setStyle("-fx-base: #ffffff; -fx-text-fill:#000000; -fx-font-weight:bold; ");
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



//creating a label
    Label lb1 = new Label("Search :");
        lb1.setLayoutX(367);
        lb1.setLayoutY(55);

        //adding style
        lb1.setStyle("-fx-text-fill:white;-fx-font-weight: bold;");

//creating a text field
        TextField tx1 = new TextField();
        tx1.setPromptText("Click here to search");
    //set the position
        tx1.setLayoutX(450);
        tx1.setLayoutY(50);


// --------------------------------------------------creating table------------------------------------------------------
        TableView<FootballClub> tb = new TableView<FootballClub>();
        ObservableList<FootballClub> observableList = FXCollections.observableArrayList(LEAGUE_MANAGER.SaveFootballClub());



        TableColumn<FootballClub, String> clubName = new TableColumn<>("Club Name");
        //adding style
        clubName.setStyle("-fx-base:PowderBlue; -fx-font-weight: bold; ");
        //width
        clubName.setMinWidth(150);
        clubName.setCellValueFactory(new PropertyValueFactory<>("nameOfTheClub"));


        //Creating table column for Matches played
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


        FilteredList<FootballClub> footballClubFilteredList = new FilteredList(observableList, p -> true);
        tb.setItems(footballClubFilteredList);
        tb.getColumns().addAll(clubName, matchesPlayed, wins, draw, loss, points, goalScored, goalReceived, goalDif);


        tx1.setOnKeyReleased(keyValue -> {
                    footballClubFilteredList.setPredicate(p -> p.getNameOfTheClub().toLowerCase().contains(tx1.getText().toLowerCase()));


                }
        );

        //table size
        tb.setPrefSize(1200,450);
        //table position
        tb.setLayoutX(100);
        tb.setLayoutY(100);
        Pane root=new Pane();
        root.getChildren().addAll(ms,tb,backbutton,lb1,tx1);
       // set the winsow size
        Scene scene = new Scene(root, 1200, 700);
        window.setScene(scene);
        window.show();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}

