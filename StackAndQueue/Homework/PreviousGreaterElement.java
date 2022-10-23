class Complete{
    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            while (!s.empty() && s.peek() <= arr[i]) {
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
