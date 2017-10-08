package com.example.hamzaelrhazi.tp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;

public class LevelActivity extends AppCompatActivity {
    private static final String TAG = "message";
    public static int NbrFoisActivityCreated=0;
    private TextView txtViewAlertCurrentLevel;
    private TextView txtViewNbrFois;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "Fonction onCreate() applée");
        setContentView(R.layout.activity_level);
        txtViewNbrFois=(TextView) findViewById(R.id.txtViewNbrFoisActivityCreated) ;
        txtViewAlertCurrentLevel=(TextView) findViewById(R.id.txtViewAlertCurrentLevel);
        Intent intent = getIntent();
        int level = intent.getIntExtra(TP3Activity.EXTRA_LEVEL,1);
        txtViewAlertCurrentLevel.setText(String.valueOf(level));
        txtViewNbrFois.setText("LevelActivity est crée "+String.valueOf(NbrFoisActivityCreated)+" fois");
    }
    @Override
    public void onDestroy(){

        Log.v(TAG, "Fonction onDestroy() applée");
        super.onDestroy();
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.v(TAG, "Fonction onStart() applée");
    }


    @Override
    public void onStop(){
        Log.v(TAG, "Fonction inStop() applée");
        super.onStop();
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.v(TAG, "Fonction onRestart() applée");    }

    @Override
    public void onPause(){
        Log.v(TAG, "Fonction onPause() applée");
        super.onPause();
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.v(TAG, "Fonction onResume() applée");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.v(TAG, "Fonction onSaveInstanceState() applée");
        super.onSaveInstanceState(savedInstanceState);
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(TAG, "Fonction onRestoreInstanceState() applée");
    }

}
