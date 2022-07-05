package homework_14;

import java.util.Arrays;

public class RunNumber {
    public static void main(String[] args) {
        Number[] numbers = Number.createDigits(
                "  ###      #     #####   #####  #       #######  #####  #######  #####   ##### ",
                " #   #    ##    #     # #     # #    #  #       #     # #    #  #     # #     #",
                "#     #  # #          #       # #    #  #       #           #   #     # #     #",
                "#     #    #     #####   #####  #    #  ######  ######     #     #####   ######",
                "#     #    #    #             # #######       # #     #   #     #     #       #",
                " #   #     #    #       #     #      #  #     # #     #   #     #     # #     #",
                "  ###    #####  #######  #####       #   #####   #####    #      #####   ##### "
        );
        int height = numbers[0].lines.length;

        if (args.length == 1 && args[0].chars().allMatch(Character::isDigit)) {
            int[] number = Arrays.stream(args[0].split("")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < height; i++) {
                for (int n : number) {
                    System.out.print(numbers[n].lines[i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Please, enter current value !!!");
        }
    }
}
