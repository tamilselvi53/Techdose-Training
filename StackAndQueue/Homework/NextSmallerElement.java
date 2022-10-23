class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> s = new Stack<>();
	    int[] res = new int[n];
	    for (int i = n - 1; i >= 0; i--) {
	        while (!s.empty() && s.peek() >= arr[i]) {
	            s.pop();
	        }
	        if (s.empty()) {
	            res[i] = -1;
	        } else {
	            res[i] = s.peek();
	        }
	        s.push(arr[i]);
	    }
	    return res;
	} 
}
