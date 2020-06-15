package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (cell % 2 == 0) {
                    System.out.print("X");
                } else  {
                    System.out.print(" ");
                }
            }
            /* Добавляем перевод на новую строку */
                System.out.println();
                /*Если row четный - ставим пробел*/
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            }
            }

    public static void main(String[] args) {
        paint(5, 5);
        System.out.println();
        paint(4, 4);
    }
}
