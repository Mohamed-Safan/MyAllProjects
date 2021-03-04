package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Financial extends Application {

    public static void stage3() {
        Stage window2 = new Stage();
        window2.setTitle("Financial Calculator");

//-----------------------FV----------------------//

        //labels
        Label lbl1 = new Label("Number of Periods\n"+" (Years):");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);

        Label lbl2 =new Label("Interst Rate(%):");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);

        Label lbl3 = new Label("Stat Principal($):");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);

        Label lbl4 = new Label("Annuity Payment($)");
        lbl4.setLayoutY(250);
        lbl4.setLayoutX(50);

        //Text Field
        TextField txt1 = new TextField();
        txt1.setLayoutX(200);
        txt1.setLayoutY(100);

        TextField txt2 = new TextField();
        txt2.setLayoutX(200);
        txt2.setLayoutY(150);
        txt2.setPromptText("%");

        TextField txt3 = new TextField();
        txt3.setLayoutX(200);
        txt3.setLayoutY(200);

        TextField txt46 = new TextField();
        txt46.setLayoutX(200);
        txt46.setLayoutY(250);

        Label lbl22 = new Label("                 " );
        lbl22.setLayoutY(430);
        lbl22.setLayoutX(200);

        Button btn1 = new Button("Calculate");
        btn1.setPrefSize(130,50);
        btn1.setLayoutX(50);
        btn1.setLayoutY(350);

        Button clear = new Button("Clear");
        clear.setLayoutX(332);
        clear.setLayoutY(290);

        clear.setOnAction(event -> {
            txt1.clear();
            txt2.clear();
            txt3.clear();
            txt46.clear();
            lbl22.setText("");
        });

        ///FV FORMULA
        btn1.setOnAction(e -> {

            try {
                double n = 12;
                double num1 = Double.parseDouble(txt1.getText());
                double num2 = Double.parseDouble(txt2.getText()) / 100;
                double num3 = Double.parseDouble(txt3.getText());
                double num4 = Double.parseDouble(txt46.getText());
                double res;

                res = (num4 * (((pow((1 + (num2 / n)), (n * num1)) - 1)) / (num2 / n)) + (num3 * (pow((1 + (num2 / n)), (n * num1)))));
                lbl22.setText(String.format("%.2f", res));
            }catch (Exception text){
                lbl22.setText("Error! Please enter Integer value... ");
            }
        });

        Button btn15 = new Button("Back");
        btn15.setLayoutX(690);
        btn15.setLayoutY(550);

        btn15.setOnAction(event -> {
            window2.close();
            Main.show();
        });

        ////----HELP BUTTON (FV)--------////

        Button bn1=new Button("Help");
        bn1.setLayoutY(30);
        bn1.setLayoutX(280);
        bn1.setPrefSize(100,20);
        bn1.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");
        bn1.setOnAction(event -> {
            window2.show();
            savingHelp.stage11();
        });

        //output

        Label lbl21 = new Label("Future Value($): " );
        lbl21.setLayoutY(430);
        lbl21.setLayoutX(50);

        ////--styles
        lbl21.setStyle(" -fx-font-weight: bold;");
        btn1.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold; bold;-fx-base:#00802b;-fx-text-fill:white;");
        btn15.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        //--------------------------------------------------------On Screen Keyboard---------------------------

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

//Adding css

        b1.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b2.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b3.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b4.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b5.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b6.setStyle("-fx-base: LightGrey; -fx-font-weight: bold;  -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b7.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b8.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b9.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b10.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        ss.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        mi.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        del.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo; -fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #990099");

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

        txt46.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"1");
                    }
                });
                b2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"4");
                    }
                });
                b3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"3");
                    }
                });
                b4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"2");
                    }
                });
                b5.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt2.setText(txt46.getText()+"5");
                    }
                });
                b6.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt2.getText()+"6");
                    }
                });
                b7.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"7");
                    }
                });
                b8.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"8");
                    }
                });
                b9.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"9");
                    }
                });
                b10.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+".");
                    }
                });
                ss.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"0");
                    }
                });
                mi.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText()+"-");
                    }
                });
                del.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt46.setText(txt46.getText().substring(0, txt46.getText().length() - 1));
                    }
                });

            }
        });

        //--------------------------PMT-------------------------------------

        Label lbl5 = new Label("Number of Periods\n"+" (Years):");
        lbl5.setLayoutY(100);
        lbl5.setLayoutX(50);

        Label lbl6 = new Label("Future value($):");
        lbl6.setLayoutY(150);
        lbl6.setLayoutX(50);

        Label lbl7 = new Label("Start Principal($):");
        lbl7.setLayoutY(200);
        lbl7.setLayoutX(50);

        Label lbl8 = new Label("Interest rate(%):");
        lbl8.setLayoutY(250);
        lbl8.setLayoutX(50);


        //--Textfield

        TextField txt5 = new TextField();
        txt5.setLayoutX(200);
        txt5.setLayoutY(100);

        TextField txt6 = new TextField();
        txt6.setLayoutX(200);
        txt6.setLayoutY(150);

        TextField txt7 = new TextField();
        txt7.setLayoutX(200);
        txt7.setLayoutY(200);

        TextField txt8 = new TextField();
        txt8.setLayoutX(200);
        txt8.setLayoutY(250);
        txt8.setPromptText("%");


        //button
        Button btn2 = new Button("Calculate");
        btn2.setPrefSize(130,50);
        btn2.setLayoutX(50);
        btn2.setLayoutY(350);

        Label lbl24 = new Label("                 " );
        lbl24.setLayoutY(430);
        lbl24.setLayoutX(200);

        Button clear1 = new Button("Clear");
        clear1.setLayoutX(332);
        clear1.setLayoutY(290);

        clear1.setOnAction(event -> {
            txt5.clear();
            txt6.clear();
            txt7.clear();
            txt8.clear();
            lbl24.setText("");
        });

