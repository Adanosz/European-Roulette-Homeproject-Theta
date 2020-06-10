package homeproject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import homeproject.Game;
import homeproject.Table;
import homeproject.Alone;
import homeproject.Player;
import homeproject.*;

import static homeproject.Game.spin;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("players.txt");
        writer.print("");
        writer.close();
        Table.table();
//        ArrayList<Player> inGamePlayers = new ArrayList<>();
//        List<Integer[]> playerTips;
        do {
            Casino.croupier();
            int winnerNumber = spin();
            System.out.println(winnerNumber);
            Casino.getWhatYouDeserve();
            Casino.exit();
        } while (Casino.inGamePlayers.size() > 1);
    }
}
