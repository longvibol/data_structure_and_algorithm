package com.vibol;

public class LinkListDemo2 {

	public static Node mergeTwoLinkList(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		}

		if (head2 == null) {
			return head1;
		}

		Node current = head1;

		while (current.next != null) {
			current = current.next;
		}

		current.next = head2;
		return head1;
	}

	public static Node mergeSortList(Node head1, Node head2) {
		Node dummy = new Node(0); // we initial the 0 to make the value easy to simplify
		Node tail = dummy;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				tail.next = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
		}

		// Append remaining node
		if (head1 != null) {
			tail.next = head1;
		}
		if (head2 != null) {
			tail.next = head2;
		}

		return dummy.next;

	}

	public static void printList2(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}

}
