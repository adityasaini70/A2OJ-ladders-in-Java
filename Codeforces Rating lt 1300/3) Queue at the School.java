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
		int t = scn.nextInt();
		scn.nextLine();
		char[] arr = scn.nextLine().toCharArray();

		for(int i = 0; i< t; i++){
			for(int j = 1; j<n; j++){
				if(arr[j] =='G' && arr[j-1] == 'B'){
					char temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j++;
				}
			}
		}

		println(new String(arr));
	}

}