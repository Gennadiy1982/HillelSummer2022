package rockpaperscissors.service;

import com.hillel.service.GameOption;
import com.hillel.service.Player;
import com.hillel.service.Score;

public interface GameController {

    String welcomeMessage();

    String pleaseEnterOptionMessage();

    void selectUserChoice(GameOption userOption);

    GameOption randomComputerChoice();

    Player calculateResult();

    Score getResult();
}
