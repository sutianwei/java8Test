package 剑指offerAll;

import java.util.ArrayList;
import java.util.Arrays;

public class 数组中出现次数超过一半的数字 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
      return nums[nums.length/2];
    }
}
