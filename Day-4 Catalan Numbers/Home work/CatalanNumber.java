import java.util.*;
public class Main
{
    //formula for nCr
    public static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > (n - k)) {
            k = n - k;
        }
        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    //Formula for catalan
    public static int catalan(int n) {
        int c = binomialCoeff(2 * n, n);
        return c / (n + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = catalan(n);
        System.out.println(ans);
    }
}
