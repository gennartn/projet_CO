package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);

        Button play = findViewById(R.id.button);

        play.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), Liste_De_Souhait.class);
                startActivity(otherActivity);
                finish();
            }
        });

        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText texte = ((EditText)findViewById(R.id.monEditText1));

                String nom = texte.getText().toString();
                Toast.makeText(MainActivity.this, nom, Toast.LENGTH_SHORT).show();
            }

            });

        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text1 = ((EditText)findViewById(R.id.monEditText2));

                String nom1 = text1.getText().toString();
                Toast.makeText(MainActivity.this, nom1, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
