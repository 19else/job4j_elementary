package ru.job4j.array;

public class SortSelected {
     public static int[] sort(int[] data) {
         for (int index = 0; index < data.length; index++) {
             int min = MinRange.findMin(data, index, data.length - 1);
             int indexOf = FindLoop.indexOf(data, min, index, data.length);

             int temp = data[index];
             data[index] = data[indexOf];
             data[indexOf] = temp;
             System.out.println("Index = " + index + " min = " + min + " indexOf = " + indexOf
                           + " data[" + indexOf + "]= " + min);

          //   System.out.println("data[" + indexOf + "] = " + min);

         }

                  return data;
     }
}
