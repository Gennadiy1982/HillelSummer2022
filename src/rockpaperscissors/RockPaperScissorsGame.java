package rockpaperscissors;

import com.hillel.service.*;

import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        GameController gameController = new RockPaperScissorsGameController();

        Scanner scanner = new Scanner(System.in);

        String userWantsToExit;

        System.out.print(gameController.welcomeMessage());


        do {
            System.out.println("Please, enter your name: ");
            String nameUser = scanner.next();
            System.out.println("How many rounds do you want to play ?");
            int numberOfRoundsGame = scanner.nextInt();
            for (int i = 0; i < numberOfRoundsGame; i++) {

                System.out.println(gameController.pleaseEnterOptionMessage());

                int userOptionRaw = scanner.nextInt();

                GameOption userOption = GameOption.valueOf(userOptionRaw);

                gameController.selectUserChoice(userOption);

                GameOption machineChoice = gameController.randomComputerChoice();

                Player winner = gameController.calculateResult();

                Score score = gameController.getResult();

                System.out.printf("%s played: %s and computer played: %s \n",nameUser, userOption.name(), machineChoice.name());
                if (Player.USER.equals(winner)) {
                    score.incrementGamesWonByUser();
                    System.out.println(nameUser + " won !!!");
                }
                if (Player.TIE.equals(winner)) {
                    System.out.println("Tie !!!");
                }
                System.out.printf("%s won %d rounds out of %d \n",nameUser, score.getGamesWonByUser(), score.totalNumberGames());
            }
            System.out.println("Continue playing(Y = Yes, N = No)?");
            userWantsToExit = scanner.next();

        } while (userWantsToExit.equalsIgnoreCase("Y"));
    }
}

