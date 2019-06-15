package com.example.awyel.doctory;

/**
 * Created by AWYEL on 6/25/2018.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME="Doctory.db";

    public static final String TABLE_NAME="Doctors";
    public static final String Table_Column_ID="id";
    public static final String Table_Column_1_Name="name";
    public static final String Table_Column_2_PhoneNumber="phone_number";
    public static final String Table_Column_3_Docttitle = "Doct_title";
    public static final String Table_Column_4_Doctspec = "Doct_spec";
    public  static String databasePath = " ";
    public SQLiteHelper(Context context) {

        super(context,DATABASE_NAME,null,1);
        databasePath = context.getDatabasePath("Doctory.db").getPath();

    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Column_ID+" INTEGER PRIMARY KEY, "+Table_Column_1_Name+" VARCHAR, "+Table_Column_2_PhoneNumber+" VARCHAR, "+Table_Column_3_Docttitle+" VARCHAR, "+Table_Column_4_Doctspec+" VARCHAR)";
        database.execSQL(CREATE_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }

}