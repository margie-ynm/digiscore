package com.example.yatusabes.digiscore;

import java.util.ArrayList;

public class Team {
    private String mName;
    private ArrayList<Player> mPlayerList;


    public Team(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public Integer getScore() {
        Integer score = 0;
        for (Player player:mPlayerList) {
            score += player.getScore();
        }
        return score;
    }

}
