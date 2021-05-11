package android.example.courseworkone;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class AdvanceActivity extends AppCompatActivity {


    public static final ArrayList<Integer> randI = new ArrayList<>();

    public int cars[] = {

            R.drawable.audi_1, R.drawable.audi_2,
            R.drawable.bmw_1, R.drawable.bmw_2,
            R.drawable.chevrolet_1,
            R.drawable.honda_1, R.drawable.honda_2,
            R.drawable.hyundai_1,
            R.drawable.jaguar_1, R.drawable.jaguar_2,
            R.drawable.kia,
            R.drawable.lamborghini_1, R.drawable.lamborghini_2,
            R.drawable.landrover_1,
            R.drawable.mazda_1,
            R.drawable.mini_1,
            R.drawable.nissan_1, R.drawable.nissan_2,
            R.drawable.renault_1, R.drawable.renault_2,
            R.drawable.rollsroyce_1,
            R.drawable.suzuki_1,
            R.drawable.tata_1,
            R.drawable.tesla_1,
            R.drawable.toyota_1, R.drawable.toyota_2, R.drawable.toyota_3, R.drawable.toyota_4, R.drawable.toyota_5, R.drawable.toyota_6
    };

    //reference - (STACKOVERFLOW) https://stackoverflow.com/questions/39962816/get-random-images-in-android-studio 


    private static final ArrayList<Integer> ints = new ArrayList<>();
    boolean image;
    Random random = new Random();
    Button btnid;
    TextView textView, textView1, textView2;
    int x, y, z;
    int anInt;
    EditText brand, brand1, brand2;
    int answer1;
    int answer2;
    int answer3;
    int marks1 = 0;
    int marks2 = 0;
    int marks3 = 0;

    
  
   
    TextView correct1, correct2, correct3;


    private final int MAX_ATTEMPTS = 3;
    private int attempts = 0;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_advance);
        brand = (EditText) findViewById(R.id.editText_car1);
        brand1 = (EditText) findViewById(R.id.editText_car2);
        brand2 = (EditText) findViewById(R.id.editText_car3);
        btnid = (Button) findViewById(R.id.button_submit);
        textView = (TextView) findViewById(R.id.textView_correct);
        textView1 = (TextView) findViewById(R.id.textView_wrong);
        textView2 = (TextView) findViewById(R.id.marks);
        correct1 = (TextView) findViewById(R.id.textView_c1);
        correct2 = (TextView) findViewById(R.id.textView_c2);
        correct3 = (TextView) findViewById(R.id.textView_c3);


        if (randI.size() > 30) {
            finish();
        }



        x = randI();
        randI.add(x);
        ints.add(x);
        y = randI();
        while (x / 5 == y / 5) {
            y = randI();
        }
        ints.add(y);
        z = randI();
        while (x / 5 == z / 5 || y / 5 == z / 5) {
            z = randI();
        }                                                                                            //
        ints.add(z);
        anInt = (random.nextInt(4));

        final ImageView iv1 = findViewById(R.id.identify_1);
        final ImageView iv2 = findViewById(R.id.identify_2);
        final ImageView iv3 = findViewById(R.id.identify_3);


      

        if (savedInstanceState != null) {
            this.x = savedInstanceState.getInt("x");
            this.y = savedInstanceState.getInt("y");
            this.z = savedInstanceState.getInt("z");
            this.answer1 = savedInstanceState.getInt("cAnswer1");
            this.answer2 = savedInstanceState.getInt("cAnswer2");
            this.answer3 = savedInstanceState.getInt("cAnswer3");
            this.image = savedInstanceState.getBoolean("submitImage");

        }


        if (anInt ==1){
            answer1 =x;
        }else if (anInt ==2){
            answer2 =y;
        }else{
            answer3 =z;
        }


        String carN1 = getCar(x).toLowerCase();
        String carN2 = getCar(z).toLowerCase();
        String carN3 = getCar(y).toLowerCase();

        iv1.setImageResource(cars[x]);
        iv2.setImageResource(cars[y]);
        iv3.setImageResource(cars[z]);



     

        btnid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (carN1.contentEquals(brand.getText())) {
                    brand.setBackgroundColor(Color.GREEN);

                    brand.setEnabled(false);

                    marks1 = 1;

                } else  {


                    brand.setBackgroundColor(Color.RED);


                }


                if (carN2.contentEquals(brand1.getText())) {
                    brand1.setBackgroundColor(Color.GREEN);
                    brand1.setEnabled(false);
                    marks2 = 1;

                } else {

                    brand1.setBackgroundColor(Color.RED);

                }


                if (carN3.contentEquals(brand2.getText())) {
                    brand2.setBackgroundColor(Color.GREEN);
                    brand2.setEnabled(false);
                    marks3 = 1;

                } else {

                    brand2.setBackgroundColor(Color.RED);

                }


                textView2.setText(String.valueOf(marks1 + marks2 + marks3));


                attempts++;
                if (attempts >= MAX_ATTEMPTS) {

                    if (carN1.contentEquals(brand.getText())) {

                    } else  {

                        correct1.setText(carN1);
                        correct1.setTextColor(Color.YELLOW);

                    }


                    if (carN2.contentEquals(brand1.getText())) {


                    } else {

                        correct2.setText(carN2);
                        correct2.setTextColor(Color.YELLOW);
                    }


                    if (carN3.contentEquals(brand2.getText())) {


                    } else {

                        correct3.setText(carN3);
                        correct3.setTextColor(Color.YELLOW);
                    }

                    btnid.setText("Next");


                    btnid.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(getIntent());
                            finish();
                        }
                    });

                }else if(carN1.contentEquals(brand.getText()) && carN2.contentEquals(brand1.getText()) && carN3.contentEquals(brand2.getText())) {

                    btnid.setText("Next");
                    textView.setText("CORRECT!");
                    textView.setBackgroundColor(Color.GREEN);
                    btnid.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(getIntent());
                            finish();


                        }
                    });

                }

            }
        });

    }


    private int randI() {
        int x = random.nextInt(30);

        while(randI.contains(x)){
            x= random.nextInt(30);
        }
        return x;
    }





    private String getCar(int num) {

        String car;

        if(-1<num && num<2){

            car="AUDI";

        }else if(1<num && num<4){

            car="BMW";

        }else if(num == 4) {

            car="CHEVROLET";

        }else if(4<num && num<7){

            car="HONDA";

        }else if(num == 7){

            car="HYUNDAI";

        }else if(7<num && num<10){

            car="JAGUAR";

        }else if(num == 10){

            car="KIA";

        }else if(10<num && num<13){

            car="LAMBORGHINI";

        }else if(num == 13){

            car="LANDROVER";

        }else if(num == 14){

            car="MAZDA";

        }else if(num == 15){
            car="MINI";

        }else if(15<num && num<18){
            car="NISSAN";
        }else if(17<num && num<20){

            car="RENAULT";

        }else if(num == 20){

            car="ROLLSROYCE";

        }else if(num == 21){

            car="SUZUKI";

        }else if(num == 22){

            car="TATA";

        }else if(num == 23){

            car="TESLA";

        }else {

            car="TOYOTA";
        }
        return car;
    }




}

//References - YOUTUBE TUTORIALS
//  STACKOVERFLOW
//(GIT HUB) - https://github.com/sanethinduwara/Flags-Android-Game/blob/master/app/src/main/java/com/saneth/flags/GuessHint.java
//https://github.com/sshajeeth/Simple-Flag-Game-App/blob/master/app/src/main/java/com/example/flaggame/GuessHints.java