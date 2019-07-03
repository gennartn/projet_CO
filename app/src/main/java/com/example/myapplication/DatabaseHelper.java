package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //nom de la base de donnée
    public static final String DATABASE_NAME = "Application.db";
    public static final String TABLE_NAME = "Article_table";
    public static final String COL_1= "NOM_UNIQUE";
    public static final String COL_2 = "PRIX";
    public static final String COL_3 = "MAGASIN";
    public static final String COL_4 = "CATHEGORIE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME,null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(NOM_UNIQUE TEXT PRIMARY KEY, PRIX INTEGER, MAGASIN TEXT, CATHEGORIE TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
