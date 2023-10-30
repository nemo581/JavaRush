package com.javarush.task.task35.task3513;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;

    public Model() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (Tile[] gt : gameTiles) {
            for (int k = 0; k < gameTiles.length; k++) {
                gt[k] = new Tile();
            }
        }
    }
}