///PMT FORMULA
        btn2.setOnAction(e -> {
            try {
                double n = 12;
                double num5 = Double.parseDouble(txt5.getText());
                double num6 = Double.parseDouble(txt6.getText());
                double num7 = Double.parseDouble(txt7.getText());
                double num8 = Double.parseDouble(txt8.getText()) / 100;

                double res1;
                res1 = (num6 - (num7 * pow((1 + (num8 / n)), (n * num5)))) / ((pow((1 + (num8 / n)), (n * num5)) - 1) / (num8 / n));
                lbl24.setText(String.format("%.2f", res1));
            }catch (Exception text){
                lbl24.setText("Error! Please enter Integer Value....");
            }
        });

        Button btn14 = new Button("Back");
        btn14.setLayoutX(690);
        btn14.setLayoutY(550);
        btn14.setOnAction(event -> {
            window2.close();
            Main.show();

        });

        btn14.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");
        btn2.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");

        //Output

        Label lbl23 = new Label("Periodic Payment($): " );
        lbl23.setLayoutY(430);
        lbl23.setLayoutX(50);

        lbl23.setStyle(" -fx-font-weight: bold;");

        //-------------------------------------On Screen Keyboard-----------------

        Button b11 = new Button("1");
        b11.setLayoutX(440);
        b11.setLayoutY(200);
        b11.setPrefSize(100,75);

        Button b12 = new Button("4");
        b12.setLayoutX(440);
        b12.setLayoutY(275);
        b12.setPrefSize(100,75);

        Button b13 = new Button("3");
        b13.setLayoutX(640);
        b13.setLayoutY(200);
        b13.setPrefSize(100,75);

        Button b14 = new Button("2");
        b14.setLayoutX(540);
        b14.setLayoutY(200);
        b14.setPrefSize(100,75);

        Button b15 = new Button("5");
        b15.setLayoutX(540);
        b15.setLayoutY(275);
        b15.setPrefSize(100,75);

        Button b16 = new Button("6");
        b16.setLayoutX(640);
        b16.setLayoutY(275);
        b16.setPrefSize(100,75);

        Button b17 = new Button("7");
        b17.setLayoutX(440);
        b17.setLayoutY(350);
        b17.setPrefSize(100,75);

        Button b18 = new Button("8");
        b18.setLayoutX(540);
        b18.setLayoutY(350);
        b18.setPrefSize(100,75);

        Button b19 = new Button("9");
        b19.setLayoutX(640);
        b19.setLayoutY(350);
        b19.setPrefSize(100,85);

        Button b20 = new Button(".");
        b20.setLayoutX(440);
        b20.setLayoutY(425);
        b20.setPrefSize(100,75);

        Button ss1 = new Button("0");
        ss1.setLayoutX(540);
        ss1.setLayoutY(425);
        ss1.setPrefSize(100,75);
        ss1.setOnAction(event ->
        {txt1.setText(txt1.getText().concat("0"));});

        Button mi1 = new Button("-");
        mi1.setLayoutX(640);
        mi1.setLayoutY(425);
        mi1.setPrefSize(100,75);

        Button del1 = new Button("Delete");
        del1.setLayoutX(740);
        del1.setLayoutY(200);
        del1.setPrefSize(100,310);


