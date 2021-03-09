package sample;

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

public class Main extends Application {

    public static void show() {

        Stage Main =new Stage();
        Main.setTitle("Home Page");

//Label
        Label lbl =new Label("Financial Calculator");
        lbl.setLayoutX(270);
        lbl.setLayoutY(65);
        lbl.setStyle("-fx-font-size: 9mm; -fx-text-fill: white; -fx-font-weight: bold;");

        //buttons
        Button btn1 = new Button("Loan Calculator");
        btn1.setPrefSize(190,100);
        btn1.setLayoutX(150);
        btn1.setLayoutY(200);

        //Adding CSS Styles
        btn1.setStyle("-fx-border-width: 10px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        //buttons
        Button btn2 = new Button("Mortgage Calculator");
        btn2.setPrefSize(190,100);
        btn2.setLayoutX(150);
        btn2.setLayoutY(320);

        //Adding CSS Styles
        btn2.setStyle("-fx-border-width: 10px; -fx-border-color: Indigo; -fx-font-size: 4mm; -fx-font-weight: bold;");

        //buttons
        Button btn3 = new Button("Saving Calculator");
        btn3.setPrefSize(190,100);
        btn3.setLayoutY(440);
        btn3.setLayoutX(150);

        //Adding CSS Styles
        btn3.setStyle("-fx-border-width: 10px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        //buttons
        Button btn4 = new Button("Compound Calculator");
        btn4.setPrefSize(190,100);
        btn4.setLayoutX(150);
        btn4.setLayoutY(560);

        //Adding CSS Styles
        btn4.setStyle("-fx-border-width: 10px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        //buttons
        Button btn5 = new Button("Help");
        btn5.setMinSize(175,175);
        btn5.setLayoutX(500);
        btn5.setLayoutY(340);


        Image img1 = new Image("file:ld.png");
        ImageView ms5 = new ImageView(img1);
        ms5.setFitHeight(30);
        ms5.setPreserveRatio(true);
        btn5.setGraphic(ms5);

        //Adding CSS Styles
        btn5.setStyle("-fx-border-width: 10px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        //Adding Background Image

        Image image = new Image("file:nn.jpg");
        ImageView ms=new ImageView(image);
        ms.setFitWidth(1000);
        ms.setFitHeight(1000);


        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage1 = (Stage) btn1.getScene().getWindow();
                Main.close();

                Loan.stage1();
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage2=(Stage) btn2.getScene().getWindow();
                stage2.close();
                Mortgage.stage2();

            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage3=(Stage) btn3.getScene().getWindow();
                stage3.close();
                Financial.stage3();
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Stage stage4 = (Stage) btn4.getScene().getWindow();
                stage4.close();
                compound.stage4();
            }});

        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage7=(Stage) btn5.getScene().getWindow();
                stage7.show();
                Help.stage7();
            }
        });

        Pane root = new Pane();
        root.getChildren().addAll(ms,ms5);
        root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
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

        Main.setScene(new Scene(root2, 1000, 800));
        Main.show();

    }

    protected static void setScene(Scene scene) {
    }
}
