import java.util.*;

public class cp {
	static Scanner scn = new Scanner(System.in);

	public static void print(Object o) {
		System.out.print(o + " ");
	}

	public static void println(Object o) {
		System.out.println(o);
	}

	public static boolean checkSet(HashSet<Integer> set, int val) {
		while (val > 0) {
			set.add(val % 10);
			val /= 10;
		}
		return set.size() == 4;
	}

	public static void main(String[] args) {
		int y = scn.nextInt(), temp = y + 1;

		while (true) {
			if (checkSet(new HashSet<Integer>(), temp))
				break;
			temp++;
		}

		println(temp);

	}

}