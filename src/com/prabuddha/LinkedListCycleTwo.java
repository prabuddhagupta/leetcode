//http://oj.leetcode.com/problems/linked-list-cycle-ii/

package com.prabuddha;

public class LinkedListCycleTwo {
	public static ListNode detectCycle(ListNode head) {
		if (head == null) // list does not exist..so no loop either.
			return null;

		// using hare/tortoise algo....in case of cycle they both will meet at
		// one eventually
		ListNode slowPointer = head; // this will jump 1 node at a time
		ListNode fastPointer = head; // this will jump 2 nodes at a time

		while (true) {
			slowPointer = slowPointer.next;

			if (fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
			} else {
				return null; // reached to null, no loop
			}

			if (slowPointer == null || fastPointer == null) // if either hits
															// null, no loop.
				return null;

			// if they meet, they both are at the same node.
			if (slowPointer.val == fastPointer.val) {
				
				//now set slowPointer back to the first node and step both pointer one step at a time until they meet.
				//that is the starting point
				slowPointer = head;
				while (fastPointer != slowPointer) {
					fastPointer = fastPointer.next;
					slowPointer = slowPointer.next;
				}

				return slowPointer;
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
		 fourth.next = second;
		//fourth.next = null;
		ListNode cyclicNode = LinkedListCycleTwo.detectCycle(first);
		if (cyclicNode != null)
			System.out.println(cyclicNode.val);
		else {
			System.out.println("No cycle");
		}
	}

}
