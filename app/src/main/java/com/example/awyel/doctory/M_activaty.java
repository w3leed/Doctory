package com.example.awyel.doctory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.awyel.doctory.SQLiteHelper.databasePath;

/**
 * Created by AWYEL on 6/29/2018.
 */

public class M_activaty extends Activity {

    SQLiteDatabase sqLiteDatabase;
    Boolean EditTextEmptyHold;
    EditText getNAME, getPhoneNumber ,gettitle,getspec;
    Button SubmitData, Show_Data,ShowData;
    String name, phoneNumber, query,title,specil;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_doctor);

        SubmitData = (Button)findViewById(R.id.button);
        getPhoneNumber = (EditText)findViewById(R.id.editText2);
        ShowData = (Button)findViewById(R.id.butto1);
        Show_Data = (Button)findViewById(R.id.button2);
        gettitle= (EditText)findViewById(R.id.editText3);
        getspec= (EditText)findViewById(R.id.editText4);
        getNAME = (EditText)findViewById(R.id.editText);

        SubmitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SQLiteDataBaseBuild();

                SQLiteTableBuild();

                CheckEditTextStatus();

                InsertDataIntoSQLiteDatabase();

                EmptyEditTextAfterDataInsert();


            }
        });

        Show_Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(M_activaty.this,SearchSQLiteActivity.class);
                startActivity(intent);
            }
        });


    }

    public void SQLiteDataBaseBuild(){

        sqLiteDatabase = openOrCreateDatabase(SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);

    }

    public void SQLiteTableBuild(){

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "+SQLiteHelper.TABLE_NAME+"("+SQLiteHelper.Table_Column_ID+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "+SQLiteHelper.Table_Column_1_Name+" VARCHAR, "+SQLiteHelper.Table_Column_2_PhoneNumber+" VARCHAR, "+SQLiteHelper.Table_Column_3_Docttitle+" VARCHAR, "+SQLiteHelper.Table_Column_4_Doctspec+" VARCHAR);");

    }

    public void CheckEditTextStatus(){

        name = getNAME.getText().toString() ;
        phoneNumber = getPhoneNumber.getText().toString();
        title=gettitle.getText().toString();
        specil=getspec.getText().toString();
        if(TextUtils.isEmpty(name) || TextUtils.isEmpty(phoneNumber)|| TextUtils.isEmpty(title)|| TextUtils.isEmpty(specil)){

            EditTextEmptyHold = false ;

        }
        else {

            EditTextEmptyHold = true ;
        }
    }

    public void InsertDataIntoSQLiteDatabase(){

        if(EditTextEmptyHold == true)
        {

            query = "INSERT INTO "+SQLiteHelper.TABLE_NAME+" (name,phone_number,Doct_title,Doct_spec) VALUES('"+name+"', '"+phoneNumber+"', '"+title+"', '"+specil+"');";

            sqLiteDatabase.execSQL(query);


            Toast.makeText(M_activaty.this,"Data Inserted Successfully", Toast.LENGTH_LONG).show();
            Toast.makeText(M_activaty.this,databasePath.toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(M_activaty.this,databasePath.toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(M_activaty.this,databasePath.toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(M_activaty.this,databasePath.toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(M_activaty.this,databasePath.toString(),Toast.LENGTH_LONG).show();
            Toast.makeText(M_activaty.this,databasePath.toString(),Toast.LENGTH_LONG).show();

        }
        else {

            Toast.makeText(M_activaty.this,"Please Fill All The Required Fields.", Toast.LENGTH_LONG).show();

        }

    }

    public void EmptyEditTextAfterDataInsert(){

        getNAME.getText().clear();
        getPhoneNumber.getText().clear();
        gettitle.getText().clear();
        getspec.getText().clear();

    }

}
