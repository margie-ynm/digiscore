package com.example.yatusabes.digiscore;

public class Player {
    private Integer mScore;
    private Integer mFouls;
    private Integer mNumber;

    public Player(Integer number) {
        mNumber = number;
        mScore = 0;
        mFouls = 0;
    }

    public Integer getNumber() {
        return mNumber;
    }

    public Integer getScore() {
        return mScore;
    }

    public Integer getFouls() {
        return mFouls;
    }
}
