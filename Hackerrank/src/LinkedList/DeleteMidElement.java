package LinkedList;

public class DeleteMidElement {
	
	Node head ;

	public void deleteMidElement() {
		
		Node slow_ptr = head;
		Node fast_ptr = head;
		Node prev = new Node();
		
		while (fast_ptr != null && fast_ptr.next != null) {
			
			fast_ptr = fast_ptr.next.next;
			prev = slow_ptr;
			slow_ptr = slow_ptr.next;
			
		}
		prev.next = slow_ptr.next;
	}
	
	public void printLinkedList() {
		Node n = head;
		
		while(n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.print(n.data);
	}

	public void addNode(int value) {
		
		Node node = new Node();
		node.data = value;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		
	}
	
	public static void main(String[] args) {
		
		DeleteMidElement obj = new DeleteMidElement();
		
		obj.addNode(1);
		obj.addNode(3);
		obj.addNode(5);
		obj.addNode(7);
		obj.addNode(9);
		
		System.out.println("Before Deleting the mid element");
		obj.printLinkedList();
		obj.deleteMidElement();
		System.out.println("After Deleting the mid element");
		obj.printLinkedList();
	}

}
