package com.javarush.mentor.task;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFigure implements Figure {
    private int[][] moves;

    public List<Position> getPossibleMoves(Position start) {
        List<Position> possibleMoves = new ArrayList<>();
        for (int[] possibleCell : this.getMoves()) {
            int col = start.x + possibleCell[0], row = start.y + possibleCell[1];
            Position position = new Position(col, row);
            if (!position.isInit) {
                continue;
            }
            possibleMoves.add(position);
        }

        return possibleMoves;
    }

    @Override
    public boolean checkMove(Position start, Position destination) {
        for (Position position: this.getPossibleMoves(start)) {
            if (position.x == destination.x && position.y == destination.y) {
                return true;
            }
        }

        return false;
    }

    public int[][] getMoves() {
        return this.moves;
    }
}
