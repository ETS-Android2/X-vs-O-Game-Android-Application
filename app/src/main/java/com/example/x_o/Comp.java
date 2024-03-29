package com.example.x_o;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Comp extends AppCompatActivity {
    Button btnNest,btnAgain,btnBack;
    TextView b1,b2,b3,b4,b5,b6,b7,b8,b9;

    TextView txtPlayer1, txtPlayer2,txtPoints1,txtPoints2;
    String w = "X";
    boolean poi = false;

    int point1 = 0, point2 = 0;

    boolean ch = false;

    globalV gvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        gvalue = (globalV) getApplicationContext();


        final MediaPlayer mp = MediaPlayer.create(this, R.raw.s6);


        txtPlayer1 = findViewById(R.id.comPlayer1);
        txtPlayer2 = findViewById(R.id.comPlayer2);
        txtPoints1 = findViewById(R.id.txtPoints1);
        txtPoints2 = findViewById(R.id.txtPoints2);

        btnNest = findViewById(R.id.btnNext);
        btnAgain = findViewById(R.id.btnAgain);
        btnBack = findViewById(R.id.btnBack2);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Comp.this, MainActivity.class);
                startActivity(intent);
            }
        });


        btnNest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w = "X";
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                b1.setTextColor(getColor(R.color.black));
                b2.setTextColor(getColor(R.color.black));
                b3.setTextColor(getColor(R.color.black));
                b4.setTextColor(getColor(R.color.black));
                b5.setTextColor(getColor(R.color.black));
                b6.setTextColor(getColor(R.color.black));
                b7.setTextColor(getColor(R.color.black));
                b8.setTextColor(getColor(R.color.black));
                b9.setTextColor(getColor(R.color.black));

                ch = false;

                mp.start();

                poi = false;
            }
        });

        btnAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                w = "X";
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                b1.setTextColor(getColor(R.color.black));
                b2.setTextColor(getColor(R.color.black));
                b3.setTextColor(getColor(R.color.black));
                b4.setTextColor(getColor(R.color.black));
                b5.setTextColor(getColor(R.color.black));
                b6.setTextColor(getColor(R.color.black));
                b7.setTextColor(getColor(R.color.black));
                b8.setTextColor(getColor(R.color.black));
                b9.setTextColor(getColor(R.color.black));

                point1 = 0;
                point2 = 0;

                txtPoints2.setText("" + point1);
                txtPoints1.setText("" + point2);


//                infoAlert(txtPlayer1);


                ch = false;

                mp.start();

                poi = false;
            }
        });

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);



