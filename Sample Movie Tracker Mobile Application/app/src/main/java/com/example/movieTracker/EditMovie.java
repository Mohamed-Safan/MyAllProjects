package com.example.movieTracker;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class EditMovie extends AppCompatActivity {

    private DataBase dataBase;

    EditText movie, yearl, direc4, act4, review4,rate;
    Button reg_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_page);

        dataBase = new DataBase(this);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("Name");
        Toast.makeText(EditMovie.this, name, Toast.LENGTH_LONG).show();

        movie = (EditText) findViewById(R.id.movie_txt);
        yearl = (EditText) findViewById(R.id.year_txt);
        direc4 = (EditText) findViewById(R.id.dir_txt);
        act4 = (EditText) findViewById(R.id.act_txt);
        reg_sub = (Button) findViewById(R.id.submit_reg_btn);
        review4 =(EditText) findViewById(R.id.rev_txt);
        rate = (EditText) findViewById(R.id.rate_txt);

        fillFields(name);

    }

//display list of items

    public void fillFields(String name){
        Cursor res = dataBase.search(name);

        if (res.getCount() == 0) {
            Toast.makeText(EditMovie.this, "Nothing to show", Toast.LENGTH_LONG).show();
        } else {
            while (res.moveToNext()) {
                movie.append(res.getString(0));
                yearl.append(res.getString(1));
                direc4.append(res.getString(2));
                act4.append(res.getString(3));
                rate.append(res.getString(4));
                review4.append(res.getString(5));
                if(res.getString(5).equals("true")) {
                    review4.setText("FAVOURITE");
                }else{
                    review4.setText("NOT FAVOURITE");
                }
            }
        }
    }

     public void onClick(View v){
         boolean isUpdate = dataBase.updateEditData(
                 movie.getText().toString(),
                 yearl.getText().toString(),
                 direc4.getText().toString(),
                 act4.getText().toString(),
                 rate.getText().toString(),
                 review4.getText().toString());
         if (isUpdate == true) {
             Toast.makeText(EditMovie.this, "Data Updated", Toast.LENGTH_LONG).show();
             Intent intent = new Intent(this, EditMain.class);
             finish();
             startActivity(intent);

         } else {
             Toast.makeText(EditMovie.this, "Data Is Not Updated", Toast.LENGTH_LONG).show();

         }
     }
    @Override
    public void finish() {
        Intent intent = new Intent(this, EditMain.class);
        super.finish();
        startActivity(intent);
    }

}
//References -  https://stackoverflow.com/questions/6054562/how-to-make-the-corners-of-a-button-round
//https://developer.android.com/guide/navigation/navigation-getting-started
//https://developer.android.com/training/data-storage/sqlite
//GitHub projects
//Tutorials
//Lecture Notes