import java.util.Scanner;

class Main {
  //Find position of last setbit 
  //Last setbit is the least power
	public static int leastPower(int n) {
	    int pos = 0;
	    while (n != 0) {
	        pos++;
	         n = n >> 1;
	    }
	    return 1<<(pos - 1);
	}
	public static void main(String[] args) {
		int n = 17;
		int res = leastPower(n);
		System.out.println(res);
	}
}
