package ru.job4j.condition;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        String hello = "Привет, Бот";
        String buy = "Пока";
        String buyy = "До скорой встречи.";
        String hi = "Привет, умник.";

        if ("Привет, Бот".equals(hello)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            hi = "Привет, умник .";
        } else if (buy.equals(question)) { // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            buyy ="До скорой встречи.";
        }
        return rsl;
    }
}
