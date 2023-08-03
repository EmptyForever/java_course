package DZseminars.dz2;

public class dz2task1 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        // StringBuilder sb = met123(QUERY, PARAMS);
        // System.out.println(sb);

        StringBuilder sb1 = answer(QUERY, PARAMS);
        System.out.println(sb1);
    }

    public static StringBuilder answer(String QUERY, String PARAMS) {
        System.out.println(PARAMS);
        String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
        System.out.println(paramsNew);

        String[] params = paramsNew.split(",");
        for (int i = 0; i < params.length; i++) {
            System.out.printf("=%s=", params[i]);
            // System.out.println();
        }
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder(QUERY);
        System.out.println(stringBuilder);
        for (int i = 0; i < params.length; i++) {
            String[] elements = params[i].replace('"', ' ').split(":");
            for (int j = 0; j < elements.length; j++) {
                System.out.printf("=%s=", elements[j]);
                // System.out.println();
            }
            System.out.println();
            if (!"null".equals(elements[1].trim())) {
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2)
                    stringBuilder.append(" and ");
            }
        }
        return stringBuilder;
    }

    public static StringBuilder met123(String QUERY, String PARAMS) {
        StringBuilder sbP = new StringBuilder();
        String str2 = PARAMS.replaceAll(", ", " and ");

        String str3 = str2.replaceAll(":", "=");
        int countTempSimvol = 0;
        // System.out.println(str3);
        String[] arr = str3.split(" and ");
        String[] arr2[] = new String[arr.length][2];
        String[] tempArr = new String[2];
        for (int i = 0; i < arr.length; i++) {
            tempArr = arr[i].split("=");
            arr2[i][0] = tempArr[0];
            arr2[i][1] = tempArr[1];
            if (arr2[i][1].equals("\"Ivanov\"") == false && arr2[i][1].equals("\"null\"}") == false) {
                // System.out.printf("%s%s", arr2[i][0], arr2[i][1]);
                // System.out.println();
            }
        }
        StringBuilder sbRes = new StringBuilder();
        String str10 = "\"null\"";
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr2[i][1].equals(str10) == false && arr2[i][1].equals("\"null\"}") == false) {
                sbRes.append(arr2[i][0] + '=' + " ").append(arr2[i][1] + " and ");
            }
        }
        if (arr2[arr.length - 1][1].equals("\"null\"")) {
            sbRes.append(arr2[arr.length - 2][0] + '=').append(arr2[arr.length - 2][1]);
        } else {
            sbRes.append(arr2[arr.length - 2][0] + '=').append(arr2[arr.length - 2][1]);
            // sbRes.append(arr2[arr.length - 1][0] + '=' + " ").append(arr2[arr.length -
            // 1][1]);
        }

        String str4Res = sbRes.toString();
        // System.out.println(str4Res);

        for (int i = 0; i < QUERY.length(); i++) {
            sbP.append(QUERY.charAt(i));
        }
        int lengthTemp = str4Res.length();

        for (int i = 1; i < lengthTemp; i++) {
            if (str4Res.charAt(i) == '"') {
                if (countTempSimvol == 2 || countTempSimvol == 3 || countTempSimvol == 6 || countTempSimvol == 7
                        || countTempSimvol == 10 || countTempSimvol == 11 || countTempSimvol == 14
                        || countTempSimvol == 15) {
                    sbP.append("'");
                    countTempSimvol++;
                } else {
                    sbP.append("");
                    countTempSimvol++;
                }
            } else {
                sbP.append(str4Res.charAt(i));
            }
        }

        return sbP;
    }

}