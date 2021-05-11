package android.example.courseworkone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

public class HintActivity extends AppCompatActivity {


    public static final ArrayList<Integer> randomsample = new ArrayList<>();

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


    boolean submitbtn;
    TextView txt2;
    TextView txt4;
    TextView renametxt;
    String y = "";
    String x = "";
    Random randomOne = new Random();
    int random;
    Button bt1;
    ImageView imgv;
    String word;
    EditText txt1;

    int atmt;
    boolean message2;




    @Override

    protected void onSaveInstanceState(Bundle state) {

        super.onSaveInstanceState(state);
        state.putInt("randW", random);
        state.putBoolean("submit", submitbtn);
        state.putBoolean("message2", message2);

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hint);
        imgv = findViewById(R.id.identify_1);
        txt1 = (EditText) findViewById(R.id.editText);
        txt2 = (TextView) findViewById(R.id.textView4);
        txt4 = (TextView) findViewById(R.id.textView5);
        renametxt = (TextView) findViewById(R.id.textView6);
        bt1 = (Button) findViewById(R.id.button5);






        if (randomsample.size() > 30) {
            finish();
        }


        submitbtn = false;

        int v = randomOne.nextInt(30);

        while (randomsample.contains(v)) {
            v = randomOne.nextInt(30);
        }

        random = v;

        randomsample.add(random);


        if (savedInstanceState != null) {
            this.random = savedInstanceState.getInt("randI");
            this.submitbtn = savedInstanceState.getBoolean("submit");
            this.message2 = savedInstanceState.getBoolean("message2");

        }

        imgv = findViewById(R.id.identify_1);
        bt1 = findViewById(R.id.button5);

        word = getCar(random);

        imgv.setImageResource(cars[random]);




        final ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isWhitespace(word.toLowerCase().charAt(i))) {
                x = x.concat(" ");
            } else {
                x = x.concat(" _");
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (Character.isWhitespace(word.toLowerCase().charAt(i))) {
                y = y.concat(" ");
            } else {
                y = y.concat(" " + word.charAt(i));
            }
        }


        final char[] char1Array = x.toCharArray();
        final char[] carNCharArray = y.toCharArray();

        txt2.setText(x);


        bt1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String letter = txt1.getText().toString();

                if (word.contains(letter)) {
                    txt4.setText("CORRECT!");
                    txt4.setTextColor(Color.GREEN);


                } else if (!word.contains(y)) {
                    atmt++;
                    txt4.setText("WRONG!");
                    txt4.setTextColor(Color.RED);
                }

                if (atmt >= 3) {
                    renametxt.setText(y);
                    renametxt.setTextColor(Color.YELLOW);

                }



                for (int i = 1; i < carNCharArray.length; i++) {
                    if (carNCharArray[i] == letter.charAt(0)) {

                        index.add(i);

                    }
                }


                for (int i = 0; i < index.size(); i++) {
                    char1Array[index.get(i)] = letter.charAt(0);

                }

                int count = 0;

                index.clear();
                txt2.setText("");


                for (int i = 0; i < carNCharArray.length; i++) {

                    String y = String.valueOf(char1Array[i]);

                    txt2.append(y);
                    System.out.print(char1Array[i]);
                    if (y.equals("_")) {
                        count++;
                    }
                }


                if (atmt >= 3) {
                    bt1.setText("Next");
                    bt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(getIntent());
                            finish();
                        }
                    });
                }

                txt1.setText("");
            }
        });


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



    public void submitWord(View view) {

    }




}


//References - YOUTUBE TUTORIALS
                //  STACKOVERFLOW
//(GIT HUB) - https://github.com/sanethinduwara/Flags-Android-Game/blob/master/app/src/main/java/com/saneth/flags/GuessHint.java
//https://github.com/sshajeeth/Simple-Flag-Game-App/blob/master/app/src/main/java/com/example/flaggame/GuessHints.java