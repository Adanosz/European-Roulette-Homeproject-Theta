package homeproject;

import java.util.*;

public class Game {
    protected static int askNr(String nm) {
        int nr = 0;
        boolean correct = false;
        do {
            System.out.printf("Kérem, adja meg %s:%n", nm);
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                nr = Integer.parseInt(s);
                if (nr < 0) {
                    System.out.println("Ez a szám sajnos túl kicsi!");
                    correct = false;
                } else {
                    correct = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sajnos mindenképpen meg kell adnia egy számot!");
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
            System.out.printf("   %-7s%s%n", "Más", "Kilép");
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
                    System.out.println("Sajnos mindenképpen a listáról kell megadnia egy számot !");
                    correct = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sajnos mindenképpen meg kell adnia egy számot!");
                correct = false;
            }
        } while (!correct);
        return k;
    }




    public static int spin() {
        return (int) (Math.random()*37);
    }

}
