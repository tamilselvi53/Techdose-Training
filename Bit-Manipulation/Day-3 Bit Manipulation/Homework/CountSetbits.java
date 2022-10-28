import java.util.Scanner;	
class Main {
	//Counting 1s by right shifting n 1 step
	public static int countSetBits1(int n) {
	    int count = 0;
	    while (n != 0) {
	        count += (n & 1);
	        n = n>>1;
	    }
	    return count;
	}
 	//Count by left shiffting 1 
	public static int countSetBits2(int n) {
	    int count = 0;
	    for (int i = 1; i <= n; i++) {
	        if ((n & i) != 0) {
	            count++;
	        }
	        i = i<<1;
	    }
	    return count;
	}	
	//Masking first setbit and counting till n becomes 0
	public static int countSetBits3(int n) {
	    int count = 0;
	    while (n != 0) {
	        n = (n & (n - 1));
	        count++;
	    }
	    return count;
	}
	public static void main(String[] args) {
		int n = 67;
		int res = countSetBits3(n);
		System.out.println(res);
	}
}
