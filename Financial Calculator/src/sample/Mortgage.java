package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static java.lang.Math.pow;

public class Mortgage extends Application {

    public static void stage2() {
        Stage window1 = new Stage();
        window1.setTitle("Mortgage Calculator");

        Label lbl1 = new Label("Home price ($):");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);
        lbl1.setPrefSize(300,20);

        Label lbl2 = new Label("Down payment (%):");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);

        Label lbl3 = new Label("Loan term (yrs):");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);

        Label lbl4 = new Label("Interest rate (%):");
        lbl4.setLayoutY(250);
        lbl4.setLayoutX(50);

        lbl1.setStyle("-fx-text-fill:white;");
        lbl2.setStyle("-fx-text-fill:white;");
        lbl3.setStyle("-fx-text-fill:white;");
        lbl4.setStyle("-fx-text-fill:white;");

        Label lbl5 = new Label(       );
        lbl5.setLayoutY(250);
        lbl5.setLayoutX(150);

        Label lbl7 = new Label("              " );
        lbl7.setLayoutY(430);
        lbl7.setLayoutX(300);

        lbl5.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");
        lbl7.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");

        TextField txt1 = new TextField();
        txt1.setLayoutX(185);
        txt1.setLayoutY(100);
        txt1.setPromptText("  ");

        TextField txt2 = new TextField();
        txt2.setLayoutX(185);
        txt2.setLayoutY(150);

        TextField txt3 = new TextField();
        txt3.setLayoutX(185);
        txt3.setLayoutY(200);

        TextField txt4 = new TextField();
        txt4.setLayoutX(185);
        txt4.setLayoutY(250);

        Button btn1 = new Button("Calculate");
        btn1.setPrefSize(130,50);
        btn1.setLayoutX(50);
        btn1.setLayoutY(350);

        btn1.setOnAction(e -> {
try {

    double n = 12;
    double num1 = Double.parseDouble(txt1.getText());
    double num2 = Double.parseDouble(txt3.getText());
    double num3 = Double.parseDouble(txt4.getText());
    double num4 = Double.parseDouble(txt2.getText());
    double num5 = num1 - num4;

    double res1;
    res1 = ((num3 / n) / 100 * num5) / (1 - pow((1 + (num3 / n) / 100), -n * num2));
    lbl7.setText(String.format("%.2f", res1));
}catch (Exception prompt){
    lbl7.setText("Please enter Integer value");
}
        });

        Button btn2 = new Button("Back");
        btn2.setLayoutX(690);
        btn2.setLayoutY(550);

        btn2.setOnAction(event -> {
            window1.close();
            Main.show();
        });

      Label btn8 = new Label("                   KEYPAD");
        btn8.setLayoutX(486);
        btn8.setLayoutY(125);
        btn8.setPrefSize(230,50);

        btn8.setStyle("-fx-font-weight:bold;-fx-text-fill:white;");

        //output

        Label lbl6 = new Label("Mortgage Payment(Monthly):\n"+"($)" );
        lbl6.setLayoutY(430);
        lbl6.setLayoutX(50);


        lbl6.setStyle("-fx-text-fill:white;");

        //style

        Button clear = new Button("Clear");
        clear.setLayoutX(332);
        clear.setLayoutY(290);

        clear.setOnAction(event -> {

            txt1.clear();
            txt2.clear();
            txt3.clear();
            txt4.clear();
            lbl7.setText("");

        });

        clear.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");

        Button b1 = new Button("1");
        b1.setLayoutX(440);
        b1.setLayoutY(200);
        b1.setPrefSize(100,75);

        Button b2 = new Button("4");
        b2.setLayoutX(440);
        b2.setLayoutY(275);
        b2.setPrefSize(100,75);
        b2.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("4"));});

        Button b3 = new Button("3");
        b3.setLayoutX(640);
        b3.setLayoutY(200);
        b3.setPrefSize(100,75);
        b3.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("3"));});

        Button b4 = new Button("2");
        b4.setLayoutX(540);
        b4.setLayoutY(200);
        b4.setPrefSize(100,75);
        b4.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("2"));});

        Button b5 = new Button("5");
        b5.setLayoutX(540);
        b5.setLayoutY(275);
        b5.setPrefSize(100,75);
        b5.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("5"));});

        Button b6 = new Button("6");
        b6.setLayoutX(640);
        b6.setLayoutY(275);
        b6.setPrefSize(100,75);
        b6.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("6"));});

        Button b7 = new Button("7");
        b7.setLayoutX(440);
        b7.setLayoutY(350);
        b7.setPrefSize(100,75);
        b7.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("7"));});

        Button b8 = new Button("8");
        b8.setLayoutX(540);
        b8.setLayoutY(350);
        b8.setPrefSize(100,75);
        b8.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("8"));});

        Button b9 = new Button("9");
        b9.setLayoutX(640);
        b9.setLayoutY(350);
        b9.setPrefSize(100,85);
        b9.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("9"));});

        Button b10 = new Button(".");
        b10.setLayoutX(440);
        b10.setLayoutY(425);
        b10.setPrefSize(100,75);
        b10.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("."));});

        Button ss = new Button("0");
        ss.setLayoutX(540);
        ss.setLayoutY(425);
        ss.setPrefSize(100,75);
        ss.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("0"));});

        Button mi = new Button("-");
        mi.setLayoutX(640);
        mi.setLayoutY(425);
        mi.setPrefSize(100,75);
        mi.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("-"));});

        Button del = new Button("Delete");
        del.setLayoutX(740);
        del.setLayoutY(200);
        del.setPrefSize(100,308);

