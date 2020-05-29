package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/29 15:51
 * @description:
 * 114. 不同的路径
 * 有一个机器人的位于一个 m × n 个网格左上角。
 * 机器人每一时刻只能向下或者向右移动一步。机器人试图达到网格的右下角。
 * 问有多少条不同的路径？
 */
public class UniquePaths {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        int [][] dp=new int[m][n];

        //初值 第一行第一列各个位置到达起点的路径都只有1条
        for(int i = 0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j = 0;j<n;j++){
            dp[0][j]=1;
        }

        for(int i=1;i<m;++i){
            for(int j=1;j<n;++j){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
