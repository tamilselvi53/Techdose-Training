import java.util.*;
public class Main
{
    //T(n): O(n log (log n)) --> Taylor series expansion
    //S(n): O(n)
    public static ArrayList<Integer> primeNumbers1toN(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        //Array to check prime or not
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            //If prime number found, mark all its multiple not primr(false)
            // 2 --> 4, 6, 8, 10 (false)
            // 7 --> 14, 21, ...(false)
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        //If Marked as prime, add into list
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                al.add(i);
            }
        }
        return al;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primeNumbers1toN(n));
	}
}
