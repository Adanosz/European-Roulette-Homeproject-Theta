package homeproject;

public class Table {
    protected static void table () {
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("█ ┌---┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┬----┐ █");
        System.out.println("█ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 3  "+ANSI_RESET+"│ 6  │"+ANSI_RED_BACKGROUND+" 9  "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 12 "+ANSI_RESET+"│ 15 │"+ANSI_RED_BACKGROUND+" 18 "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 21 "+ANSI_RESET+"│ 24 │"+ANSI_RED_BACKGROUND+" 27 "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 30 "+ANSI_RESET+"│ 33 │"+ANSI_RED_BACKGROUND+" 36 "+ANSI_RESET+"│2to1│ █");
        System.out.println("█ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"├----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┤ █");
        System.out.println("█ │"+ANSI_GREEN_BACKGROUND+" 0 "+ANSI_RESET+"│ 2  │"+ANSI_RED_BACKGROUND+" 5  "+ANSI_RESET+"│ 8  │ 11 │"+ANSI_RED_BACKGROUND+" 14 "+ANSI_RESET+"│ 17 │ 20 │"+ANSI_RED_BACKGROUND+" 23 "+ANSI_RESET+"│ 26 │ 29 │"+ANSI_RED_BACKGROUND+" 32 "+ANSI_RESET+"│ 35 │2to1│ █");
        System.out.println("█ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"├----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┼----┤ █");
        System.out.println("█ │"+ANSI_GREEN_BACKGROUND+"   "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 1  "+ANSI_RESET+"│ 4  │"+ANSI_RED_BACKGROUND+" 7  "+ANSI_RESET+"│ 10 │ 13 │"+ANSI_RED_BACKGROUND+" 16 "+ANSI_RESET+"│"+ANSI_RED_BACKGROUND+" 19 "+ANSI_RESET+"│ 22 │"+ANSI_RED_BACKGROUND+" 25 "+ANSI_RESET+"│ 28 │ 31 │"+ANSI_RED_BACKGROUND+" 34 "+ANSI_RESET+"│2to1│ █");
        System.out.println("█ └---┼----┴----┴----┴----┼----┴----┴----┴----┼----┴----┴----┴----┼----┘ █");
        System.out.println("▀▀▀▀█ │       1st 12      │       2nd 12      │       3rd 12      │ █▀▀▀▀▀");
        System.out.println("    █ ├---------┬---------┼---------┬---------┼---------┬---------┤ █");
        System.out.println("    █ │ 1 to 18 │  Even   │" + ANSI_RED_BACKGROUND+"   RED   "+ANSI_RESET+"│"+ANSI_BLACK_BACKGROUND+"  BLACK  "+ANSI_RESET+"│   Odd   │19 to 36 │ █");
        System.out.println("    █ └---------┴---------┴---------┴---------┴---------┴---------┘ █");
        System.out.println("    ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42;1m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}
