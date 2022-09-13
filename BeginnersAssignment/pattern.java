import java.util.*;
public class Main
{
    public static double areaOfCircle(double r) {
        return 22.7 * r * r;
    }
    public static void pattern(int n) {
        int ctr = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        ctr = n;
        for (int i = 1; i <= n; i++) {
            for (int j = (n - i + 1); j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
	}
}
