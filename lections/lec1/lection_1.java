
import java.util.Random;
import java.util.Scanner;

public class lection_1 {

    // public static void main1(String[] args) {
    // char ch = '1';
    // System.out.println(Character.isDigit(ch));
    // ch = 'a';
    // System.out.println(Character.isDigit(ch));
    // }

    // public static void main2(String[] args) {
    // boolean flag1 = 123 <= 234;
    // System.out.println(flag1);
    // boolean flag2 = 123>= 234 || flag1;
    // System.out.println(flag2);
    // boolean flag3 = flag1 ^ flag2;
    // System.out.println(flag3);
    // }

    // public static void main(String[] args) {
    // String msg = "hello Worl";
    // System.out.println(msg);
    // }

    // public static void main(String[] args) {
    // var a = 123;
    // System.out.println(a);
    // var d = 123.456;
    // System.out.println(d);
    // }

    // public static void main(String[] args) {
    // var a = 123;
    // System.out.println(a);
    // var d = 123.456;
    // System.out.println(d);
    // System.out.println(getType(a));
    // System.out.println(getType(d));
    // d = 1022;
    // System.out.println(d);
    // System.err.println(getType(d));
    // d = "miss";
    // }
    // static String getType(Object o){
    // return o.getClass().getSimpleName();
    // }

    // public static void main(String[] args) {
    // Примитив Обертка
    // int Integer
    // short Short
    // long Long
    // byte Byte
    // float Float
    // double Double
    // char Character
    // boolean Boolean
    // }

    // public static void main(String[] args) {
    // System.out.println(Integer.MAX_VALUE); // 2147483647
    // System.out.println(Integer.MIN_VALUE); // -2147483648
    // }

    // Операции Java
    // присваивание =
    // арифметические * / + - % ++ --
    // операции сравнения < > == != >= <=
    // логические операции || && ^ !
    // побитовые операции << >> & | ^

