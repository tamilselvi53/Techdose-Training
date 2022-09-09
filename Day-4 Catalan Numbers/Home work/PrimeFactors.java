import java.util.*;
public class Main
{
    //T(n): O(root n) --> n is divided by factor (removing occurances)
    public static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; (i * i) <= n; i++) {
            //even numbers captured by 2
            //3 captures divisible by 3
            while ((n % i) == 0) {
                n /= i;
                al.add(i);
            }
        }
        //if it doesn't divisible any of the factors in range, it must be prime
        if (n > 1) {
            al.add(n);
        }
        return al;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primeFactors(n));
	}
}
