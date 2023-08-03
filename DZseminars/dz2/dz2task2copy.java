package DZseminars.dz2;

// import java.io.File;
import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.BufferedReader;
// import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class dz2task2copy {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] { 9, 5, 4, 3, 6 };
        sort(arr);
    }

    // private static File log;
    // private static FileWriter fileWriter;

    public static void sort(int[] mas) throws Exception {
        FileWriter fw = new FileWriter("log.txt", false);
        int temp;
        boolean isSorted = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm ");

        String date = dateFormat.format(new Date());
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
            fw.append(date + Arrays.toString(mas) + "\n");
        }
        fw.flush();
        fw.close();
    }

}
