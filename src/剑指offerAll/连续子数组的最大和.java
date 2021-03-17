package 剑指offerAll;

public class 连续子数组的最大和 {

    /**
     * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     * <p>
     * 要求时间复杂度为O(n)。
     */


    public int maxSubArray(int[] nums) {

        int res = nums[0];
        for (int i=0;i<nums.length;i++){
            nums[i] +=Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;



    }

}
