import java.util.*;
public class Main
{
    public static double mean(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum / n;
        return avg;
    }
    public static double median(int[] arr, int n) {
        Arrays.sort(arr); 
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2;
        }
    }
    public static int mode(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, maxEle = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 1};
        int n = arr.length;
        double m = mean(arr, n);
        double med = median(arr, n);
        int mod = mode(arr, n);
        System.out.println(m);
        System.out.println(med);
        System.out.println(mod);

	}
}
