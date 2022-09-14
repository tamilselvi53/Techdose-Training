import java.util.*;
public class Main
{
    //T(n): O(root n);
    public static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        //remaining factors can be found using n / i
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != (n / i)) {
                    res.add(n / i);
                }
            }
        }
        return res;
    }
    public static boolean isPerfectSquare(int n) {
        int count = factors(n).size();
        //Perfect sq numbers have odd no of factors --> 6, 6 --> 1 6 will be considered
        if (count % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPerfectSquare(n);
        System.out.println(res);
	}
}
