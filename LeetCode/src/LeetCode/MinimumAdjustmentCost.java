package LeetCode;

import java.util.List;

/**
 * @Author: Coder13
 * @Date: 2020/5/27 8:08
 * @description:
 * 91. 最小调整代价
 * 给一个整数数组，调整每个数的大小，使得相邻的两个数的差不大于一个给定的整数target，
 * 调整每个数的代价为调整前后的差的绝对值，求调整代价之和最小是多少。
 */
public class MinimumAdjustmentCost {
    /*
     * @param A: An integer array
     * @param target: An integer
     * @return: An integer
     */
    public int MinAdjustmentCost(List<Integer> A, int target) {
        // write your code here
        int[][] dp=new int[A.size()+1][101];
        //dp[i][j]表示数字A[i]调整到j的最小代价，dp[i][j]为数字A[i-1]调整到k的最小代价加上A[i]调整到j之和。
        // k的取值有100种，应挑选与j之差绝对值不大于target的，代价最小
        for(int i=1;i<=A.size();i++){
            for(int j=0;j<=100;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=1;i<=A.size();i++){
            for(int j=0;j<=100;j++){
                int left=Math.max(1,j-target);  //k可调整到的最小值
                int right=Math.min(100,j+target);  //k可调整到的最大值
                for(int k=left;k<=right;k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.abs(A.get(i-1) - j)); //此时A[i]移动到j的位置，cost为abs(A.get(i)-j)
                }
            }
        }
        int mincost=Integer.MAX_VALUE;
        for(int i=0;i<=100;i++){
            if(mincost>dp[A.size()][i]){
                mincost=dp[A.size()][i];
            }
        }
        return mincost;
    }
}
