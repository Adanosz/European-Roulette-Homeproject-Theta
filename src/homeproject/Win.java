package homeproject;

import java.util.ArrayList;
import java.util.List;

public class Win {

    public static void betMultiplyer(ArrayList<Player> inGamePlayers) {
//        ArrayList<Player> inGamePlayers = UserInterface.inGamePlayers(UserInterface.howManyPlayers());
        int p = 0;
        do {
            int betTypeValue;
            switch (inGamePlayers.get(p).getBetType()) {
                case 1:
                    betTypeValue = 35;
                    break;
                case 2:
                case 3:
                    betTypeValue = 17;
                    break;
                case 4:
                    betTypeValue = 11;
                    break;
                case 5:
                    betTypeValue = 8;
                    break;
                case 6:
                    betTypeValue = 5;
                    break;
                case 7:
                    betTypeValue = 2;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    betTypeValue = 1;
            }
            inGamePlayers.get(p).setBetMultiplier(betTypeValue);
            p++;
        } while (p < inGamePlayers.size());
    }

    public static List<Integer[]> winnerNumberCases (int winnerNumber) {
        List<Integer[]> win = new ArrayList<>();

        switch (winnerNumber) {
            case 0:
                win.add(new Integer[]{1, 0});
                win.add(new Integer[]{4, 13});
                win.add(new Integer[]{4, 14});
                win.add(new Integer[]{5, 23});
                win.add(new Integer[]{10, 2});
                break;
            case 1:
                win.add(new Integer[]{1, 1});
                win.add(new Integer[]{2, 1});
                win.add(new Integer[]{3, 1});
                win.add(new Integer[]{4, 1});
                win.add(new Integer[]{4, 13});
                win.add(new Integer[]{5, 1});
                win.add(new Integer[]{5, 23});
                win.add(new Integer[]{6, 1});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 2:
                win.add(new Integer[]{1, 2});
                win.add(new Integer[]{2, 1});
                win.add(new Integer[]{2, 2});
                win.add(new Integer[]{3, 2});
                win.add(new Integer[]{4, 1});
                win.add(new Integer[]{4, 13});
                win.add(new Integer[]{4, 14});
                win.add(new Integer[]{5, 1});
                win.add(new Integer[]{5, 2});
                win.add(new Integer[]{5, 23});
                win.add(new Integer[]{6, 1});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 3:
                win.add(new Integer[]{1, 3});
                win.add(new Integer[]{2, 2});
                win.add(new Integer[]{3, 3});
                win.add(new Integer[]{4, 1});
                win.add(new Integer[]{4, 14});
                win.add(new Integer[]{5, 2});
                win.add(new Integer[]{5, 23});
                win.add(new Integer[]{6, 1});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 4:
                win.add(new Integer[]{1, 4});
                win.add(new Integer[]{2, 3});
                win.add(new Integer[]{3, 1});
                win.add(new Integer[]{3, 4});
                win.add(new Integer[]{4, 2});
                win.add(new Integer[]{5, 1});
                win.add(new Integer[]{5, 3});
                win.add(new Integer[]{6, 1});
                win.add(new Integer[]{6, 2});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10,2});
                win.add(new Integer[]{11, 2});
                break;
            case 5:
                win.add(new Integer[]{1, 5});
                win.add(new Integer[]{2, 3});
                win.add(new Integer[]{2, 4});
                win.add(new Integer[]{3, 2});
                win.add(new Integer[]{3, 5});
                win.add(new Integer[]{4, 2});
                win.add(new Integer[]{5, 1});
                win.add(new Integer[]{5, 2});
                win.add(new Integer[]{5, 3});
                win.add(new Integer[]{5, 4});
                win.add(new Integer[]{6, 1});
                win.add(new Integer[]{6, 2});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 6:
                win.add(new Integer[]{1, 6});
                win.add(new Integer[]{2, 4});
                win.add(new Integer[]{3, 3});
                win.add(new Integer[]{3, 6});
                win.add(new Integer[]{4, 2});
                win.add(new Integer[]{5, 2});
                win.add(new Integer[]{5, 4});
                win.add(new Integer[]{6, 1});
                win.add(new Integer[]{6, 2});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 7:
                win.add(new Integer[]{1, 7});
                win.add(new Integer[]{2, 5});
                win.add(new Integer[]{3, 4});
                win.add(new Integer[]{3, 7});
                win.add(new Integer[]{4, 3});
                win.add(new Integer[]{5, 3});
                win.add(new Integer[]{5, 5});
                win.add(new Integer[]{6, 2});
                win.add(new Integer[]{6, 3});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 8:
                win.add(new Integer[]{1, 8});
                win.add(new Integer[]{2, 5});
                win.add(new Integer[]{2, 6});
                win.add(new Integer[]{3, 5});
                win.add(new Integer[]{3, 8});
                win.add(new Integer[]{4, 3});
                win.add(new Integer[]{5, 3});
                win.add(new Integer[]{5, 4});
                win.add(new Integer[]{5, 5});
                win.add(new Integer[]{5, 6});
                win.add(new Integer[]{6, 2});
                win.add(new Integer[]{6, 3});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 9:
                win.add(new Integer[]{1, 9});
                win.add(new Integer[]{2, 6});
                win.add(new Integer[]{3, 6});
                win.add(new Integer[]{3, 9});
                win.add(new Integer[]{4, 3});
                win.add(new Integer[]{5, 4});
                win.add(new Integer[]{5, 6});
                win.add(new Integer[]{6, 2});
                win.add(new Integer[]{6, 3});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 10:
                win.add(new Integer[]{1, 10});
                win.add(new Integer[]{2, 7});
                win.add(new Integer[]{3, 7});
                win.add(new Integer[]{3, 10});
                win.add(new Integer[]{4, 4});
                win.add(new Integer[]{5, 5});
                win.add(new Integer[]{5, 7});
                win.add(new Integer[]{6, 3});
                win.add(new Integer[]{6, 4});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 11:
                win.add(new Integer[]{1, 11});
                win.add(new Integer[]{2, 7});
                win.add(new Integer[]{2, 8});
                win.add(new Integer[]{3, 8});
                win.add(new Integer[]{3, 11});
                win.add(new Integer[]{4, 4});
                win.add(new Integer[]{5, 5});
                win.add(new Integer[]{5, 6});
                win.add(new Integer[]{5, 7});
                win.add(new Integer[]{5, 8});
                win.add(new Integer[]{6, 3});
                win.add(new Integer[]{6, 4});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 12:
                win.add(new Integer[]{1, 12});
                win.add(new Integer[]{2, 8});
                win.add(new Integer[]{3, 9});
                win.add(new Integer[]{3, 12});
                win.add(new Integer[]{4, 4});
                win.add(new Integer[]{5, 6});
                win.add(new Integer[]{5, 8});
                win.add(new Integer[]{6, 3});
                win.add(new Integer[]{6, 4});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 1});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 13:
                win.add(new Integer[]{1, 13});
                win.add(new Integer[]{2, 9});
                win.add(new Integer[]{3, 10});
                win.add(new Integer[]{3, 13});
                win.add(new Integer[]{4, 5});
                win.add(new Integer[]{5, 7});
                win.add(new Integer[]{5, 9});
                win.add(new Integer[]{6, 4});
                win.add(new Integer[]{6, 5});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 14:
                win.add(new Integer[]{1, 14});
                win.add(new Integer[]{2, 9});
                win.add(new Integer[]{2, 10});
                win.add(new Integer[]{3, 11});
                win.add(new Integer[]{3, 14});
                win.add(new Integer[]{4, 5});
                win.add(new Integer[]{5, 7});
                win.add(new Integer[]{5, 8});
                win.add(new Integer[]{5, 9});
                win.add(new Integer[]{5, 10});
                win.add(new Integer[]{6, 4});
                win.add(new Integer[]{6, 5});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 15:
                win.add(new Integer[]{1, 15});
                win.add(new Integer[]{2, 10});
                win.add(new Integer[]{3, 12});
                win.add(new Integer[]{3, 15});
                win.add(new Integer[]{4, 5});
                win.add(new Integer[]{5, 8});
                win.add(new Integer[]{5, 10});
                win.add(new Integer[]{6, 4});
                win.add(new Integer[]{6, 5});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 16:
                win.add(new Integer[]{1, 16});
                win.add(new Integer[]{2, 11});
                win.add(new Integer[]{3, 13});
                win.add(new Integer[]{3, 16});
                win.add(new Integer[]{4, 6});
                win.add(new Integer[]{5, 9});
                win.add(new Integer[]{5, 11});
                win.add(new Integer[]{6, 5});
                win.add(new Integer[]{6, 6});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 17:
                win.add(new Integer[]{1, 17});
                win.add(new Integer[]{2, 11});
                win.add(new Integer[]{2, 12});
                win.add(new Integer[]{3, 14});
                win.add(new Integer[]{3, 17});
                win.add(new Integer[]{4, 6});
                win.add(new Integer[]{5, 9});
                win.add(new Integer[]{5, 10});
                win.add(new Integer[]{5, 11});
                win.add(new Integer[]{5, 12});
                win.add(new Integer[]{6, 5});
                win.add(new Integer[]{6, 6});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 18:
                win.add(new Integer[]{1, 18});
                win.add(new Integer[]{2, 12});
                win.add(new Integer[]{3, 15});
                win.add(new Integer[]{3, 18});
                win.add(new Integer[]{4, 6});
                win.add(new Integer[]{5, 10});
                win.add(new Integer[]{5, 12});
                win.add(new Integer[]{6, 5});
                win.add(new Integer[]{6, 6});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 1});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 19:
                win.add(new Integer[]{1, 19});
                win.add(new Integer[]{2, 13});
                win.add(new Integer[]{3, 16});
                win.add(new Integer[]{3, 19});
                win.add(new Integer[]{4, 7});
                win.add(new Integer[]{5, 11});
                win.add(new Integer[]{5, 13});
                win.add(new Integer[]{6, 6});
                win.add(new Integer[]{6, 7});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 20:
                win.add(new Integer[]{1, 20});
                win.add(new Integer[]{2, 13});
                win.add(new Integer[]{2, 14});
                win.add(new Integer[]{3, 17});
                win.add(new Integer[]{3, 20});
                win.add(new Integer[]{4, 7});
                win.add(new Integer[]{5, 11});
                win.add(new Integer[]{5, 12});
                win.add(new Integer[]{5, 13});
                win.add(new Integer[]{5, 14});
                win.add(new Integer[]{6, 6});
                win.add(new Integer[]{6, 7});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 21:
                win.add(new Integer[]{1, 21});
                win.add(new Integer[]{2, 14});
                win.add(new Integer[]{3, 18});
                win.add(new Integer[]{3, 21});
                win.add(new Integer[]{4, 7});
                win.add(new Integer[]{5, 12});
                win.add(new Integer[]{5, 14});
                win.add(new Integer[]{6, 6});
                win.add(new Integer[]{6, 7});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 22:
                win.add(new Integer[]{1, 22});
                win.add(new Integer[]{2, 15});
                win.add(new Integer[]{3, 19});
                win.add(new Integer[]{3, 22});
                win.add(new Integer[]{4, 8});
                win.add(new Integer[]{5, 13});
                win.add(new Integer[]{5, 15});
                win.add(new Integer[]{6, 7});
                win.add(new Integer[]{6, 8});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 23:
                win.add(new Integer[]{1, 23});
                win.add(new Integer[]{2, 15});
                win.add(new Integer[]{2, 16});
                win.add(new Integer[]{3, 20});
                win.add(new Integer[]{3, 23});
                win.add(new Integer[]{4, 8});
                win.add(new Integer[]{5, 13});
                win.add(new Integer[]{5, 14});
                win.add(new Integer[]{5, 15});
                win.add(new Integer[]{5, 6});
                win.add(new Integer[]{6, 7});
                win.add(new Integer[]{6, 8});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 24:
                win.add(new Integer[]{1, 24});
                win.add(new Integer[]{2, 16});
                win.add(new Integer[]{3, 21});
                win.add(new Integer[]{3, 24});
                win.add(new Integer[]{4, 8});
                win.add(new Integer[]{5, 14});
                win.add(new Integer[]{5, 16});
                win.add(new Integer[]{6, 7});
                win.add(new Integer[]{6, 8});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 2});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 25:
                win.add(new Integer[]{1, 25});
                win.add(new Integer[]{2, 17});
                win.add(new Integer[]{3, 22});
                win.add(new Integer[]{3, 25});
                win.add(new Integer[]{4, 9});
                win.add(new Integer[]{5, 15});
                win.add(new Integer[]{5, 17});
                win.add(new Integer[]{6, 8});
                win.add(new Integer[]{6, 9});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 26:
                win.add(new Integer[]{1, 26});
                win.add(new Integer[]{2, 17});
                win.add(new Integer[]{2, 18});
                win.add(new Integer[]{3, 23});
                win.add(new Integer[]{3, 26});
                win.add(new Integer[]{4, 9});
                win.add(new Integer[]{5, 15});
                win.add(new Integer[]{5, 16});
                win.add(new Integer[]{5, 17});
                win.add(new Integer[]{5, 18});
                win.add(new Integer[]{6, 8});
                win.add(new Integer[]{6, 9});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 27:
                win.add(new Integer[]{1, 27});
                win.add(new Integer[]{2, 18});
                win.add(new Integer[]{3, 24});
                win.add(new Integer[]{3, 27});
                win.add(new Integer[]{4, 9});
                win.add(new Integer[]{5, 16});
                win.add(new Integer[]{5, 18});
                win.add(new Integer[]{6, 8});
                win.add(new Integer[]{6, 9});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 1});
                break;
            case 28:
                win.add(new Integer[]{1, 28});
                win.add(new Integer[]{2, 19});
                win.add(new Integer[]{3, 25});
                win.add(new Integer[]{3, 28});
                win.add(new Integer[]{4, 10});
                win.add(new Integer[]{5, 17});
                win.add(new Integer[]{5, 19});
                win.add(new Integer[]{6, 9});
                win.add(new Integer[]{6, 10});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 2});
                break;
            case 29:
                win.add(new Integer[]{1, 29});
                win.add(new Integer[]{2, 19});
                win.add(new Integer[]{2, 20});
                win.add(new Integer[]{3, 26});
                win.add(new Integer[]{3, 29});
                win.add(new Integer[]{4, 10});
                win.add(new Integer[]{5, 17});
                win.add(new Integer[]{5, 18});
                win.add(new Integer[]{5, 19});
                win.add(new Integer[]{5, 20});
                win.add(new Integer[]{6, 9});
                win.add(new Integer[]{6, 10});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 30:
                win.add(new Integer[]{1, 30});
                win.add(new Integer[]{2, 20});
                win.add(new Integer[]{3, 27});
                win.add(new Integer[]{3, 30});
                win.add(new Integer[]{4, 10});
                win.add(new Integer[]{5, 18});
                win.add(new Integer[]{5, 20});
                win.add(new Integer[]{6, 9});
                win.add(new Integer[]{6, 10});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 31:
                win.add(new Integer[]{1, 31});
                win.add(new Integer[]{2, 21});
                win.add(new Integer[]{3, 28});
                win.add(new Integer[]{3, 31});
                win.add(new Integer[]{4, 11});
                win.add(new Integer[]{5, 19});
                win.add(new Integer[]{5, 21});
                win.add(new Integer[]{6, 10});
                win.add(new Integer[]{6, 11});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 32:
                win.add(new Integer[]{1, 32});
                win.add(new Integer[]{2, 21});
                win.add(new Integer[]{2, 22});
                win.add(new Integer[]{3, 29});
                win.add(new Integer[]{3, 32});
                win.add(new Integer[]{4, 11});
                win.add(new Integer[]{5, 19});
                win.add(new Integer[]{5, 20});
                win.add(new Integer[]{5, 21});
                win.add(new Integer[]{5, 22});
                win.add(new Integer[]{6, 10});
                win.add(new Integer[]{6, 11});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 33:
                win.add(new Integer[]{1, 33});
                win.add(new Integer[]{2, 22});
                win.add(new Integer[]{3, 30});
                win.add(new Integer[]{3, 33});
                win.add(new Integer[]{4, 11});
                win.add(new Integer[]{5, 20});
                win.add(new Integer[]{5, 22});
                win.add(new Integer[]{6, 10});
                win.add(new Integer[]{6, 11});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 34:
                win.add(new Integer[]{1, 34});
                win.add(new Integer[]{2, 23});
                win.add(new Integer[]{3, 31});
                win.add(new Integer[]{4, 12});
                win.add(new Integer[]{5, 21});
                win.add(new Integer[]{6, 11});
                win.add(new Integer[]{7, 3});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
            case 35:
                win.add(new Integer[]{1, 35});
                win.add(new Integer[]{2, 23});
                win.add(new Integer[]{2, 24});
                win.add(new Integer[]{3, 32});
                win.add(new Integer[]{4, 12});
                win.add(new Integer[]{5, 21});
                win.add(new Integer[]{5, 22});
                win.add(new Integer[]{6, 11});
                win.add(new Integer[]{7, 2});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 1});
                win.add(new Integer[]{11, 2});
                break;
            case 36:
                win.add(new Integer[]{1, 36});
                win.add(new Integer[]{2, 24});
                win.add(new Integer[]{3, 33});
                win.add(new Integer[]{4, 12});
                win.add(new Integer[]{5, 22});
                win.add(new Integer[]{6, 11});
                win.add(new Integer[]{7, 1});
                win.add(new Integer[]{8, 3});
                win.add(new Integer[]{9, 2});
                win.add(new Integer[]{10, 2});
                win.add(new Integer[]{11, 1});
                break;
        }
        return win;
    }
}
