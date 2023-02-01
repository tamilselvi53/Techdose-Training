class Solution
{
    public static void swap(long[] arr1, long[] arr2, int i, int j) {
            long temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
        //T(n): O(m + n)
        //GAP Method
        int gap = (n + m) / 2; 
        while (gap >= 1) {
            int i = 0;
            //In arr1
            while (i + gap < n) {
                if (arr1[i] > arr1[i + gap]) {
                    swap(arr1, arr1, i, i + gap);
                }
                i++;
            }
            int j = 0;
            while (i < n && j < m) {
                if (arr1[i] > arr2[j]) {
                    swap(arr1, arr2, i, j);
                }
                i++; j++;
            }
            i = 0;
            while (j < m) {
                if (arr2[i] > arr2[j]) {
                    swap(arr2, arr2, i, j);
                }
                i++;
                j++;
            }
            if (gap == 1) {
                return;
            }
            gap = (gap / 2) + (gap % 2);
        }
    }
}
