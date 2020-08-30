package company.company;


/*

 * 如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？

 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。

 * [-2,-8,-1,-5,-9]

 * 问题：求一个数组中连续子向量的最大和

 */

public class FindGreatestSumOfSubArray {

    public int findGreatestSumOfSubArray(int[] array) {

        int sum = array[0];

        int max = array[0];


        for (int i = 1; i < array.length; i++) {

            //前面sum大于0，认为是有贡献的，可以叠加在上面。否则认为没有贡献，另起炉灶

            if (sum >= 0) {

                sum = sum + array[i];

            } else {

                sum = array[i];

            }


            if (sum > max) {

                max = sum;

            }

        }


        return max;

    }


    public static void main(String[] args) {

        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};

        System.out.println(new FindGreatestSumOfSubArray().findGreatestSumOfSubArray(array));

    }

}
