package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] five = new int[5];
        for (int index = 0; index < five.length; index++) {

            int y = index * 2 + 3;

            five[index] = y;

          //  five[index] = index * 2 + 3;

            System.out.println("five[" + index + "]=" + five[index]);

        }
    }
}
