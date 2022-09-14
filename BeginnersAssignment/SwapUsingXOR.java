import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 4, 9
        int x = sc.nextInt(); // 0010
        int y = sc.nextInt(); // 1001
        x = x ^ y; //1011
        y = x ^ y; //1001 --> 0010
        x = x ^ y; //1001
        System.out.println(x + " " + y);
	}
}
