package ru.job4j.loop;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */
public class Paint {
    public String pyramid(int height) {
        /*
        *вводим переменную screen со сылкой на обьект StringBuilder()
         */
        StringBuilder screen = new StringBuilder();
        /*
        *Производим вычисление
         */
        int weight = 2 * height - 1;
        /*
        * Цикл с переменной row, приэтом row не равно переменной height, умеличиваем каждый раз значение да один
        * до тех пор пока будет выполняться условие
         */
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    }
