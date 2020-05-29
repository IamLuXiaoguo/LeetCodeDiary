package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/29 20:25
 * @description:
 * 115. 不同的路径 II
 * "不同的路径" 的跟进问题：
 * 现在考虑网格中有障碍物，那样将会有多少条不同的路径？
 * 网格中的障碍和空位置分别用 1 和 0 来表示。
 */
public class UniquePathsII {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]= new int[m][n];
        if(m==0 ||n==0||obstacleGrid[0][0]==1) return 0;
        dp[0][0]=1;

        //初值 排除障碍
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]!=1) dp[i][0]=dp[i-1][0];
            else dp[i][0]=0;
        }
        for(int j=1;j<n;j++){
            if(obstacleGrid[0][j]!=1) dp[0][j]=dp[0][j-1];
            else dp[0][j]=0;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                //排除障碍
                if(obstacleGrid[i][j]!=1) dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else dp[i][j]=0;
            }
        }
        return dp[m-1][n-1];
    }
}
