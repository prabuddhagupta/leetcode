//http://oj.leetcode.com/problems/linked-list-cycle/

package com.prabuddha;


public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
		if (head == null) // list does not exist..so no loop either.
			return false;

		
		//using hare-tortoise algo....in case of cycle they both will meet at one eventually
		ListNode slowPointer = head;  //this will jump 1 node at a time
		ListNode fastPointer = head;  //this will jump 2 nodes at a time

		while (true) {
			slowPointer = slowPointer.next;

			if (fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
			} else {
				return false; //reached to null, no loop
			}

			if (slowPointer == null || fastPointer == null) // if either hits null, no loop.
				return false;

			
			//if they evermeet, they both are at the same node.
			if (slowPointer.val == fastPointer.val) {  
				return true;
			}
		}

	}

	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		first.next = second;
		second.next = third;
		third.next = fourth;
		//fourth.next = second;
		fourth.next = null;
		System.out.println(LinkedListCycle.hasCycle(first));
	}

}
