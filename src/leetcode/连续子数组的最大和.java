package leetcode;

public class 连续子数组的最大和 {


    public static int maxSum(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int []a =new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(a));
    }

}
