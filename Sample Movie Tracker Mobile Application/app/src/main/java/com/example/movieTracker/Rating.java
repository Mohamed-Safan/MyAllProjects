package com.example.movieTracker;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Rating extends AppCompatActivity {
    ListView show;


    DataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        show = (ListView) findViewById(R.id.listShow);

        show.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        dataBase = new DataBase(this);
        ResultsPage();
    }





    private void ResultsPage() {
        Cursor data = dataBase.displayMovie();
        ArrayList<String> listData = new ArrayList<>();
        while (data.moveToNext()) {
            listData.add(data.getString(0));
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_display, R.id.txt_title, listData);
        show.setAdapter(adapter);

        show.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
