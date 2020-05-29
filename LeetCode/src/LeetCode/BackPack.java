package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/22 16:43
 * @description:
 * 92. 背包问题
 * 在n个物品中挑选若干物品装入背包，最多能装多满？假设背包的大小为m，每个物品的大小为A[i]
 */
public class BackPack {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
//        //dp[i][j]表示将前i个物品挑选若干放入容量为j的背包，所装的最大值
//        //其中i属于[0,A.length)，0表示第一个物品，j属于[0,m]，0表示容量为0
//        int[][] dp = new int[A.length][m+1];
//
//        //边界条件，第一行
//        for(int j=0; j<=m; j++)
//            dp[0][j] = ( j >= A[0] ? A[0] : 0);
//
//        //递推式
//        for(int i=1; i<A.length; i++){
//            for(int j=0; j<=m; j++){
//                dp[i][j] = dp[i-1][j];
//                if(j >= A[i])
//                    dp[i][j] = Math.max(dp[i][j], A[i]+dp[i-1][j-A[i]]);
//            }
//        }
//
//        return dp[A.length-1][m];

        //优化
        int[] dp = new int[m+1];

        for(int j=0; j<=m; j++)
            dp[j] = (j >= A[0]) ? A[0] : 0;

        for(int i=1; i<A.length; i++)
            for(int j=m; j>=A[i]; j--)
                dp[j] = Math.max(dp[j], dp[j - A[i]] + A[i]);

        return dp[m];
    }

    public static void main(String [] args){
        int  m = 10 ;
        int []A={3,4,8,5};
        BackPack backPack =new BackPack();
        System.out.println(backPack.backPack(m,A));
    }
}
