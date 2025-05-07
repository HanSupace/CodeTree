package baekjoon_AL2;

import java.util.*;
import java.io.*;

public class N과M_9 {
	
	public static int[] arr;
	public static int[] num;
	public static boolean[] visit;

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
		visit = new boolean[N];

		StringTokenizer st1 = new StringTokenizer(br.readLine());

		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0,0);
		System.out.println(sb);

	}
	
	public static void dfs(int at, int depth) {
		if(depth == M) {
			for(int val : num) {
				sb.append(val+" ");
				
			}
			sb.append("\n");
			return;
		}
		int temp = 0;
		for(int i = at; i<N; i++) {
			
				if(temp==arr[i]) continue;
				
				num[depth] = arr[i];
				temp=arr[i];
				dfs(i+1, depth+1);
				
			
		}
	}

}
