package seminars.seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class program4 {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        ex4();
    }

    public static void ex1() {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000_00; i++) {
            list.add(0);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 1_000_00; i++) {
            list2.add(0);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя строку вида
     * text
     * 1. Нужно сохранить text в связный список.
     * 2. Если введено print~num, выводит строку из позиции num в связном списке и
     * удаляет её из списка.
     * 3. Выход - слово exit
     * qwe
     * [qwe]
     * tre
     * [qwe, tre]
     * zxc
     * [qwe, tre, zxc]
     * print~1
     * tre
     * [qwe, zxc]
     * print~1
     * zxc
     * [qwe]
     */
    /**
     * 1. принять строку от пользователя сканером.
     * // 2. сделать проверку этой строки на соответствие exit
     * // 2. - сделать проверку подстроки на соотвествие строке print~
     * // 3. выдать String[] arr --> arr[1] (второй элемент списка) форматированный
     * в
     * // число. записываем его в temp int
     * // 4. берём это число и выводим list.remove(temp)
     */
    // LinkedList console ass
    public static void ex2() {
        LinkedList<String> list = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in, "cp866");
        String str = new String();
        boolean flag = true;
        while (flag) {
            System.out.print("Введите строку: ");
            str = iScanner.nextLine();
            if (str.equals("exit")) {
                flag = false;
            } else if (str.startsWith("print~")) {
                String[] arr = str.split("~");
                int temp = Integer.parseInt(arr[1]);
                // System.out.println(temp);
                System.out.println(list.remove(temp));
                System.out.println(list);
            } else {
                list.add(str);
                System.out.println(list);
            }
        }
        iScanner.close();
        System.out.println();
    }

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была
     * первой в выводе, а
     * первая введённая - последней в выводе
     * и чистит структуру
     * 3. Выход - exit
     * 
     * 
     * qwe
     * [qwe]
     * tre
     * [qwe, tre]
     * zxc
     * [qwe, tre, zxc]
     * print
     * zxc tre qwe
     * []
     */
    public static void ex3() {
        Stack<String> list = new Stack<>();
        Scanner iScanner = new Scanner(System.in, "cp866");
        String str = new String();
        boolean flag = true;
        while (flag) {
            System.out.print("Введите строку: ");
            str = iScanner.nextLine();
            if (str.equals("exit")) {
                flag = false;
            } else if (str.startsWith("print")) {
                // String[] arr = str.split("~");
                // int temp = Integer.parseInt(arr[1]);
                int tempik = list.size();
                for (int i = 0; i < tempik; i++) {
                    System.out.printf("%s ", list.pop());
                }
                list.clear();
                System.out.println(list);
            } else {
                list.push(str);
                System.out.println(list);
            }
        }
        iScanner.close();
        System.out.println();
    }

    public static void ex4() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 11);
        }
        System.out.println(Arrays.toString(arr));
        filed_queue(arr);
    }

    public static void filed_queue(int[] list) {
        Queue<Integer> queue = new LinkedList<>();
        for (int j = 0; j < list.length; j++) {
            queue.offer(list[j]);
        }
        System.out.println(queue);
    }

}
