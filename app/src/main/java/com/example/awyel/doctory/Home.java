package com.example.awyel.doctory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by AWYEL on 6/21/2018.
 */

public class Home extends Activity  implements View.OnClickListener{
    Button butto1,bTN_admin;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        butto1 = (Button) findViewById(R.id.butto1);
        bTN_admin=(Button) findViewById(R.id.bTN_admin);
        bTN_admin.setOnClickListener(this);
        butto1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==butto1)
        {

            Intent intent = new Intent(Home.this, SearchSQLiteActivity.class);
            startActivity(intent);
        }
        if (v==bTN_admin)
        {

            Intent intent = new Intent(Home.this, onley_admin.class);
            startActivity(intent);
        }
    }
}
