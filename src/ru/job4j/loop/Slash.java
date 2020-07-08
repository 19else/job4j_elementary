package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row; //условие, по которому рисуется левая диагональ
                boolean right = (cell + row) == size - 1; // условие, рисуется правая диагональ
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("Draw is 3");
        draw(3);
        System.out.println();
        System.out.println("Draw is 5");
        draw(5);
    }
}
