import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList LL = new LinkedList();
		LL.insertAtBeginning(1);
		LL.insertAtBeginning(2);
		LL.insertAtBeginning(3);
		LL.display();
		
		LL.insertAtEnd(4);
		LL.insertAtEnd(5);
		LL.display();
		
		LL.deleteAtBeginning();
		LL.display();
		
		LL.deleteAtEnd();
		LL.display();
	}

}
