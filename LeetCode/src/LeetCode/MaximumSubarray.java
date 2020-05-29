package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/29 9:07
 * @description:
 * 41. 最大子数组
 * 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。
 */
public class MaximumSubarray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int []dp = new int[nums.length];
        dp[0]=nums[0];
        int result=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],0)+nums[i];
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}
