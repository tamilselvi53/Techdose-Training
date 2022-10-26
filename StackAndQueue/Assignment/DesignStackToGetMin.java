import java.util.*;

public class Main
{
    public static int getMin(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!s1.empty() && s1.peek() < nums[i]) {
                s2.push(s1.pop());
            }
            s1.push(nums[i]);
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }
        return s1.peek();
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	        arr[i] = sc.nextInt();
	    }
	    int minElement = getMin(arr);
	    System.out.println(minElement);
	    
	}
}