    // public static void main(String[] args) {
    // // арифметика
    // int temp1 = 123;
    // System.out.println(temp1);
    // temp1 = temp1 * 4;
    // System.out.println(temp1);
    // temp1 = temp1 / 2;
    // System.out.println(temp1);
    // temp1 = temp1 - 4;
    // System.out.println(temp1);
    // temp1 += 2;
    // System.out.println(temp1);
    // temp1++;
    // System.out.println(temp1);
    // temp1--;
    // temp1--;
    // System.out.println(temp1);
    // // операции сравнения
    // boolean flag11 = 123 > 200;
    // boolean flag12 = 123 != 200;
    // System.out.println(flag11);
    // System.out.println(flag12);
    // // логические операции
    // boolean flag13 = flag11 || flag12;
    // boolean flag14 = flag11 && flag12;
    // System.out.println(flag13);
    // System.out.println(flag14);
    // boolean flag15 = flag11 ^ flag12;
    // System.out.println(flag15);
    // boolean flag16 = !flag11;
    // boolean flag17 = !flag12;
    // System.err.println(flag16);
    // System.err.println(flag17);
    // // побитовые операции
    // // фиг с ними
    // }
    // public static void main(String[] args) {
    // }
    // public static void main(String[] args) {
    // int[] arr[] = new int[3][5];
    // for (int[] line : arr) {
    // for (int item : line) {
    // System.out.printf("%d", item);
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args) {
    // int i = 123;
    // double d = 3.1415;
    // System.out.println(i);
    // System.out.println(d);
    // i = (int)d;
    // System.out.println(i);
    // System.out.println(d);
    // }

    // НЕЛЬЗЯ!!!!!!!!!
    // public static void main(String[] args) {
    // int[] a = new int[10];
    // double[] d = new double[10];
    // d = a;
    // }
    // НЕЛЬЗЯ!!!!!!!!!

    // ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА
    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("name: ");;
    // String name = iScanner.nextLine();
    // System.out.printf("Привет, %s!", name);
    // iScanner.close();
    // }

    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("int a: ");
    // int x = iScanner.nextInt();
    // System.out.printf("double a: ");
    // double y = iScanner.nextDouble();
    // System.out.printf("%d + %f = %f", x, y, x + y);
    // iScanner.close();
    // }

    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("int a: ");
    // boolean flag = iScanner.hasNextInt();
    // System.out.println(flag);
    // int i = iScanner.nextInt();
    // System.out.println(i);
    // iScanner.close();
    // }

    // public static void main(String[] args) {
    // int a = 1, b = 2;
    // int c = a + b;
    // String res = a + " + " + b + " = " + c;
    // System.out.println(res);
    // }

    // public static void main(String[] args) {
    // int a = 1, b = 2;
    // int c = a + b;
    // String res = String.format("%d + %d = %d \n", a, b, c);
    // System.out.printf("%d + %d = %d \n", a, b, c);
    // System.out.println(res);
    // }

    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in, "cp866");
    // boolean flag = iScanner.hasNextFloat();
    // if (flag) {
    // float x = iScanner.nextFloat();
    // System.out.printf("%.2f\n", x);
    // }
    // System.out.println(flag);
    // iScanner.close();
    // }

    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in, "cp866");
    // boolean flag = iScanner.hasNextFloat();
    // if (flag) {
    // int i = 123;
    // System.out.println(i);

    // }
    // System.out.println(i);
    // System.out.println(flag);
    // iScanner.close();
    // }

    // public static void sayHi() {
    // System.out.println("hi!");
    // }

    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static double factor(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // return n * factor(n - 1);
    // }

    // public static void main(String[] args) {
    // sayHi();
    // System.out.println(sum(1, 3));
    // System.out.println(factor(5));
    // }

    // public static void main(String[] args) {
    // int a = 3;
    // int b = 2;
    // int min = a < b ? a : b;
    // System.out.println(min);
    // }

    public static void main(String[] args) {
        // printStarMatrix();
        // createArr();
        // printMatrix();
        // printMatrix2();
        // formatFloat();
        // switchConstruction();
        // whileStandart();
        // contineTest();
        // breakTest();
        // newRandomCreate();
        // lection_1_task1(3);
        met123();
    }

    public static void met123() {
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void printStarMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void createArr() {
        int[] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length);
    }

    public static void printMatrix() {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }

    public static void printMatrix2() {
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void formatFloat() {
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);
        System.out.printf("%.2f\n", pi);
        System.out.printf("%.3f\n", pi);
        System.out.printf("%e\n", pi);
        System.out.printf("%.2e\n", pi);
        System.out.printf("%.3e\n", pi);
        // 3,141500
        // 3,14
        // 3,141
        // 3,141500e+00
        // 3,14e+00
        // 3,141e+00
    }

    public static void switchConstruction() {
        Scanner iScanner = new Scanner(System.in);
        // int value = iScanner.nextInt();
        String mounth = iScanner.nextLine();
        String text = "";
        switch (mounth) {
            case "1":
                text = "first";
                break;
            case "2":
                text = "second";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }

    public static void whileStandart() {
        int value = 123;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    // Циклы continue,break

    // Операторы для
    // управления циклами—continue и break.
    // Выполнение следующей
    // итерации цикла—continue.
    // Прерывание текущей
    // итерации цикла—break.*
    // ближайшего к оператору

    public static void contineTest() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 1) {
                    continue;
                }
                System.out.printf("%d ", arr[i][j]);
                // 0 0 0 0

                // 0 0 0 0
                // 0 0 0 0
            }
            System.out.println();
        }
    }

    public static void breakTest() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%d ", arr[i][j]);
                if (i == 1 && j == 1) {
                    break;
                }
                // 0 0 0 0
                // 0 0
                // 0 0 0 0
                // 0 0 0 0
            }
            System.out.println();
        }
    }

    public static void newRandomCreate() {
        Random rnd = new Random();
        int randomNum = rnd.nextInt(50, 100);
        for (int i = 0; i < 10; i++) {
            randomNum = rnd.nextInt(50, 100);
            System.out.println(randomNum);
        }
    }

    public static void lection_1_task1(int k) {
        Random rnd = new Random();
        int randomNum = 0;
        int temp = k;
        for (int i = 0; i < temp; i++) {
            randomNum = rnd.nextInt(0, 4);
            if (randomNum != 0 && randomNum != 1) {
                if (k == 1) {
                    // randomNum = rnd.nextInt(0, 101);
                    System.out.printf("%d*x + ", randomNum);
                    k--;
                    break;
                }
                System.out.printf("%d*x^%d + ", randomNum, k);
                k--;
            } else {

                // System.out.printf("%d*x^%d + ", randomNum, k);
                k--;
            }
        }
        randomNum = rnd.nextInt(0, 101);
        System.out.printf("%d = 0", randomNum);
    }

}
