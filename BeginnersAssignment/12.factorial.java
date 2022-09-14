import java.util.*;
public class Main
{
    static int[] fac = new int[10];
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        fac[n] =  n * factorial(n - 1);
        return fac[n];
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
	}
}
