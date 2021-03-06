package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoanHelp extends Application {

    public static void stage8() {
        Stage window8 = new Stage();
        window8.setTitle("Compound Calculator");

        Image image1 = new Image("file:sd.jpg");
        ImageView ms1=new ImageView(image1);

        ms1.setImage(image1);
        ms1.setFitWidth(1000);
        ms1.setFitHeight(1000);

        Image image = new Image("file:lo.png");
        ImageView ms=new ImageView(image);
        Group rt= new Group();
        ms.setX(50);
        ms.setY(50);
        ms.setImage(image);
        ms.setFitWidth(180);
        ms.setFitHeight(180);

        Image image8 = new Image("file:55.png");
        ImageView ms0=new ImageView(image8);
        ms0.setX(630);
        ms0.setY(80);
        ms0.setImage(image8);
        ms0.setFitWidth(350);
        ms0.setFitHeight(400);



        Image img11 = new Image("file:7.png");
        ImageView ms8=new ImageView(img11);
        Group rt1= new Group();
        ms8.setX(50);
        ms8.setY(280);
        ms8.setImage(img11);
        ms8.setFitWidth(100);
        ms8.setFitHeight(100);

        Label l=new Label("Press this button to get Home Window");
        l.setLayoutY(300);
        l.setLayoutX(280);
        l.setStyle("-fx-text-fill:white;");

        Image img12 = new Image("file:8.png");
        ImageView ms4=new ImageView(img12);
        ms4.setX(50);
        ms4.setY(400);
        ms4.setImage(img12);
        ms4.setFitWidth(100);
        ms4.setFitHeight(100);

        Label l1=new Label("If you want to clear the values, press this button");
        l1.setLayoutY(420);
        l1.setLayoutX(280);
        l1.setStyle("-fx-text-fill:white;");

        Image img13 = new Image("file:a.png");
        ImageView ms6=new ImageView(img13);
        ms6.setX(50);
        ms6.setY(520);
        ms6.setImage(img13);
        ms6.setFitWidth(100);
        ms6.setFitHeight(100);

        Label l2=new Label("Press this button to calculate the value");
        l2.setLayoutY(540);
        l2.setLayoutX(280);
        l2.setStyle("-fx-text-fill:white;");

        Image img14 = new Image("file:9.png");
        ImageView ms7=new ImageView(img14);
        ms7.setX(50);
        ms7.setY(640);
        ms7.setImage(img14);
        ms7.setFitWidth(100);
        ms7.setFitHeight(100);

        Label l3=new Label("Here you can find out the output ");
        l3.setLayoutY(660);
        l3.setLayoutX(280);
        l3.setStyle("-fx-text-fill:white;");

        Image image22 = new Image("file:q.png");
        ImageView ms10=new ImageView(image22);
        ms10.setX(50);
        ms10.setY(760);
        ms10.setImage(image22);
        ms10.setFitWidth(100);
        ms10.setFitHeight(100);

        Label l4=new Label("On Screen Keypad ");
        l4.setLayoutY(780);
        l4.setLayoutX(280);
        l4.setStyle("-fx-text-fill:white;");

        //Labels
        Label lb1=new Label("Loan Calculator");
        lb1.setLayoutX(280);
        lb1.setLayoutY(50);

        lb1.setStyle("-fx-text-fill:White;-fx-font-size:5mm;-fx-font-weight: bold;");

        Label lb2=new Label("Loan Calculator is the special kind of\n"+ "calculator that Calculates your Monthly Payment,\n"+"Total Payments and Total Interest.");
        lb2.setLayoutY(100);
        lb2.setLayoutX(280);
        lb2.setStyle("-fx-text-fill:white;");

        Button btn1=new Button();
        btn1.setLayoutX(680);
        btn1.setLayoutY(750);

        Image img1 = new Image("file:po.jpg");
        ImageView ms5 = new ImageView(img1);
        ms5.setFitHeight(30);
        ms5.setPreserveRatio(true);
        btn1.setGraphic(ms5);

        btn1.setOnAction(event -> {

            window8.close();
            Loan.stage1();

        });

        Pane root = new Pane();
        root.getChildren().addAll(ms1,ms,lb1,lb2,ms5,btn1,ms8,ms4,ms6,ms7,l1,l2,l3,l4,ms10,l,ms0);

        window8.setHeight(1000);
        window8.setWidth(1000);
        window8.setScene(new Scene(root));
        window8.show();

    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}