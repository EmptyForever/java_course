package DZseminars.dz3;

public class tempTest {
    public static void main(String[] args) {
        // String str1 = "[1, 3, 5, 7, 9]
        // Minimum is 1
        // Maximum is 9
        // Average is = 5";
        String str2 = "[1, 3, 5, 7, 9]        Minimum is 1        Maximum is 9        Average is = 5";
        String str3 = "[1, 3, 5, 7, 9]\r\n" + //
                "Minimum is 1\r\n" + //
                "Maximum is 9\r\n" + //
                "Average is = 5";
        String str5 = "[1, 3, 5, 7, 9]\r\n" + //
                "Minimum is 1\r\n" + //
                "Maximum is 9\r\n" + //
                "Average is = 5";
        System.out.println(str5.equals(str3));

    }
}
