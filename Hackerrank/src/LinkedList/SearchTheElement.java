package LinkedList;

public class SearchTheElement {
	
    Node head;
	
	public void pushElement(int data) {
		
		Node node = new Node();
	
		node.data = data;
		
		if (head == null) {
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
	
	public String searchElement(Node node, int i) {
		
		if(node == null) {
			return "Not a valid Linked List";
		}
		if (node.data == i) {
			return "Element is found";
		}
		
		return searchElement(node.next, i);
	}

	public Integer findtheElementfromEndoftheList(Node head2, int n) {
		
		int len = 1;
		Node temp = head2;
		
		while (temp.next != null) {
			temp = temp.next;
			len++;
		}
		
		temp = head2;
		
		for (int i = 1; i<len-n+1; i++) {
			temp = temp.next;
		}
		
		return temp.data;
	}

}
