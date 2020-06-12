package homeproject;

import static homeproject.Casino.clear;

public class Help {
    public static void help(){
        clear();
        System.out.println("    European Roulette is often called the Game of Luck. It is played using a Roulette wheel numbered 1-36 \n" +
                "    plus a single zero (0). The numbers are alternately colored red and black except zero which is colored yellow. \n" +
                "    A small white ball within the Roulette wheel to determine the winning number. \n" +
                "    The objective of the game is to guess the number on which the ball will land on by placing one or more bets\n" +
                "    covered by that particular number.");
        System.out.println();
        System.out.println(
                "    Bet types: \n" +
                "     Number: This is a bet on any number.\n " +
                        "    Vertical pair: This is the opposite of a straight bet. Instead of betting on one number, \n" +
                        "         you’re placing a bet on the line that separates two numbers. If either number comes up, you win. " +
                        "\n     Horizontal pair: This is the opposite of a straight bet. Instead of betting on one number,\n" +
                        "         you’re placing a bet on the line that separates two numbers. If either number comes up, you win. " +
                        "\n     Column: This is a bet on any number within a row of three numbers. " +
                        "\n     Four number: This bet is similar to the split bet. But instead of two numbers, you’re betting that\n" +
                        "         one of four numbers will come up. These numbers also need to touch (to form a square). " +
                        "\n     Six/Line: These are similar to streets bets, but instead of covering one row of three numbers,\n" +
                        "         you cover two rows of three numbers. " +
                        "\n     Row: This is a bet on the outcome being a number within one of the three rows of twelve numbers\n" +
                        "         that span the longest side of the roulette table." +
                        "\n     Dozen: This bet covers a dozen numbers, too. But, in order:" +
                        "\n     High-Low: You’re betting on whether the number selected will fall within 1-18 (low) or 19-36 (high). \n" +
                        "         Both are even money bets." +
                        "\n     Even-Odd: You’re betting on whether an even or odd number is selected." +
                        "\n     Colour: Simple. You’re making a bet on whether a red number or a black number will win."
        );
        System.out.println();
    }
}
