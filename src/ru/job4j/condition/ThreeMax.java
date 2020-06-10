package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second && second > third) {
            result = second;
        }
        if (first < third && third > second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = ThreeMax.max(10, 5, 1);
        System.out.println(result);
    }


}
