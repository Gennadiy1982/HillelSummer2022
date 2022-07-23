package com.hillel.service;

public interface GameController {

    String welcomeMessage();

    String pleaseEnterOptionMessage();

    void selectUserChoice(GameOption userOption);

    GameOption randomComputerChoice();

    Player calculateResult();

    Score getResult();
}
