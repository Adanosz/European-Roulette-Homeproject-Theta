package homeproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import homeproject.Game;
import homeproject.Table;
import homeproject.Alone;
import homeproject.Player;
import homeproject.*;

public class Main {
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("players.txt");
        writer.print("");
        writer.close();
        clear();
        Table.table();
        do {
            Casino.croupier();
            Casino.clear();
            Table.table();
            int winnerNumber = Wheel.spinTheWheel();
            clear();
            Wheel.winnerNumberWheel();
            System.out.println("\n And the winner number is... \n\n              "+ Table.ANSI_YELLOW + "\u001B[1m" +  winnerNumber + Table.ANSI_RESET + "\n\n");
            Casino.getWhatYouDeserve(winnerNumber);
            Casino.exit();
        } while (Casino.inGamePlayers.size() > 1);
    }
}
