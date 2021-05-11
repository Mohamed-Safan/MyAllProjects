package android.example.courseworkone;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

import static android.graphics.Color.*;
public class CarPickerActivity extends AppCompatActivity {

    public static final ArrayList<Integer> INTEGERS = new ArrayList<>();

    public int cars[]= {
            R.drawable.audi_1,R.drawable.audi_2,
            R.drawable.bmw_1,R.drawable.bmw_2,
            R.drawable.chevrolet_1,
            R.drawable.honda_1,R.drawable.honda_2,
            R.drawable.hyundai_1,
            R.drawable.jaguar_1,R.drawable.jaguar_2,
            R.drawable.kia,
            R.drawable.lamborghini_1,R.drawable.lamborghini_2,
            R.drawable.landrover_1,
            R.drawable.mazda_1,
            R.drawable.mini_1,
            R.drawable.nissan_1, R.drawable.nissan_2,
            R.drawable.renault_1,R.drawable.renault_2,
            R.drawable.rollsroyce_1,
            R.drawable.suzuki_1,
            R.drawable.tata_1,
            R.drawable.tesla_1,
            R.drawable.toyota_1,R.drawable.toyota_2,R.drawable.toyota_3,R.drawable.toyota_4,R.drawable.toyota_5,R.drawable.toyota_6
    };
//reference - (STACKOVERFLOW) https://stackoverflow.com/questions/39962816/get-random-images-in-android-studio

    boolean clickedSubmit;
    Random ran = new Random();
    int random;
    Button identifyCar;
    ImageView img;
    Spinner sp1;
    String correctCar;
    int num;
    TextView tv;


    @Override
    protected void onSaveInstanceState (Bundle state) {

        super.onSaveInstanceState(state);
        state.putInt("randI",random);
        state.putBoolean("submit",clickedSubmit);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        if(INTEGERS.size()>30){
            finish();
        }

        clickedSubmit=false;
        int v = ran.nextInt(30);
        while(INTEGERS.contains(v)){
            v=ran.nextInt(30);

        }

        random=v;
        INTEGERS.add(random);
        if(savedInstanceState != null) {

            this.random = savedInstanceState.getInt("randI");
            this.clickedSubmit = savedInstanceState.getBoolean("submit");
        }
        img = findViewById(R.id.identify_car);
        identifyCar = findViewById(R.id.button_submit);

        correctCar = getCar(random);
        img.setImageResource(cars[random]);       //selecting random image from the arrays
        ArrayAdapter<CharSequence> names = ArrayAdapter.createFromResource(this, R.array.car_names, android.R.layout.simple_spinner_item);
        names.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);      //setting the data to dropdown
        sp1 = findViewById(R.id.select_car);  //select the spinner
        if (sp1 != null) {
            sp1.setAdapter(names);   //adding names array to the spinner
        }


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


    public void clickedSubmit(View view) {

        if(!clickedSubmit) {
            String text = sp1.getSelectedItem().toString();
            if (text.equals(correctCar)) {
                tv = (TextView) findViewById(R.id.textView);
                tv.setText("CORRECT!");
                tv.setBackgroundColor(Color.GREEN);


            }

            else {
                tv = (TextView) findViewById(R.id.textView2);
                tv.setText("WRONG");
                tv.setBackgroundColor(RED);

                tv = (TextView) findViewById(R.id.textView3);
                tv.setText(correctCar);
                tv.setBackgroundColor(YELLOW);
            }


            identifyCar.setText("Next");
            identifyCar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view1) {
                    finish();
                    startActivity(getIntent());
                }
            });
        }
    }
}


//References - YOUTUBE TUTORIALS
//  STACKOVERFLOW
//(GIT HUB) - https://github.com/sanethinduwara/Flags-Android-Game/blob/master/app/src/main/java/com/saneth/flags/GuessHint.java
//https://github.com/sshajeeth/Simple-Flag-Game-App/blob/master/app/src/main/java/com/example/flaggame/GuessHints.java