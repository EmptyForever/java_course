
import java.util.Scanner;

public class program {

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
    // int[] arr = new int[10];
    // System.out.println(arr.length);
    // arr = new int[] { 1, 2, 3, 4, 5 };
    // System.out.println(arr.length);
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
    // int[][] arr = new int[3][5];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.printf("%d", arr[i][j]);
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

    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }

}