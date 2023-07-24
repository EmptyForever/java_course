package DZseminars.dz1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

// принимаем число 5
// найти сумму всех чисел от 1 до 5
// найти произведение чисел от 1 до 5
// 

public class program1task1 {
    public static void main(String[] args) {
        int resTri = countNTriangle(5);
        System.out.println(resTri);
        factorialN(5);
    }

    public static int countNTriangle(int n) {
        int resSumm = 0;
        for (int i = 1; i <= n; i++) {
            resSumm = resSumm + i;
        }
        // System.out.println(resSumm);
        return resSumm;
    }

    public static void factorialN(int n) {
        int resMultiplication = 1;
        for (int i = 1; i <= n; i++) {
            resMultiplication = resMultiplication * i;
        }
        System.out.println(resMultiplication);
    }
}
