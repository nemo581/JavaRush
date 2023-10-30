package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Model {
    protected int score;
    protected int maxTile;
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

    private void compressTiles(Tile[] tiles) { // сжатие
        int insertPosition = 0;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            if (!tiles[i].isEmpty()) {
                if (i != insertPosition) {
                    tiles[insertPosition] = tiles[i];
                    tiles[i] = new Tile();
                }
                insertPosition++;
            }
        }
    }

    private void mergeTiles(Tile[] tiles) { // объеденение
        LinkedList<Tile> tilesList = new LinkedList<>();
        for (int i = 0; i < FIELD_WIDTH; i++) {
            if (tiles[i].isEmpty()) {
                continue;
            }

            if (i < FIELD_WIDTH - 1 && tiles[i].value == tiles[i + 1].value) {
                int updatedValue = tiles[i].value * 2;
                if (updatedValue > maxTile) {
                    maxTile = updatedValue;
                }
                score += updatedValue;
                tilesList.addLast(new Tile(updatedValue));
                tiles[i + 1].value = 0;
            } else {
                tilesList.addLast(new Tile(tiles[i].value));
            }
            tiles[i].value = 0;
        }

        for (int i = 0; i < tilesList.size(); i++) {
            tiles[i] = tilesList.get(i);
        }
    }
}