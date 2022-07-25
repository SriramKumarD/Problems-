package LinkedList;

public class LinkedList {
	
	Node head;

	//It will add the node at last Index /// 5(head)->   (10)
	public void insert(int value) {
		Node node = new Node();
		node.data = value;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	
	public void show() {
		
		Node n = head;
		
		while(n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.print(n.data);
	}

	//It will add the node at starting Index
	public void insertAtFirstPosition(int value) {
		Node node = new Node();
		node.data = value;
		node.next = null;
		node.next = head;
		head = node;
	}

	//It will add the node at given Index 
	public void insertAtIndex(int index, int value) {
		
		if(index == 0) {
			insertAtFirstPosition(value);
		}
		else {
			Node node = new Node();
			node.data = value;
			
			Node n = head;
			
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	//It will delete the node from given Index
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}
		else {
			Node node = head;
			
			for (int i=0; i<index-1; i++) {
				node = node.next;
			}
			Node n1 = node.next;
			node.next = n1.next;
			
			System.out.println("Deleted the node at Index:"+index+ "Value :"+n1.data);
		}
	}
	

}
