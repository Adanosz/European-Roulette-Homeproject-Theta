package homeproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private String name;
    private int money;
    private int betValue;
    private int betType;
    private int betForInType;
    private int round;
    private int lostMoney;
    private int wonMoney;
    private boolean win;
    private int betMultiplier;

    public Player(String name, int money, int betValue, int betType, int betForInType, int betMultiplier, int round, int lostMoney, int wonMoney, boolean win) {
        this.name = name;
        this.money = money;
        this.betValue = betValue;
        this.betType = betType;
        this.betForInType = betForInType;
        this.betMultiplier = betMultiplier;
        this.round = round;
        this.lostMoney = lostMoney;
        this.wonMoney = wonMoney;
        this.win = win;
    }

    public static Player addPlayer (int size) {

        System.out.println("What is Player" + (size+1) + " name?");
        String name = null;
        boolean correct = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                name = sc.nextLine();
                if (name != null) {
                    correct = true;
                } else {
                    System.out.println(Table.ANSI_RED + "You must enter something..." + Table.ANSI_RESET);
                    correct = false;
                }
            } catch (InputMismatchException e) {
                System.out.println(Table.ANSI_RED + "You must enter something..." + Table.ANSI_RESET);
                correct = false;
            }
        } while (!correct);
        System.out.println(Table.ANSI_BLUE + name + Table.ANSI_RESET + ". You have 1000 $. Good luck! Have a good game! \n");
        return new Player(name, 1000, 0, 0, 0, 0,0, 0, 0, false);
    }


    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        if (isWin()) {
            return "Round" + round + ": " +
                    "Congratulation " + Table.ANSI_BLUE + name + Table.ANSI_RESET + "! You won! " +
                    " You have " + money +
                    "$ " + ", already lost " + Table.ANSI_RED + lostMoney +
                    "$" + Table.ANSI_RESET + " and won " + Table.ANSI_GREEN + wonMoney +
                    "$" + Table.ANSI_RESET;
        } else {
            return "Round" + round + ": " +
                    "Sorry " + Table.ANSI_BLUE + name + Table.ANSI_RESET + "! You lost this round! Better luck next time!" +
                    " You have " + money +
                    "$ " + ", already lost " + Table.ANSI_RED + lostMoney +
                    "$" + Table.ANSI_RESET + " and won " + Table.ANSI_GREEN + wonMoney +
                    "$" + Table.ANSI_RESET;
        }
    }

    public int getBetMultiplier() {
        return betMultiplier;
    }

    public void setBetMultiplier(int betMultiplier) {
        this.betMultiplier = betMultiplier;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int setBetForInType(int betForInType) {
        this.betForInType = betForInType;
        return betForInType;
    }

    public boolean isWin() {
        return win;
    }

    public String getName() {
        return name;
    }

    public int setBetType(int betType) {
        this.betType = betType;
        return betType;
    }

    public int setBetValue(int betValue) {
        this.betValue = betValue;
        return betValue;
    }

    public int setLostMoney(int lostMoney) {
        this.lostMoney = lostMoney;
        return lostMoney;
    }

    public int setRound(int round) {
        this.round = round;
        return round;
    }

    public int setWonMoney(int wonMoney) {
        this.wonMoney = wonMoney;
        return wonMoney;
    }

    public int getBetForInType() {
        return betForInType;
    }

    public int getBetType() {
        return betType;
    }

    public int getBetValue() {
        return betValue;
    }

    public int getLostMoney() {
        return lostMoney;
    }

    public int getMoney() {
        return money;
    }

    public int getRound() {
        return round;
    }

    public int getWonMoney() {
        return wonMoney;
    }
}