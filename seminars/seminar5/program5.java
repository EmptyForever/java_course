package seminars.seminar5;

import java.util.*;

public class program5 {
    public static void main(String[] args) {
        // task1();
        // task2();
        task3();
    }

    // Создать структуру для хранения
    // Номеров паспортов и Фамилий сотрудников организации.
    // 123456 Иванов
    // 321456 Васильев
    // 234561 Петрова
    // 234432 Иванов
    // 654321 Петрова
    // 345678 Иванов
    // Вывести данные по сотрудникам с фамилией Иванов.
    public static void task1() {
        System.out.println("this met123");
        Map<Integer, String> mp1 = new HashMap<>();
        mp1.put(123456, "Иванов");
        mp1.put(321456, "Васильев");
        mp1.put(234561, "Петрова");
        mp1.put(234432, "Иванов");
        mp1.put(654321, "Петрова");
        mp1.put(345678, "Иванов");
        String name = "Иванов";
        for (var item : mp1.entrySet()) {
            if (item.getValue().equals(name)) {
                System.out.printf("%d: %s\n", item.getKey(), item.getValue());
            }
        }
    }

    // Даны 2 строки, написать метод, который вернет true,
    // если эти строки являются изоморфными и false, если нет.
    // Строки изоморфны, если одну букву в первом слове можно
    // заменить на некоторую букву во втором слове, при этом
    // 1. повторяющиеся буквы одного слова меняются на одну и
    // ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
    // 2. буква может не меняться, а остаться такой же. (Например, note - code)
    // Пример 1:
    // Input: s = "foo", t = "bar"
    // Output: false
    // Пример 2:
    // Input: s = "paper", t = "title"
    // p - t
    // a - i
    // e - l
    // r - e
    // Output: true

    public static void task2() {
        // boolean flag1 = true;
        String name1 = "paper";
        String name2 = "eeeee";
        // System.out.println(name1.charAt(0));
        boolean flag123 = izomorphe(name1, name2);
        System.out.println(flag123);
        boolean flag124 = izomorphe(name2, name1);
        System.out.println(flag124);
        System.out.println(flag123 && flag124);
        // System.out.printf("Строка -%s- изоморфна строке -%s?-", name1, name2);
        // System.out.println();
        // System.out.printf("Строка -%s- изоморфна строке -%s?-", name1, name2);
    }

    public static boolean izomorphe(String name1, String name2) {
        // boolean flag1 = true;
        if (name1.equals(name2)) {
            return false;
        } else if (name1.length() != name2.length()) {
            return false;
        } else {
            Map<Character, Character> map1 = new HashMap<>();
            char[] chr = name1.toCharArray();
            char[] chr2 = name2.toCharArray();

            for (int i = 0; i < chr.length; i++) {
                if (!map1.containsKey(chr[i])) {
                    map1.put(chr[i], chr2[i]);
                } else {
                    if (map1.get(chr[i]) != chr2[i]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    // Написать программу, определяющую правильность расстановки скобок в выражении.
    // Пример 1: a+(d*3) - истина
    // Пример 2: [a+(1*3) - ложь
    // Пример 3: [6+(3*3)] - истина
    // Пример 4: {a}[+]{(d*3)} - истина
    // Пример 5: <{a}+{(d*3)}> - истина
    // Пример 6: {a+]}{(d*3)} - ложь
    // [(]) - ложь

    public static void task3() {
        // String str1 = "{a+]}{(d*3)}";
        String str1 = "][";
        System.out.println(str1);
        boolean flag14 = sortSkobok(str1);
        System.out.println(flag14);
    }

    public static boolean sortSkobok(String str1) {
        Stack<Character> data1 = new Stack<>();

        Map<Character, Character> map1 = new HashMap<>();
        map1.put(']', '[');
        map1.put('}', '{');
        map1.put(')', '(');
        map1.put('>', '<');

        char[] chr = str1.toCharArray();
        // System.out.println(Arrays.toString(chr));

        for (int i = 0; i < chr.length; i++) {
            if (map1.containsValue(chr[i])) {
                data1.push(chr[i]);
            } else if (map1.containsKey(chr[i])) {
                if (data1.empty() || map1.get(chr[i]) != data1.pop()) {
                    return false;
                }
            }
        }
        return data1.empty();
    }
}
