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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Loan extends Application {

    public static void stage1() {
        Stage window = new Stage();
        window.setTitle("Loan Calculator");

        Label lbl1 = new Label("Loan amount ($):");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);
        Label lbl2 = new Label("Loan Term (yrs):");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);
        Label lbl3 = new Label("Interest rate (%):");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);
        Label lbl4 = new Label("Compound;");
        lbl4.setLayoutY(250);
        lbl4.setLayoutX(50);

        lbl1.setStyle("-fx-text-fill:white;");
        lbl2.setStyle("-fx-text-fill:white;");
        lbl3.setStyle("-fx-text-fill:white;");
        lbl4.setStyle("-fx-text-fill:white;");


        TextField txt1 = new TextField();
        txt1.setLayoutX(170);
        txt1.setLayoutY(100);
        TextField txt2 = new TextField();
        txt2.setLayoutX(170);
        txt2.setLayoutY(150);

        TextField txt3 = new TextField();
        txt3.setLayoutX(170);
        txt3.setLayoutY(200);

        //Output (emty Labels)

        Label lbl9 = new Label("            ");
        lbl9.setLayoutX(250);
        lbl9.setLayoutY(480);

        Label lbl10 = new Label("            ");
        lbl10.setLayoutX(250);
        lbl10.setLayoutY(530);

        Label lbl11 = new Label("           ");
        lbl11.setLayoutX(250);
        lbl11.setLayoutY(580);

        lbl9.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");
        lbl10.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");
        lbl11.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");

        Label sd1=new Label("MONTHLY");
        sd1.setLayoutX(150);
        sd1.setLayoutY(250);
        sd1.setPrefWidth(220);

        Label lbl5 = new Label("Pay Back;");
        lbl5.setLayoutY(300);
        lbl5.setLayoutX(50);
        lbl5.setStyle("-fx-text-fill:white;");

        Label SD=new Label("EVERY MONTH");
        SD.setLayoutX(150);
        SD.setLayoutY(300);
        SD.setPrefWidth(220);

        Button btn1 = new Button("Calculate");
        btn1.setLayoutX(50);
        btn1.setLayoutY(350);
        btn1.setPrefSize(130,50);
//----------------------------------------------------------------------------
//------------------------------------Loan formula----------------------------
        btn1.setOnAction(e -> {
            try {
                double n = 12;
                double l = Double.parseDouble(txt1.getText());
                double t = (Double.parseDouble(txt2.getText()));
                double r = Double.parseDouble(txt3.getText());

                double ans5;
                ans5 = ((r / 12) / 100 * l) / (1 - Math.pow((1 + (r / 12) / 100), -n * t));
                lbl9.setText(String.format("%.2f", ans5));

                double ans6;
                ans6 = (ans5 * t * 12);
                lbl10.setText(String.format("%.2f", ans6));

                double ans7;

                ans7 = ans6 - l;
                lbl11.setText(String.format("%.2f", ans7));
            }catch (Exception text){
                lbl9.setText("Error! Please enter Integer values...");
            }
        });

//--------------------------------------------------------------

        Button btn2 = new Button("Back");
        btn2.setLayoutX(690);
        btn2.setLayoutY(550);


        Label btn8 = new Label("             KEYPAD");
        btn8.setLayoutX(486);
        btn8.setLayoutY(95);
        btn8.setPrefSize(230,50);
        lbl2.setStyle("-fx-text-fill:white;-fx-font-weight:bold");



        Image image = new Image("file:pp.jpg");
        ImageView ms=new ImageView(image);
        Group rt= new Group();

        ms.setImage(image);
        ms.setFitWidth(1000);
        ms.setFitHeight(800);

        //output
//label
        Label lbl6 = new Label("Payment Every Month ($):");
        lbl6.setLayoutY(480);
        lbl6.setLayoutX(50);

        //style
        lbl6.setStyle(" -fx-font-weight: bold;");


        //label
        Label lbl7 = new Label("Total Payments ($):");
        lbl7.setLayoutY(530);
        lbl7.setLayoutX(50);
//Label
        Label lbl8 = new Label("Total Interest ($):");
        lbl8.setLayoutY(580);
        lbl8.setLayoutX(50);

        lbl6.setStyle("-fx-text-fill:white;");
        lbl7.setStyle("-fx-text-fill:white;");
        lbl8.setStyle("-fx-text-fill:white;");
        SD.setStyle("-fx-text-fill:white;");
        sd1.setStyle("-fx-text-fill:white;");

        Button btn4 = new Button("Clear");
        btn4.setLayoutX(300);
        btn4.setLayoutY(350);

        btn4.setOnAction(event -> {

            txt1.clear();
            txt2.clear();
            txt3.clear();
            lbl9.setText("");
            lbl10.setText("");
            lbl11.setText("");

        });

//On Screen Keyboard

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
        del.setPrefSize(100,310);


//Adding css

        del.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo;-fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
        b1.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #5200cc;");
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

        ////-------------------Help Button------------------------------///

        Button bn1=new Button("Help");
        bn1.setLayoutY(30);
        bn1.setLayoutX(280);
        bn1.setPrefSize(100,20);

        bn1.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");

        bn1.setOnAction(event -> {

            window.show();
            LoanHelp.stage8();

        });

//clear button style

        btn4.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");
        btn1.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");
        btn2.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");
        btn8.setStyle("-fx-border-width: 5px; -fx-border-color: BLACK; -fx-text-fill: white;-fx-font-size: 4mm; -fx-font-weight: bold;");


        ///Help

        btn2.setOnAction(event -> {

            window.close();
            Main.show();

        });
        Pane root = new Pane();
        root.getChildren().add(ms);
        root.getChildren().addAll(lbl1,lbl2,lbl3,lbl5,lbl4,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,txt1,txt2,txt3,btn1,btn2,btn4,btn8);
        root.getChildren().addAll(SD,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,ss,mi,bn1,del);
        root.getChildren().add(sd1);

        window.setScene(new Scene(root));
        window.show();
        window.setHeight(800);
        window.setWidth(1000);

    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
