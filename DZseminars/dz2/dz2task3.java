package DZseminars.dz2;

public class dz2task3 {
    public static void main(String[] args) {
        String JSON222 = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String ELEMENT122 = "Студент ";
        String ELEMENT222 = " получил ";
        String ELEMENT322 = " по предмету ";
        StringBuilder sb1 = met123(JSON222, ELEMENT122, ELEMENT222, ELEMENT322);
        System.out.println(sb1);
    }

    public static StringBuilder met123(String json, String elem1, String elem2, String elem3) {
        StringBuilder sb = new StringBuilder();
        
        String str1 = json.replace("[", "");
        String str2 = str1.replace("]", "");

        String[] strArr = str2.split("},");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replace("{", "").replace("}", "");
        }
        String[][] matrixStudent = new String[strArr.length][3];
        for (int i = 0; i < matrixStudent.length; i++) {
            matrixStudent[i] = strArr[i].split(",");
        }

        for (int i = 0; i < 3; i++) {
            sb.append(elem1);
            String[] tempArr = matrixStudent[i][0].split(":");
            sb.append(tempArr[1].replace('"', ' ').trim());

            sb.append(elem2);
            String[] tempArr1 = matrixStudent[i][1].split(":");
            sb.append(tempArr1[1].replace('"', ' ').trim());

            sb.append(elem3);
            String[] tempArr2 = matrixStudent[i][2].split(":");
            sb.append(tempArr2[1].replace('"', ' ').trim());
            sb.append("\n");
        }

        return sb;
    }

}

// решение для автотеста. там баг...
// StringBuilder a123 = ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    //   System.out.println(a123);
// class Answer {  
//     public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
//         // Напишите свое решение ниже
//         StringBuilder sb = new StringBuilder();

//         String str1 = JSON.replace("[", "");
//         String str2 = str1.replace("]", "");

//         String[] strArr = str2.split("},");

//         for (int i = 0; i < strArr.length; i++) {
//             strArr[i] = strArr[i].replace("{", "").replace("}", "");
//         }
//         String[][] matrixStudent = new String[strArr.length][3];
//         for (int i = 0; i < matrixStudent.length; i++) {
//             matrixStudent[i] = strArr[i].split(",");
//         }

//         for (int i = 0; i < 3; i++) {
//             sb.append(ELEMENT1);
//             String[] tempArr = matrixStudent[i][0].split(":");
//             sb.append(tempArr[1].replace('"', ' ').trim());

//             sb.append(ELEMENT2);
//             String[] tempArr1 = matrixStudent[i][1].split(":");
//             sb.append(tempArr1[1].replace('"', ' ').trim());

//             sb.append(ELEMENT3);
//             String[] tempArr2 = matrixStudent[i][2].split(":");
//             sb.append(tempArr2[1].replace('"', ' ').trim());
//             sb.append("\n");
//         }

//         return sb;
//     }
// }


// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
// 	public static void main(String[] args) { 
//       String JSON = "";
//       String ELEMENT1 = "";
//       String ELEMENT2 = "";
//       String ELEMENT3 = "";
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//         	"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//         	"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
// 	    ELEMENT1 = "Студент ";
//         ELEMENT2 = " получил ";
//         ELEMENT3 = " по предмету ";
//       }
//       else{
//         JSON = args[0];
// 	    ELEMENT1 = args[1];
//         ELEMENT2 = args[2];
//         ELEMENT3 = args[3];
//       }     
      
//       Answer ans = new Answer();      
//       StringBuilder a123 = ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
//       System.out.println(a123);
// 	}
// }




