package com.example.yatusabes.digiscore;

public class Team {
    private String mName;
    private Player[] mPlayers;


    public Team(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public Integer getScore() {
        Integer score = 0;
        for (Player player:mPlayers) {
            score += player.getScore();
        }
        return score;
    }

}