//Adding css

        del1.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo; -fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b11.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b12.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b13.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b14.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b15.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b16.setStyle("-fx-base: LightGrey; -fx-font-weight: bold;  -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b17.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b18.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b19.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b20.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        ss1.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        mi1.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");

        txt5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b11.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"1");
                    }
                });

                b12.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"4");
                    }
                });

                b13.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"3");
                    }
                });

                b14.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"2");
                    }
                });
                b15.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"5");
                    }
                });
                b16.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"6");
                    }
                });
                b17.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"7");
                    }
                });
                b18.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"8");
                    }
                });
                b19.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"9");
                    }
                });
                b20.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+".");
                    }
                });
                ss1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"0");
                    }
                });
                mi1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText()+"-");
                    }
                });
                del1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt5.setText(txt5.getText().substring(0, txt5.getText().length() - 1));
                    }
                });


            }
        });


        txt6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b11.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"1");
                    }
                });

                b12.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"4");
                    }
                });

                b13.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"3");
                    }
                });

                b14.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"2");
                    }
                });
                b15.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"5");
                    }
                });
                b16.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"6");
                    }
                });
                b17.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"7");
                    }
                });
                b18.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"8");
                    }
                });
                b19.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"9");
                    }
                });
                b20.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+".");
                    }
                });
                ss1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"0");
                    }
                });
                mi1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText()+"-");
                    }
                });
                del1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt6.setText(txt6.getText().substring(0, txt6.getText().length() - 1));
                    }
                });

            }
        });

        txt7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b11.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"1");
                    }
                });

                b12.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"4");
                    }
                });

                b13.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"3");
                    }
                });

                b14.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"2");
                    }
                });
                b15.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"5");
                    }
                });
                b16.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"6");
                    }
                });
                b17.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"7");
                    }
                });
                b18.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"8");
                    }
                });
                b19.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"9");
                    }
                });
                b20.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+".");
                    }
                });
                ss1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"0");
                    }
                });
                mi1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText()+"-");
                    }
                });
                del1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt7.setText(txt7.getText().substring(0, txt7.getText().length() - 1));
                    }
                });

            }
        });


        txt8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b11.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"1");
                    }
                });

                b12.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"4");
                    }
                });

                b13.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"3");
                    }
                });

                b14.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"2");
                    }
                });
                b15.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"5");
                    }
                });
                b16.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"6");
                    }
                });
                b17.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"7");
                    }
                });
                b18.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"8");
                    }
                });
                b19.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"9");
                    }
                });
                b20.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+".");
                    }
                });
                ss1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"0");
                    }
                });
                mi1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText()+"-");
                    }
                });
                del1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt8.setText(txt8.getText().substring(0, txt8.getText().length() - 1));
                    }
                });

            }
        });

        ////----HELP BUTTON (PMT)--------////

        Button bn2=new Button("Help");
        bn2.setLayoutY(30);
        bn2.setLayoutX(280);
        bn2.setPrefSize(100,20);

        bn2.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");
        bn2.setOnAction(event -> {

            window2.show();
            savingHelp.stage11();

        });
        //INTEREST RATE
        //--Label

        Label lbl9 = new Label("Number of Periods \n"+"(Years)");
        lbl9.setLayoutY(100);
        lbl9.setLayoutX(50);

        Label lbl10 = new Label("Future value($):");
        lbl10.setLayoutY(150);
        lbl10.setLayoutX(50);

        Label lbl11 = new Label("Start Principal($):");
        lbl11.setLayoutY(200);
        lbl11.setLayoutX(50);

        Label lbl12 = new Label("Annuity Payment($):");
        lbl12.setLayoutY(250);
        lbl12.setLayoutX(50);

        //Textfield

        TextField txt9 = new TextField();
        txt9.setLayoutX(200);
        txt9.setLayoutY(100);

        TextField txt10 = new TextField();
        txt10.setLayoutX(200);
        txt10.setLayoutY(150);

        TextField txt11 = new TextField();
        txt11.setLayoutX(200);
        txt11.setLayoutY(200);

        TextField txt12 = new TextField();
        txt12.setLayoutX(200);
        txt12.setLayoutY(250);


        //button

        Button btn3 = new Button("Calculate");
        btn3.setPrefSize(130,50);
        btn3.setLayoutX(50);
        btn3.setLayoutY(350);


        Button btn13 = new Button("Back");
        btn13.setLayoutX(690);
        btn13.setLayoutY(550);

        btn13.setOnAction(event -> {

            window2.close();
            Main.show();

        });

        Label lbl25 = new Label("Interest Rate(%): " );
        lbl25.setLayoutY(430);
        lbl25.setLayoutX(50);

        Label lbl26 = new Label("                 " );
        lbl26.setLayoutY(430);
        lbl26.setLayoutX(200);

        Button clear2 = new Button("Clear");
        clear2.setLayoutX(332);
        clear2.setLayoutY(290);


        clear2.setOnAction(event -> {

            txt9.clear();
            txt10.clear();
            txt11.clear();
            txt12.clear();
            lbl26.setText("");

        });
        //On Screen Keyboard

        Button b21 = new Button("1");
        b21.setLayoutX(440);
        b21.setLayoutY(200);
        b21.setPrefSize(100,75);


        Button b22 = new Button("4");
        b22.setLayoutX(440);
        b22.setLayoutY(275);
        b22.setPrefSize(100,75);


        Button b23 = new Button("3");
        b23.setLayoutX(640);
        b23.setLayoutY(200);
        b23.setPrefSize(100,75);



        Button b24 = new Button("2");
        b24.setLayoutX(540);
        b24.setLayoutY(200);
        b24.setPrefSize(100,75);


        Button b25 = new Button("5");
        b25.setLayoutX(540);
        b25.setLayoutY(275);
        b25.setPrefSize(100,75);

        Button b26 = new Button("6");
        b26.setLayoutX(640);
        b26.setLayoutY(275);
        b26.setPrefSize(100,75);


        Button b27 = new Button("7");
        b27.setLayoutX(440);
        b27.setLayoutY(350);
        b27.setPrefSize(100,75);

        Button b28 = new Button("8");
        b28.setLayoutX(540);
        b28.setLayoutY(350);
        b28.setPrefSize(100,75);


        Button b29 = new Button("9");
        b29.setLayoutX(640);
        b29.setLayoutY(350);
        b29.setPrefSize(100,85);


        Button b30 = new Button(".");
        b30.setLayoutX(440);
        b30.setLayoutY(425);
        b30.setPrefSize(100,75);

        Button ss2 = new Button("0");
        ss2.setLayoutX(540);
        ss2.setLayoutY(425);
        ss2.setPrefSize(100,75);


        Button mi2 = new Button("-");
        mi2.setLayoutX(640);
        mi2.setLayoutY(425);
        mi2.setPrefSize(100,75);

        Button del2 = new Button("Delete");
        del2.setLayoutX(740);
        del2.setLayoutY(200);
        del2.setPrefSize(100,310);



