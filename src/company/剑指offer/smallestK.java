package company.剑指offer;


import java.util.ArrayList;
import java.util.Scanner;

public class smallestK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (k > input.length) {
            return al;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            al.add(input[input.length - i - 1]);
        }
        return al;

    }
    public static void main(String[] args) {
        int[] arr= {4,5,1,6,2,7,3,8};
        int  k=4;
        smallestK s=new smallestK();

        ArrayList<Integer> list = s.GetLeastNumbers_Solution(arr, 4);

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
}}




