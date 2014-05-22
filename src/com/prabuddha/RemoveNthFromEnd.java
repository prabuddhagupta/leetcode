//https://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/

package com.prabuddha;

public class RemoveNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        n++;  //to find one node prior to node to be removed
        ListNode firstPointer = head;
        ListNode secondPointer = head;

        while(secondPointer != null) {
            if(n--<=0) {  //start moving firstPointer only when desired gap  between first and second pointer is created
                firstPointer = firstPointer.next;  
            } 
            secondPointer = secondPointer.next;
        }

        //remove the reference the node in question
        firstPointer.next = firstPointer.next.next;
        return head;
	}

	public static void main(String[] args) {
		ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = null;
        
        ListNode answer = RemoveNthFromEnd.removeNthFromEnd(first,3);
        while(answer!=null) {
            System.out.println(answer.val);  
            answer = answer.next;
        }
    }

}