//Adding css

        del2.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo; -fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b21.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b22.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b23.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b24.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b25.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b26.setStyle("-fx-base: LightGrey; -fx-font-weight: bold;  -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b27.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b28.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b29.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b30.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        ss2.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        mi2.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");

        txt9.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b21.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"1");
                    }
                });

                b22.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"4");
                    }
                });

                b23.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"3");
                    }
                });

                b24.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"2");
                    }
                });
                b25.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"5");
                    }
                });
                b26.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"6");
                    }
                });
                b27.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"7");
                    }
                });
                b28.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"8");
                    }
                });
                b29.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"9");
                    }
                });
                b30.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+".");
                    }
                });
                ss2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"0");
                    }
                });
                mi2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText()+"-");
                    }
                });
                del2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt9.setText(txt9.getText().substring(0, txt9.getText().length() - 1));
                    }
                });

            }
        });


        txt10.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b21.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"1");
                    }
                });

                b22.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"4");
                    }
                });

                b23.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"3");
                    }
                });

                b24.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"2");
                    }
                });
                b25.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"5");
                    }
                });
                b26.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"6");
                    }
                });
                b27.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"7");
                    }
                });
                b28.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"8");
                    }
                });
                b29.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"9");
                    }
                });
                b30.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+".");
                    }
                });
                ss2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"0");
                    }
                });
                mi2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText()+"-");
                    }
                });
                del2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt10.setText(txt10.getText().substring(0, txt10.getText().length() - 1));
                    }
                });

            }
        });



        txt11.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b21.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"1");
                    }
                });

                b22.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"4");
                    }
                });

                b23.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"3");
                    }
                });

                b24.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"2");
                    }
                });
                b25.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"5");
                    }
                });
                b26.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"6");
                    }
                });
                b27.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"7");
                    }
                });
                b28.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"8");
                    }
                });
                b29.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"9");
                    }
                });
                b30.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+".");
                    }
                });
                ss2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"0");
                    }
                });
                mi2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText()+"-");
                    }
                });
                del2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt11.setText(txt11.getText().substring(0, txt11.getText().length() - 1));
                    }
                });

            }
        });

        txt12.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b21.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"1");
                    }
                });

                b22.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"4");
                    }
                });

                b23.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"3");
                    }
                });

                b24.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"2");
                    }
                });
                b25.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"5");
                    }
                });
                b26.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"6");
                    }
                });
                b27.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"7");
                    }
                });
                b28.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"8");
                    }
                });
                b29.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"9");
                    }
                });
                b30.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+".");
                    }
                });
                ss2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"0");
                    }
                });
                mi2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText()+"-");
                    }
                });

                del2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt12.setText(txt12.getText().substring(0, txt12.getText().length() - 1));
                    }
                });

            }
        });

        ///RATE FORMULA
        btn3.setOnAction(e -> {

            try {
                double n = 12;
                double num9 = Double.parseDouble(txt9.getText());
                double num10 = Double.parseDouble(txt10.getText());
                double num11 = Double.parseDouble(txt11.getText());
                double num12 = Double.parseDouble(txt12.getText());

                double res2;
                res2 = n * (pow((num10 / num11), (1 / (n * num9))) - 1);
                lbl26.setText(String.format("%.2f", res2));
            }catch (Exception text){
                lbl26.setText("Error! Please enter Integer Values...");
            }
        });

        lbl25.setStyle(" -fx-font-weight: bold;");
        btn3.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");
        btn13.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");

        ////----HELP BUTTON (INTEREST RATE)--------////

        Button bn3=new Button("Help");
        bn3.setLayoutY(30);
        bn3.setLayoutX(280);
        bn3.setPrefSize(100,20);

        bn3.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");

        bn3.setOnAction(event -> {
            window2.show();
            savingHelp.stage11();
        });

        //--Number of Periods

        //Label

        Label lbl13 = new Label("Interest Rate(%):");
        lbl13.setLayoutY(100);
        lbl13.setLayoutX(50);

        Label lbl14 = new Label("Future value($):");
        lbl14.setLayoutY(150);
        lbl14.setLayoutX(50);

        Label lbl15 = new Label("Start Principal($):");
        lbl15.setLayoutY(200);
        lbl15.setLayoutX(50);

        Label lbl16 = new Label("Annuity Payment($):");
        lbl16.setLayoutY(250);
        lbl16.setLayoutX(50);

