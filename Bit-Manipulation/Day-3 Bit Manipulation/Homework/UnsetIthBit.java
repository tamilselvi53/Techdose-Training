import java.util.*;

class Main
{
  public static int unSetIthBit (int n, int i)
  {
    //(Ith position set to 1)
    // Then negated it
    return n & (~(1 << (i - 1)));
  }
  
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int i = sc.nextInt();

    int res = unSetIthBit (n, i);
    System.out.println (res);
  }
}
