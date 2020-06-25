package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int column = 0; column < size; column++) {
            for (int line = 0; line < size; line++) {
            table[column][line] = (line + 1) * (column + 1);
                System.out.println("column = " + column + " Line = " + line
                        + " table[" + column + "][" + line + "] = " + (line + 1) * (column + 1));
            }
        }
        return table;
    }
}