//Textfield

        TextField txt13 = new TextField();
        txt13.setLayoutX(200);
        txt13.setLayoutY(100);
        txt13.setPromptText("%");

        TextField txt14 = new TextField();
        txt14.setLayoutX(200);
        txt14.setLayoutY(150);

        TextField txt15 = new TextField();
        txt15.setLayoutX(200);
        txt15.setLayoutY(200);

        TextField txt16 = new TextField();
        txt16.setLayoutX(200);
        txt16.setLayoutY(250);
//button

        Button btn4 = new Button("Calculate");
        btn4.setPrefSize(130,50);
        btn4.setLayoutX(50);
        btn4.setLayoutY(350);

        Button btn12 = new Button("Back");
        btn12.setLayoutX(690);
        btn12.setLayoutY(550);

        btn12.setOnAction(event -> {
            window2.close();
            Main.show();

        });
        btn12.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");
        btn4.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");


        Label lbl27 = new Label("Number of\n"+" Periods (Years):" );
        lbl27.setLayoutY(430);
        lbl27.setLayoutX(50);

        Label lbl28 = new Label("                 " );
        lbl28.setLayoutY(430);
        lbl28.setLayoutX(200);

        lbl27.setStyle(" -fx-font-weight: bold;");

        Button clear3 = new Button("Clear");
        clear3.setLayoutX(332);
        clear3.setLayoutY(290);

        clear3.setOnAction(event -> {
            txt13.clear();
            txt14.clear();
            txt15.clear();
            txt16.clear();
            lbl28.setText("");

        });
        ///NUMBERS PERIODS FORMULA

        btn4.setOnAction(e -> {
            try {
                double n = 12;
                double num13 = Double.parseDouble(txt13.getText()) / 100;
                double num14 = Double.parseDouble(txt14.getText());
                double num15 = Double.parseDouble(txt15.getText());
                double num16 = Double.parseDouble(txt16.getText());

                double res3;
                res3 = log((num14 + (num16 * 12 / num13)) / (num15 + (num16 * 12 / num13))) / (log(1 + (num13 / 12)) * 12);
                lbl28.setText(String.format("%.0f", res3));
            }catch (Exception text){
                lbl28.setText("Error! Please enter integer values...");
            }
        });

        Button b31 = new Button("1");
        b31.setLayoutX(440);
        b31.setLayoutY(200);
        b31.setPrefSize(100,75);

        Button b32 = new Button("4");
        b32.setLayoutX(440);
        b32.setLayoutY(275);
        b32.setPrefSize(100,75);

        Button b33 = new Button("3");
        b33.setLayoutX(640);
        b33.setLayoutY(200);
        b33.setPrefSize(100,75);

        Button b34 = new Button("2");
        b34.setLayoutX(540);
        b34.setLayoutY(200);
        b34.setPrefSize(100,75);

        Button b35 = new Button("5");
        b35.setLayoutX(540);
        b35.setLayoutY(275);
        b35.setPrefSize(100,75);

        Button b36 = new Button("6");
        b36.setLayoutX(640);
        b36.setLayoutY(275);
        b36.setPrefSize(100,75);

        Button b37 = new Button("7");
        b37.setLayoutX(440);
        b37.setLayoutY(350);
        b37.setPrefSize(100,75);

        Button b38 = new Button("8");
        b38.setLayoutX(540);
        b38.setLayoutY(350);
        b38.setPrefSize(100,75);

        Button b39 = new Button("9");
        b39.setLayoutX(640);
        b39.setLayoutY(350);
        b39.setPrefSize(100,85);

        Button b40 = new Button(".");
        b40.setLayoutX(440);
        b40.setLayoutY(425);
        b40.setPrefSize(100,75);

        Button ss3 = new Button("0");
        ss3.setLayoutX(540);
        ss3.setLayoutY(425);
        ss3.setPrefSize(100,75);

        Button mi3 = new Button("-");
        mi3.setLayoutX(640);
        mi3.setLayoutY(425);
        mi3.setPrefSize(100,75);

        Button del3 = new Button("Delete");
        del3.setLayoutX(740);
        del3.setLayoutY(200);
        del3.setPrefSize(100,310);

