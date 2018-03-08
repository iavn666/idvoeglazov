package ru.array;

public class FindLoop {

    public int indexOf(int[] data, int el) {

        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.


        for (int e1 = 0;e1<data.length;e1++) {
            if (data[e1] == el) {
                rsl = e1;
                break;
            }
        }

        return rsl;
    }


}
