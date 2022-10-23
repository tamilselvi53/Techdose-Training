public class Main
{
	public static void main(String[] args) {
	    StackUsingLL stack = new StackUsingLL(5);
	    System.out.println(stack.isEmpty());
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
	    stack.push(5);
      System.out.println(stack.isFull());
	    System.out.println(stack.pop());
	    System.out.println(stack.peek());
	    stack.push(7);
	    stack.push(8);
	    System.out.println(stack.peek());
	    
	}
}
