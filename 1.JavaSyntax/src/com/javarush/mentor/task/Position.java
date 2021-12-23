package com.javarush.mentor.task;

public class Position {

    public int x, y;
    public static final int LIMIT = 8;

    public boolean isInit;

    public Position(int x, int y) {
        if (x > LIMIT - 1 || x < 0 || y > LIMIT - 1 || y < 0) {
            this.isInit = false;
        } else {
            this.x = x;
            this.y = y;

            this.isInit = true;
        }
    }

    public static Position convert(String position) throws Exception {
        int x = ((int) position.charAt(0)) - 97;
        int y = Integer.parseInt(String.valueOf(position.charAt(1))) - 1;

        if (x > LIMIT - 1 || x < 0 || y > LIMIT - 1 || y < 0) {
            throw new Exception("Coordinates are out of the GameBoard");
        }

        return new Position(x, y);
    }
}
