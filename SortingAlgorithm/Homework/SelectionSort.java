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
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < (n - 1); i++) {
            int minIndex = i; // To find min val index
            for (int j = i + 1; j < n; j++) {
                //Any number is lesser than currNum, then mark as minIndex 
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 6, 2, 9, 3};
		selectionSort(arr);
		for (int i: arr) {
		    System.out.println(i);
		}
	}
}
