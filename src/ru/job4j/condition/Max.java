package ru.job4j.condition;

public class Max {

    public static int max(int first, int second, int third) {
          return Math.max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(second, third, fourth);
        return Math.max(first, temp);
    }

    public static int max(int first, int second) {
           return first >= second ? first : second;
    }

    public static void main(String[] args) {
        int result = Max.max(3, 4);
        int max = Max.max(1, 2, 3, 4);
        int maxThird = Max.max(10, 8, 7);
        System.out.println("Максимальное число из двух значений - " + result);
        System.out.println("Максимальное число из трех значений - " + max);
        System.out.println("Максимальное число из четырех значений - " + maxThird);
    }
}
