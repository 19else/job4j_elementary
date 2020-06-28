package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            int point = nullIndex; // указатель на null ячейку ??? зачем ??? //
            /*переместить первую не null-ячейку. Нужен цикл */
            if (array[nullIndex] == null) {

                for (int index = nullIndex; index < array.length - 1; index++) {
                    if (array[index] != null) {

                        String temp = array[nullIndex];
                        array[nullIndex] = array[index];
                        array[index] = temp;
                    }

                }
                System.out.print(array[nullIndex] + " spacebar ");

            }
        }
        return array;
    }



    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
            
        }
    }
}
