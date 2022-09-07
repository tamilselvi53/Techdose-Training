import java.util.*;
public class Main
{
    //T(n): O(log n)
    public static long powerOfN(long base, long power) {
        //Base condition set total to 1
        if (power == 0) {
            return 1;
        }
        //recursive call
        long ans = powerOfN(base, power / 2);
        //Odd power need to be multiplied 1 time extra
        if (power % 2 == 1) {
            return ans * ans * base;
        }
        //Even power multiplied twice
        return ans * ans;
    }
    // T(n): O(log n)
    public static long powerOfN2(long base, long power) {
        //Base condition set total to 1
        long res = 1;
        while (power > 0) {
            // Odd extra power is multiplied with res
            if (power % 2 == 1) {
                res *= base;
            }
            // Even base is multiplied twice --> base
            base = (base * base);
            // Power reduced to 2 --> 2 * 2 --> 4 * 4 --> 16 * 16
            power /= 2;
        }
        return res;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = powerOfN2(n, p);
        System.out.println(ans);
	}
	//(2, 5) --> (2, 2) * (2, 2) * 2 --> (2, 1) * (2, 1) --> (2, 0)[1] * (2, 0)[1] * 2 
	//(2, 6) --> (2, 3) * (2, 3) --> (2, 1) * (2, 1) * 2 --> (2, 0)[1] * (2, 0)[1] * 2
}
