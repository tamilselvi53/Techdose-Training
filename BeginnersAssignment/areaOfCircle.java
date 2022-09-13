import java.util.*;
public class Main
{
    //T(n): O(1)
    public static double areaOfCircle(double r) {
        return 22.7 * r * r;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = areaOfCircle(2);
        System.out.println(ans);
	}
}