//Adding css

        del3.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo; -fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b31.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b32.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b33.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b34.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b35.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b36.setStyle("-fx-base: LightGrey; -fx-font-weight: bold;  -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b37.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b38.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b39.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b40.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        ss3.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        mi3.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");

        txt13.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b31.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"1");
                    }
                });
                b32.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"4");
                    }
                });
                b33.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"3");
                    }
                });
                b34.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"2");
                    }
                });
                b35.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"5");
                    }
                });
                b36.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"6");
                    }
                });
                b37.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"7");
                    }
                });
                b38.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"8");
                    }
                });
                b39.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"9");
                    }
                });
                b40.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+".");
                    }
                });
                ss3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"0");
                    }
                });
                mi3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"-");
                    }
                });
                del3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText().substring(0, txt13.getText().length() - 1));
                    }
                });

            }
        });
        txt14.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b31.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"1");
                    }
                });

                b32.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"4");
                    }
                });

                b33.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt1.setText(txt14.getText()+"3");
                    }
                });

                b34.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"2");
                    }
                });
                b35.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"5");
                    }
                });
                b36.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"6");
                    }
                });
                b37.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"7");
                    }
                });
                b38.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"8");
                    }
                });
                b39.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"9");
                    }
                });
                b40.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+".");
                    }
                });
                ss3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"0");
                    }
                });
                mi3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText()+"-");
                    }
                });
                del3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt14.setText(txt14.getText().substring(0, txt14.getText().length() - 1));
                    }
                });
            }
        });
        txt15.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b31.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"1");
                    }
                });
                b32.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"4");
                    }
                });

                b33.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"3");
                    }
                });

                b34.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt13.setText(txt13.getText()+"2");
                    }
                });
                b35.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"5");
                    }
                });
                b36.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"6");
                    }
                });
                b37.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"7");
                    }
                });
                b38.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"8");
                    }
                });
                b39.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"9");
                    }
                });
                b40.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+".");
                    }
                });
                ss3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"0");
                    }
                });
                mi3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText()+"-");
                    }
                });
                del3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt15.setText(txt15.getText().substring(0, txt15.getText().length() - 1));
                    }
                });
            }
        });
        txt16.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b31.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"1");
                    }
                });
                b32.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"4");
                    }
                });
                b33.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"3");
                    }
                });
                b34.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"2");
                    }
                });
                b35.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"5");
                    }
                });
                b36.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"6");
                    }
                });
                b37.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"7");
                    }
                });
                b38.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"8");
                    }
                });
                b39.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"9");
                    }
                });
                b40.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+".");
                    }
                });
                ss3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"0");
                    }
                });
                mi3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText()+"-");
                    }
                });
                del3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt16.setText(txt16.getText().substring(0, txt16.getText().length() - 1));
                    }
                });
            }
        });

        ////----HELP BUTTON (NUMBER OF PERIODS)--------////

        Button bn4=new Button("Help");
        bn4.setLayoutY(30);
        bn4.setLayoutX(280);
        bn4.setPrefSize(100,20);

        bn4.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");

        bn4.setOnAction(event -> {
            window2.show();
            savingHelp.stage11();
        });

//Start Principal
        //Labels

        Label lbl17 = new Label("Interest Rate (%):");
        lbl17.setLayoutY(100);
        lbl17.setLayoutX(50);

        Label lbl18 = new Label("Future value ($):");
        lbl18.setLayoutY(150);
        lbl18.setLayoutX(50);

        Label lbl19 = new Label("Number of Periodsn\n"+ "(Years):");
        lbl19.setLayoutY(200);
        lbl19.setLayoutX(50);

        Label lbl20 = new Label("Annuity Payment ($):");
        lbl20.setLayoutY(250);
        lbl20.setLayoutX(50);

