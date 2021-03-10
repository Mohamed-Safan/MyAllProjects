package android.example.courseworkone;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.Random;
import static android.graphics.Color.*;

public class CarImageActivity extends AppCompatActivity {
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


        private static final ArrayList<Integer> ints = new ArrayList<>();
        boolean submitImage;
        public static int choose=-1;
        Random ran = new Random();
        int random;
        Button identifyWords;
        TextView tv;
        TextView correct;
        TextView wrong;
        int x, y, z;
        int carName;
        int cAnswer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_car_image);

//  random image
            if(randI.size()>30){
                finish();
            }

            x = randI();
            randI.add(x);
            ints.add(x);
            y = randI();
            while(x/5==y/5){                //to make sure there wont be more than images from the same car
                y = randI();
            }

            ints.add(y);
            z = randI();
            while(x/5==z/5 || y/5==z/5){
                z = randI();
            }

            ints.add(z);
            carName = (ran.nextInt(4));

            final ImageView iv1 = findViewById(R.id.identify_1);
            final ImageView iv2 = findViewById(R.id.identify_2);
            final ImageView iv3 = findViewById(R.id.identify_3);
            if(savedInstanceState!= null) {        // if there is an instance saved, it will save them back
                this.x = savedInstanceState.getInt("x");
                this.y = savedInstanceState.getInt("y");
                this.z = savedInstanceState.getInt("z");
                this.cAnswer = savedInstanceState.getInt("cAnswer");
                this.carName = savedInstanceState.getInt("carName");
                this.submitImage=savedInstanceState.getBoolean("submitImage");
            }


            if (carName==1){
                cAnswer=x;
            }
            else if (carName==2){
                cAnswer=y;
            }
            else{
                cAnswer=z;
            }

            String carN = getCar(cAnswer);

            TextView textView = findViewById(R.id.textView_name);

            textView.setText(carN);

            iv1.setImageResource(cars[x]);

            iv2.setImageResource(cars[y]);

            iv3.setImageResource(cars[z]);


            identifyWords = findViewById(R.id.button_next);

        }

        private int randI() {

            int x = ran.nextInt(30);

            while(randI.contains(x)){

                x=ran.nextInt(30);

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

        public void findCorrectImage(View view) {
            //did this to do the thing when orientation changes


            identifyWords.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    startActivity(getIntent());
                }
            });

        }

        public void click1(View view) {
            choose = x;
            if (choose == cAnswer){
                correct = (TextView) findViewById(R.id.textView_correct);
                correct.setText("CORRECT!");
                correct.setBackgroundColor(Color.GREEN);// if the user select the correct answer

            } else {
                wrong = (TextView) findViewById(R.id.textView_wrong);
                wrong.setText("WRONG!");
                wrong.setBackgroundColor(RED);
            }

            identifyWords.setEnabled(true);
            identifyWords.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    startActivity(getIntent());
                }
            });
        }

        public void click2(View view) {
            choose = y;
            if (choose == cAnswer){
                correct = (TextView) findViewById(R.id.textView_correct);
                correct.setText("CORRECT!");
                correct.setBackgroundColor(Color.GREEN);// if the user select the correct answer

            } else {
                wrong = (TextView) findViewById(R.id.textView_wrong);
                wrong.setText("WRONG!");
                wrong.setBackgroundColor(RED);
            }
            identifyWords.setEnabled(true);
            identifyWords.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    startActivity(getIntent());
                }
            });
        }

        public void click3(View view) {
            choose = z;
            if (choose == cAnswer){
                correct = (TextView) findViewById(R.id.textView_correct);
                correct.setText("CORRECT!");
                correct.setBackgroundColor(Color.GREEN);// if the user select the correct answer

            } else {
                wrong = (TextView) findViewById(R.id.textView_wrong);
                wrong.setText("WRONG!");
                wrong.setBackgroundColor(RED);
            }
            identifyWords.setEnabled(true);
            identifyWords.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    startActivity(getIntent());
                }
            });
        }
    }









