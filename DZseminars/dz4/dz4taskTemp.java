package DZseminars.dz4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dz4taskTemp {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "cp866");

        char op = Calculator.getChar(iScanner);
        int num1 = Calculator.getInt(iScanner);
        int num2 = Calculator.getInt(iScanner);
        mainezik.mainezikUse(num1, op, num2);
        iScanner.close();

    }

}

/**
 * Innerdz4task3
 */
class mainezik {
    public static void mainezikUse(int num1, char op, int num2) {
        // Scanner iScanner = new Scanner(System.in, "cp866");
        Calculator calc = new Calculator();
        Deque<Integer> deq = calc.createDeque();
        for (int i = 0; i < 6; i++) {

            // char op = Calculator.getChar(iScanner);
            // int num1 = Calculator.getInt(iScanner);
            // int num2 = Calculator.getInt(iScanner);

            int endRes = Calculator.calculate(num1, op, num2);
            if (op != '<') {
                System.out.printf("результат: %d\n", endRes);
            } else {
                int tempDeq = deq.pop();
                // deq.pop();
                System.out.printf("результат: %d\n", deq.getFirst());
                deq.addFirst(tempDeq);
            }

            if (op != '<') {
                deq.addFirst(endRes);
            }
            // System.out.println(deq);
        }
        // iScanner.close();
    }

}

class Calculator {
    public Deque<Integer> createDeque() {
        Deque<Integer> deq = new ArrayDeque<>();
        return deq;
    }

    public static int getInt(Scanner iScanner) {
        // Scanner iScanner = new Scanner(System.in, "cp866");
        int numTemp = iScanner.nextInt();
        return numTemp;
    }

    public static char getChar(Scanner iScanner) {
        // Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите операцию: ");
        char tempChar = iScanner.next().charAt(0);
        return tempChar;
    }

    public static int calculate(int num1, char op, int num2) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '<':
                System.out.print("Предыдущая операция: ");
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        // Calculator.deq.addFirst(result);
        return result;
    }

}
