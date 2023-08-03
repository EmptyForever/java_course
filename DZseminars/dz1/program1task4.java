package DZseminars.dz1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

// В файле задано уравнение вида q + w = e (q, w, e >= 0).
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// 1. считать строку из файла

public class program1task4 {
    public static void main(String[] args) throws Exception {
        // String str1 = fileReadString("file1");
        String str1 = getDataFromFile("file1");

        System.out.println(str1);
        // for (int i = 0; i < str1.length(); i++) {
        //     if (str1.charAt(i) == '?') {
        //         System.out.println("?");
        //     }
        // }
        // char ch1 = str1.charAt(0);
        // System.out.println(ch1);
    }

    // принимает одну строку из однострочного файла
    // если файл
    public static String fileReadString(String fileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
        String str;
        str = br.readLine();
        br.close();
        return str;
    }

    // возвращает пустую строку, если файл пуст или его нет
    public static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "";
        }
    }

}
