package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/28 9:56
 * @description:
 * 111. 爬楼梯
 * 假设你正在爬楼梯，需要n步你才能到达顶部。
 * 但每次你只能爬一步或者两步，你能有多少种不同的方法爬到楼顶部？
 */
public class ClimbingStairs {
    /**
     * @param n: An integer
     * @return: An integer
     *
     * 一般解决动态规划问题，分为四个步骤，分别是:
     * 问题拆解，找到问题之间的具体联系
     * 状态定义
     * 递推方程推导
     * 实现
     */
    public int climbStairs(int n) {
        // write your code here
        if(n==0) return 0;
        if(n==1) return 1;
        int []dp  = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