//Textfield

        TextField txt17 = new TextField();
        txt17.setLayoutX(200);
        txt17.setLayoutY(100);
        txt17.setPromptText("%");

        TextField txt18 = new TextField();
        txt18.setLayoutX(200);
        txt18.setLayoutY(150);

        TextField txt19 = new TextField();
        txt19.setLayoutX(200);
        txt19.setLayoutY(200);

        TextField txt20 = new TextField();
        txt20.setLayoutX(200);
        txt20.setLayoutY(250);

        Button btn5 = new Button("Calculate");
        btn5.setPrefSize(130,50);
        btn5.setLayoutX(50);
        btn5.setLayoutY(350);

        Button btn6 = new Button("Back");
        btn6.setLayoutX(690);
        btn6.setLayoutY(550);

        btn6.setOnAction(event -> {

            window2.close();
            Main.show();
        });

        btn6.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;");
        btn5.setStyle("-fx-border-width: 5px; -fx-border-color: Indigo; -fx-font-weight: bold;-fx-base:#00802b;-fx-text-fill:white;");

        //output
        Label lbl29 = new Label("Start Principal($): " );
        lbl29.setLayoutY(430);
        lbl29.setLayoutX(50);

        Label lbl30 = new Label("                 " );
        lbl30.setLayoutY(430);
        lbl30.setLayoutX(200);

        Button clear4 = new Button("Clear");
        clear4.setLayoutX(332);
        clear4.setLayoutY(290);

        clear4.setOnAction(event -> {
            txt17.clear();
            txt18.clear();
            txt19.clear();
            txt20.clear();
            lbl30.setText("");
        });

        ///START PRINCIPAL CALCULATION

        btn5.setOnAction(e -> {
            try {
                double n = 12;
                double num17 = Double.parseDouble(txt17.getText()) / 100;
                double num18 = Double.parseDouble(txt18.getText());
                double num19 = Double.parseDouble(txt19.getText());
                double num20 = Double.parseDouble(txt20.getText());

                double res4;
                res4 = (num18-(num20*((pow((1+(num17/n)),(n*num19))-1)/(num17/n))))/(pow((1+(num17/n)),(n*num19)));
                lbl30.setText(String.format("%.2f", res4));

            }
            catch (Exception text){
                lbl30.setText("Error! Please enter Integer Values:");

            }
        });

        ///on screen keyboard
        Button b41 = new Button("1");
        b41.setLayoutX(440);
        b41.setLayoutY(200);
        b41.setPrefSize(100,75);

        Button b42 = new Button("4");
        b42.setLayoutX(440);
        b42.setLayoutY(275);
        b42.setPrefSize(100,75);

        Button b43 = new Button("3");
        b43.setLayoutX(640);
        b43.setLayoutY(200);
        b43.setPrefSize(100,75);

        Button b44 = new Button("2");
        b44.setLayoutX(540);
        b44.setLayoutY(200);
        b44.setPrefSize(100,75);

        Button b45 = new Button("5");
        b45.setLayoutX(540);
        b45.setLayoutY(275);
        b45.setPrefSize(100,75);

        Button b46 = new Button("6");
        b46.setLayoutX(640);
        b46.setLayoutY(275);
        b46.setPrefSize(100,75);

        Button b47 = new Button("7");
        b47.setLayoutX(440);
        b47.setLayoutY(350);
        b47.setPrefSize(100,75);

        Button b48 = new Button("8");
        b48.setLayoutX(540);
        b48.setLayoutY(350);
        b48.setPrefSize(100,75);

        Button b49 = new Button("9");
        b49.setLayoutX(640);
        b49.setLayoutY(350);
        b49.setPrefSize(100,85);

        Button b50 = new Button(".");
        b50.setLayoutX(440);
        b50.setLayoutY(425);
        b50.setPrefSize(100,75);

        Button ss4 = new Button("0");
        ss4.setLayoutX(540);
        ss4.setLayoutY(425);
        ss4.setPrefSize(100,75);

        Button mi4 = new Button("-");
        mi4.setLayoutX(640);
        mi4.setLayoutY(425);
        mi4.setPrefSize(100,75);

        Button del4 = new Button("Delete");
        del4.setLayoutX(740);
        del4.setLayoutY(200);
        del4.setPrefSize(100,310);

//Adding css
        b41.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b42.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b43.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b44.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b45.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b46.setStyle("-fx-base: LightGrey; -fx-font-weight: bold;  -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b47.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b48.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b49.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        b50.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        ss4.setStyle("-fx-base: LightGrey; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        mi4.setStyle("-fx-base: pink; -fx-font-weight: bold; -fx-font-size:8mm;-fx-border-width: 8px;-fx-border-color: #990099");
        del4.setStyle("-fx-base: pink;-fx-border-size:5px; -fx-border-color:indigo; -fx-font-weight: bold; -fx-font-size:5mm;-fx-border-width: 8px;-fx-border-color: #990099");

        txt17.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b41.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"1");
                    }
                });

                b42.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"4");
                    }
                });

                b43.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"3");
                    }
                });

                b44.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt5.getText()+"2");
                    }
                });
                b45.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"5");
                    }
                });
                b46.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"6");
                    }
                });
                b47.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"7");
                    }
                });
                b48.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"8");
                    }
                });
                b49.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"9");
                    }
                });
                b50.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+".");
                    }
                });
                ss4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"0");
                    }
                });
                mi4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText()+"-");
                    }
                });
                del4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt17.setText(txt17.getText().substring(0, txt17.getText().length() - 1));
                    }
                });

            }
        });

        txt18.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b41.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"1");
                    }
                });

                b42.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"4");
                    }
                });

                b43.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"3");
                    }
                });

                b44.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"2");
                    }
                });
                b45.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"5");
                    }
                });
                b46.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"6");
                    }
                });
                b47.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"7");
                    }
                });
                b48.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"8");
                    }
                });
                b49.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"9");
                    }
                });
                b50.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+".");
                    }
                });
                ss4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"0");
                    }
                });
                mi4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText()+"-");
                    }
                });
                del4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt18.setText(txt18.getText().substring(0, txt18.getText().length() - 1));
                    }
                });

            }
        });

        txt19.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b41.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"1");
                    }
                });
                b42.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"4");
                    }
                });
                b43.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"3");
                    }
                });
                b44.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"2");
                    }
                });
                b45.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"5");
                    }
                });
                b46.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"6");
                    }
                });
                b47.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"7");
                    }
                });
                b48.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"8");
                    }
                });
                b49.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"9");
                    }
                });
                b50.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+".");
                    }
                });
                ss4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"0");
                    }
                });
                mi4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText()+"-");
                    }
                });

                del4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt19.setText(txt19.getText().substring(0, txt19.getText().length() - 1));
                    }
                });

            }
        });


        txt20.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                b41.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"1");
                    }
                });

                b42.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"4");
                    }
                });

                b43.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"3");
                    }
                });

                b44.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"2");
                    }
                });
                b45.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"5");
                    }
                });
                b46.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"6");
                    }
                });
                b47.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"7");
                    }
                });
                b48.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"8");
                    }
                });
                b49.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"9");
                    }
                });
                b50.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+".");
                    }
                });
                ss4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"0");
                    }
                });
                mi4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText()+"-");
                    }
                });
                del4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        txt20.setText(txt20.getText().substring(0, txt20.getText().length() - 1));
                    }
                });
            }
        });
        ////----HELP BUTTON (PRINCIPAL AMOUNT)--------////

        Button bn5=new Button("Help");
        bn5.setLayoutY(30);
        bn5.setLayoutX(280);
        bn5.setPrefSize(100,20);

        bn5.setStyle("-fx-font-weight: bold; -fx-base:PowderBlue;-fx-border-width: 5px; -fx-border-color: BLACK;");

        bn5.setOnAction(event -> {
            window2.show();
            savingHelp.stage11();
        });

        lbl29.setStyle(" -fx-font-weight: bold;");

