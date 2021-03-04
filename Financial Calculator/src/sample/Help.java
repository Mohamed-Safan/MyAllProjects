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

public class Help extends Application {

    public static void stage7() {
        Stage window7 = new Stage();
        window7.setTitle("Help");

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

        Image image2 = new Image("file:oo.png");
        ImageView ms2=new ImageView(image2);
        Group rt2= new Group();
        ms2.setX(50);
        ms2.setY(250);
        ms2.setImage(image2);
        ms2.setFitWidth(180);
        ms2.setFitHeight(180);

        Image image3 = new Image("file:kj.png");
        ImageView ms3=new ImageView(image3);
        Group rt3= new Group();
        ms3.setX(50);
        ms3.setY(450);
        ms3.setImage(image3);
        ms3.setFitWidth(180);
        ms3.setFitHeight(180);


        Image image4 = new Image("file:ddd.png");
        ImageView ms4=new ImageView(image4);
        Group rt4= new Group();
        ms4.setX(50);
        ms4.setY(650);
        ms4.setImage(image4);
        ms4.setFitWidth(180);
        ms4.setFitHeight(180);



        //Labels
        Label lb1=new Label("Loan Calculator");
        lb1.setLayoutX(280);
        lb1.setLayoutY(50);

        lb1.setStyle("-fx-text-fill:White;-fx-font-size:5mm;-fx-font-weight: bold;");

        Label lb2=new Label("Loan Calculator is the special kind of\n"+ "calculator that Calculates your Monthly Payment,\n"+"Total Payments and Total Interest.");
        lb2.setLayoutY(100);
        lb2.setLayoutX(280);
        lb2.setStyle("-fx-text-fill:white;");




        Label lb3=new Label("Mortgage Calculator");
        lb3.setLayoutX(280);
        lb3.setLayoutY(250);

        lb3.setStyle("-fx-text-fill:White;-fx-font-size:5mm;-fx-font-weight: bold;");

        Label lb4=new Label("Mortgage Calculator is the special kind of\n"+ "calculator that Calculates your \n"+"Monthly Mortgage Payment.");
        lb4.setLayoutY(300);
        lb4.setLayoutX(280);
        lb4.setStyle("-fx-text-fill:white;");


        Label lb5=new Label("Saving Calculator");
        lb5.setLayoutX(280);
        lb5.setLayoutY(450);
        lb5.setStyle("-fx-text-fill:White;-fx-font-size:5mm;-fx-font-weight: bold;");

        Label lb6=new Label("Saving Calculator is the special kind of\n"+ "calculator that Calculates your \n"+"First Payment,Annuity Payment,Interest Rate, \n"+"Numbers of Payments and Start Principal.");
        lb6.setLayoutY(500);
        lb6.setLayoutX(280);
        lb6.setStyle("-fx-text-fill:white;");

        Label lb7=new Label("Compound Interest Calculator");
        lb7.setLayoutX(280);
        lb7.setLayoutY(650);
        lb7.setStyle("-fx-text-fill:White;-fx-font-size:5mm;-fx-font-weight: bold;");

        Label lb8=new Label("Compound Calculator is the special kind of\n"+ "calculator that Calculates your \n"+"Interest Value.");
        lb8.setLayoutY(700);
        lb8.setLayoutX(280);
        lb8.setStyle("-fx-text-fill:white;");

Button btn1=new Button();
btn1.setLayoutX(680);
btn1.setLayoutY(750);


        Image img1 = new Image("file:po.jpg");
        ImageView ms5 = new ImageView(img1);
        ms5.setFitHeight(30);
        ms5.setPreserveRatio(true);
        btn1.setGraphic(ms5);

        btn1.setOnAction(event -> {

            window7.close();
            Main.show();

        });



        Pane root = new Pane();
        root.getChildren().addAll(ms1,ms,lb1,lb2,ms2,lb3,lb4,ms3,ms4,lb5,lb6,lb7,lb8,ms5,btn1);

        window7.setHeight(1000);
        window7.setWidth(1000);
        window7.setScene(new Scene(root));
        window7.show();

    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}