import java.util.Arrays;
// import java.util.Scanner;

// снипеты 
// 1. Scanner 
// 2. class
// 3. main

// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

// Текст задачи:
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1..

// Дан массив nums = [3,2,4,3, 1, 3, 3, 5] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

// [3,2,4,3,1,3,3,5]
// [2,4,1,5,3,3,3,3]

public class program {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 4, 3, 1, 3, 3, 5, 6 };      
        // int val = 3;

        // for (int i = nums.length - 1; i >= 0 ; i--) {
        //     if (nums[i] == val) {
        //         for (int j = i ; j < nums.length - 1; j++) {
        //             nums[j] = nums[j+1];
        //         }
        //         nums[nums.length - 1] = val;
        //     }
        // }
        // System.out.println(Arrays.toString(nums));

        int val = 3;

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = val;
        }

        System.out.println(Arrays.toString(arr));



// 1 { 3, 2, 4, 3, 1, 3, 3, 5 }
// 1 { 3, 2, 4, 3, 1, 3, 5, 3 }
                        // 5  3
// 1 { 3, 2, 4, 3, 1, 3, 3, 5 }
// 1 { 3, 2, 4, 3, 1, 3, 3, 5 }
// 2 


        // val = 3

        // Scanner iScanner = new Scanner(System.in, "cp866");
        // System.out.print("Введиет имя: ");
        // String name = iScanner.nextLine();

        // System.out.printf("Привет, %s!", name);

        // iScanner.close();

        // int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        // int count = 0;
        // int countMax = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 1) {
        // count++;
        // } else {
        // countMax = count;
        // count = 0;
        // }
        // }

        // if (countMax < count) {
        // countMax = count;
        // }
        // System.out.println(countMax);
        // System.out.println(Arrays.toString(arr));
    }

}