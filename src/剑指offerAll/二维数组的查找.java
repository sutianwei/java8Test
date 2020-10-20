package 剑指offerAll;

public class 二维数组的查找 {
    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     *  
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public boolean find(int[][] matrix, int target) {
            int rows = matrix.length;
            int columns = matrix[0].length;
            for (int i = 0;i<rows;i++){
                for (int j=0;j<columns;j++){
                    if (matrix[i][j] ==target){
                        return true;
                    }
                }
            }
        return true;
    }

    public boolean find2(int[][] matrix, int target) {
       int row=0;int colums = matrix[0].length;
       while (row<matrix.length&&colums>=0){
           int num = matrix[row][colums];
           if (num == target){
               return true;
           }else if (num>target){
               colums--;
           }else {
               row++;
           }
       }
       return false;
    }



}
