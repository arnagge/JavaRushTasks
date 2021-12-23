package com.javarush.mentor.task.figure;

import com.javarush.mentor.task.BaseFigure;
import com.javarush.mentor.task.Position;

public class Bishop extends BaseFigure {

    private final int[][] moves = new int[((Position.LIMIT - 1) * 4)][];

    public int[][] getMoves() {
        int idx = 0;
        for (int i = 1; i < Position.LIMIT; i++) {
            this.moves[idx++] = new int[]{i, i};
            this.moves[idx++] = new int[]{-i, -i};

            this.moves[idx++] = new int[]{i, -i};
            this.moves[idx++] = new int[]{-i, i};
        }

        return this.moves;
    }
}
