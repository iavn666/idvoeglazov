package ru.job4j.loop;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 12.03.2018
 */

public class Board {
    /*
    *Объявляем метод paint, указываем ему две переменные width и height
     */
    public String paint(int width, int height) {
        /*
        *Создаем переменную screen со сылкой на обьект StringBuilder позваляет вставлять символы в строку
         */
        StringBuilder screen = new StringBuilder();
        /*
        * Разделяет строки
         */
        String ln = System.lineSeparator();
        /*
        * Обьявляем цикл в условии обьявляем переменную (а) которая будет меньше переменной height
         */
        for (int a = 0;a<height; a++) {
            for (int b = 0;b<width;b++){
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((a + b) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
