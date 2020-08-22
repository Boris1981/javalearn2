package ru.gb.TTT;

public class TicTocToe {

    static final char HUMAN_CELL = 'X';
    static final char AI_CELL = '0';
    static final char EMPTY = '#';
    static final int MAP_SIZE = 3;
    static final int WIN_SIZE = 3;
    static char[][] map = new char[MAP_SIZE][MAP_SIZE];

    public static void main (String args[]) {

        initGame();
        drawMap();





    }
    public static void initGame() {

        for (int y=0;y<MAP_SIZE;y++) {
            for (int x=0;x<MAP_SIZE;x++) {
                map[y][x] = EMPTY;
            }
        }
        System.out.println("TicTocToe initiated"); //unnecessary remark
    }
    public static void drawMap() {
        for (int y=0;y<MAP_SIZE;y++) {
            for (int x=0;x<MAP_SIZE;x++) {
                System.out.print(map[y][x]);
            }
            System.out.println();
        }
    }


}
