package com.example.yatusabes.digiscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Player> mPlayerList;
    private HashMap<Integer, Player> mPlayerMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initPlayers();
        Player test = new Player(33);
        addPlayerLineItem(test);
    }
    private void initPlayers() {
        mPlayerList = new ArrayList<>();
        mPlayerMap = new HashMap<>();

    }

    // create LinearLayout for each player in team, with child views
    private void addPlayerLineItem(Player player) {
        LinearLayout teamAPane = (LinearLayout) findViewById(R.id.team_a_panel);
        LinearLayout playerLine = new LinearLayout(this);

        TextView playerNumberLabel = new TextView(this);
        playerNumberLabel.setText(player.getNumber().toString());

        playerNumberLabel.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.single_player_text_size));
        EditText playerPointInput = new EditText(this);


        playerLine.addView(playerNumberLabel);
        playerLine.addView(playerPointInput);

        teamAPane.addView(playerLine);
    }


}
