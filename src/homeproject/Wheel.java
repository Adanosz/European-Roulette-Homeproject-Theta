package homeproject;

import java.util.ArrayList;
import java.util.List;

import static homeproject.Table.*;

public class Wheel {
    static String[] wp2 = new String[]{
            Table.ANSI_GREEN+" 0" + ANSI_RESET,  "28", Table.ANSI_RED+ " 9" + ANSI_RESET,
             "26",Table.ANSI_RED+ "30" + ANSI_RESET,"11", Table.ANSI_RED+ " 7" + ANSI_RESET,
            "20",Table.ANSI_RED+ "32" + ANSI_RESET, "17", Table.ANSI_RED+ " 5" + ANSI_RESET,
            "22",Table.ANSI_RED+ "34" + ANSI_RESET, "15", Table.ANSI_RED+ " 3" + ANSI_RESET,
            "24",Table.ANSI_RED+ "36" + ANSI_RESET, "13",  Table.ANSI_RED+ " 1" + ANSI_RESET ,
            Table.ANSI_RED+"27" + ANSI_RESET, "10", Table.ANSI_RED+"25" + ANSI_RESET, "29",
            Table.ANSI_RED+ "12" + ANSI_RESET, " 8",Table.ANSI_RED+ "19" + ANSI_RESET, "31",
            Table.ANSI_RED+ "18" + ANSI_RESET, " 6",Table.ANSI_RED+ "21" + ANSI_RESET, "33",
            Table.ANSI_RED+ "16" + ANSI_RESET, " 4",Table.ANSI_RED+ "23" + ANSI_RESET, "35",
            Table.ANSI_RED+ "14" + ANSI_RESET, " 2"  };

    static String[] wp = new String[]{
            Table.ANSI_GREEN+" 0" + ANSI_RESET,  "28", Table.ANSI_RED+ " 9" + ANSI_RESET,
            "26",Table.ANSI_RED+ "30" + ANSI_RESET,"11", Table.ANSI_RED+ " 7" + ANSI_RESET,
            "20",Table.ANSI_RED+ "32" + ANSI_RESET, "17", Table.ANSI_RED+ " 5" + ANSI_RESET,
            "22",Table.ANSI_RED+ "34" + ANSI_RESET, "15", Table.ANSI_RED+ " 3" + ANSI_RESET,
            "24",Table.ANSI_RED+ "36" + ANSI_RESET, "13",  Table.ANSI_RED+ " 1" + ANSI_RESET ,
            Table.ANSI_RED+"27" + ANSI_RESET, "10", Table.ANSI_RED+"25" + ANSI_RESET, "29",
            Table.ANSI_RED+ "12" + ANSI_RESET, " 8",Table.ANSI_RED+ "19" + ANSI_RESET, "31",
            Table.ANSI_RED+ "18" + ANSI_RESET, " 6",Table.ANSI_RED+ "21" + ANSI_RESET, "33",
            Table.ANSI_RED+ "16" + ANSI_RESET, " 4",Table.ANSI_RED+ "23" + ANSI_RESET, "35",
            Table.ANSI_RED+ "14" + ANSI_RESET, " 2"  };
    static int[] wpValue = new int[] {0, 28, 9, 26, 30, 11, 7, 20, 32, 17, 5, 22, 34, 15, 3, 24, 36, 13, 1, 27, 10, 25, 29, 12, 8, 19, 31, 18, 6,21, 33, 16, 4, 23, 35, 14, 2};

    static String gap = "  ";
    static String gapUpper = " ";
    static int num = ((int) (Math.random()*37) );

