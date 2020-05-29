package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Coder13
 * @Date: 2020/5/18 9:20
 * @description:
 * 56. 两数之和
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
 */
public class TwoSum {
    //Solution 1
    public int[] twoSum(int[]nums, int target){
        int []res = new int[2];
        if(nums==null || nums.length<=1 ) return res;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int val = target-num;
            if(map.containsKey(val)){
                //从前往后进入Map中，注意顺序
                res[1] = i;
                res[0] = map.get(val);
                return res;
            }else{
                map.put(num,i);
            }
        }
        return res;
    }

    //Solution 2
    public int[] twoSum_2(int[]nums, int target){
        int []res = new int[2];
        if(nums==null || nums.length<=1 ) return res;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String [] args){
        int [] test = {2,7,11,46,23,0} ;
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] res = ts.twoSum(test,target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}
