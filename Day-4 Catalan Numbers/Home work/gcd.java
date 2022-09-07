import java.util.*;
public class Main
{
    //T(n): O(log n)
    public static long gcd(long a, long b) {
        return (a == 0) ? b : gcd(a % b, a);
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = gcd(a, b);
        System.out.println(ans);
	}
}
