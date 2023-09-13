package com.example.eval1xr2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    RatingBar ex;
    private EditText e1;
    private RadioButton rb1, rb2;
    private ProgressBar pbar;
    int aux = 0;
    private Button b;

    private CheckBox c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ex = (RatingBar) findViewById(R.id.ex);
        e1 = (EditText) findViewById(R.id.e1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        pbar = (ProgressBar) findViewById(R.id.pbar);
        b = (Button) findViewById(R.id.b1);

        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);

        radios1();
        radios2();
        barra();
        ch();
        ch2();

    }

    public void ch(){
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"¡De gusta la imagen! 7w7",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void ch2(){
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"¡No de gusta la imagen! 7n7",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void mensaje(View v){
        AlertDialog.Builder a = new AlertDialog.Builder(this);
        a.setCancelable(true);
        a.setTitle("Mensaje :D");
        a.setMessage(e1.getText().toString());
        a.setIcon(R.drawable.m1);
        a.show();
    }
    public void radios1(){
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Dijiste :) : "+rb1.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public void radios2(){
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Dijiste >:u : "+rb2.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void extrellas(View v){
        Toast.makeText(MainActivity.this,"Diste: "+ex.getRating()+"De dije no tocar >:v",Toast.LENGTH_LONG).show();
    }

    public void barra(){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Timer t = new Timer();
                TimerTask tt = new TimerTask(){
                    @Override
                    public void run(){
                        aux++;
                        pbar.setProgress(aux);
                        if(aux==100)
                            t.cancel();
                    }
                };
                t.schedule(tt,0,100);
            }
        });
    }

}