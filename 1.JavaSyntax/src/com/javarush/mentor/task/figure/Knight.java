package com.javarush.mentor.task.figure;

import com.javarush.mentor.task.BaseFigure;

public class Knight extends BaseFigure {

    private final int[][] moves = new int[][]{
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
            {-1, -2},
            {-2, -1},
            {-2, 1},
            {-1, 2},
    };

    public int[][] getMoves() {
        return this.moves;
    }
}
