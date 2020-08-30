package company.offer;

/*
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * */
public class 重复数字 {
    public static int duplication;

    public static boolean duplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] >= arr.length) {
                return false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    duplication = arr[i];
                    System.out.println(arr[i]);
                    return true;
                }

                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3,3, 1, 4, 2, 5, 7};
        boolean result = duplicate(arr);
        System.out.println(result);
    }


}
