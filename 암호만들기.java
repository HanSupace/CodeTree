package baekjoon_AL2;

import java.util.*; 
import java.io.*;

public class 암호만들기 {
	
	public static char[] arr;
	public static char[] a;
	public static StringBuilder sb;
	public static int M;
	public static int N;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(st.nextToken());
		
		a = new char[N];
		
		arr=new char[M];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			arr[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(arr);
		
		dfs(0, 0);
		
		System.out.println(sb);
	
	}
	
	public static void dfs(int at, int depth) {
		if(depth == N) {
			if(isVal()) {
			for(char val : a) {
				sb.append(val);
			}
			sb.append("\n");
			
			}
			return;
		}
		
		for(int i=at; i<M; i++) {
			a[depth] = arr[i];
			dfs(i+1, depth+1);
		}
	}
	
	public static boolean isVal() {
		int mo =0;
		int ja =0;
		for(char c : a) {
			if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
			mo++;
		}else {
			ja++;
		}
			
		
		}
		if(mo>=1 && ja>=2) {
			return true;
		}else {
			return false;
		}
	}

}
