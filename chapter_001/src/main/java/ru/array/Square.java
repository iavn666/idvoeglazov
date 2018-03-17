package ru.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class Square {

    public int[] calculate(int bound) {


        int[] rst = new int[bound];

              for (int i = 0; rst.length > i; i++) {
              rst[i] = (int) Math.pow(rst[i], 2);
                    }
                  return rst;

    }


}

