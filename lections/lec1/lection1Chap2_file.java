import java.io.*;

/**
 * lection1Chap2_file
 */
public class lection1Chap2_file {
    public static void main(String[] args) throws Exception {
        // fileWriteTest();
        // fileWriteTest();
        // charReadFile();
        // met123();

        // создание документов с помощью кода
        // String str = "2*x^3 + 3*x^2 + 36 = 0#3*x^3 + 3*x + 0 = 0";
        // String str2 = "2*x^3 + 3*x^2 + 36 = 0";
        // String str3 = "3*x^3 + 3*x + 0 = 0";
        // fileWriteUse(str2, "file2", false);
        // fileWriteUse(str3, "file3", false);
        
        String str1 = fileReadStringMnogochlen("file2");
        String str2 = fileReadStringMnogochlen("file3");
        String str3 = str1 + str2;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        fileWriteUse(str3, "newFile", false);

    }

    // Создание файла и запись\ дозапись
    public static void fileWriteTest() {
        try {
            // true - добавление(дозапись)
            // false - перезапись (удалениеи запись)
            FileWriter fw = new FileWriter("file1.txt", true);
            String str1 = "123456789 11 13 15 17 19";
            fw.write(str1 + "\n");
            fw.write(str1);
            fw.append("\n");
            fw.append(str1);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Создание файла и запись\ дозапись (с переменной строка)
    public static void fileWriteUse(String str1, String fileName, boolean append) {
        try {
            FileWriter fw = new FileWriter(fileName + ".txt", append);
            fw.append(str1);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Чтение, Вариант посимвольно
    public static void charReadFile() throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
            // System.out.print(ch);
        }
        fr.close();
    }

    // Вариант построчно
    public static void fileReadString() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }

    public static String fileReadStringMnogochlen(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
        String str;
        // while (() != null) {
        //     System.out.printf("== %s ==\n", str);
        // }
        str = br.readLine();
        br.close();
        return str;
    }

    // public static void met123() {

    // }

}