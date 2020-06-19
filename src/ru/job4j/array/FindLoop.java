package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; //Если элемента нет в массиве, возвращаем -1//
        for (int index = 0; index < el; index++) {
            if (data[index] == el) {
                rst = index;
                System.out.println("result = " + rst);
                System.out.println("массив с индексом [index] = " + data[index]);
                break;
            }
            
        }
        return rst;
    }
}

