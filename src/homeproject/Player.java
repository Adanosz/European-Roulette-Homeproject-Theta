package homeproject;

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
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
//        System.out.println(Table.ANSI_CYAN_BACKGROUND + name + Table.ANSI_RESET + ". How much money do you have?");
//        int money = sc.nextInt();
        System.out.println(Table.ANSI_CYAN_BACKGROUND + name + Table.ANSI_RESET + ". You have 1000 $. Good luck! Have a good game!");
        return new Player(name, 1000, 0, 0, 0, 0,0, 0, 0, false);
    }


    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", betValue=" + betValue +
                ", betType=" + betType +
                ", betForInType=" + betForInType +
                ", round=" + round +
                ", lostMoney=" + lostMoney +
                ", wonMoney=" + wonMoney +
                ", win=" + win +
                ", betMultiplier=" + betMultiplier +
                '}';
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