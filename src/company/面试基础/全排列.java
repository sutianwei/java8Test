package company.面试基础;

public class 全排列 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
//        int[] arr = {1, 2, 3, 4};

        fullSort(arr, 0, arr.length - 1);
    }  public static void fullSort(String[] arr, int start, int end) {
        // 递归终止条件
        if (start == end) {
            for (String i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            //1，2，3的全排列这块相当于将其中一个提了出来，下次递归从start+1开始
            swap(arr, i, start);
            fullSort(arr, start + 1, end);
            //这块是复原数组，为了保证下次另外的同级递归使用数组不会出错
            //这块可以通过树来理解，每次回退一步操作，交换回去
            swap(arr, i, start);
        }
    }





    private static void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
