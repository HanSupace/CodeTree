package baekjoon_AL1;

import java.util.Arrays;
import java.util.Scanner;


public class 접미사배열 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		String[] arr = new String[s.length()];
		
		for(int i=0; i<s.length();i++) {
			arr[i]=s.substring(i,s.length());
		}
		Arrays.sort(arr);
		
		for(String S : arr) {
			System.out.println(S);
		}
	}

}
