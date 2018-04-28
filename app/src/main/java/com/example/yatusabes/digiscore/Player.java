package com.example.yatusabes.digiscore;

public class Player {
    private Integer mScore;
    private Integer mFouls;

    public Player() {
        mScore = 0;
        mFouls = 0;
    }

    public Integer getScore() {
        return mScore;
    }

    public Integer getFouls() {
        return mFouls;
    }
}
