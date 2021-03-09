package Service;

import Service.entities.TeamDetailsUI;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.FileNotFoundException;


public class GUI extends Application {

    Console console =new Console();

    public static void show()throws FileNotFoundException{

        Stage Main =new Stage();
        Main.setTitle("Home Page");

//Label
        Label lbl =new Label("FOOTBALL PREMIER LEAGUE \n         CHAMPIONSHIP \n                   2020");
        lbl.setLayoutX(270);
        lbl.setLayoutY(65);
        lbl.setStyle("-fx-font-size: 9mm; -fx-text-fill: white; -fx-font-weight: bold;");

        //buttons
        Button btn1 = new Button("Team Details");
        //Button size
        btn1.setPrefSize(190,100);
        btn1.setLayoutX(140);
        btn1.setLayoutY(300);

        //Adding CSS Styles
        btn1.setStyle("-fx-font-size: 5mm; -fx-border-width: 10px; -fx-border-color: white; -fx-font-weight: bold;");


        //buttons
        Button btn3 = new Button("Random match");
        //Button size
        btn3.setPrefSize(190,100);
        //position of the button
        btn3.setLayoutX(140);
        btn3.setLayoutY(660);

        //Adding CSS Styles
        btn3.setStyle("-fx-font-size: 5mm; -fx-border-width: 10px; -fx-border-color: white; -fx-font-size: 4mm; -fx-font-weight: bold;");


        //buttons
        Button btn2 = new Button("Search");
        btn2.setPrefSize(190,100);
        //position of the button
        btn2.setLayoutX(140);
        btn2.setLayoutY(480);

        //Adding CSS Styles
        btn2.setStyle("-fx-font-size: 5mm; -fx-border-width: 10px; -fx-border-color: white; -fx-font-size: 4mm; -fx-font-weight: bold;");



        //button 1 Action
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage2=(Stage)btn1.getScene().getWindow();//to open Team details window
                stage2.close();
                TeamDetailsUI.stage2();
            }
        });

        //button 3 Action
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage3 =(Stage)btn3.getScene().getWindow();
                stage3.close();
                RandomUI.stage3();
            }
        });

        //button 2 Action
        btn2.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage4=(Stage)btn2.getScene().getWindow();
                stage4.close();
                SearchGUI.stage4();
            }
        }));

        //Adding Background Image
        Image image = new Image("file:fb.jpg");
        ImageView ms=new ImageView(image);
        //set the size of the image
        ms.setFitWidth(1000);
        ms.setFitHeight(1000);

        Pane root = new Pane();
        root.getChildren().addAll(ms);
        root.getChildren().addAll(btn1,btn2,btn3);
        root.getChildren().add(lbl);

        Main.setScene(new Scene(root, 1000, 800));
        Main.show();

    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root2 = new Pane();

        GUI.setScene(new Scene(root2, 1000, 800));
        GUI.show();


    }

    protected static void setScene(Scene scene) {
    }
}

