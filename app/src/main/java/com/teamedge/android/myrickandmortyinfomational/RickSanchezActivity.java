package com.teamedge.android.myrickandmortyinfomational;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RickSanchezActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rick_sanchez);
    }


    public void openMortySmith(View view) {
        Intent i = new Intent(this, MortySmithActivity.class);
        startActivity(i);
    }
}
