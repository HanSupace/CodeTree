package baekjoon_AL1;

import java.util.*;
import java.io.*;

public class ROT13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i=0; i<str.length();i++) {
			
			char c= str.charAt(i);
			if(!Character.isLetter(c)) {
				sb.append(c);
				continue;
			}
			
			int n = (int)c + 13;
			
			if(Character.isUpperCase(c)&& n>90) {
				n-=26;
			}
			if(Character.isLowerCase(c)&& n>122) {
				n-=26;
			}
			sb.append((char)n);
		}
		 System.out.print(sb);
	}

}
