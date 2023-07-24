package seminars.seminar2;
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaa.

// a4b3cd2a2
public class program1task2 {
    public static void main(String[] args) {
        String str1 = "aaaabbbcd";
        System.out.println(str1);
        String str2 = shatie(str1);
        System.out.println(str2);
    }

    public static String shatie(String str) {
        StringBuilder sb = new StringBuilder();
        Character temp = null;
        Character last = null;
        int countTemp = 1;
        // aabbcdaa
        for (int i = 1; i < str.length(); i++) {
            temp = str.charAt(i); // d
            last = str.charAt(i - 1); //c 
            if (temp == last) {
                countTemp++;
            } else {
                if (countTemp == 1) {
                    sb.append(last);
                } else {
                    sb.append(last).append(countTemp);
                    countTemp = 1;
                }
            }
        }
        if (countTemp == 1) {
            sb.append(temp);
        } else {
            sb.append(temp).append(countTemp);
        }
        return sb.toString();
    }


    
}
