package lections.lec5;

import java.util.*;
import java.io.*;

/**
 * lec4
 */
public class lec5 {

    public static void main(String[] args) {
        // ex1_hashmap();
        // hashMap_ex1();
        // hashMap_ex2();
        // hashMap_ex3();
        // StrvalueOf();
        // ex2_hashmap();
        // ex3_hashmap();
        // ex4_hashmap();
        // treeMap_ex01();
        treeMap_ex02();
    }

    // HashMap --> Map – это множество коллекций, работающих с данными по принципу
    // <Ключ / Значение>.

    {
        // Ключевые особенности:
        // ●допускаются только уникальные ключи, значения могут повторяться;
        // ●помните про null значения*;
        // /●ускоренная обработка данных;
        // ●порядок добавления не запоминается.
        // В HashMap элементы располагаются как угодно и могут
        // менять свое положение.
    }

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

    // 1. работа с hasMap
    {
        // put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        // putIfAbsent(K,V) – произвести добавление если ключ не найден.
        // get(K) - получение значения по указанному ключу.
        // remove(K) – удаляет пару по указанному ключу.
        // containsValue(V) – проверка наличия значения.
        // containsKey(V) – проверка наличия ключа.
        // keySet() – возвращает множество ключей.
        // values() – возвращает набор значений.
    }

    // 1. -->
    // start
    // put(K,V), putIfAbsent(K,V)
    public static void hashMap_ex1() {
        Map<Integer, String> hmap1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hmap1.put(i, "pupka");
        }
        for (int i = 6; i < 15; i++) {
            hmap1.putIfAbsent(i, "234");
        }
        System.out.println(hmap1);
    }

    // get(K), remove(K)
    // containsValue(V), containsKey(V)
    public static void hashMap_ex2() {
        HashMap<Integer, String> newHashMap = new HashMap<>();
        newHashMap.put(0, "1");
        for (int i = 1; i < 10; i++) {
            String str = "i" + newHashMap.get(i - 1);
            newHashMap.putIfAbsent(i, str);
        }
        System.out.println(newHashMap);
        int temp = newHashMap.size();
        for (int i = 0; i < temp; i += 2) {
            newHashMap.remove(i);
        }
        System.out.println(newHashMap);
        System.out.println(newHashMap.containsValue("i1"));
        System.out.println(newHashMap.containsKey(1));
        System.out.println(newHashMap.containsKey(2) || newHashMap.containsKey(10));
        System.out.println(newHashMap.containsKey(3));
    }

    // keySet(), values()
    public static void hashMap_ex3() {
        Map<Integer, String> hmap = new HashMap<>();
        Random rnd = new Random();
        rnd.nextInt(3, 9);
        // for (int i = 0; i < 100; i++) {
        // // System.out.printf("%f ", rnd.nextDouble(3, 9));
        // System.out.printf("%f ", rnd.nextInt(3, 9));
        // }

        String str = Integer.toString(rnd.nextInt(1, 11));
        System.out.println(str + "abc");
        for (int i = 0; i < 10; i++) {
            str = Integer.toString(rnd.nextInt(i, i + 11));
            hmap.putIfAbsent(i, str + "abc");
        }
        System.out.println(hmap);
        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
    }

    // end
    public static void StrvalueOf() {
        char num = '*';
        String str = String.valueOf(num);
        String str2 = Integer.toString(num);
        System.out.println(str);
        System.out.println(str2);
    }
    // 1. <--

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
    // put(K,V), get(K), remove(K)
    // descendingKeySet(V), descendingMap()
    // tailMap(K) - выдаёт пары key = val начиная с ключа K
    // headMap(k) - выдаёт пары key = val от 0 key до k --> [0, k)
    // lastEntry() - последня пара
    // firstEntry() - первая пара
    // lastKey(), firstKey()

    // put(K,V), get(K), remove(K)
    public static void treeMap_ex01() {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "134");
        tMap.put(2, "234");
        tMap.put(3, "334");
        tMap.put(4, "334");
        System.out.println(tMap.get(0)); // null
        tMap.put(0, "334");
        System.out.println(tMap.get(0)); // 334
        tMap.put(0, "0");
        System.out.println(tMap);
        System.out.println(tMap.get(0)); // 0
        System.out.println(tMap.remove(0)); // 0
        System.out.println(tMap);

    }

    // tailMap, headMap(k), lastEntry(), firstEntry(), lastKey(), firstKey()
    public static void treeMap_ex02() {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        // String str = new String();
        for (int i = 0; i < 5; i++) {
            // str = Integer.toString(i*i);
            tmap.putIfAbsent(i, Integer.toString(i * i));
        }
        System.out.println(tmap);
        // System.out.println(Integer.parseInt(descendingKeySet(tmap)));
        // NavigableSet set1 = tmap.descendingMap();

        System.out.println(tmap.tailMap(2));
        System.out.println(tmap.headMap(7));
        System.out.println(tmap.headMap(2));
        System.out.println(tmap.lastKey());
        System.out.println(tmap.firstKey());
        System.out.println(tmap.lastEntry());
        System.out.println(tmap.firstEntry());
    }

}