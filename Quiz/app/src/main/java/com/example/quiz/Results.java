package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Bundle extras = getIntent().getExtras();
        Integer points = extras.getInt("points");

        final TextView pointsplace = (TextView) findViewById(R.id.points);
        if (points==1) pointsplace.setText(points + " point");
        else pointsplace.setText(points + " points");

        final Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent quiz = new Intent(Results.this, MainActivity.class);
                Results.this.startActivity(quiz);
            }
        });

    }
}