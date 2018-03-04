package com.example.android.projectno2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    int redA = 0;
    int redB = 0;

    int yellowA = 0;
    int yellowB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtScoreA = (TextView) findViewById(R.id.txtScoreA);
        final TextView txtScoreB = (TextView) findViewById(R.id.txtScoreB);
        final TextView txtRedA = (TextView) findViewById(R.id.txtRedA);
        final TextView txtRedB = (TextView) findViewById(R.id.txtRedB);
        final TextView txtYellowA = (TextView) findViewById(R.id.txtYellowA);
        final TextView txtYellowB = (TextView) findViewById(R.id.txtYellowB);

        final String oldTxtRedA = txtRedA.getText().toString();
        final String oldTxtRedB = txtRedB.getText().toString();

        final String oldTxtYellowA = txtYellowA.getText().toString();
        final String oldTxtYellowB = txtYellowB.getText().toString();


        Button btnGoalA = (Button) findViewById(R.id.btnGoalA);
        Button btnGoalB = (Button) findViewById(R.id.btnGoalB);
        Button btnRedA = (Button) findViewById(R.id.btnRedA);
        Button btnRedB = (Button) findViewById(R.id.btnRedB);
        Button btnYellowA = (Button) findViewById(R.id.btnYellowA);
        Button btnYellowB = (Button) findViewById(R.id.btnYellowB);


        Button btnWinner = (Button) findViewById(R.id.btnWinner);

        Button btnReset = (Button) findViewById(R.id.btnReset);

        btnGoalA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA++;
                txtScoreA.setText(scoreA + "");
            }
        });


        btnGoalB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scoreB++;
                txtScoreB.setText(scoreB + "");
            }
        });

        btnRedA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                redA++;
                txtRedA.setText(oldTxtRedA + redA);
            }
        });

        btnRedB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redB++;
                txtRedB.setText(oldTxtRedB + redB);
            }
        });

        btnYellowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowA++;
                txtYellowA.setText(oldTxtYellowA + yellowA);
            }
        });

        btnYellowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowB++;
                txtYellowB.setText(oldTxtYellowB + yellowB);
            }
        });

        btnWinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreA < scoreB) {

                    Toast.makeText(MainActivity.this, "The winner is: Team B, Congrats.",
                            Toast.LENGTH_LONG).show();
                } else if (scoreB < scoreA) {

                    Toast.makeText(MainActivity.this, "The winner is: Team A, Congrats.",
                            Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "Draws", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRedA.setText(oldTxtRedA + (redA = redA - redA));
                txtRedB.setText(oldTxtRedB + (redB = redB - redB));


                txtScoreA.setText((scoreA = scoreA - scoreA) + "");
                txtScoreB.setText((scoreB = scoreB - scoreB) + "");

                txtYellowA.setText(oldTxtYellowA + (yellowA = yellowA - yellowA));
                txtYellowB.setText(oldTxtYellowB + (yellowB = yellowB - yellowB));


            }
        });

    }
}
