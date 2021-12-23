package com.javarush.mentor.task;

public interface Figure {
    int[][] getMoves();
    boolean checkMove(Position startPoint, Position endPoint);
}
