import java.util.*;
import java.io.*;

public class cp {
	static Scanner scn = new Scanner(System.in);
	static FastReader scn_fast = new FastReader();

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void print(Object o) {
		System.out.print(o);
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

	public static int max_array(int[] array) {
		int ans = Integer.MIN_VALUE;

		for (Integer val : array) {
			ans = val > ans ? val : ans;
		}

		return ans;
	}

	public static int max_array_idx(int[] array) {
		int max = max_array(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == max)
				return i;
		}

		return -1;
	}

	public static int min_array(int[] array) {
		int ans = Integer.MAX_VALUE;

		for (Integer val : array) {
			ans = val < ans ? val : ans;
		}

		return ans;
	}

	public static int min_array_idx(int[] array) {
		int min = min_array(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == min)
				return i;
		}

		return -1;
	}

	public static long array_sum(int[] array) {
		long ans = 0;
		for (Integer val : array) {
			ans += val;
		}
		return ans;
	}

	public static long array_sum_only_positive(int[] array) {
		long ans = 0;
		for (Integer val : array) {
			if (val > 0)
				ans += val;
		}
		return ans;
	}

	public static ArrayList<Integer> max_array_indices(int[] array) {
		int max = max_array(array);

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == max)
				ans.add(i);
		}

		return ans;
	}

	public static int[] input_array(int n) {
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = scn_fast.nextInt();
		}
		return ans;
	}

	public static void print_array(int[] arr) {
		for (Integer val : arr) {
			print(Integer.toString(val) + " ");
		}
		println("");
	}

	public static void main(String[] args) {
		int n = scn_fast.nextInt();
		String s = scn_fast.next();
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}
		}

		println(count);
	}

}