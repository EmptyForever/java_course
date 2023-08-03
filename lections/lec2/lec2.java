package lections.lec2;

import java.util.logging.*;

public class lec2 {
    public static void main(String[] args) {
        met213();
    }

    // Использование Logger logger = Logger.getLogger()
    // Уровни важности INFO, DEBUG, ERROR, WARNING и др.

    // Вывод ConsoleHandler info = new ConsoleHandler();
    // log.addHandler(info); Формат вывода:
    // структурированный, абы как*
    // XMLFormatter, SimpleFormatter
    public static void met213() {
        Logger logger = Logger.getLogger(lec2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        // SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();

        // ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое сообщениеlog");
        logger.info("Тестовое сообщениеinfo");
        logger.info("Тестовое сообщениеinfo");
    }

}
