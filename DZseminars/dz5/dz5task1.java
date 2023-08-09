package DZseminars.dz5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class dz5task1 {
    public static void main(String[] args) {
        consoleMain();
    }

    // тут получаем
    // фамилия : номер
    public static Object[] consoleAdd() {
        Scanner iScanner = new Scanner(System.in, "cp866");

        Object[] arrObj = new Object[2];
        System.out.print("Введите фамилию: ");
        String str = iScanner.nextLine();
        System.out.print("Введите номер: ");
        Integer number = iScanner.nextInt();
        arrObj[0] = str;
        arrObj[1] = number;
        return arrObj;

    }

    // тут полученные фамилия имя --> arr Object
    // делаем проверку. Если имя (Arr[0]) есть в нашем HashMap
    // - добавляем номер к листу ИНАЧЕ
    // - добавляем новый контакт
    public static void telephoneBook(HashMap<String, LinkedList<Integer>> bookPhones) {
        Object[] arrObj = new Object[2];
        // for (int i = 0; i < 3; i++) {
        LinkedList<Integer> listPhoneTemp = new LinkedList<>();
        // listPhoneTemp.clear();
        arrObj = consoleAdd();
        if (bookPhones.containsKey(arrObj[0])) {
            bookPhones.get(arrObj[0]).add((int) arrObj[1]);
        } else {
            listPhoneTemp.add((int) arrObj[1]);
            bookPhones.put(arrObj[0].toString(), listPhoneTemp);
            // System.out.println(bookPhones);
        }
        // }
    }

    public static void consoleMain() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        HashMap<String, LinkedList<Integer>> bookPhones = new HashMap<>();
        while (true) {
            printMenu();
            String str = iScanner.nextLine();
            if (str.equals("exit")) {
                break;
            } else if (str.equals("add")) {
                telephoneBook(bookPhones);
            } else if (str.equals("print all")) {
                System.out.println(bookPhones);
            }
        }
        iScanner.close();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("Введите exit, чтобы выйти");
        System.out.println("Введите add, чтобы добавить контакт");
        System.out.println("Введите print all, чтобы вывести всех");
        System.out.println();
    }

}
