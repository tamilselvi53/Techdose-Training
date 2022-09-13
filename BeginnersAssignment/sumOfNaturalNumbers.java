import java.util.*;
public class Main
{
    public static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumOfNaturalNumbers(n);
        System.out.println(res);
	}
}
