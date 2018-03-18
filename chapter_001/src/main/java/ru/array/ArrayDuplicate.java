package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 18.03.2018
 */

import java.util.Arrays;



public class ArrayDuplicate {
    /**
     * find duplicated array
     * @param array
     * @return duplicated array
     */
    public String[] remove(String[] array){
        int uni = array.length;
        for(int out = 0;out<uni;out++){
            for (int in = out+1;in<uni;in++){
                if(array[out].equals(array[in])){
                    array[in] = array[uni-1];
                    uni--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array,uni);
    }




}


