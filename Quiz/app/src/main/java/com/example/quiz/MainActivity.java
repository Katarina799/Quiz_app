package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton q1rb1 = (RadioButton) findViewById(R.id.q1rb1);
        final RadioButton q1rb2 = (RadioButton) findViewById(R.id.q1rb2);
        final RadioButton q1rb3 = (RadioButton) findViewById(R.id.q1rb3);
        final RadioButton q1rb4 = (RadioButton) findViewById(R.id.q1rb4);
        final RadioButton q2rb1 = (RadioButton) findViewById(R.id.q2rb1);
        final RadioButton q2rb2 = (RadioButton) findViewById(R.id.q2rb2);
        final RadioButton q2rb3 = (RadioButton) findViewById(R.id.q2rb3);
        final CheckBox q3c1 = (CheckBox) findViewById(R.id.q3c1);
        final CheckBox q3c2 = (CheckBox) findViewById(R.id.q3c2);
        final CheckBox q3c3 = (CheckBox) findViewById(R.id.q3c3);
        final CheckBox q3c4 = (CheckBox) findViewById(R.id.q3c4);
        final CheckBox q3c5 = (CheckBox) findViewById(R.id.q3c5);
        final CheckBox q4c1 = (CheckBox) findViewById(R.id.q4c1);
        final CheckBox q4c2 = (CheckBox) findViewById(R.id.q4c2);
        final CheckBox q4c3 = (CheckBox) findViewById(R.id.q4c3);
        final CheckBox q4c4 = (CheckBox) findViewById(R.id.q4c4);
        final CheckBox q4c5 = (CheckBox) findViewById(R.id.q4c5);
        final ToggleButton buttonq5 = (ToggleButton) findViewById(R.id.buttonq5);
        final ToggleButton buttonq6 = (ToggleButton) findViewById(R.id.buttonq6);
        final Button clearbutton = (Button) findViewById(R.id.clearbutton);
        final Button checkbutton = (Button) findViewById(R.id.checkbutton);


        checkbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int points=0;
                if(q1rb4.isChecked()) points++;
                if(q2rb2.isChecked()) points++;
                if(q3c1.isChecked() && !q3c2.isChecked() && q3c3.isChecked() && q3c4.isChecked() && !q3c5.isChecked()) points++;
                if(!q4c1.isChecked() && q4c2.isChecked() && !q4c3.isChecked() && q4c4.isChecked() && q4c5.isChecked()) points++;
                if(buttonq5.isChecked()) points++;
                if(!buttonq6.isChecked()) points++;
                Intent results = new Intent(MainActivity.this, Results.class);
                results.putExtra("points", points);
                MainActivity.this.startActivity(results);
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float points = 0;
                q1rb1.setChecked(false);
                q1rb2.setChecked(false);
                q1rb3.setChecked(false);
                q1rb4.setChecked(false);
                q2rb1.setChecked(false);
                q2rb2.setChecked(false);
                q2rb3.setChecked(false);
                q3c1.setChecked(false);
                q3c2.setChecked(false);
                q3c3.setChecked(false);
                q3c4.setChecked(false);
                q3c5.setChecked(false);
                q4c1.setChecked(false);
                q4c2.setChecked(false);
                q4c3.setChecked(false);
                q4c4.setChecked(false);
                q4c5.setChecked(false);
                buttonq5.setChecked(false);
                buttonq6.setChecked(false);
            }
        });
    }
}