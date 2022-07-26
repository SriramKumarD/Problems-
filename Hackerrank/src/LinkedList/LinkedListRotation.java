package LinkedList;

public class LinkedListRotation {

	public void rotate(int k, Node head) {
		
		
		if(k == 0) {
			return ;
		}
		
		Node node = new Node();
		node = head;
		
		Node newHead = new Node();
		newHead = head;
		int count =1;
		while(count < k && node.next != null) {
			node = node.next;
			count++;
		}
		
		if(node == null) {
			return;
		}
		
		Node kthNode = node;
		
		while(node.next != null) {
			node = node.next;
		}
		
		node.next = newHead;
		
		newHead = kthNode.next;
		
		kthNode.next = null;
		
		
		//Printing the rotated elements
			
		Node n = newHead;
		
		while(n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.print(n.data);
	}

}
