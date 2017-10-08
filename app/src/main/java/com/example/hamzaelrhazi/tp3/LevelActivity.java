package com.example.hamzaelrhazi.tp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class LevelActivity extends AppCompatActivity {
    public static int NbrFoisActivityCreated=0;
    private TextView txtViewAlertCurrentLevel;
    private TextView txtViewNbrFois;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        txtViewNbrFois=(TextView) findViewById(R.id.txtViewNbrFoisActivityCreated) ;
        txtViewAlertCurrentLevel=(TextView) findViewById(R.id.txtViewAlertCurrentLevel);
        Intent intent = getIntent();
        int level = intent.getIntExtra(TP3Activity.EXTRA_LEVEL,1);
        txtViewAlertCurrentLevel.setText(String.valueOf(level));
        txtViewNbrFois.setText("LevelActivity est crée "+String.valueOf(NbrFoisActivityCreated)+" fois");
    }


}
