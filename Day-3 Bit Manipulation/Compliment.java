import java.util.Scanner;

class Main {
  public static int _1scompliment(int n) {
    //negation
		n = ~n;
		return n;
	}
	public static int _2scompliment(int n) {
    //negation
		n = ~n;
    //Adding 1
		n &= 1;
		return n;
	}
	public static void main(String[] args) {
		int n = 13;
		int ones = _1scompliment(n);
    int twos = _2scompliment(n);
		System.out.println(twos);
	}
}
