package ru.array;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class Matrix {


        int[][] multiple(int size){
            /*
            *Обьявили размер масива
             */
            int multiple[][]= new int[size][size];

            /*
            *Проходим по двум масивам через цикл i это количество строк j это количество столбцов
            */

        for (int i = 0;i<size;i++){
            for (int j = 0; j<size;j++){
               multiple[i][j]= (i+1)*(j+1);
            }
        }
        return multiple;
    }





}
