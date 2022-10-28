import java.util.Scanner;

class Main {
  // Toggle at given index using XOR
	public static int flipIthBit(int n, int pos) {
	    return n ^ (1<<(pos - 1));
	}
	public static void main(String[] args) {
		int n = 8;
		int res = flipIthBit(n, 3);
		System.out.println(res);
	}
}
