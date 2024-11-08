package com.chess.engine.board;

public class BoardUtils {
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);

    public static final boolean[] SECOND_ROW = null;
    public static final boolean[] SEVENTH_ROW = null;

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;


    private BoardUtils() {}

    public static boolean isValidTileCoordinate(int coordinate) {return coordinate >= 0 && coordinate < NUM_TILES;}

    private static boolean[] initColumn(int columnNumber) {
        final boolean[] column = new boolean[64];

        while (columnNumber <= 64) {
            column[columnNumber] = true;
            columnNumber += 8;
        }
        return column;
    }
}
