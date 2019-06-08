package com.teamedge.android.myrickandmortyinfomational;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BethSmithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beth_smith);
    }

    public void openJerrySmith(View view) {
        Intent i = new Intent(this, JerrySmithActivity.class);
        startActivity(i);
    }
}
