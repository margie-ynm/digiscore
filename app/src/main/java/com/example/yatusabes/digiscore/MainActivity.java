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

    private static final Integer LOGAN = 1;
    private static final Integer JACK = 2;
    private static final Integer CALVIN = 3;
    private static final Integer CORTEZ = 4;
    private static final Integer MAX = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPlayers();
        addPlayerViews();
    }

    private void addPlayerViews() {
        for (Player player: mPlayerList) {
            addPlayerLineItem(player);
        }
    }

    private void initPlayers() {
        mPlayerList = new ArrayList<>();
        mPlayerMap = new HashMap<>();

        mPlayerList.add(new Player(LOGAN, R.integer.logan));
        mPlayerList.add(new Player(JACK, R.integer.jack));
        mPlayerList.add(new Player(CALVIN, R.integer.calvin));
        mPlayerList.add(new Player(CORTEZ, R.integer.cortez));
        mPlayerList.add(new Player(MAX, R.integer.max));

        for (Player player: mPlayerList) {
            mPlayerMap.put(player.getViewID(), player);
        }
    }


    // create LinearLayout for each player in team, with child views
    private void addPlayerLineItem(Player player) {
        LinearLayout teamAPane = (LinearLayout) findViewById(R.id.team_a_panel);
        LinearLayout playerLine = new LinearLayout(this);

        TextView numberSign = new TextView(this);
        numberSign.setText("#");

        TextView playerNumberLabel = new TextView(this);
        playerNumberLabel.setText(player.getNumber());
        playerNumberLabel.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimension(R.dimen.single_player_text_size));

        EditText playerPointInput = new EditText(this);
        playerPointInput.setId(player.getViewID());


        playerLine.addView(numberSign);p
        playerLine.addView(playerNumberLabel);
        playerLine.addView(playerPointInput);

        teamAPane.addView(playerLine);
    }


}
