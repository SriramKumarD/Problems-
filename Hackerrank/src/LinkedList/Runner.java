package LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList lList = new LinkedList();
		LinkedListRotation rotation = new LinkedListRotation();
		FindMidElementInLinkedList objList = new FindMidElementInLinkedList();
		
		lList.insert(3);
		lList.insert(4);
		lList.insert(5);
		lList.insert(1);
		//lList.show();
		lList.insertAtFirstPosition(9);
		//lList.show();
		lList.insertAtIndex(3,10);
		lList.insert(11);
		lList.insert(12);
		//lList.deleteAt(1);
		Node head = lList.getHeadNode();
		rotation.rotate(4, head);
		//lList.show();
		Node head1 = lList.getHeadNode();
		objList.getMiddleElement(head1);
		
	}

}
