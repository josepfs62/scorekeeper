package com.josepfayos.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int team1 = 0;
    static int team2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView scoreteam1 = (TextView) findViewById(R.id.scoreteam1);
        TextView scoreteam2 = (TextView) findViewById(R.id.scoreteam2);

        setContentView(R.layout.activity_main);
        ImageButton decreaseTeam1 = (ImageButton) findViewById(R.id.decreaseteam1);
        decreaseTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team1--;
                scoreteam1.setText(team1);
            }
        });

        setContentView(R.layout.activity_main);
        ImageButton increaseteam1 = (ImageButton) findViewById(R.id.increaseteam1);
        increaseteam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team1++;
                scoreteam1.setText(team1);
            }
        });

        setContentView(R.layout.activity_main);
        ImageButton decreaseTeam2 = (ImageButton) findViewById(R.id.decreaseteam2);
        decreaseTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team2--;
                scoreteam2.setText(team2);
            }
        });

        setContentView(R.layout.activity_main);
        ImageButton increaseteam2 = (ImageButton) findViewById(R.id.increaseteam2);
        increaseteam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team2++;
                scoreteam2.setText(team2);
            }
        });
    }
}