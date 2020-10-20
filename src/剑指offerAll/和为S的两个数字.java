package 剑指offerAll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class 和为S的两个数字 {

    /**
     * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，
     * 使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可
     */
    public static int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length / 2;
        while (i < j) {
            int num = nums[i] + nums[j];
            if (num < target) i++;
            else if (num > target) j--;
            else
                return new int[]{nums[i], nums[j]};
        }
        return new int[0];
    }


    public static int[] twoSum2(int[] nums, int target) {
//        Set<Integer>  set = new HashSet<>();
//        for (int i=0;i<nums.length;i++){
//            set.add(nums[i]);
//            int s= target-nums[i];
//            if (set.contains(s)){
//
//                return new int[]{target-nums[i],nums[i]};
//            }
//        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            int s = target - nums[i];
            if (list.contains(s)) {

                return new int[]{target - nums[i], nums[i]};
            }
        }


        return new int[0];
    }

    public static void main(String[] args) {
        int nums1[] = {16, 16, 18, 24, 30, 32};
        int tar = 48;
        for (int i : twoSum(nums1, tar)) {
            System.out.println(i);
        }

    }


}