//Adding css

        b1.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm; -fx-border-width: 8px;-fx-border-color: #5200cc;");
        b2.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b3.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b4.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b5.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b6.setStyle("-fx-base: LightGrey; -fx-font-weight: bold;  -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b7.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b8.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b9.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b10.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        ss.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        mi.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        del.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo;-fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");


        txt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"1");
                    }
                });
                b2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"4");
                    }
                });

                b3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"3");
                    }
                });

                b4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"2");
                    }
                });
                b5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"5");
                    }
                });
                b6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"6");
                    }
                });
                b7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"7");
                    }
                });
                b8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"8");
                    }
                });
                b9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"9");
                    }
                });
                b10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+".");
                    }
                });
                ss.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"0");
                    }
                });
                mi.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText()+"-");
                    }
                });
                del.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt1.getText().substring(0, txt1.getText().length() - 1));
                    }
                });

            }
        });


        txt2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"1");
                    }
                });

                b2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"4");
                    }
                });

                b3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"3");
                    }
                });

                b4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"2");
                    }
                });
                b5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"5");
                    }
                });
                b6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"6");
                    }
                });
                b7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"7");
                    }
                });
                b8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"8");
                    }
                });
                b9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"9");
                    }
                });
                b10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+".");
                    }
                });
                ss.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"0");
                    }
                });
                mi.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText()+"-");
                    }
                });
                del.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt2.getText().substring(0, txt2.getText().length() - 1));
                    }
                });
            }
        });

        //setting set on actions for buttons in keyboard(text field3)
        txt4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"1");
                    }
                });

                b2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"4");
                    }
                });

                b3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"3");
                    }
                });

                b4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"2");
                    }
                });
                b5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"5");
                    }
                });
                b6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"6");
                    }
                });
                b7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"7");
                    }
                });
                b8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"8");
                    }
                });
                b9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"9");
                    }
                });
                b10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+".");
                    }
                });
                ss.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"0");
                    }
                });
                mi.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText()+"-");
                    }
                });

                del.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt4.setText(txt4.getText().substring(0, txt4.getText().length() - 1));
                    }
                });

            }
        });

        txt3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"1");
                    }
                });

                b2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"4");
                    }
                });

                b3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"3");
                    }
                });

                b4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"2");
                    }
                });
                b5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"5");
                    }
                });
                b6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"6");
                    }
                });
                b7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"7");
                    }
                });
                b8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"8");
                    }
                });
                b9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"9");
                    }
                });
                b10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+".");
                    }
                });
                ss.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"0");
                    }
                });
                mi.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText()+"-");
                    }
                });


                del.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt3.setText(txt3.getText().substring(0, txt3.getText().length() - 1));
                    }
                });
            }
        });

        btn8.setStyle("-fx-border-width: 8px; -fx-border-color: BLACK; -fx-font-weight: bold; -fx-text-fill:WHITE;-fx-font-size: 4mm;");
        btn1.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");
        btn2.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        Button bn1=new Button("Help");
        bn1.setLayoutY(30);
        bn1.setLayoutX(280);
        bn1.setPrefSize(100,20);

        bn1.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");

        bn1.setOnAction(event -> {

            window1.show();
            mortgageHelp.stage9();
        });

        Image image = new Image("file:pp.jpg");
        ImageView ms=new ImageView(image);
        Group root= new Group();

        ms.setImage(image);
        ms.setFitWidth(1000);
        ms.setFitHeight(800);

        root.getChildren().addAll(ms);
        root.getChildren().add(btn1);
        root.getChildren().addAll(lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,ss,mi,del);
        root.getChildren().addAll(btn2,btn8,clear,txt1,txt2,txt3,txt4,bn1);

        window1.setScene(new Scene(root, 1000, 800));
        window1.show();

    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}