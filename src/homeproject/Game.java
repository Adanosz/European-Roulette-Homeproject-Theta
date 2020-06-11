package homeproject;

import java.util.*;

public class Game {
    protected static int askNr() {
        int nr = 0;
        boolean correct;
        do {
            System.out.printf("Please enter %s:%n", "any number from 1-36");
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
        int k;

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
//    public static int spin() {
//        System.out.println("The croupier spins the wheel and flicks the ball. ");
//        System.out.print("The wheel is spinning");
//        Thread t = new Thread();
//        int count = 0;
//        int winnerNumber = 0;
//        while (count !=3) {
//            try {
//                Thread.sleep(1500);;
//                System.out.print(".");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            count++;
//            if (count == 3) {
//                winnerNumber = (int) (Math.random()*37);
//            }
//        }
//        t.setDaemon(true);
//        t.start();
//        return winnerNumber;
//    }
}
