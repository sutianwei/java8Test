package 剑指offerAll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 重复数字 {

    /**
     * 采用Set，遍历整个nums数组，如果set中存在，说明这个数字重复了，直接返回。
     * 如果不存在，那就继续添加下一个
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (set.contains(num)) {
                repeat = num;
                //跳出循环
                break;
            } else {
                set.add(num);
                repeat = num;
            }

        }
        return repeat;
    }

    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }


    public int findRepeatNumber2(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i =0;i<nums.length;i++){
            arr[nums[i]] ++;
            if (arr[nums[i]] >1){
                return nums[i];
            }
        }

        return -1;
    }

    public int findRepeatNumber3(int[] nums) {

        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -2;
    }




    public static void main(String[] args) {
        int[] d = new int[3];
        d[1] = 2;
        System.out.println(d[1] > 1);
    }


}
