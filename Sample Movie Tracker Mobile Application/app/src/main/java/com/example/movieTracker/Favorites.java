package com.example.movieTracker;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Favorites extends AppCompatActivity {
    ArrayList<String> checkedItems1 = new ArrayList<>();

    ListView faveroiteLa;
    Button btSave;
    CheckedTextView checked;
    DataBase dataBase;
    DisplayMovie input=new DisplayMovie();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        faveroiteLa = (ListView) findViewById(R.id.AddFavouriteBtn);
        btSave = (Button) findViewById(R.id.buttonSave);
        faveroiteLa.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        dataBase = new DataBase(this);
        showAll();
    }
//display available data list
    public void showAll(){

        Cursor data = dataBase.displayFavorites();
        ArrayList<String> listData1 = new ArrayList<>();
        while (data.moveToNext()) {
            listData1.add(data.getString(0));
        }

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.checkbox, R.id.txt_Availability, listData1);
        faveroiteLa.setAdapter(adapter);


        for(int x=0; x<listData1.size(); x++)
            faveroiteLa.setItemChecked(x, true);
        faveroiteLa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // selected item
                String selectedItem = ((TextView) view).getText().toString();
                if (checkedItems1.contains(selectedItem))
                    checkedItems1.remove(selectedItem);
                else
                    checkedItems1.add(selectedItem);

            }
        });


    }
//add checked items to database
    public void saveMovie(View view){

        String checkItems = "";
        for (String item : checkedItems1) {
            dataBase.RemoveFavoritesList(item);

            if (checkItems == "") {
                checkItems = item;

            }
            else
                checkItems += "/" + item;

        }
        Toast.makeText(this, checkItems+" "+"removed", Toast.LENGTH_LONG).show();


    }


}
//References -  https://stackoverflow.com/questions/6054562/how-to-make-the-corners-of-a-button-round
//https://developer.android.com/guide/navigation/navigation-getting-started
//https://developer.android.com/training/data-storage/sqlite
//GitHub projects
//Tutorials
//Lecture Notes