package homeproject;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Casino {
    private static int round = 0;
    static ArrayList<Player> inGamePlayers = UserInterface.inGamePlayers(UserInterface.howManyPlayers());
    static List<Integer[]> playerTips = new ArrayList<>();
    static void  clear () {
//        for (int i = 0; i <35 ; i++) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
//        }
    }

    public static void croupier() {
        int playerIndex = 0;
        do {
            System.out.println(Table.ANSI_CYAN_BACKGROUND + inGamePlayers.get(playerIndex).getName() + Table.ANSI_RESET + ". How much money do you bet?");
            int betValue = 0;
            boolean correct = false;
            round++;
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    if (number > 0 && number < inGamePlayers.get(playerIndex).getMoney()) {
                        betValue = number;
                        correct = true;
                    } else {
                        System.out.println(inGamePlayers.get(playerIndex).getName() + Table.ANSI_RED + " You have " + inGamePlayers.get(playerIndex).getMoney() + "$, so you can't bet for " + number + "$..." + Table.ANSI_RESET);
                        correct = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(inGamePlayers.get(playerIndex).getName() + Table.ANSI_RED + " Your input was not a number. Please give only number values..." + Table.ANSI_RESET);
                    correct = false;
                }
            } while (!correct);

            Table.table();
            inGamePlayers.get(playerIndex).setBetValue(betValue);
            String[] liveMain = {"Számra", "Függőleges párra", "Vízszintes párra",
                    "Oszlopra", "Négyesre", "Sorpárra", "Sorra", "Tucatra", "Magasra-alacsonyra",
                    "Páros-páratlanra", "Színre"}; //11
            int path = Game.choosePath(liveMain, "a tétek menüjéből", Table.ANSI_CYAN_BACKGROUND + inGamePlayers.get(playerIndex).getName() + Table.ANSI_RESET + ". Mire kíván fogadni?");
            inGamePlayers.get(playerIndex).setBetType(path);
            clear();
            Table.table();


            switch (path) {
                case 1:
                    int num;
                    do {
                        num = Game.askNr("a kívánt számot 0 és 36 között");
                        if (num > 36) {
                            System.out.println("Ilyen szám nincs a táblán!");
                        }
                        inGamePlayers.get(playerIndex).setBetForInType(num);
                    } while (num > 36);

                    break;
                case 2:
                    String[] hspl = {"1-2", "2-3", "4-5", "5-6", "7-8", "8-9", "10-11",
                            "11-12", "13-14", "14-15", "16-17", "17-18", "19-20",
                            "20-21", "22-23", "23-24", "25-26", "26-27", "28-29",
                            "29-30", "31-32", "32-33", "34-35", "35-36"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(hspl, "Melyik függőleges párra tesz?"));
                    break;
                case 3:
                    String[] vspl = {"1-4", "2-5", "3-6", "4-7", "5-8", "6-9", "7-10",
                            "8-11", "9-12", "10-13", "11-14", "12-15", "13-16", "14-17",
                            "15-18", "16-19", "17-20", "18-21", "19-22", "20-23",
                            "21-24", "22-25", "23-26", "24-27", "25-28", "26-29",
                            "27-30", "28-31", "29-32", "30-33", "31-34", "32-35", "33-36"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(vspl, "Melyik vízszintes párra tesz?"));

                    break;
                case 4:
                    String[] tri = {"1--3", "4--6", "7--9", "10--12",
                            "13--15", "16--18", "19--21", "22--24", "25--27", "28--30",
                            "31--33", "34--36", "0-1-2", "0-2-3"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(tri, "Melyik oszlopra tesz?"));
                    break;
                case 5:
                    String[] four = {"1-2-4-5", "2-3-5-6", "4-5-7-8", "5-6-8-9", "7-8-10-11",
                            "8-9-11-12", "10-11-13-14", "11-12-14-15", "13-14-16-17", "14-15-17-18", "16-17-19-20", "17-18-20-21",
                            "19-20-22-23", "20-21-23-24", "22-23-25-26", "23-24-26-27", "25-26-28-29", "26-27-29-30",
                            "28-29-31-32", "29-30-32-33", "31-32-34-35", "32-33-35-36", "0-1-2-3"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(four, "Melyik négyesre tesz?"));
                    break;
                case 6:
                    String[] six = {"1--6", "4--9", "7--12", "10--15", "13--18",
                            "16--21", "19--24", "22--27", "25--30", "28--33", "31--36"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(six, "Melyik sorpárra tesz?"));
                    break;
                case 7:
                    String[] col = {"Felső", "Közép", "Alsó"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(col, "Melyik sorra tesz?"));
                    break;
                case 8:
                    String[] th = {"1--12", "13--24", "25--36"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(th, "Melyik tucatra tesz?"));
                    break;
                case 9:
                    String[] ha = {"1--18", "19--36"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(ha, "Magasra vagy alacsonyra tesz?"));
                    break;
                case 10:
                    String[] nu = {"Páratlan", "Páros"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(nu, "Párosra vagy páratlanra tesz?"));
                    break;
                case 11:
                    String[] clr = {"Piros", "Fekete"};
                    inGamePlayers.get(playerIndex).setBetForInType(Game.choosePath(clr, "Pirosra vagy feketére tesz?"));
                    break;
                default:
                    break;
            }
            playerTips.add(new Integer[]{inGamePlayers.get(playerIndex).getBetType(), inGamePlayers.get(playerIndex).getBetForInType()});
            Win.betMultiplyer(inGamePlayers);
            inGamePlayers.get(playerIndex).setRound(round);
            playerIndex++;
            clear();
        } while (playerIndex < inGamePlayers.size());
    }


    public static void exit () {
        int counter = -1;
        int playerCounter = inGamePlayers.size()-1;
        while ((counter < inGamePlayers.size()-1) /*&& (playerCounter > 0)*/){
            System.out.println("ingameplayers: " + inGamePlayers.size());
            System.out.println("counter: " + counter);
            System.out.println(inGamePlayers.get(playerCounter).getName() + ". Do you want to exit?");
            System.out.println("1.: Yes");
            System.out.println("Else: No");
            Scanner sc = new Scanner(System.in);
            String vote = sc.next();
            if (vote.equals("1")) {
                BufferedWriter bw = null;
                try {
                    String mycontent = inGamePlayers.get(playerCounter).toString();
                    File file = new File("players.txt");

                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fw = new FileWriter(file, true);
                    bw = new BufferedWriter(fw);
                    bw.append(mycontent);
                    bw.newLine();
                    System.out.println("File written Successfully");
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                finally
                {
                    try{
                        if(bw!=null)
                            bw.close();
                    }catch(Exception ex){
                        System.out.println("Error in closing the BufferedWriter"+ex);
                    }
                }
                inGamePlayers.remove(playerCounter);
                if (playerCounter>0)
                    playerCounter--;
            } else {
                playerCounter--;
                counter++;
            }
        }
    }

    public static void getWhatYouDeserve() {
        for (int j = 0; j < Win.win(21).size(); j++) {
            for (int i = 0; i < inGamePlayers.size(); i++) {
                System.out.println(Arrays.equals(Win.win(21).get(i), playerTips.get(i)));
                if (Arrays.equals(Win.win(21).get(j), playerTips.get(i))) {
                    inGamePlayers.get(i).setWin(true);
                    inGamePlayers.get(i).setWonMoney(inGamePlayers.get(i).getWonMoney()+(inGamePlayers.get(i).getBetValue() * inGamePlayers.get(i).getBetMultiplier()));
                }
            }
        }
        int z = 0;
        do {
            if (inGamePlayers.get(z).isWin()) {
                inGamePlayers.get(z).setMoney(inGamePlayers.get(z).getMoney() + ((inGamePlayers.get(z).getBetValue()) * inGamePlayers.get(z).getBetMultiplier()));
            } else {
                inGamePlayers.get(z).setMoney(inGamePlayers.get(z).getMoney() - inGamePlayers.get(z).getBetValue());
                inGamePlayers.get(z).setLostMoney(inGamePlayers.get(z).getLostMoney() - (inGamePlayers.get(z).getBetValue()));
            }
            z++;
        }
        while (z < inGamePlayers.size());
        for (Player inGamePlayer : inGamePlayers) {
            System.out.println(inGamePlayer.toString());
        }
    }
}
