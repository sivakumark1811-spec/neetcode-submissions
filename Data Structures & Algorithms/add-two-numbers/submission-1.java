/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int carry =0;
       ListNode result= new ListNode(0);
       ListNode temp = result;
       while(l1!=null || l2!=null || carry!=0){
        int a =l1!=null?l1.val:0;
        int b =l2!=null?l2.val:0;
        temp.next=new ListNode((a + b +carry)%10);
        carry=(a + b +carry)/10;
        temp=temp.next;
        if (l1!=null)l1=l1.next;
        if (l2!=null)l2=l2.next;
       }
       return result.next;
    }
}
