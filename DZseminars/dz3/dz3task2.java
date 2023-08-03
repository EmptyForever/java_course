package DZseminars.dz3;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
import java.util.Iterator;
// import java.util.List;

/**
 * dz3task2
 */
public class dz3task2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer[] arr2 = new Integer[] { 2, 4, 5, 6, 7, 8, 9 };
        Integer[] arr3 = new Integer[] { 2, 4, 6, 8 };
        // removeEvenNumbers(arr);
        // removeEvenNumbers(arr2);
        removeEvenNumbers(arr3);
        // int[] newArrr = removeEvenNumbers(arr);
        // System.out.println(Arrays.toString(newArrr));
    }

    public static void removeEvenNumbers(Integer[] a) {
        // 1. добавляем Integer в спсок и массива первый способо
        // ArrayList<Integer> list1 = new ArrayList<>();
        // for (int value : a) {
        // list1.add(value);
        // }
        // 2. второй
        // Collections.addAll(list1, a);
        // 3. третий
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(a));
        // System.out.println(list1);

        // 1. решение 1
        // Iterator<Integer> listIterator = list1.iterator();
        // while (listIterator.hasNext()) {
        // if (listIterator.next() % 2 == 0) {
        // listIterator.remove();
        // }
        // }

        // 2. решение 2
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
                i--;
                System.out.println(list1.size());
            }
        }


        System.out.println(list1);
    }

}