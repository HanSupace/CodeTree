package baekjoon_AL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.LinkedList;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class 오등큰수 {

	public static void main(String[] args) throws IOException{
		
		StringBuilder sb = new StringBuilder();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] data= new int [N];
		int[] ans = new int [N];
		int[] count = new int [1000000];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			data[i]=Integer.parseInt(st.nextToken());
			count[data[i]]++;
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			while(!stack.isEmpty() && count[data[stack.peek()]] < count[data[i]]) {
				ans[stack.pop()]=data[i];
				
			}
			stack.add(i);
				
			
		}
		while(!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		
		for(int i=0;i<N;i++) {
			 sb.append(ans[i]).append(" ");
		}
		System.out.println(sb);
		
	}

}
