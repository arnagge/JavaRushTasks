package com.javarush.mentor.task;

import com.javarush.mentor.task.figure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Chess {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Position startPoint = Position.convert(scanner.nextLine().toLowerCase());
        Position endPoint = Position.convert(scanner.nextLine().toLowerCase());

        if (startPoint.x == endPoint.x && startPoint.y == endPoint.y) {
            throw new Exception("Coordinates are equal!");
        }

        List<String> figuresResult = new ArrayList<>();
        Figure[] figures = {
                new King(),
                new Knight(),
                new Pawn(),
                new Rook(),
                new Queen(),
                new Bishop(),
        };

        for (Figure fig: figures) {
            if (fig.checkMove(startPoint, endPoint)) {
                figuresResult.add(fig.getClass().getSimpleName());
            }
        }

        System.out.println(figuresResult.toString());
    }
}





