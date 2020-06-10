package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            return first >= third ? first : third;

        } else {
            return second >= third ? second : third;

        }

    }

    public static void main(String[] args) {

        int result = MultiMax.max(5, 5, 5);
        System.out.println(result);
    }

}
