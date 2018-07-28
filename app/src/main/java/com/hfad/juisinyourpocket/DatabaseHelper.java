package com.hfad.juisinyourpocket;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "mydatabase.db";
    public  static final String TABLE_NAME = "organizations.db";
    public static  final String COL1 = "ID";
    public static  final String COL2 = "NAME";





    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE "+ TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NAME TEXT)";
        db.execSQL(createTable);

        setValues();

    }

    public void setValues(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(getQueryString("Badhan Ju Zone"));
        db.execSQL(getQueryString("Jahangirnagar University Information and Technology Society (JUITS)"));
        db.execSQL(getQueryString("JU Computer Club"));
        db.execSQL(getQueryString("Jahangirnagar University (JUCC)"));
        db.execSQL(getQueryString("Jahangirnagar University Science Club (JUSC)"));
        db.execSQL(getQueryString("Jahangirnagar University Martial Art Club (JUMAC)"));
        db.execSQL(getQueryString("Jahangirnagar University Debate Organization (JUDO)"));
        db.execSQL(getQueryString("Jahangirnagar University Model United Nations Association (JUMUNA)"));
        db.execSQL(getQueryString("Jahangirnagar University Physics Club (JUPC)"));
    }
    public String getQueryString(String s){
        String ans = "INSERT INTO "+TABLE_NAME+"("+COL2+") VALUES("+s+")";
        return ans;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
    }

    public Cursor getListContents()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT + FROM " + TABLE_NAME, null);
        return data;
    }




}
