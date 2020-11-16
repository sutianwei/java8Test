package 剑指offerAll;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 */
public class 重复数字 {

    public int findRepeatNumber1(int[] nums) {

        int arr[] = new int[nums.length];
        arr[0] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] == i) {
                return nums[i];
            }

            arr[nums[i]] = i;
        }
        return -2;
    }


    /**
     * 采用Set，遍历整个nums数组，如果set中存在，说明这个数字重复了，直接返回。
     * 如果不存在，那就继续添加下一个
     */
    public static int findRepeatNumber2(int[] nums) {
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
    public static void main(String[] args) {
        int [] a={1,2,3,3,4};
        System.out.println(findRepeatNumber2(a));
    }

    public int findRepeatNumber3(int[] nums) {
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


    /**
     * 遍历数组nums，使用临时数组arr，因为每一个数字都是0-n的数字，
     * 第一次arr[nums[index]] =0，第二次的时候就是当重复的那个值
     */
    public static int findRepeatNumber4(int[] nums) {

        int[] arr = new int[nums.length];
//        for (int num : nums) {
//            if (++arr[num] > 1)
//                return num;
//        }
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }

        return -1;
    }



    public int findRepeatNumber5(int[] nums) {
        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -2;
    }

}
