package DZseminars.dz2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class dz2task2 {
    public static void main(String[] args) throws Exception {
        // int[] arr1 = new int[] { 9, 4, 8, 3, 1 };
        int[] mas1 = new int[] { 9, 4, 8, 3, 1 };
        // int[] mas1 = { 11, 3, 14, 16, 7 };
        // int[] mas1 = { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
        sort(mas1);
    }

    // 1. сортировки пузырьком числового массива
    // +
    // 2. результат после каждой итерации
    // +
    // запишите в лог-файл
    // -
    // После каждой итерации, ваш код должен делать запись
    // -
    // в лог-файл 'log.txt' в формате
    // +
    // год-месяц-день час:минуты {массив на данной итерации}.

    public static void sort(int[] mas) throws Exception {
        int temp;
        boolean isSorted = false;

        Logger logger = Logger.getLogger(dz2task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        // JmeFormatter formatter = new JmeFormatter();
        // JmeFormatter
        

        fh.setFormatter(sFormat);
        // fh.setFormatter(xml);
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
            logger.info(Arrays.toString(mas));
            // logger.info(Arrays.toString(mas));
            // logger.log(Level.INFO, Arrays.toString(mas));
            // logger.log(Level.WARNING, Arrays.toString(mas));
        }
    }

}

// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.util.Arrays;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.text.DateFormat;

// class BubbleSort {
    // private static File log;
    // private static FileWriter fileWriter;
    
    // public static void sort(int[] mas) throws Exception {
//        FileWriter fw = new FileWriter("log.txt", false);
//        int temp;
//        boolean isSorted = false;
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm ");

//        String date = dateFormat.format(new Date());
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length - 1; i++) {
//                if (mas[i] > mas[i + 1]) {
//                    isSorted = false;
//                    temp = mas[i];
//                    mas[i] = mas[i + 1];
//                    mas[i + 1] = temp;
//                 }
//             }
//             fw.append(date + Arrays.toString(mas) + "\n");
//   }
//        fw.flush();
//        fw.close(); 
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) throws Exception { 
//       int[] arr = {};
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         arr = new int[]{9, 4, 8, 3, 1};
//       }
//       else{
//         arr = Arrays.stream(args[0].split(", "))
//                         .mapToInt(Integer::parseInt)
//                         .toArray();
//       }     
      
//       BubbleSort ans = new BubbleSort();   
//       ans.sort(arr);
      

//       try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }