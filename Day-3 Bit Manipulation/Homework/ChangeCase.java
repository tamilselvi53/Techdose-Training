import java.util.Scanner;
class Main {	
	public static char toUpper(char ch) {
	    return (char)(ch & (~(1<<5)));
	}
	public static char toLower(char ch) {
	    return (char)(ch | (1<<5));
	}
	public static char toToggle(char ch) {
	    return (char)(ch ^ (1<<5));
	}
	public static void main(String[] args) {
		char ch = 'a';
		char res = toUpper(ch);
		System.out.println(res);
	}
}
