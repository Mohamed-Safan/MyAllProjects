package android.example.courseworkone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{


    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.car_make);
        btn2 = findViewById(R.id.car_image);
        btn3 = findViewById(R.id.hint);
        btn4 = findViewById(R.id.advaned);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();

            }
        });

        //REFERENCES - MOBILE APPLICATION DEVELOPMENT TUTORIALS

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1View) {

                openActivity3();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1View) {

                openActivity4();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1View) {

                openActivity5();
            }
        });



    }

    private void openActivity2(){
        Intent intent = new Intent(this, CarPickerActivity.class);
        startActivity(intent);
    }

    private void openActivity3(){
        Intent intent = new Intent(this,CarImageActivity.class);
        startActivity(intent);
    }


    private void openActivity4(){
        Intent intent = new Intent(this,HintActivity.class);
        startActivity(intent);
    }

    private void openActivity5(){
        Intent intent = new Intent(this,AdvanceActivity.class);
        startActivity(intent);
    }

    //REFERENCES - MOBILE APPLICATION DEVELOPMENT TUTORIALS
    //             STACKOVERFLOW



    }


