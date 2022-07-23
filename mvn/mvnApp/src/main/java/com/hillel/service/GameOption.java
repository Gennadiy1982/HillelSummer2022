package com.hillel.service;

public enum GameOption {
    ROCK(1, 2), PAPER(2, 3), SCISSORS(3, 1), EMPTY(-1, -1);

    private final int id;
    private final int winBy;

    GameOption(int id, int winBy) {
        this.id = id;
        this.winBy = winBy;
    }

    public static GameOption valueOf(int userEnteredOption){
        for (GameOption option : GameOption.values()) {
            if (userEnteredOption == option.id) {
                return option;
            }
        }
        return EMPTY;
    }

    public boolean isWinBy(GameOption option) {
        return this.winBy == option.id;
    }
}
