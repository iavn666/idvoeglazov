package ru.array;

public class BubbleSort {

    public int[] sort(int[] array) {

        for (int index = 0; index < array.length-1;index++) {
            for (int j = 0; j < index; j++) {
                if (array[j] > array[j + 1]) {
                    int b = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = b;

                }

            }


        }
        return array;

    }

}

