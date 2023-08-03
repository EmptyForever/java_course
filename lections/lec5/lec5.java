package lections.lec5;

import java.util.*;

/**
 * lec4
 */
public class lec5 {

    public static void main(String[] args) {
        // ex1_hashmap();
        // ex2_hashmap();
        // ex3_hashmap();
        // ex4_hashmap();
        ex5_hashmap();
    }

    // HashMap
    // Map – это множество коллекций, работающих с данными
    // по принципу <Ключ / Значение>.
    // Ключевые особенности:
    // ●допускаются только уникальные ключи, значения могут повторяться;
    // ●помните про null значения*;
    // /●ускоренная обработка данных;
    // ●порядок добавления не запоминается.
    // В HashMap элементы располагаются как угодно и могут
    // менять свое положение.
    public static void ex1_hashmap() {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один");
        System.out.println(db);
        db.put(2, "два");
        System.out.println(db);
        db.put(3, "три");
        System.out.println(db);
        db.put(null, "!null");
        System.out.println(db);
        db.put(null, null);
        System.out.println(db);

    }

    // put(K,V) – добавить пару если или изменить значение,если ключ имеется.
    // putIfAbsent(K,V) – произвести добавление если ключ не найден.
    // get(K) - получение значения по указанному ключу.
    // remove(K) – удаляет пару по указанному ключу.
    // containsValue(V) – проверка наличия значения.
    // containsKey(V) – проверка наличия ключа.
    // keySet() – возвращает множество ключей.
    // values() – возвращает набор значений.
    public static void ex2_hashmap() {
        HashMap<Integer, String> db = new HashMap<>();
        db.put(1, "ehrheh");
        System.out.println(db);

        db.putIfAbsent(1, "addyes?"); // no
        System.out.println(db);

        db.putIfAbsent(2, "addyes?"); // yes
        System.out.println(db);

        System.out.println(db.get(2));
        System.out.println(db.remove(1)); // ehrheh
        System.out.println(db);

    }

    public static void ex3_hashmap() {
        Map<Integer, String> data = new HashMap<>();
        data.put(1, "134");
        data.put(2, "234");
        data.put(3, "334");
        data.put(0, "334");

        System.out.println(data);
        System.out.println(data.containsKey(1));
        System.out.println(data.containsValue(134));
        System.out.println(data.containsValue("134"));
        System.out.println(data.keySet());
        System.out.println(data.values());

        for (var item : data.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

    }

    public static void ex4_hashmap() {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9);
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f);

    }

    // TREEEMAP
    // TREEMAP
    // TREMAP
    public static void ex5_hashmap() {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "134");
        tMap.put(2, "234");
        tMap.put(3, "334");
        tMap.put(4, "334");
        tMap.put(0, "334");
        System.out.println(tMap);

    }
}