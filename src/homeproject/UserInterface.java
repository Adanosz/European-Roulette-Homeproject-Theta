package homeproject;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public static int howManyPlayers() {
        boolean correct;
        Scanner sc;
        int howManyPlayer = 0;
        do {
            Hello.hello();
            try {
                sc = new Scanner(System.in);
                int number = sc.nextInt();
                if (number < 7 && number > 0) {
                    howManyPlayer = number;
                    correct = true;
                } else {
                    System.out.println(Table.ANSI_RED + "Please enter a number between 0 and 6!" + Table.ANSI_RESET);
                    correct = false;
                }
            } catch (InputMismatchException e) {
                System.out.println(Table.ANSI_RED + "Please enter a NUMBER between 0 and 6!!" + Table.ANSI_RESET);
                correct = false;
            }
        } while (!correct);
        return howManyPlayer;
    }

    public static ArrayList<Player> inGamePlayers(int HowManyPlayers) {
        ArrayList<Player> inGamePlayers = new ArrayList<>();
        if (HowManyPlayers == 1){
            Alone.alone();
            System.exit(0);
        } else {
            for (int i = 0; i <HowManyPlayers ; i++) {
                inGamePlayers.add(Player.addPlayer(inGamePlayers.size()));
            }
        }
        return inGamePlayers;
    }

}
