class Main {
  public static int rightMostSetBit(int n) {
    return n & (~n + 1):
  }
  public static int rightMost1Pos(int n) {
    int pos = 0;
    while (n != 0) {
      if ((n & 1) == 1) {
        return pos + 1;
      }
      pos++;
    }
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res1 = rightMostSetBit(n);
    int res2 = rightMostSet1Pos(n);
    System.out.println(res1);
    System.out.println(res2);
  }
}
