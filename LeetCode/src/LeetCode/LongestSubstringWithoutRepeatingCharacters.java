package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author: Coder13
 * @Date: 2020/5/19 20:41
 * @description:
 * 给定一个字符串，请找出其中无重复字符的最长子字符串。
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int result = 0;
        for(int i = 0;i<s.length();i++){
            int count = 0;
            HashSet<Character> temp = new HashSet<Character>();
            temp.add(s.charAt(i));
            count++;
            for(int j = i+1;j<s.length();j++){
                if(temp.contains(s.charAt(j))){
                    break;
                }else{
                    temp.add(s.charAt(j));
                    count++;
                }
            }
            result = Math.max(result,count);
        }
        return result;
    }
}
