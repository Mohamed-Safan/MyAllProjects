package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sun.plugin.dom.html.HTMLBodyElement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class UIs extends Application {

    private TableView table = new TableView();
    private HTMLBodyElement membershipNumber;

    public static void main(String[] args) {
        launch(args);
    }


    @Override


    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("My Gym Manager");
        stage.setWidth(300);
        stage.setHeight(500);



        final Label lb1 = new Label("GYM MANAGMENT SYSTEM");
        lb1.setStyle("-fx-font-weight:bold");


        Button bt1=new Button("Search");
        bt1.setLayoutX(200);
        bt1.setLayoutY(50);


        bt1.setOnAction(e -> {
            try {
                String record=null;
                String memNo=String.valueOf(membershipNumber.getText());
                BufferedReader br=new BufferedReader(new FileReader("membersDetailDb.txt"));

                while ((record=br.readLine())!=null){
                    StringTokenizer st=new StringTokenizer(record,",");
                    if (record.contains(memNo)){
                        lb1.setText(st.nextToken()+"  "+st.nextToken()+"  "+st.nextToken());
                    }
                }
                br.close();
            } catch (Exception prompt){
                membershipNumber.setText("matching record not found");
            }
        });

        table.setEditable(true);

        TableColumn tb1 = new TableColumn("Membership Number");
        TableColumn tb2 = new TableColumn("Name");




        table.getColumns().addAll(tb1, tb2 );



        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(lb1, table,bt1);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
}