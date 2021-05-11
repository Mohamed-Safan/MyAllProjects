package com.example.movieTracker;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Search extends AppCompatActivity {

    DataBase datab2;
    private EditText editsearch;
    private Button editButton1;
    private TextView search23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editsearch = findViewById(R.id.etSearch);
        editButton1 = findViewById(R.id.editButton);
        search23 = findViewById(R.id.tvSearch);

        datab2 = new DataBase(this);


    }


    public void onClick12(View view) {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputManager != null) {
            inputManager.hideSoftInputFromWindow(view.getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }
        if (!editsearch.getText().toString().equals("")) {
            search23.setText("");
            String let = editsearch.getText().toString();
            Cursor cursor = datab2.search(let);

            if (cursor.getCount() == 0) {
                Toast.makeText(Search.this, "Search not found", Toast.LENGTH_LONG).show();
            } else {

                while (cursor.moveToNext()) {
                    if (!(search23.getText().toString().equals(cursor.getString(0).toLowerCase())))
                        search23.append(cursor.getString(0) + "\n");




                }
            }
        }
        editsearch.setText("");
    }
    }
