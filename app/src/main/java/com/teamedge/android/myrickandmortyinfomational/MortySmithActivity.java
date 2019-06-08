package com.teamedge.android.myrickandmortyinfomational;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MortySmithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morty_smith);
    }

    public void openSummerSmith(View view) {
        Intent i = new Intent(this, SummerSmithActivity.class);
        startActivity(i);
    }
}
