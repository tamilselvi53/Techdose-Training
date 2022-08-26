import java.util.Scanner;

class Main {
	public static boolean isSetBit(int n, int pos) {
	    return (n & (1<<(pos - 1))) != 0;
	}
	public static void main(String[] args) {
		int n = 8;
		boolean res = isSetBit(n, 4);
		System.out.println(res);
	}
}
