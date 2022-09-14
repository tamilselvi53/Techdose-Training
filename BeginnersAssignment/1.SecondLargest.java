import java.util.Scanner;
class Main {
  //T(n) : O(n)
  //S(n) : O(1)
  public static int secondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
      
    if (arr[0] > arr[1]) {
      largest = arr[0];
      second = arr[1];
    } else {
        largest = arr[1];
        second = arr[0];
    }
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] > largest) {
        second = largest;
        largest = arr[i];
      } else if (arr[i] > second) {
        second = arr[i];
      }
    }
    return second;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {4, 7, 1, 9, 3};
    int res = secondLargest(arr);
    System.out.println(res);
  }
}

    
