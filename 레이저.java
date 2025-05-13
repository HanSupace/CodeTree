package baekjoon_AL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 레이저 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = 0;
		
		Stack<Character> stack = new Stack<>();
		
		String S = br.readLine();
		
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='(') {
				stack.push('(');
			}else if(S.charAt(i)==')') {
				if(S.charAt(i-1)==')') {
					res++;
					stack.pop();
				}else if(S.charAt(i-1)=='(') {
					stack.pop();
					res += stack.size();
				}
			}
				
			
		}
		 System.out.print(res);
	}

}
