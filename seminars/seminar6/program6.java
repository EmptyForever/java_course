package seminars.seminar6;

import java.util.Arrays;
import java.util.HashSet;
// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class program6 {
    public static void main(String[] args) {
        // task1_1();
        // task1_2();
        // task1_3();
        Integer[] arr = rndCreate(120, 100);
        System.out.println(task2(arr));

    }

    public static void task1_1() {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 30000, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
    }

    public static void task1_2() {
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();
        linkedSet.addAll(List.of(1, 2, 30000, 3, 2, 4, 5, 6, 3));
        System.out.println(linkedSet);
    }

    public static void task1_3() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(1, 2, 30000, 3, 2, 4, 5, 6, 3));
        System.out.println(treeSet);
    }

    // 1. Напишите метод, который заполнит массив из 120 элементов случайными
    // цифрами от 0 до 100.
    // 2. Создайте метод, в который передайте заполненный выше массив и с помощью
    // Set вычислите процент уникальных значений в
    // данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее
    // количество чисел в массиве.

    public static Integer[] rndCreate(int size, int max) {
        Random rnd = new Random();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, max);
        }
        return arr;
    }

    public static double task2(Integer[] arr) {

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        double res = 0;

        res = (double)set.size() * 100 / arr.length;
        System.out.printf("%d * 100 / %d \n", set.size(), arr.length);
        // System.out.println();
        return res;
    }

}
