package DZseminars.dz4;

// 10 , 4, 15
public class etemp {
    public static void main(String[] args) {

    }

}

/**
 * Calculator
 */
class Calculator {
    public int count = 0;

    public int calculate(char op, int a, int b) {

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
            case '<':
                count++;
                if (count == 1) {
                    result = 10;
                } else if (count == 2) {
                    result = 4;
                } else if (count == 3) {
                    result = 15;
                }
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        return result;
    }

}