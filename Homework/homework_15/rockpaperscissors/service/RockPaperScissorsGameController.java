package homework_15.rockpaperscissors.service;

import com.hillel.service.GameController;
import com.hillel.service.GameOption;
import com.hillel.service.Player;
import com.hillel.service.Score;

import java.util.Random;

public class RockPaperScissorsGameController implements GameController {

    private GameOption userChoice = GameOption.EMPTY;
    private GameOption machineChoice = GameOption.EMPTY;
    private final Score totalScore = new Score();


    @Override
    public String welcomeMessage() {
        return "            Welcome            \n"+
                "   Rock Paper Scissors Game    \n"+
                "-------------------------------\n";
    }

    @Override
    public String pleaseEnterOptionMessage() {
        return "        Please enter:          \n"+
                "        1 --> ROCK             \n"+
                "        2 --> PAPER            \n"+
                "        3 --> SCISSORS         \n"+
                "-------------------------------\n";
    }


    @Override
    public void selectUserChoice(GameOption userOption) {
        this.userChoice = userOption;
    }

    @Override
    public GameOption randomComputerChoice() {
        int randomNumberBetween1to3 = new Random().nextInt(3) + 1;
        GameOption machineOption = GameOption.valueOf(randomNumberBetween1to3);
        this.machineChoice = machineOption;
        return machineOption;
    }

    @Override
    public Player calculateResult() {

        totalScore.incrementTotalNumberGames();

        if (machineChoice.equals(userChoice)) {
            return Player.TIE;
        }
        if (machineChoice.isWinBy(userChoice)) {
            return Player.USER;
        }
        return Player.COMPUTER;
    }

    @Override
    public Score getResult() {
        return totalScore;
    }
}
