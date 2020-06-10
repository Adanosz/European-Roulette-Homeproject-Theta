package homeproject;

import java.util.*;

public class Game {
    protected static int askNr(String nm) {
        int nr = 0;
        boolean correct = false;
        do {
            System.out.printf("Please enter %s:%n", nm);
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                nr = Integer.parseInt(s);
                if (nr < 0) {
                    System.out.println("This number is too small!");
                    correct = false;
                } else {
                    correct = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("You have to enter a number!");
                correct = false;
            }
        } while (!correct);
        return nr;
    }

    static int choosePath(String[] choices, String menu, String title) {
        boolean correct = false;
        int k = 0;

        do {
            System.out.println(title);
            for (int i = 0; i < choices.length; i++) {
                System.out.printf("   %-7d%s%n", (i + 1), choices[i]);
            }
//            System.out.printf("   %-7s%s%n", "Más", "Kilép");
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                k = Integer.parseInt(s);
                if (k > 0 && k <= choices.length) {
                    correct = true;
                } else {
                    k = 0;
                }
            } catch (NumberFormatException e) {
                k = 0;
            }
        } while (!correct);
        return k;
    }
    protected static int choosePath(String[] choices, String title) {
        boolean correct;
        int k = 0;

        do {
            System.out.println(title);
            for (int i = 0; i < choices.length; i++) {
                System.out.printf("   %-7d%s%n", (i + 1), choices[i]);
            }
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                k = Integer.parseInt(s);
                if (k > 0 && k <= choices.length) {
                    correct = true;
                } else {
                    System.out.println(Table.ANSI_RED + "You have to choose a number from the list!" + Table.ANSI_RESET);
                    correct = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(Table.ANSI_RED +"You have to enter a number!" + Table.ANSI_RESET);
                correct = false;
            }
        } while (!correct);
        return k;
    }




    public static int spin() {
        System.out.println("The croupier spins the wheel and flicks the ball. ");
        System.out.println("The wheel is spinning...");
        int winnerNumber = 0;
        for (int i = 0; i < 240000000; i++) {
            winnerNumber = (int) (Math.random()*37);
        }
        return winnerNumber;
    }

}
