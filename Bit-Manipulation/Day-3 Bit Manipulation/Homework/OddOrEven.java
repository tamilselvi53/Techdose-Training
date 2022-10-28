import java.util.Scanner;

class Main {
	public static boolean isOdd(int n) {
	    return ((n&1) == 1);
	}
	public static void main(String[] args) {
		int n = 178;
		String res = isOdd(n) ? "Odd" : "Even";
		System.out.println(res);
	}
}
