import java.util.*;
public class Main
{
    public static HashMap<Character, Integer> frequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello";
        HashMap<Character, Integer> map = frequency(s);
        System.out.println(map);
	}
}
