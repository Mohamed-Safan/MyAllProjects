package android.example.courseworkone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.car_make);
        button2 = findViewById(R.id.car_image);
        button3 = findViewById(R.id.hint);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1View) {

                openActivity3();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1View) {

                openActivity4();
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
}