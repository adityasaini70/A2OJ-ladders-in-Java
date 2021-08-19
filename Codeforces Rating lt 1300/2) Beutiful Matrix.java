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
		int[][] mat = new int[5][5];
		int ro = -1, col = -1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = scn.nextInt();
				if (mat[i][j] == 1) {
					ro = i;
					col = j;
				}
			}
		}

		int moves = Math.abs(ro - 2) + Math.abs(col - 2);
		println(moves);
	}

}