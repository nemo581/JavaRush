package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;

    public Model() {
        resetGameTiles();
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> emptyTile = new ArrayList<>();
        for (Tile[] gt : gameTiles) {
            for (int i = 0; i < gameTiles.length; i++) {
                if (gt[i].value == 0) {
                    emptyTile.add(gt[i]);
                }
            }
        }
        return emptyTile;
    }

    private void addTile() {
        if (!getEmptyTiles().isEmpty()) {
            getEmptyTiles().get((int) (getEmptyTiles().size() * Math.random())).value = Math.random() < 0.9 ? 2 : 4;
        }
    }

    protected void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (Tile[] gt : gameTiles) {
            for (int k = 0; k < gameTiles.length; k++) {
                gt[k] = new Tile();
            }
        }
        addTile();
        addTile();
    }
}