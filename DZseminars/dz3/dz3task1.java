package DZseminars.dz3;

import java.util.Arrays;

public class dz3task1 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] { 9, 5, 4, 3, 6 };
        int[] arr1 = sortArray(arr);
        System.out.println(Arrays.toString(arr1));

    }

    // 1. разбиваем массив на два массива.
    // 2. сравниваем 1 и2 3 и 4 и так до тех пор пока не дойдём до конца
    // 3. результат записываем

    public static int[] sortArray(int[] arrayA) throws Exception {
        // int[] arrRes = new int[5];
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую
        // часть
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет
        // крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет
        // искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);

    }

    public static int[] mergeArray(int[] arrayA, int[] arrayB) throws Exception {

        int [] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;
        
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length){
            arrayC[i] = arrayB[i - positionB];
            positionB++;
            } else if (positionB == arrayB.length) {
            arrayC[i] = arrayA[i - positionA];
            positionA++;
            } else if (arrayA[i - positionA] < arrayB[i - positionB]) {
            arrayC[i] = arrayA[i - positionA];
            positionB++;
            } else {
            arrayC[i] = arrayB[i - positionB];
            positionA++;
            }
        }
        return arrayC;

    }

}
