package com.tayoto.pauline;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId() == R.id.previous){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
