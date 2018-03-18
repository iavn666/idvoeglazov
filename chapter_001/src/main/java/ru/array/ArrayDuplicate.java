package ru.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array){
        int uni = array.length;
        for(int out = 0;out<array.length;out++){
            for (int in = out+1;in<array.length;in++){
                if(array[out].equals(array[in])){
                    array[in]=array[uni - 1];
                    uni--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array,uni);
    }




}


