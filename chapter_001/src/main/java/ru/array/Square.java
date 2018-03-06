package ru.array;

public class Square {

    public int[] calculate(int bound) {

        int[] rst = new int[bound];
        rst [0] = 1;
        rst [1] = 2;
        rst [2] = 3;
        rst [3] = 4;
        rst [4] = 5;
        rst [5] = 6;

        for (int i = 0; rst.length > i; i++) {
            rst[i] = (int) Math.pow(rst[i], 2);
                    }
                  return rst;

    }


}

