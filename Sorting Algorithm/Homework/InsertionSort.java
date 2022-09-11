
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
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        if (arr[1] < arr[0]) {
            swap(arr, 0, 1);
        }
        for (int i = 2; i < n; i++) {
            int j = i;
            //To not exceed -1 index
            //Swap numbers, until we get right position
            while ((j >= 1) && (arr[j] < arr[j - 1])) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {11, 6, 2, 9, 3};
		insertionSort(arr);
		for (int i: arr) {
		    System.out.println(i);
		}
	}
}
