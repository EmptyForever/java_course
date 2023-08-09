package DZseminars.dz4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dz4task3 {
    public static void main(String[] args) {
        // Calculator calculator = new Calculator();
        // int result = calculator.calculate(op, a, b);
        // System.out.println(result);
        // int result2 = calculator.calculate(op2, c, d);
        // System.out.println(result2);
        // int prevResult = calculator.calculate(undo, 0, 0);
        // System.out.println(prevResult);


        Scanner iScanner = new Scanner(System.in, "cp866");
        Calculator calc = new Calculator();
        Deque<Integer> deq = calc.createDeque();
        for (int i = 0; i < 6; i++) {

            char op = Calculator.getChar(iScanner);
            int num1 = Calculator.getInt(iScanner);
            int num2 = Calculator.getInt(iScanner);

            int endRes = Calculator.calculate(num1, op, num2);
            // System.out.printf("результат: %d\n", endRes);
            if (op != '<') {
                System.out.printf("результат: %d\n", endRes);
            } else {
                int tempDeq = deq.pop();
                System.out.println(deq);
                // deq.pop();
                System.out.printf("результат: %d\n", deq.getFirst());
                // System.out.println(deq);
                deq.add(tempDeq);
                // System.out.println(deq);

            }

            if (op != '<') {
                deq.addFirst(endRes);
            } else {
                // deq.addFirst(endRes);
            }
            System.out.println(deq);
        }
        iScanner.close();
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
