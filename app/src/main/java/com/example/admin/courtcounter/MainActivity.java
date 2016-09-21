package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * this method displays the given score for Team A
      */
    public void displayForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increases the score for Team A by three points
     */
    public void addThreePointsForTeamA(View view){
       scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increases the score for Team A by one point...
     */
    public void addOnePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

        /**
         * Increases the score for Team A by Two points

         */
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * this is the displays the give score for Team B
     */
    public void displayTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * this method increases the score for team B by one point

     */
    public void OneTeamB(View v){
        scoreTeamB=scoreTeamB+1;
        displayTeamB(scoreTeamB);

    }

    /**
     * this method increases the score for team B by two points

     */
    public void TwoTeamB(View v){
        scoreTeamB=scoreTeamB+2;
        displayTeamB(scoreTeamB);

    }

    /**
     *this method increases the score for team B by three points
     */
    public void ThreeTeamB (View v){
        scoreTeamB=scoreTeamB+3;
        displayTeamB(scoreTeamB);
    }

    /**
     * this method reserts the score for team A and team B
     */
    public void resetScore(View v){
      scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}
