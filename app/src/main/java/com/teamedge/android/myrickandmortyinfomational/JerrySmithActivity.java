package com.teamedge.android.myrickandmortyinfomational;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JerrySmithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerry_smith);
    }

    public void openMainActivity(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
