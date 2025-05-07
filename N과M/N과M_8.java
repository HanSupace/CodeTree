package baekjoon_AL2;

import java.util.*;
import java.io.*;

public class N과M_8 {
	
	public static int[] arr;
	public static int[] num;

	public static int N;
	public static int M;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		num = new int[M];

		StringTokenizer st1 = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0);
		System.out.println(sb);

	}
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int val : num) {
				sb.append(val+" ");
				
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i<N; i++) {
			num[depth]=arr[i];
			dfs(depth+1);
		}
	}

}
