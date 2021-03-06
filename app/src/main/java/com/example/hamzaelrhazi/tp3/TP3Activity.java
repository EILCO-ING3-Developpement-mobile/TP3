package com.example.hamzaelrhazi.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;


public class TP3Activity extends AppCompatActivity {
    public static final String EXTRA_LEVEL = "EXTRA_LEVEL";
    private static final String TAG = "message";
    private Button btnAjouterUnPoint;
    private TextView txtViewCurrentScore;
    private TextView txtViewCurrentLevel;
    private Button btnReinitialiserLeJeu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "Fonction onCreate(Bundle savedInstanceState) applée");
        setContentView(R.layout.activity_tp3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnAjouterUnPoint=(Button) findViewById(R.id.btnAjouterUnPoint);
        txtViewCurrentScore=(TextView) findViewById(R.id.txtViewCurrentScore);
        txtViewCurrentLevel=(TextView) findViewById(R.id.txtViewCurrentLevel);
        btnReinitialiserLeJeu=(Button) findViewById(R.id.btnReinitialiserLeJeu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tp3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ajouterUnPoint(View v){
        int previousScore;
        int score;
        int level=1;
        previousScore=Integer.parseInt(txtViewCurrentScore.getText().toString());
        score=previousScore+1;
        txtViewCurrentScore.setText(String.valueOf(score));
        level=(score/5)+1;
        txtViewCurrentLevel.setText(String.valueOf(level));

        if(score%5==0){
            Intent intent=new Intent(this,LevelActivity.class);
            intent.putExtra(EXTRA_LEVEL, level);
            startActivity(intent);
            LevelActivity.NbrFoisActivityCreated++;
        }

    }
    public void reinitialiserLeJeu(View v){
        int initialScore=0;
        int initialLevel=1;
        txtViewCurrentScore.setText(String.valueOf(initialScore));
        txtViewCurrentLevel.setText(String.valueOf(initialLevel));

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
        Log.v(TAG, "Fonction onResume() applée");    }

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
