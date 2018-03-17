package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */
public class Turn {

    public int[] back(int[] array){
     for (int index = 0;index<array.length/2;index++){
            int a = array[index];
            array[index]= array[array.length - index - 1];
            array[array.length - index - 1]= a;
        }
              return array;
        }
    }

