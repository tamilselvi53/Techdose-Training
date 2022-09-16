import java.util.*;
public class Main
{
    //T(n): O(no of digits)
    public static void digits(int n) {
        int rem;
        while (n > 0) {
            rem = n % 10;
            System.out.println(rem);
            n /= 10;
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        digits(n);
	}
}
