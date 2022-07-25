package LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList lList = new LinkedList();
		lList.insert(3);
		lList.insert(4);
		lList.insert(5);
		lList.insert(1);
		//lList.show();
		lList.insertAtFirstPosition(9);
		//lList.show();
		lList.insertAtIndex(3,10);
		lList.deleteAt(1);
		lList.show();
	}

}
