import java.util.*;
public class Main
{
    //T(n): O(1)
    public static int areaOfTriangle(int[] x_coordinates, int[] y_coordinates) {
        int res = (x_coordinates[0] * (y_coordinates[1] - y_coordinates[2])) + (x_coordinates[1] * (y_coordinates[2] - y_coordinates[0])) + (x_coordinates[2] * (y_coordinates[0] - y_coordinates[1]));        
        return Math.abs(res/ 2);
        
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x_coordinates = {1, 2, 5};
        int[] y_coordinates = {0, 6, 10};
        int ans = areaOfTriangle(x_coordinates, y_coordinates);
        System.out.println(ans);
	}
}
