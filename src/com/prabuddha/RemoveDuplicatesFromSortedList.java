//http://oj.leetcode.com/problems/remove-duplicates-from-sorted-list/

package com.prabuddha;

public class RemoveDuplicatesFromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode first = head;
		while (head!=null && head.next!= null) {
			if (head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}

		return first;
	}

	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode third_dup = new ListNode(3);
		ListNode fourth = new ListNode(4);

		first.next = second;
		second.next = third;
		third.next = third_dup;
		third_dup.next = fourth;
		fourth.next = null;

		System.out.println(RemoveDuplicatesFromSortedList.deleteDuplicates(first));
	}

}
