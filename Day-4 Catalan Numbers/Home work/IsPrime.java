import java.util.*;
public class Main
{
    //T(n): O(n)
    public static boolean isPrime1(int n) {
        //Factors are no longer than its half
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //T(n): O(root n)
    public static boolean isPrime2(int n) {
        //remaining factors can be found using n / i
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans1 = isPrime1(n);
        boolean ans2 = isPrime2(n);
        System.out.println(ans1 + " " + ans2);
	}
}
