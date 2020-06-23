package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; //Если элемента нет в массиве, возвращаем -1//
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;

                break;
            }
            
        }
        return rst;

    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1; // если элемента нет в массиве, возвращаем -1 //
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                result = index;

                break;
            }

        }
        return  result;

    }
}

