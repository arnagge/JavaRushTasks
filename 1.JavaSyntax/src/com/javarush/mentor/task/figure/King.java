package com.javarush.mentor.task.figure;

import com.javarush.mentor.task.BaseFigure;

public class King extends BaseFigure {

    private final int[][] moves = new int[][]{
            {-1, -1},
            {-1, 0},
            {-1, 1},
            {0, -1},
            {0, 1},
            {1, -1},
            {1, 0},
            {1, 1},
    };

    public int[][] getMoves() {
        return this.moves;
    }


//    private List<Position> getNeighbors(Position gameObject) {
//        List<Position> result = new ArrayList<>();
//        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
//            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
//                if (y < 0 || y >= SIDE) {
//                    continue;
//                }
//                if (x < 0 || x >= SIDE) {
//                    continue;
//                }
//                if (gameField[y][x] == gameObject) {
//                    continue;
//                }
//                result.add(gameField[y][x]);
//            }
//        }
//        return result;
//    }

//    public boolean checkMove(Position start, Position destination) {
//
//        System.out.println(start.toString());
//        System.out.println(destination.toString());
//        int x = start.x, y = start.y;
//
//        int[][] checkArea = new int[][]{
//                {x - 1, y - 1},
//                {x - 1, y},
//                {x - 1, y + 1},
//                {x, y - 1},
//                {x, y + 1},
//                {x + 1, y - 1},
//                {x + 1, y},
//                {x + 1, y + 1},
//        };
//
//        ArrayList<int[]> checkAreaList = new ArrayList<>(Arrays.asList(checkArea));
//
//        for (int[] possibleCell :checkAreaList) {
//            int col = possibleCell[0], row = possibleCell[1];
//            if (!this.checkInRange(col, row)) {
//                continue;
//            }
//        }
//
//        return false;
//
//        Iterator<int[]> iterator = checkAreaList.iterator();
//
//        while (iterator.hasNext()) {
//            int[] item = iterator.next();
//            int col = item[0], row = item[1];
//            if (!this.checkInRange(col, row)) {
//                iterator.remove();
//            }
//        }
//
//        return checkAreaList;
//    }
//
//    private boolean checkInRange(int x, int y) {
//        return (x >= 0 && x <= Position.LIMIT - 1 && y >= 0 && y <= Position.LIMIT - 1);
//    }
}
