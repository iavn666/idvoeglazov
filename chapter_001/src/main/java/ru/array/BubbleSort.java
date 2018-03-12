package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class BubbleSort {

    public int[] sort(int[] array) {
        /*
        *В условии указываем что переменная равна длине массива минус одит чтобы не выйти за границу массива
        * так как нумерация индексов идет с нуля по этому вычитаем единицу, убавляем на единицу до тех пор пока
        * переменная index будет удовлетворяет условию index>0
         */

        for (int  index = array.length-1;index>0;index--) {
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

