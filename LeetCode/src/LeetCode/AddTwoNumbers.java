package LeetCode;

/**
 * @Author: Coder13
 * @Date: 2020/5/19 8:24
 * @description:
 * 你有两个用链表代表的整数，其中每个节点包含一个数字。
 * 数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。
 * 写出一个函数将两个整数相加，用链表形式返回和。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //生成ListNode链表对象，链表的值为0，没有指向的节点
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {

            //两个链表的同一位赋值给变量x和y
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;


            int sum = carry + x + y;
            carry = sum / 10; //这里的carry循环时在上面这个式子用int sum = carry + x + y;


            curr.next = new ListNode(sum % 10);  //如果结果是两位数，各位数留在结果链表里
            curr = curr.next;


            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        //最后一位的进位，如果有进位，把进位放到下一个链表里
        if (carry > 0) {
             curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
