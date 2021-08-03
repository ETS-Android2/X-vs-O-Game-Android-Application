package com.example.x_o;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnComp,btnPlayers;
    Intent intent;
    Button btnBoor;
    Button btnSmart;
    globalV gvalue ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.s5);


        btnBoor = findViewById(R.id.btnBoor);
        btnSmart = findViewById(R.id.btnSmart);

        btnComp = findViewById(R.id.btnComp);
        btnPlayers = findViewById(R.id.btnPlayers);


        gvalue = (globalV) getApplicationContext();

        btnBoor.setVisibility(View.INVISIBLE);
        btnSmart.setVisibility(View.INVISIBLE);



        btnPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this , Two_Players.class);
                startActivity(intent);
                mp.start();
            }
        });



        btnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnBoor.getVisibility() == View.INVISIBLE) {
                    btnBoor.setVisibility(View.VISIBLE);
                    btnSmart.setVisibility(View.VISIBLE);
                }else
                {
                    btnBoor.setVisibility(View.INVISIBLE);
                    btnSmart.setVisibility(View.INVISIBLE);
                }
                mp.start();
            }
        });


        btnBoor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                gvalue.setBrain("Boor");
                intent = new Intent(MainActivity.this , Comp.class);
                startActivity(intent);
                mp.start();
            }
        });

        btnSmart.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                gvalue.setBrain("Smart");
                intent = new Intent(MainActivity.this , Comp.class);
                startActivity(intent);
                mp.start();
            }
        });



    }
}
