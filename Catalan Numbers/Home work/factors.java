import java.util.*;
public class Main
{
    //T(n): O(n)
    public static ArrayList<Integer> factors1(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        //Factors are no longer than its half
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                res.add(i);
            }
        }
        res.add(n);
        return res;
    }
    
    //T(n): O(root n)
    public static ArrayList<Integer> factors2(int n) {
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
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans1 = factors1(n);
        ArrayList<Integer> ans2 = factors2(n);
        System.out.println(ans1 + " " + ans2);
	}
}
