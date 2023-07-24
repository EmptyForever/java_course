
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

// принимаем число 5
// найти сумму всех чисел от 1 до 5
// найти произведение чисел от 1 до 5

package DZseminars.dz1;

/**
 * program1task2
 */
public class program1task2 {
    public static void main(String[] args) {
        // printPrimeNums();
        printPrimeNums2();
    }

    // у числа надо проверить количество делителей. идём от 1 до самого числа
    // если count делителей становится больше двух, то прекращаем этот цикл
    // иначе печатаем число i

    public static void printPrimeNums() {
        int count = 0;
        int temp = 0;
        for (int i = 1; i <= 1001; i++) {
            count = 0;
            temp = 0;
            for (int j = 1; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            temp = count;
            if (temp > 1) {

            } else {
                System.out.println(i);
            }
        }
        // System.out.println("g");
    }

    public static void printPrimeNums2() {
        boolean isPrime;
        for (int i = 1; i < 1000; i++) {
            isPrime = i == 1;
            for (int j = 2; j < 1000; j++) {
                if (i >= j && i % j == 0) {
                    if (j == i) {
                        isPrime = true;
                    }
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }

    }
}