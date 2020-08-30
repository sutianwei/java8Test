package company.company;

import java.io.StringReader;

public class aKMP {
    public String repplace(StringBuffer str) {
        int length = str.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")) {

                result.append("20%");
            } else {
                result.append(b);
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        aKMP a = new aKMP();
        StringBuffer ss = new StringBuffer();
        ss.append("we  are harry");

        System.out.println(a.repplace(ss));
    }
}
