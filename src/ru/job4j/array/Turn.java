package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {

        int arrayLength = array.length - 1;

     for (int index = 0; index < arrayLength - index; index++) {
            int second = array[index];
            array[index] = array[arrayLength - index];
            array[arrayLength - index] = second;

      }
        return array;
    }
}
