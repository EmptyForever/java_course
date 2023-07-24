package seminars.seminar2;
// Напишите метод, который принимает на вход строку (String) и определяет 

// является ли строка палиндромом (возвращает boolean значение).
// abcba

public class program1task3 {
    public static void main(String[] args) {
        String str1 = "abccfba";
        boolean flag = palindrom(str1);
        System.out.println(flag);
    }

    public static Boolean palindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            // a    b   a
            // 0    1   2
            // 
            // str.charAt(i) = 0
            // str.charAt(str.length() - i - 1) = 2
            //                  3      - 0 - 1  = 2
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
