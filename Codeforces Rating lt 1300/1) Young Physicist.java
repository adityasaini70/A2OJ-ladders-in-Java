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
		int n = scn.nextInt();
		int s1 = 0, s2 = 0, s3 = 0;
		for (int i = 0; i < n; i++) {
			// int[] arr = int_input();
			int [] arr= new int[3];
			for(int j = 0; j<arr.length; j++){
				arr[j] = scn.nextInt();
			}
			s1 += arr[0];
			s2 += arr[1];
			s3 += arr[2];
		}

		if (s1 == 0 && s2 == 0 && s3 == 0)
			println("YES");
		else
			println("NO");
	}

}