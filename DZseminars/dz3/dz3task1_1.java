package DZseminars.dz3;

import java.util.Arrays;

public class dz3task1_1 {
    public static void main(String args[]) {
        int[] a = new int[] { 19, 7, 6, 15, 2, 6, 2, 4, 8, 16 };
        System.out.println(Arrays.toString(a)); // до сортировки
         // сртировка
        // System.out.println(Arrays.toString(a)); // после сортировки
        // int[] bc = new int[a.length];
        // bc = copyArr(a);
        
        methodRes(a);

        System.out.println(Arrays.toString(a)); // после сортировки
        // System.out.println(Arrays.toString(bc)); // после сортировки
        
    }

    public static int[] methodRes(int[] a) {
        // int[] bc = new int[a.length];
        // bc = copyArr(a);
        sort(0, a.length - 1, a);
        // System.out.println(Arrays.toString(a)); // после сортировки
        // System.out.println(Arrays.toString(bc)); // после сортировки


        // return bc;
        return a;
    }

    public static void merge(int begin, int end, int[] a) {
        int mid = (begin + end) / 2;

        int[] t = new int[end - begin + 1];

        int index_1 = begin;

        int index_2 = mid + 1;

        int index_t = 0;

        while ((index_1 <= mid) || (index_2 <= end)) {
            if (index_1 > mid) {
                t[index_t++] = a[index_2++];
                continue;
            }
            if (index_2 > end) {
                t[index_t++] = a[index_1++];
                continue;
            }
            if (a[index_2] > a[index_1]) {
                t[index_t++] = a[index_1++];
                continue;
            } else {
                t[index_t++] = a[index_2++];
                continue;
            }
        }
        for (int i = 0; i < end - begin + 1; i++) {
            a[i + begin] = t[i];
        }
        // System.out.println(Arrays.toString(t));
    }

    public static void sort(int start, int finish, int[] a) {
        // System.out.println("Sort " + start + ".." + finish);

        if (start == finish) // выход из рекурсии - массив из 1 элемента отсортирован по определению
            return;

        int mid = (start + finish) / 2; //

        sort(start, mid, a); // сортировка 1-й половины массива
        sort(mid + 1, finish, a); // сортировка 2-й половины массива
        merge(start, finish, a);
    }


    public static int[] copyArr(int[] a) {
        // int[] source = { 1, 2, 3, 4, 5 };
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        return b;
    }

}