//        infoAlert(txtPlayer1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b1);
                win();
                chBrain();
                win();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b2);
                win();
                chBrain();
                win();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b3);
                chBrain();
                win();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b4);
                win();
                chBrain();
                win();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b5);
                win();
                chBrain();
                win();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b6);
                win();
                chBrain();
                win();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b7);
                win();
                chBrain();
                win();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b8);
                win();
                chBrain();
                win();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press(b9);
                win();
                chBrain();
                win();
            }
        });
    }

    public void chBrain()
    {
        if (gvalue.getBrain() == "Boor")
        {
            copmPress();
        }
        else
        {
            SmartCompPress();
        }
    }

    public void press(TextView b)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.s7);

        Typeface tf = Typeface.createFromAsset(getAssets(), "font5.TTF");

        if(b.getText() == "") {

            b.setText(w);

            if (w == "X")
                w = "O";
            else
                w = "X";

            mp.start();

            b.setTypeface(tf);
        }
    }


    public void copmPress()
    {
        if (checkWim() == false) {
            final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.s7);

            TextView view = null;

            Typeface tf = Typeface.createFromAsset(getAssets(), "font5.TTF");


            List<TextView> t = new ArrayList<TextView>();
            t.add(b1);
            t.add(b2);
            t.add(b3);
            t.add(b4);
            t.add(b5);
            t.add(b6);
            t.add(b7);
            t.add(b8);
            t.add(b9);

            boolean chFill = fill(t);

            if (chFill == true) {

                boolean c = false;

                while (c == false) {

                    Random r = new Random();
                    int tx = r.nextInt(t.size());

                    view = t.get(tx);

                    if (view.getText() == "") {
                        view.setText(w);
                        c = true;
                    }
                }

                if (w == "X")
                    w = "O";
                else
                    w = "X";


                mp1.start();
                view.setTypeface(tf);
            }
        }
    }


    public void SmartCompPress()
    {
        try {

            if (checkWim() == false) {
                final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.s7);

                TextView view = null;

                Typeface tf = Typeface.createFromAsset(getAssets(), "font5.TTF");


                List<TextView> t = new ArrayList<TextView>();
                t.add(b1);
                t.add(b2);
                t.add(b3);
                t.add(b4);
                t.add(b5);
                t.add(b6);
                t.add(b7);
                t.add(b8);
                t.add(b9);

                boolean chFill = fill(t);

                if (chFill == true) {

                    boolean c = false;

                    while (c == false) {

//                    Random r = new Random();


                        int tx = smartMethod(t)-1;


                        view = t.get(tx);

                        if (view.getText() == "" && tx >= 0) {
                            view.setText(w);
                            c = true;
                        }
                    }

                    if (w == "X")
                        w = "O";
                    else
                        w = "X";


                    mp1.start();
                    view.setTypeface(tf);
                }
            }
        }catch (Exception e)
        {
            Toast.makeText(this, e+"", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean checkWim(){
        if(b1.getCurrentTextColor() == getColor(R.color.Red) || b2.getCurrentTextColor() == getColor(R.color.Red) ||
                b3.getCurrentTextColor() == getColor(R.color.Red) || b4.getCurrentTextColor() == getColor(R.color.Red) ||
                b5.getCurrentTextColor() == getColor(R.color.Red) || b6.getCurrentTextColor() == getColor(R.color.Red) ||
                b7.getCurrentTextColor() == getColor(R.color.Red) || b8.getCurrentTextColor() == getColor(R.color.Red) ||
                b9.getCurrentTextColor() == getColor(R.color.Red))
        {
            return true;
        }
        return false;
    }

    public int smartMethod(List<TextView> t){
//        Toast.makeText(this, w+"", Toast.LENGTH_SHORT).show();
        Random r = new Random();
        int tx2 = (r.nextInt(t.size())+1);



        if(b1.getText() == b2.getText() && b1.getText() == "O" && b3.getText() == "")
            return 3;
        else if (b1.getText() == b3.getText() && b1.getText() == "O" && b2.getText() == "")
            return 2;
        else if (b2.getText() == b3.getText() && b2.getText() == "O" && b1.getText() == "")
            return 1;

        else if (b4.getText() == b5.getText() && b4.getText() == "O" && b6.getText() == "")
            return 6;
        else if (b4.getText() == b6.getText() && b4.getText() == "O" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b6.getText() && b5.getText() == "O" && b4.getText() == "")
            return 4;

        else if (b7.getText() == b8.getText() && b7.getText() == "O" && b9.getText() == "")
            return 9;
        else if (b7.getText() == b9.getText() && b7.getText() == "O" && b8.getText() == "")
            return 8;
        else if (b8.getText() == b9.getText() && b8.getText() == "O" && b7.getText() == "")
            return 7;

        else if (b1.getText() == b4.getText() && b1.getText() == "O" && b7.getText() == "")
            return 7;
        else if (b1.getText() == b7.getText() && b1.getText() == "O" && b4.getText() == "")
            return 4;
        else if (b4.getText() == b7.getText() && b4.getText() == "O" && b1.getText() == "")
            return 1;

        else if (b2.getText() == b5.getText() && b2.getText() == "O" && b8.getText() == "")
            return 8;
        else if (b2.getText() == b8.getText() && b2.getText() != "" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b8.getText() && b5.getText() == "O" && b2.getText() == "")
            return 2;

        else if (b3.getText() == b6.getText() && b3.getText() == "O" && b9.getText() == "")
            return 9;
        else if (b3.getText() == b9.getText() && b3.getText() == "O" && b6.getText() == "")
            return 6;
        else if (b6.getText() == b9.getText() && b6.getText() == "O" && b3.getText() == "")
            return 3;

        else if (b1.getText() == b5.getText() && b1.getText() == "O" && b9.getText() == "")
            return 9;
        else if (b1.getText() == b9.getText() && b1.getText() == "O" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b9.getText() && b5.getText() == "O" && b1.getText() == "")
            return 1;

        else if (b3.getText() == b5.getText() && b3.getText() == "O" && b7.getText() == "")
            return 7;
        else if (b3.getText() == b7.getText() && b3.getText() == "O" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b7.getText() && b5.getText() == "O" && b3.getText() == "")
            return 3;



        else if(b1.getText() == b2.getText() && b1.getText() != "" && b3.getText() == "")
            return 3;
        else if (b1.getText() == b3.getText() && b1.getText() != "" && b2.getText() == "")
            return 2;
        else if (b2.getText() == b3.getText() && b2.getText() != "" && b1.getText() == "")
            return 1;

        else if (b4.getText() == b5.getText() && b4.getText() != "" && b6.getText() == "")
            return 6;
        else if (b4.getText() == b6.getText() && b4.getText() != "" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b6.getText() && b5.getText() != "" && b4.getText() == "")
            return 4;

        else if (b7.getText() == b8.getText() && b7.getText() != "" && b9.getText() == "")
            return 9;
        else if (b7.getText() == b9.getText() && b7.getText() != "" && b8.getText() == "")
            return 8;
        else if (b8.getText() == b9.getText() && b8.getText() != "" && b7.getText() == "")
            return 7;

        else if (b1.getText() == b4.getText() && b1.getText() != "" && b7.getText() == "")
            return 7;
        else if (b1.getText() == b7.getText() && b1.getText() != "" && b4.getText() == "")
            return 4;
        else if (b4.getText() == b7.getText() && b4.getText() != "" && b1.getText() == "")
            return 1;

        else if (b2.getText() == b5.getText() && b2.getText() != "" && b8.getText() == "")
            return 8;
        else if (b2.getText() == b8.getText() && b2.getText() != "" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b8.getText() && b5.getText() != "" && b2.getText() == "")
            return 2;

        else if (b3.getText() == b6.getText() && b3.getText() != "" && b9.getText() == "")
            return 9;
        else if (b3.getText() == b9.getText() && b3.getText() != "" && b6.getText() == "")
            return 6;
        else if (b6.getText() == b9.getText() && b6.getText() != "" && b3.getText() == "")
            return 3;

        else if (b1.getText() == b5.getText() && b1.getText() != "" && b9.getText() == "")
            return 9;
        else if (b1.getText() == b9.getText() && b1.getText() != "" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b9.getText() && b5.getText() != "" && b1.getText() == "")
            return 1;

        else if (b3.getText() == b5.getText() && b3.getText() != "" && b7.getText() == "")
            return 7;
        else if (b3.getText() == b7.getText() && b3.getText() != "" && b5.getText() == "")
            return 5;
        else if (b5.getText() == b7.getText() && b5.getText() != "" && b3.getText() == "")
            return 3;

        else
            return tx2;
    }


    public boolean fill(List<TextView> arr)
    {
        for (int i = 0 ; i < arr.size() ; i++) {
            TextView view = arr.get(i);
            if (view.getText() == "")
                return true;
        }
        return false;
    }


    public void win()
    {

        if (b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText() != "")
        {
            b1.setTextColor(getColor(R.color.Red));
            b2.setTextColor(getColor(R.color.Red));
            b3.setTextColor(getColor(R.color.Red));

            b4.setTextColor(getColor(R.color.gray));
            b5.setTextColor(getColor(R.color.gray));
            b6.setTextColor(getColor(R.color.gray));
            b7.setTextColor(getColor(R.color.gray));
            b8.setTextColor(getColor(R.color.gray));
            b9.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b4.getText() == b5.getText() && b5.getText() == b6.getText() && b4.getText() != "")
        {
            b4.setTextColor(getColor(R.color.Red));
            b5.setTextColor(getColor(R.color.Red));
            b6.setTextColor(getColor(R.color.Red));

            b1.setTextColor(getColor(R.color.gray));
            b2.setTextColor(getColor(R.color.gray));
            b3.setTextColor(getColor(R.color.gray));
            b7.setTextColor(getColor(R.color.gray));
            b8.setTextColor(getColor(R.color.gray));
            b9.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b7.getText() == b8.getText() && b8.getText() == b9.getText() && b7.getText() != "")
        {
            b7.setTextColor(getColor(R.color.Red));
            b8.setTextColor(getColor(R.color.Red));
            b9.setTextColor(getColor(R.color.Red));

            b4.setTextColor(getColor(R.color.gray));
            b5.setTextColor(getColor(R.color.gray));
            b6.setTextColor(getColor(R.color.gray));
            b1.setTextColor(getColor(R.color.gray));
            b2.setTextColor(getColor(R.color.gray));
            b3.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b1.getText() == b4.getText() && b4.getText() == b7.getText() && b1.getText() != "")
        {
            b1.setTextColor(getColor(R.color.Red));
            b4.setTextColor(getColor(R.color.Red));
            b7.setTextColor(getColor(R.color.Red));

            b2.setTextColor(getColor(R.color.gray));
            b3.setTextColor(getColor(R.color.gray));
            b5.setTextColor(getColor(R.color.gray));
            b6.setTextColor(getColor(R.color.gray));
            b8.setTextColor(getColor(R.color.gray));
            b9.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b2.getText() == b5.getText() && b5.getText() == b8.getText() && b2.getText() != "")
        {
            b2.setTextColor(getColor(R.color.Red));
            b5.setTextColor(getColor(R.color.Red));
            b8.setTextColor(getColor(R.color.Red));

            b1.setTextColor(getColor(R.color.gray));
            b3.setTextColor(getColor(R.color.gray));
            b4.setTextColor(getColor(R.color.gray));
            b6.setTextColor(getColor(R.color.gray));
            b7.setTextColor(getColor(R.color.gray));
            b9.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b3.getText() == b6.getText() && b6.getText() == b9.getText() && b3.getText() != "")
        {
            b3.setTextColor(getColor(R.color.Red));
            b6.setTextColor(getColor(R.color.Red));
            b9.setTextColor(getColor(R.color.Red));

            b1.setTextColor(getColor(R.color.gray));
            b2.setTextColor(getColor(R.color.gray));
            b4.setTextColor(getColor(R.color.gray));
            b5.setTextColor(getColor(R.color.gray));
            b7.setTextColor(getColor(R.color.gray));
            b8.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b1.getText() == b5.getText() && b5.getText() == b9.getText() && b1.getText() != "")
        {
            b1.setTextColor(getColor(R.color.Red));
            b5.setTextColor(getColor(R.color.Red));
            b9.setTextColor(getColor(R.color.Red));

            b2.setTextColor(getColor(R.color.gray));
            b3.setTextColor(getColor(R.color.gray));
            b4.setTextColor(getColor(R.color.gray));
            b6.setTextColor(getColor(R.color.gray));
            b7.setTextColor(getColor(R.color.gray));
            b8.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
        if (b3.getText() == b5.getText() && b5.getText() == b7.getText() && b3.getText() != "")
        {
            b3.setTextColor(getColor(R.color.Red));
            b5.setTextColor(getColor(R.color.Red));
            b7.setTextColor(getColor(R.color.Red));

            b1.setTextColor(getColor(R.color.gray));
            b2.setTextColor(getColor(R.color.gray));
            b4.setTextColor(getColor(R.color.gray));
            b6.setTextColor(getColor(R.color.gray));
            b8.setTextColor(getColor(R.color.gray));
            b9.setTextColor(getColor(R.color.gray));

            winAlert();
            poi = true;

        }
    }


    @SuppressLint("ResourceAsColor")
    public void winAlert() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);


        if (ch == false)
        {
            if (w == "X") {
                point1++;
                txtPoints2.setText("" + point1);
                if (txtPlayer2.getText() != "")
                    alert.setTitle(txtPlayer2.getText() + "is the WINNER..! ☺");
                else
                    alert.setTitle("WINNER..! ☺");


            } else if (w == "O") {
                point2++;
                txtPoints1.setText("" + point2);
                if (txtPlayer1.getText() != "")
                    alert.setTitle(txtPlayer1.getText() + "are the WINNER..! ☺");
                else
                    alert.setTitle("WINNER..! ☺");
            }
            alert.create().show();
        }

        ch = true;

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.s3);

        mp.start();
    }


    public void infoAlert(final TextView text)
    {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.s5);

        final EditText txtname = new EditText(this);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("ENTER YOUR NAME");
        alert.setView(txtname);
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                text.setText(txtname.getText().toString() + " ");

                mp.start();
            }
        });


        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                mp.start();
            }
        });

        alert.show();

    }

}
