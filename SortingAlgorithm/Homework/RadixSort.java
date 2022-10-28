//T(n): O(n * range * digits) approx O(n * no. of digits)
//S(n): O(n * range * digits)
public class Main
{
    public static int[] CountSort(int[] arr, int n, int k) {
        int[] freq = new int[10];
        //Freuency of numbers
        for (int i = 0; i < n; i++) {
            //To get digit at given k position
            freq[(arr[i] / (int)Math.pow(10, k)) % 10]++;
        }
        //Cumulative frequency
        for (int i = 1; i < 10; i++) {
            freq[i] += freq[i - 1];
        }
        //Storing elements in result array maintaining order
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int index = --freq[(arr[i] / (int)Math.pow(10, k)) % 10];
            res[index] = arr[i];
        }
        return res;
    }
    public static int[] RadixSort(int[] arr, int n) {
        int digits = 2;
        for (int i = 1; i <= digits; i++) {
            //Given array need to be updated in each iteration
            arr = CountSort(arr, n, i - 1);
        }
        return arr;
    }
	public static void main(String[] args) {
	    int[] arr = {9, 87, 17, 5, 12, 21};
	    int[] res = RadixSort(arr, 6);
	    for (int i: res) {
	    System.out.print(i +" ");
	    }
	}
}
