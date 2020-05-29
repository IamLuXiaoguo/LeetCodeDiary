package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/28 22:05
 * @description:
 * 109. 数字三角形
 * 给定一个数字三角形，找到从顶部到底部的最小路径和。
 * 每一步可以移动到下面一行的相邻数字上。
 */
public class Triangle {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        //从后往前
        int n = triangle.length;
        int [][]dp= new int [n][n];
        if(n < 1){
            return 0;
        }

        if(n == 1){
            return triangle[0][0];
        }
        //取最后一行的值作为初值
        for(int i=0;i<triangle[n-1].length;i++){
            dp[n-1][i]=triangle[n-1][i];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<triangle[i].length;j++){
                //注意相邻关系
                dp[i][j]=Math.min(dp[i+1][j],dp[i+1][j+1])+triangle[i][j];
            }
        }
        return dp[0][0];
    }

}
