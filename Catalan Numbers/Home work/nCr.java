import java.util.*;
public class Main
{
    //T(n): O(n * n)
    //S(n): O(n * n)
    //Similar to pascal triangle
    // 1
    // 1 2 1
    // 1 2 2 1
    // 1 2 6 2 1 --> responsible for nCr
    public static int nCr(int n, int r) {
        int[][] combination = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    combination[i][j] = 1;
                } else {
                    combination[i][j] = combination[i - 1][j - 1] + combination[i - 1][j];
                }
            }
        }
        return combination[n][r];
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(nCr(n, r));
	}
}
