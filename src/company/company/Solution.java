package company.company;

import java.util.HashMap;
import java.util.Map;

//两数之和
//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
//给定 nums = [2, 7, 11, 15], target = 9
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ans = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (ans.containsKey(target - nums[i]))
                return new int[]{ans.get(target - nums[i]), i};
            ans.put(nums[i], i);
        }
        return null;
    }
}
