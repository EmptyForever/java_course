package DZseminars.dz3;

import java.text.DecimalFormat;
import java.util.Arrays;

public class dz3task3 {
    public static void main(String[] args) {
        Integer[] arr1 = { 4, 2, 7, 5, 1, 3, 8, 6, 9, 9 };
        analyzeNumbers(arr1);
    }

    public static void analyzeNumbers(Integer[] arr) {
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = findMin(arr);
        System.out.printf("Minimum is %d \n", min);

        int max = findMax(arr);
        System.out.printf("Maximum is %d \n", max);

        float sredn = average(arr);

        int tempProveka = (int) sredn;
        DecimalFormat dF = new DecimalFormat("#.#####");
        if (sredn == tempProveka) {
            System.out.printf("Average is = %d", tempProveka);
        } else {
            String tempik = dF.format(sredn);
            System.out.printf("Average is = %s", tempik);
        }
    }

    public static int findMin(Integer[] arr) {
        Integer min = arr[0];
        for (Integer i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(Integer[] arr) {
        Integer max = arr[0];
        for (Integer i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static float average(Integer[] numbers) {
        int length = numbers.length;
        int sum = 0;

        // Находим сумму всех чисел
        for (double num : numbers) {
            sum += num;
        }
        // И делим её на количество слагаемых
        return sum / length;
    }

    // public static float average(Integer[] numbers) {
    // double d = Arrays.stream(numbers).average().getAsDouble();
    // float f = (float) d;
    // return f;
    // }
}
