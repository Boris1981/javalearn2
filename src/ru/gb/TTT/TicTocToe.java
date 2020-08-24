package ru.gb.TTT;

import java.util.Scanner;

public class TicTocToe {

    static final char HUMAN_CELL = 'X';
    static final char AI_CELL = '0';
    static final char EMPTY = '#';
    static final int MAP_SIZE = 3;
    static final int WIN_SIZE = 3;
    static char[][] map = new char[MAP_SIZE][MAP_SIZE];
    static int moves = 0;

    public static void main (String args[]) {
        initGame();
        drawMap();
        do{
            humanTurn();
            drawMap();

            moves++;
        } while (moves < MAP_SIZE*MAP_SIZE);
        System.out.println("You filled all map! No one wins.");//unnecessary remark
        System.exit(0);
    }
    //init
    public static void initGame() {

        for (int y=0;y<MAP_SIZE;y++) {
            for (int x=0;x<MAP_SIZE;x++) {
                map[y][x] = EMPTY;
            }
        }
        System.out.println("TicTocToe initiated"); //unnecessary remark
    }
    //draw map
    public static void drawMap() {
        for (int y=0;y<MAP_SIZE;y++) {
            for (int x=0;x<MAP_SIZE;x++) {
                System.out.print(map[y][x]);
            }
            System.out.println();
        }
    }
    //human turn
    public static void humanTurn() {
        int x=-1;
        int y=-1;
        System.out.println("Your turn, meatbag!");
        do {
            System.out.println("input X and Y");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) x = sc.nextInt();
            if (sc.hasNextInt()) y = sc.nextInt();
           } while (!isCellEmpty(x,y));
        map[y - 1][x - 1] = HUMAN_CELL;
    }

    //check move: is cell empty? is cell in map? is input- integer?
    public static boolean isCellInMap(int x, int y) {
        if ( x<1 || x>MAP_SIZE || y<1 || y>MAP_SIZE ) {
            return false;
        }
        return true;
    }
    public static boolean isCellEmpty(int x, int y) {
        if (isCellInMap(x,y)) {
            if (map[y - 1][x - 1] == EMPTY) {
                return true;
            }
        }
        return false;
    }

    //check win
    //ai turn


}
