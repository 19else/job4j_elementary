package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
            int point = nullIndex; // указатель на null ячейку ??? зачем ??? //
            /*переместить первую не null-ячейку. Нужен цикл */
            if (array[nullIndex] == null) {

                for (int index = point; index < array.length; index++) {
                    int notNull = index;
                    if (array[index] != null) {

                        String temp = array[point];
                        array[point] = array[notNull];
                        array[notNull] = temp;
                    }

                }

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
