import java.util.*;

class Main {
    public static int flipIthBit(int n, int i) {
        //if 1, then it will be 1
        //if 0, then it will be 0
        return n ^ (1<<(i - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int res = flipIthBit(n, i);
        System.out.println(res);
    }
}
