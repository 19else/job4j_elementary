package ru.job4j.excersises;

public class CrossAway {
    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] right = {3, 1, 5};
        for (int indexLeft = 0; indexLeft < left.length; indexLeft++) {
            for (int indexRight = 0; indexRight < right.length; indexRight++) {
                if (left[indexLeft] == right[indexRight]) {
                    System.out.println(left[indexLeft]);
                    break;
                }
            }
        }
    }
}



