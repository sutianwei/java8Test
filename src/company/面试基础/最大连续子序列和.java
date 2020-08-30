package company.面试基础;

public class 最大连续子序列和 {
    //    public static void main(String[] args) {
//        int[] a = {1,-2,3,10,-4,7,2,-5};
//        int max = maxSubSum1(a);
//        System.out.println(max);
//        // 21
//    }
//
//    private static int maxSubSum1(int[] a) {
//        int maxSum = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a.length; j++) {
//                int thisSum = 0;
//                for (int k = i; k <= j; k++) {
//                    thisSum += a[k];
//                }
//                if (thisSum > maxSum) {
//                    maxSum = thisSum;
//                }
//            }
//        }
//        return maxSum;
//    }
    public static void main(String args[]) {
        int[] a = {-2, 11, -4, 13, -5, 2};
        int[] b = {-2, -11, -4, -13, -5, -2};
        System.out.println(maxSerialSum(b, b.length));
        System.out.println(maxSerialSum1(a, a.length));
        System.out.println(maxSerialSum2(a, a.length));
        System.out.println(maxSerialSum3(b, b.length));
    }

    /**
     * 暴力法  时间复杂度 O(n的三次方)
     *
     * @param a 原始数组
     * @param n 数组长度
     * @return
     */
    public static int maxSerialSum(int a[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {  // 每一个可能开始的起点
            for (int j = i; j < n; j++) {  // 每一个可能结束的点
                int sum = 0;
                for (int k = i; k <= j; k++) { //计算在起点到结束点的和
                    sum += a[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    /**
     * 时间复杂度 O(n的平方)
     *
     * @param a
     * @param n
     * @return
     */
    public static int maxSerialSum1(int a[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {  //起点
            int sum = 0;
            for (int j = i; j < n; j++) {  //终点
                sum += a[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    /**
     * 时间复杂度O(n)  空间复杂度O(n)
     *
     * @param a
     * @param n
     * @return
     */
    public static int maxSerialSum2(int a[], int n) {
        int max = 0;
        int tem[] = new int[n];
        for (int i = 0; i < n; i++) {
            tem[i] = 0;
        }
        if (a[0] > 0) {
            tem[0] = a[0];
        } else {
            tem[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            //这里如果小于0 在加后面的就没有意义了。
            //如果加一负数也不用担心会影响结果，因为tem[i-1]中已经存了没加这个负数时的值，
            //如果后面的结果不大于tem[i-1] 那么会返回tem[i-1]的值。
            if (tem[i - 1] + a[i] > 0) {
                tem[i] = tem[i - 1] + a[i];
            } else {
                // 如果结果小于0 那么就以i为起点算后面的
                tem[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (tem[i] > max) {
                max = tem[i];
            }
        }
        return max;
    }

    /**
     * 思路 ：从头开始加，如果结果小于0 就置为0 ，sumSoFar 用来保存 整个过程中出现的最大值 即结果
     *
     * @param a
     * @param n
     * @return
     */
    public static int maxSerialSum3(int a[], int n) {
        boolean flag = false;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                flag = true;
                break;
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        if (!flag) {
            return max;
        }
        int sumSoFar = 0;
        int sumEndingHere = 0;
        for (int i = 0; i < n; i++) {
            sumEndingHere = sumEndingHere + a[i];
            if (sumEndingHere < 0) {
                sumEndingHere = 0;
                continue;
            }
            if (sumEndingHere > sumSoFar) {
                sumSoFar = sumEndingHere;
            }
        }
        return sumSoFar;
    }
    /**
     * 暴力枚举法
     */
    public static int t1(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if(sum > max) {
                    max = sum;
//                  System.out.println("max = " + max);
                }
            }
        }
        return max;
    }

    /**
     * 预处理暴力枚举法
     */
    public static int t2(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    /**
     * 分治法
     */
    public static int t3(int[] array) {
        return t3(array, 0, array.length - 1);
    }

    public static int t3(int[] array, int left, int right) {
        int sum = 0;
        if(left == right) {
            sum = array[left];
        } else {
            int center = (left + right) / 2;
            //左右两部分的和
            int leftSum = t3(array, left, center);
            int rightSum = t3(array, center + 1, right);

            //求包含左半部分最右元素的最大和
            int s1 = Integer.MIN_VALUE;
            int lefts = 0;
            for (int i = center; i >= left; i--) {
                lefts += array[i];
                if (lefts > s1) {
                    s1 = lefts;
                }
            }

            //求包含右半部分最左元素的最大和
            int s2 = Integer.MIN_VALUE;
            int rights = 0;
            for (int i = center + 1; i <= right; i++) {
                rights += array[i];
                if (rights > s2) {
                    s2 = rights;
                }
            }

            //取三者最大值
            sum = s1 + s2;
            if(sum < leftSum) {
                sum = leftSum;
            }
            if(sum < rightSum) {
                sum = rightSum;
            }
        }
        return sum;
    }

    /**
     * 动态规划法
     */
    public static int t4(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0; //子串和
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}
