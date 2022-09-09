import java.util.*;
public class Main
{
    //T(n): O(n * n)
    //S(n): O(1)
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // first loop --> no of passes
        for (int i = n - 1; i > 1; i--) {
            // In each pass, one number is sorted from last
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 6, 2, 9, 3};
		bubbleSort(arr);
		for (int i: arr) {
		    System.out.println(i);
		}
	}
}
