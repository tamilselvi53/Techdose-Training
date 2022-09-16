import java.util.*;
public class Main
{
    //T(n): O(n* n) --WC
    //S(n): O(n)
    //for sorting in arraylist
    public static void insertionSort(Map<Integer, ArrayList<Integer>> map, int hashIndex) {
        ArrayList<Integer> arr = map.get(hashIndex);
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int j = i;
            //To not exceed -1 index
            //Swap numbers, until we get right position
            while ((j >= 1) && (arr.get(j) < arr.get(j - 1))) {
                Collections.swap(arr, j, j - 1);
                j--;
            }
        }
    }
    
    //For sorting array
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            //To not exceed -1 index
            //Swap numbers, until we get right position
            while ((j >= 1) && (arr[j] < arr[j - 1])) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }
    public static int hash(int[] arr, int i, int minVal, int buckets) {
        return (arr[i] - minVal) / buckets;
    }
    public static int[] bucketSort(int[] arr, int buckets) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        //Hashmap of bucketsize which holds Arraylist
        for (int i = 0; i < buckets; i++) {
            map.put(i, new ArrayList<>());
        }
        
        //To find minimum Value to subtract in array
        int n = arr.length;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        //Finding hashIndex for all array values
        int hashIndex = 0;
        int minVal = arr[minIndex];
        for (int i = 0; i < n; i++) {
            hashIndex = hash(arr, i, minVal, buckets);
            //Inserting in map
            map.get(hashIndex).add(arr[i]);
            insertionSort(map, hashIndex);
        }
        
        int[] sorted_arr = new int[n];
        int index = 0;
        for (ArrayList<Integer> al: map.values()) {
            for (int val: al) {
                sorted_arr[index] = val;
                index++;
            }
        }
        insertionSort(sorted_arr);
        return sorted_arr;
    }
  
	public static void main(String[] args) {
	    int[] arr = {7, 2, 9, 1, 6, 8};
	    int buckets = arr.length;
	    int[] sorted_arr = bucketSort(arr, buckets);
	    for (int i: sorted_arr) {
	        System.out.print(i + " ");
	    }
	}
}
