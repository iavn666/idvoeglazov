package ru.job4j.loop;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class Board {

    public String paint(int width, int height) {

        StringBuilder screen = new StringBuilder();

        String ln = System.lineSeparator();

        for (int a = 0;a<height; a++) {
            for (int b = 0;b<width;b++){
                  if ((a + b) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
