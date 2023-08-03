package DZseminars.dz1;

import java.util.Scanner;

public class program1task3 {
    public static void main(String[] args) {
        int a = getInt();
        char op = getChar();
        int b = getInt();

        System.out.println(calculate(op, a, b));
    }

    public static int calculate(char op, int a, int b) {
        // iScanner.close();
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        // System.out.printf("%d %c %d = %f", a, op, b, result);
        return result;
    }


    public static char getChar() {
        Scanner iScanner = new Scanner(System.in, "cp866");

        System.out.print("Введите оператор * / - + : ");
        char ch1 = iScanner.next().charAt(0);
        // iScanner.close();
        return ch1;
    }


    public static int getInt() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        int num = iScanner.nextInt();

        // iScanner.close();
        return num;
    }


}
