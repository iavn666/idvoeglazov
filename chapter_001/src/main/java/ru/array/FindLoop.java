package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */


public class FindLoop {


    public int indexOf(int[] data, int el) {

        data[0] = 1;
        data[1] = 2;
        data[2] = 3;


        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.
        /*
        *Обьявляем цикл
         */

        for (int index = 0;index<data.length;index++) {
            /*
            *Ищем значение которое подходит по условию
             */
            if (data[index] == el) {
                /*
                *Сравниваем найденное значение
                 */
                rsl = index;
                /*
                *Останавливаем работу цикла
                 */
                break;
            }
            }
            /*
            *Возвращаем результат
             */
        return rsl;
        }

   }






