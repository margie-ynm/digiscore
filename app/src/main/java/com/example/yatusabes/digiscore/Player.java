package com.example.yatusabes.digiscore;

public class Player {
    private Integer mScore;
    private Integer mFouls;
    private Integer mNumber;
    private Integer mViewID;

    public Player(Integer viewID, Integer number) {
        mNumber = number;
        mScore = 0;
        mFouls = 0;

        mViewID = viewID;
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

    public Integer getViewID() {
        return mViewID;
    }
}
