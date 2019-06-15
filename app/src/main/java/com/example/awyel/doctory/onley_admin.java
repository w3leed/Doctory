package com.example.awyel.doctory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by AWYEL on 6/30/2018.
 */

public class onley_admin extends Activity implements View.OnClickListener {
    EditText editText_log ,editText_pass;
    Button btn_log;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onley_admin);
        editText_log= (EditText) findViewById(R.id.editText_lo);
        editText_pass= (EditText) findViewById(R.id.editText_pass);
        btn_log= (Button) findViewById(R.id.btn_log);
        btn_log.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String s ="waleed";
        String ss ="12345";
        String un = editText_log.getText().toString();
        String p=editText_pass.getText().toString();
        if (s.equals(un)&&ss.equals(p)) {
            Intent intent =new Intent(onley_admin.this,M_activaty.class);
            startActivity(intent);
            editText_log.getText().clear();
            editText_pass.getText().clear();
        } else {
            Toast.makeText(this,"error pass or name",Toast.LENGTH_LONG).show();
            editText_log.getText().clear();
            editText_pass.getText().clear();
        }

    }
}
