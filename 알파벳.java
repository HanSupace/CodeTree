package baekjoon_AL1;

import java.util.*;
import java.io.*;

public class 알파벳 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		int[] arr = new int [26];
		
		for(int i=0;i<26;i++) {
			arr[i]=-1;
		}
		
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(arr[c-'a']==-1) {
				arr[c-'a']=i;
			}
		}
		
		for(int i=0; i<26;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
