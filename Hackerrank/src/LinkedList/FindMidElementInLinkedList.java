package LinkedList;

public class FindMidElementInLinkedList {

	
	public void getMiddleElement(Node head) {
		
		/*
		 * int count = 0;
		 * 
		 * Node mid = head;
		 * 
		 * while (count % 2 == 1) { ++count; mid = mid.next; }
		 */
		
		//First Approach
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println("Middle element of given LinkedList : "+slow_ptr.data);
		
	}
}
