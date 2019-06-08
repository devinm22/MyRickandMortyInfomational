package com.teamedge.android.myrickandmortyinfomational;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SummerSmithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer_smith);
    }

    public void openBethSmith(View view) {
        Intent i = new Intent(this, BethSmithActivity.class);
        startActivity(i);
    }
}
