package lections.lec6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class lec6 {
    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        ex05();
    }

    // set - множество уникальных значений
    // HashSet, LinkedHashSet
    public static void HashSetInfo1() {
        // isEmpty() – проверка на пустоту;
        // add(V) – добавление элемента в коллекцию;
        // remove(V) – удаление элемента из коллекцию;
        // contains(V) – проверка на включение элемента в коллекции;
        // clear() – удаление всех элементов коллекции;
        // size() – возвращает количество элементов коллекции;
    }

    // собственный принт лол
    public static void pr(Object obj) {
        System.out.println(obj);
    }

    public static void ex01() {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.isEmpty());
        set.add(123);
        set.add(124);
        set.add(123);
        set.add(122);
        set.add(null);
        System.out.println(set);
        set.remove(122);
        System.out.println(set);
        // pr(set);
        System.out.println(set.contains(123));
        System.out.println(set.contains(140));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

    }

    // HashSet - как синоним множества
    public static void HashSetInfo2() {
        // addAll(Coll) – объединение множеств
        // retainAll(Coll) – пересечение множеств
        // removeAll(Coll) – разность множеств
    }

    public static void ex02() {
        Set<Integer> set = new HashSet<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(rnd.nextInt(0, 11));
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set2.add(rnd.nextInt(6, 16));
        }
        System.out.println(set);
        System.out.println(set2);
        set2.addAll(set);
        System.out.println(set.addAll(set2)); // true
        System.out.println(set);
        System.out.println(set2);

    }

    // retainAll(Coll) – пересечение множеств
    // set.retainAll(set2)
    // оставляет в set пересечения c set2
    // одинаково в две стороны!
    public static void ex03() {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Random rnd = new Random();
        set.addAll(Arrays.asList(17, 18, 19, 10, 12, 13, 15));
        set2.addAll(Arrays.asList(16, 17, 18, 11, 12, 13, 14));

        // for (int i = 0; i < 10; i++) {
        // set.add(rnd.nextInt(10, 20));
        // }
        // for (int i = 0; i < 10; i++) {
        // set2.add(rnd.nextInt(10, 20));
        // }
        System.out.println(set);
        System.out.println(set2);
        // System.out.println(set2.retainAll(set));
        // System.out.println(set2);
        // System.out.println(set);
        System.out.println(set.retainAll(set2));
        System.out.println(set);
        System.out.println(set2);

    }

    // removeAll(Coll) – разность множеств
    public static void ex04() {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        set.addAll(Arrays.asList(17, 18, 19, 10, 12, 13, 15));
        set2.addAll(Arrays.asList(16, 17, 18, 11, 12, 13, 14));
        set3.addAll(set);

        pr(set);
        pr(set2);
        pr(set3);
        set.removeAll(set2);
        set2.removeAll(set3);
        pr(set);
        pr(set2);
        // set2.removeAll(set);
        // System.out.println(set2);

    }

    public static void ex05() {
        LinkedHashSet<Integer> linkSet = new LinkedHashSet<>();
        pr(linkSet.isEmpty());
        linkSet.add(124);
        linkSet.add(123);
        linkSet.add(126);
        linkSet.add(125);
        System.out.println(linkSet);
        pr(linkSet.size());
        pr(linkSet.contains(125));
        pr(linkSet.remove(125)); // true        - remove не возвращает элемент      --> возвращает bool
        pr(linkSet.contains(125));
        linkSet.clear();
        pr(linkSet);

    }

}
