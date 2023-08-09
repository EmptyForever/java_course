package DZseminars.dz4;

import java.util.LinkedList;

public class dz4task1 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        Object[] arr = new Object[] { 1, "One", 2, "Two" };
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println(revert(list));
        System.out.println(list);

    }
    // Напишите класс LLTasks с методом revert, который принимал бы на вход
    // LinkedList и возвращает “перевернутый” список.
    // Пример
    // Дан
    // [1, One, 2, Two]
    // Вывод
    // [1, One, 2, Two]
    // [Two, 2, One, 1]

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> ll2 = new LinkedList<>();
        int temp = ll.size();
        for (int i = temp - 1; i >= 0; i--) {
            ll2.add(ll.get(i));
        }
        return ll2;
    }

}
