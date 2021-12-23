package com.javarush.mentor.task.figure;

import com.javarush.mentor.task.BaseFigure;

public class Pawn extends BaseFigure {

    private final int[][] moves = new int[][]{
            {0, 1},
            {0, -1},
    };

    public int[][] getMoves() {
        return this.moves;
    }
}
