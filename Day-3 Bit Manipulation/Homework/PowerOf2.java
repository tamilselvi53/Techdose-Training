import java.util.*;

class Main
{
  public static boolean isPowerOf2(int n) {
      //power of 2 numbers should have 1 setbit
	    return (n & (n - 1)) == 0;
	}
	public static void main(String[] args) {
		int n = 13;
		boolean res = isPowerOf2(n);
		System.out.println(res);
	}
}
