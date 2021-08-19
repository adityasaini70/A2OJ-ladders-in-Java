import java.util.*;

public class cp {
	static Scanner scn = new Scanner(System.in);

	public static void print(Object o) {
		System.out.print(o + " ");
	}

	public static void println(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		char[] arr = scn.nextLine().toCharArray();
		StringBuilder ans = new StringBuilder("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '.') {
				ans.append("0");
			} else if ((i + 1 < arr.length) && (arr[i] == '-' && arr[i + 1] == '.')) {
				ans.append("1");
				i++;
			} else if ((i + 1 < arr.length) && (arr[i] == '-' && arr[i + 1] == '-')) {
				ans.append("2");
				i++;
			}

		}

		println(ans.toString());
	}

}