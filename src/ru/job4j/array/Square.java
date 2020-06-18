package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        /* заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат */
        int[] result = new int[bound];
        for (int i = 0; i < bound; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(index + " in squared = " + array[index]);
            
        }
    }
}
