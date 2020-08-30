package company.company;

/**
 * 寻找一数组中前K个最大的数
 */
public class Max {
    private static int searchMax(int[] temp) {
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 12, 8, 6, 98, 3, 4, 1, 12};
        int max = searchMax(a);
        int k = 3;
        //max加1否则是0-97，数组越界98
        int[] temp = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            //可能有相同的数字
            temp[a[i]]++;
        }
        int count = 0;
        for (int j = max; j >= 0; j--) {
            if (count == k) {
                break;
            }
            //可能有相同的所以不用if，用while
            while (temp[j] > 0) {
                count++;
                System.out.println(j);
                temp[j]--;
            }
        }
    }
}
