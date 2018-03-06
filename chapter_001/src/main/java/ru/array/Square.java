package ru.array;

public class Square {

    public int calculate(int bound) {

        int[] rst = new int[bound];
        rst [0] = '1';
        rst [1] = '2';
        rst [2] = '3';
        rst [3] = '4';


        for (int i = 0; i<rst.length; i++) {
            rst[i] = (int) Math.pow(rst[i], 2);
                    }

                    int rsl = 0;

        return rsl;

    }


}

