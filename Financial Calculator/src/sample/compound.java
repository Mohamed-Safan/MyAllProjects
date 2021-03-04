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

public class compound extends Application {

    public static void stage4() {
        Stage window3 = new Stage();
        window3.setTitle("Compound Interest Calculator");

        Label lbl1 = new Label("Principal amount($):");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);
        lbl1.setPrefSize(300,20);

        Label lbl2 = new Label("Interest rate(%):");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);

        Label lbl3 = new Label("Loan term (yrs):");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);

        lbl1.setStyle("-fx-text-fill:white;");
        lbl2.setStyle("-fx-text-fill:white;");
        lbl3.setStyle("-fx-text-fill:white;");


//-----txtfield-------------/////

        TextField txt1 = new TextField();
        txt1.setLayoutX(175);
        txt1.setLayoutY(100);
        txt1.setPromptText("  ");

        TextField txt2 = new TextField();
        txt2.setLayoutX(175);
        txt2.setLayoutY(150);

        TextField txt3 = new TextField();
        txt3.setLayoutX(175);
        txt3.setLayoutY(200);

        //output
        Label lbl6 = new Label("Compount Interest($):" );
        lbl6.setLayoutY(430);
        lbl6.setLayoutX(50);
        lbl6.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");

        Label lbl9 = new Label("            ");
        lbl9.setLayoutX(250);
        lbl9.setLayoutY(430);

        lbl9.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");


        //button
        Button btn1 = new Button("Calculate");
        btn1.setPrefSize(130,50);
        btn1.setLayoutX(50);
        btn1.setLayoutY(300);

        btn1.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");

        Button btn2 = new Button("Back");
        btn2.setLayoutX(690);
        btn2.setLayoutY(550);

        btn2.setOnAction(event -> {

            window3.close();
            Main.show();
        });

        Label btn8 = new Label("                   KEYPAD");
        btn8.setLayoutX(486);
        btn8.setLayoutY(125);
        btn8.setPrefSize(230,50);
        btn8.setStyle("-fx-font-weight:bold; -fx-text-fill:white;");
        //Adding styles

        btn2.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        //Image
        Image image = new Image("file:pp.jpg");
        ImageView ms=new ImageView(image);
        Group rt= new Group();
        rt.getChildren().addAll(ms);
        ms.setImage(image);
        ms.setFitWidth(1000);
        ms.setFitHeight(1000);

        Button clear = new Button("Clear");
        clear.setLayoutX(332);
        clear.setLayoutY(290);

        clear.setOnAction(event -> {
            txt1.clear();
            txt2.clear();
            txt3.clear();
            lbl9.setText("");

        });

        Button b1 = new Button("1");
        b1.setLayoutX(440);
        b1.setLayoutY(200);
        b1.setPrefSize(100,75);

        Button b2 = new Button("4");
        b2.setLayoutX(440);
        b2.setLayoutY(275);
        b2.setPrefSize(100,75);

        Button b3 = new Button("3");
        b3.setLayoutX(640);
        b3.setLayoutY(200);
        b3.setPrefSize(100,75);

        Button b4 = new Button("2");
        b4.setLayoutX(540);
        b4.setLayoutY(200);
        b4.setPrefSize(100,75);

        Button b5 = new Button("5");
        b5.setLayoutX(540);
        b5.setLayoutY(275);
        b5.setPrefSize(100,75);



        Button b6 = new Button("6");
        b6.setLayoutX(640);
        b6.setLayoutY(275);
        b6.setPrefSize(100,75);


        Button b7 = new Button("7");
        b7.setLayoutX(440);
        b7.setLayoutY(350);
        b7.setPrefSize(100,75);


        Button b8 = new Button("8");
        b8.setLayoutX(540);
        b8.setLayoutY(350);
        b8.setPrefSize(100,75);

        Button b9 = new Button("9");
        b9.setLayoutX(640);
        b9.setLayoutY(350);
        b9.setPrefSize(100,85);

        Button b10 = new Button(".");
        b10.setLayoutX(440);
        b10.setLayoutY(425);
        b10.setPrefSize(100,75);

        Button ss = new Button("0");
        ss.setLayoutX(540);
        ss.setLayoutY(425);
        ss.setPrefSize(100,75);

        Button mi = new Button("-");
        mi.setLayoutX(640);
        mi.setLayoutY(425);
        mi.setPrefSize(100,75);

        Button del = new Button("Delete");
        del.setLayoutX(740);
        del.setLayoutY(200);
        del.setPrefSize(100,310);

        Button bn1=new Button("Help");
        bn1.setLayoutY(30);
        bn1.setLayoutX(630);
        bn1.setPrefSize(100,20);

        bn1.setStyle("-fx-font-weight: bold; -fx-base:pink;-fx-border-width: 5px; -fx-border-color: BLACK;");

        bn1.setOnAction(event -> {
            window3.show();
            CompoundHelp.stage10();
        });

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

        btn1.setOnAction(e -> {

            try {
                double n = 12;
                double p = Double.parseDouble(txt1.getText());
                double r = Double.parseDouble(txt2.getText()) / 100;
                double t = Double.parseDouble(txt3.getText());

                double ans;
                double ans1;
                ans = p * (Math.pow((1 + r / n), n * t));
                ans1 = ans - p;
                lbl9.setText(String.format("%.2f", ans1));
            }catch (Exception text){
                lbl9.setText("Error! Please enterInteger values" );
            }
        });



        clear.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");

        Pane root = new Pane();
        root.getChildren().add(ms);
        root.getChildren().addAll(btn1,btn2,btn8,clear,txt1,txt2,txt3,lbl1,lbl2,lbl3,lbl9,lbl6,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,ss,mi,bn1,del);


        window3.setHeight(800);
        window3.setWidth(1000);
        window3.setScene(new Scene(root));
        window3.show();

    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}

