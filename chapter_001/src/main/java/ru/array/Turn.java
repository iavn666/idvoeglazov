package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */
public class Turn {

    public int[] back(int[] array){

        /*
        *Преворачиваем массив
         */


            for (int index = 0;index<array.length/2;index++){
                /*
                *Запоминаем значение массива через переменную
                 */
            int a = array[index];
            /*
            * Меняем местами элементы в массиве
             */
            array[index]= array[array.length - index - 1];
             array[array.length - index - 1]= a;
                        }

              return array;

        }
    }

