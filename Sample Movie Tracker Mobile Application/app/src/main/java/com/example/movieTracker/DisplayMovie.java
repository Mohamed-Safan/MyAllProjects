package com.example.movieTracker;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayMovie extends AppCompatActivity {

    ArrayList<String> checkedItems = new ArrayList<>();

    ListView listView;
    Button addToFav;
    CheckBox checked;

    DataBase dataBase1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        listView = (ListView) findViewById(R.id.List_View_Display);
        addToFav = (Button) findViewById(R.id.ADD_);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        dataBase1 = new DataBase(this);
        showAll();
    }


    private void showAll() {
        Cursor data = dataBase1.displayMovie();
        ArrayList<String> listData = new ArrayList<>();
        while (data.moveToNext()) {
            listData.add(data.getString(0));
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_display, R.id.txt_title, listData);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // selected item
                String selectedItem = ((TextView) view).getText().toString();
                if (checkedItems.contains(selectedItem))
                    checkedItems.remove(selectedItem);
                else
                    checkedItems.add(selectedItem);

            }
        });
    }

    public void addtoFavourite(View view) {

        String checkItems = "";
        for (String item : checkedItems) {
           dataBase1.addFavoritesList(item);

            if (checkItems == "")
                checkItems = item;

            else
                checkItems += "/" + item;

        }
        Toast.makeText(this, checkItems+" "+"added", Toast.LENGTH_LONG).show();

    }


}


//References -  https://stackoverflow.com/questions/6054562/how-to-make-the-corners-of-a-button-round
//https://developer.android.com/guide/navigation/navigation-getting-started
//https://developer.android.com/training/data-storage/sqlite
//GitHub projects
//Tutorials
//Lecture Notes