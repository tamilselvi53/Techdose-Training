import java.util.*;

class Main {
    public static int setIthBit(int n, int i) {
        return n | (1<<(i - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int res = setIthBit(n, i);
        System.out.println(res);
    }
}
