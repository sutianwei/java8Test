package company.javathead;

public class 字符排序 {
    public static void main(String args[]) {
        String[] input = new String[]{"we", "wer", "rt", "erterte", "tt", "d"};
        String[] ss = new String[]{"z", "f", "a", "g"};
        arrsort(ss);
        arrsort(input);
        for (String s : input) {
            System.out.println(s);
        }
        for (String w : ss) {
            System.out.println(w);
        }
    }

    public static String[] arrsort(String[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j].compareTo(input[j + 1]) > 0) {
                    String temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;


                }
            }
        }
        return input;
    }

}