    public static int spinTheWheel() {
        System.out.println("The croupier spins the wheel and flicks the ball. ");
        Thread t = new Thread();
        int winnerNumber = 0;
        int count = 0;
        winnerNumber = wpValue[num];

            while (count != 1) {
                try {
                    int k = 0;
                    int slow = 25;
                    for (int j = 0; j < (((37* 5) + num)+1); j++) {
                        if (k == 37) {
                            k = 0;
                        }
                        if (j%37 == 21) {
                            slow += 25;
                        }
                        if (j > ((37*5) + (num-10))) {
                            slow += 30;
                        }
                        Thread.sleep(slow);
                        if (k > 0) {
                            wp[k - 1] = wp2[k - 1];
                        }
                        if (k == 0) {
                            wp[36] = wp2[36];
                        }
                        wp[k] = (Table.ANSI_WHITE_BACKGROUND +Table.ANSI_BLACK+ wp[k] + ANSI_RESET);
                        clear();
                        rouletteWheel();
                        k++;

                    }
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }


        t.setDaemon(true);
        t.start();
    return winnerNumber;
    }
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void rouletteWheel() {
        System.out.println("The croupier spins the wheel and flicks the ball... ");
        System.out.println("       ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.print("     ▄▀ "+ wp[1]+gapUpper + wp[2]+gap + wp[3]+gap + wp[4]+gap + wp[5]+gapUpper + wp[6]+gap + wp[7] + "  ▀▄\n");
        System.out.println("   ▄▀"+ wp[0] + "                          " + wp[8] +" ▀▄" );
        System.out.println(" ▄▀"+ wp[36] +"                              " + wp[9] +  " ▀▄");
        System.out.print("█ "+wp[35] + "                                 " + wp[10] + " █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n");
        System.out.print("█ "+wp[34] + "                                 " + wp[11] + " █ ┌---┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┐ █\n");
        System.out.print("█ "+wp[33] + "                                 " + wp[12] + " █ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 3  "+ANSI_RESET+"│ 6  │"+ANSI_RED_BACKGROUND+" 9  "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 12 "+ANSI_RESET+"│ 15 │"+ANSI_RED_BACKGROUND+" 18 "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 21 "+ANSI_RESET+"│ 24 │"+ANSI_RED_BACKGROUND+" 27 "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 30 "+ANSI_RESET+"│ 33 │"+ANSI_RED_BACKGROUND+" 36 "+ANSI_RESET+"│2to1│ █\n");
        System.out.print("█ "+wp[32] + "                                 " + wp[13] + " █ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"├----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┤ █\n");
        System.out.print("█ "+wp[31] + "                                 " + wp[14] + " █ │"+ANSI_GREEN_BACKGROUND+" 0 "+ANSI_RESET+"│ 2  │"+ANSI_RED_BACKGROUND+" 5  "+ANSI_RESET+"│ 8  │ 11 │"+ANSI_RED_BACKGROUND+" 14 "+ANSI_RESET+"│ 17 │ 20 │"+ANSI_RED_BACKGROUND+" 23 "+ANSI_RESET+"│ 26 │ 29 │"+ANSI_RED_BACKGROUND+" 32 "+ANSI_RESET+"│ 35 │2to1│ █\n");
        System.out.print("█ "+wp[30] + "                                 " + wp[15] + " █ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"├----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┤ █\n");
        System.out.print("█ "+wp[29] + "                                 " + wp[16] + " █ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 1  "+ANSI_RESET+"│ 4  │"+ANSI_RED_BACKGROUND+" 7  "+ANSI_RESET+"│ 10 │ 13 │"+ANSI_RED_BACKGROUND+" 16 "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 19 "+ANSI_RESET+"│ 22 │"+ANSI_RED_BACKGROUND+" 25 "+ANSI_RESET+"│ 28 │ 31 │"+ANSI_RED_BACKGROUND+" 34 "+ANSI_RESET+"│2to1│ █\n");
        System.out.print("█ "+wp[28] + "                                 " + wp[17] + " █ └---┼----┴----┴----┴----┼----┴----┴----┴----┼----┴----┴----┴----┼----┘ █\n");
        System.out.println(" ▀▄ "+ wp[27] +"                             " + wp[18] +" ▄▀▀▀▀▀█ │       1st 12      │       2nd 12      │       3rd 12      │ █▀▀▀▀▀");
        System.out.println("   ▀▄ "+ wp[26] + "                         " + wp[19] +" ▄▀      █ ├---------┬---------┼---------┬---------┼---------┬---------┤ █");
        System.out.print("     ▀▄  "+ wp[25]+gap + wp[24]+gap + wp[23]+gap+" " + wp[22]+gap + wp[21]+gap + wp[20]+ "  ▄▀        █ │ 1 to 18 │  Even   │" + ANSI_RED_BACKGROUND+"   RED   "+ANSI_RESET+"│"+ANSI_BLACK_BACKGROUND+"  BLACK  "+ANSI_RESET+"│   Odd   │19 to 36 │ █\n");
        System.out.println("       ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀          █ └---------┴---------┴---------┴---------┴---------┴---------┘ █");
        System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    }

    public static void winnerNumberWheel() {
        rouletteWheel();
        wp[num] = (Table.ANSI_WHITE_BACKGROUND +Table.ANSI_BLACK+ wp[num] + ANSI_RESET);
    }
}