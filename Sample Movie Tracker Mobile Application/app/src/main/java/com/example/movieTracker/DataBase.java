package com.example.movieTracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Arrays;

public class DataBase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="MOVIES.db";
    private static final String TABLE_NAME="Register_table";
    public static final String Name_COL = "NAME";
    public static final String year1 = "YEAR";
    public static final String dir = "DIRECTOR";
    public static final String act = "ACTORS";
    public static final String rate = "RATING";
    public static final String review1 = "REVIEW";


    public DataBase (Context context){
        super(context,DATABASE_NAME,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {



            db.execSQL("CREATE TABLE "+ TABLE_NAME +"(NAME Text PRIMARY KEY , YEAR Number, DIRECTOR Text, ACTORS Text, RATING Number, REVIEW Text,favourites Text )");
        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           db.execSQL(" DROP TABLE IF EXISTS " +TABLE_NAME );
           onCreate(db);
    }
    public boolean addData(String name, String year, String director, String actors, String rating, String review){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Name_COL,name);
        contentValues.put(year1,year);
        contentValues.put(dir,director);
        contentValues.put(act,actors);
        contentValues.put(rate,rating);
        contentValues.put(review1,review);


        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result== -1)
            return false;
        else
            return true;

    }
    public Cursor displayMovie(){
        SQLiteDatabase db = this.getWritableDatabase();


        Cursor result=db.rawQuery("SELECT * FROM "+DataBase.TABLE_NAME+ " ORDER BY "+DataBase.Name_COL+" ASC"
                , new String[] {} );
        System.out.println(Arrays.toString(result.getColumnNames()));
        return result;
    }


    public Cursor displayFavorites(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor result = db.rawQuery("select * from  "+TABLE_NAME+" WHERE "+ rate +"= 'true'",null);


        return result;
    }


    public void addFavoritesList(String NAME){
        SQLiteDatabase db = this.getWritableDatabase();
        String test = "UPDATE "+TABLE_NAME+" SET "+ rate +" = 'true' WHERE NAME = '"+NAME+"'";
        System.out.println(test);
        db.execSQL("UPDATE "+TABLE_NAME+" SET "+ rate +" = 'true' WHERE NAME = '"+NAME+"'");


    }


    public void RemoveFavoritesList(String NAME){
        SQLiteDatabase db = this.getWritableDatabase();
        String test = "UPDATE "+TABLE_NAME+" SET "+ rate +" = 'false' WHERE NAME = '"+NAME+"'";
        System.out.println(test);
        db.execSQL("UPDATE "+TABLE_NAME+" SET "+ rate +" = 'false' WHERE NAME = '"+NAME+"'");


    }

    public boolean updateEditData(String name, String year, String director, String actors, String rating,String review) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(Name_COL,name);
        contentValues.put(year1,year);
        contentValues.put(dir,director);
        contentValues.put(act,actors);
        contentValues.put(rate,rating);
        contentValues.put(review1,review);

        db.update(TABLE_NAME, contentValues, "NAME = ?",new String[] { name });

        return true;


    }
    public Cursor search(String letters){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+TABLE_NAME+" WHERE NAME OR DIRECTOR LIKE " +
                "'"+letters+"%' OR NAME LIKE '%"+letters+"%'  OR NAME LIKE '%"+letters+"'",null);
        return cursor;

    }


}
//References -  https://stackoverflow.com/questions/6054562/how-to-make-the-corners-of-a-button-round
//https://developer.android.com/guide/navigation/navigation-getting-started
//https://developer.android.com/training/data-storage/sqlite
//GitHub projects
//Tutorials
//Lecture Notes
//https://abhiandroid.com/ui/checkbox