//CLEAR BUTTON STYLE

        clear.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");
        clear1.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");
        clear2.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");
        clear3.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");
        clear4.setStyle("-fx-border-width: 8px; -fx-border-color: Green; -fx-font-weight: bold; ");

        //Tabe Pane
        TabPane tb =new TabPane() ;

        Tab tb1= new Tab("FV (Future Value)");
        Tab tb2= new Tab("PMT (Annuity Payment)");
        Tab tb3= new Tab("I/Y (Interest Rate)");
        Tab tb4= new Tab("N (Number of Periods)");
        Tab tb5= new Tab("Start Principal");

        tb.getTabs().add(tb1);
        tb.getTabs().add(tb2);
        tb.getTabs().add(tb3);
        tb.getTabs().add(tb4);
        tb.getTabs().add(tb5);

        VBox vb=new VBox(tb);
        Scene sc =new Scene(vb);

        Image image = new Image("file:ll.jpg");
        ImageView m=new ImageView(image);
        m.setFitHeight(800);
        m.setFitWidth(1000);

        tb.setTabMinWidth(100);
        tb.setTabMinHeight(40);

        Pane layout1 = new Pane();
        layout1.getChildren().addAll(m,lbl1,lbl2,lbl3,lbl4,txt1,txt2,txt3,txt46,btn1,btn15,lbl21,lbl22,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,ss,mi,clear,bn1,del);
        tb1.setContent(layout1);

        Image image1 = new Image("file:ll.jpg");
        ImageView ms1=new ImageView(image1);
        Group rt1= new Group();
        rt1.getChildren().addAll(ms1);
        ms1.setFitHeight(800);
        ms1.setFitWidth(1000);

        Pane layout2 = new Pane();
        layout2.getChildren().addAll(ms1,lbl5,lbl6,lbl7,lbl8,txt5,txt6,txt7,txt8,btn2,btn14,lbl23,lbl24,clear1,b11,b12,b13,del1,b14,b15,b16,b17,b18,b19,b20,ss1,mi1,bn2);
        tb2.setContent(layout2);

        Image image2 = new Image("file:ll.jpg");
        ImageView ms2=new ImageView(image2);
        ms2.setFitHeight(800);
        ms2.setFitWidth(1000);

        Pane layout3 = new Pane();
        layout3.getChildren().addAll(ms2,lbl9,lbl10,lbl11,lbl12,txt9,txt10,txt11,txt12,btn3,btn13,lbl25,lbl26,clear2,b21,b22,b23,del2,b24,b25,b26,b27,b28,b29,b30,ss2,mi2,bn3);
        tb3.setContent(layout3);

        Image image3 = new Image("file:ll.jpg");
        ImageView ms3=new ImageView(image3);
        ms3.setFitHeight(800);
        ms3.setFitWidth(1000);

        Pane layout4 = new Pane();
        layout4.getChildren().addAll(ms3,lbl13,lbl14,lbl15,lbl16,txt13,txt14,txt15,txt16,btn4,btn12,lbl27,lbl28,clear3,b31,b32,del3,b33,b34,b35,b36,b37,b38,b39,b40,ss3,mi3,bn4);
        tb4.setContent(layout4);

        Image image4 = new Image("file:ll.jpg");
        ImageView ms4=new ImageView(image4);
        ms4.setFitHeight(800);
        ms4.setFitWidth(1000);

        Pane layout5= new Pane();
        layout5.getChildren().addAll(ms4,lbl17,lbl18,lbl19,lbl20,txt17,txt18,txt19,txt20,btn5,btn6,lbl29,lbl30,clear4,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,ss4,mi4,bn5,del4);
        tb5.setContent(layout5);

        window2.setScene(sc);
        window2.show();
        window2.setHeight(800);
        window2.setWidth(1000);
    }
    public static void main(String[] args){
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    }
}




