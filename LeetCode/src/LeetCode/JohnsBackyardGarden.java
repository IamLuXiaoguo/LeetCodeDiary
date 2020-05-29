package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/21 23:54
 * @description:
 *749. 约翰的后花园
 * 约翰想在他家后面的空地上建一个后花园，
 * 现在有两种砖，一种3 dm的高度，7 dm的高度。约翰想围成x dm的墙。
 * 如果约翰能做到，输出YES，否则输出NO。
 */
public class JohnsBackyardGarden {
//    public String isBuild(int x) {
//        // write you code here
//        if(trueOrFalse(x)) return "YES";
//        return "NO";
//    }
//    private boolean trueOrFalse(int x){
//        if(x<0) return false;
//        if(x==0) return true;
//        //同时-3 -7 求或的操作
//        return trueOrFalse(x-3) || trueOrFalse(x-7);
//    }

 /*
  * 另一种算法的思路：输入 x,如果要返回YES的话，
  * 那么这个x，一定是包含n个3和m个7的（n,m=0,1,2,3,...）
  *   1、先判断x是否是3或7的倍数
  *   2、如果不是，则判断x-7后，是否是3的倍数
  *   3、继续执行步骤2，直到x<7
  */
    public String isBuild(int x) {

        // write you code here
        if(x%3==0||x%7==0) return "YES";
        if(trueOrFalse(x)) return "YES";
        return "NO";
    }
    private boolean trueOrFalse(int x){
        //下面两步的步骤顺序不可交换
        if(x%3==0) return true;
        if(x<7) return false;
        return trueOrFalse(x-7);
    }

    public static void main(String [] args){
        int  test = 10 ;
        JohnsBackyardGarden j=new JohnsBackyardGarden();
        System.out.println(j.isBuild(test));
    }


}
