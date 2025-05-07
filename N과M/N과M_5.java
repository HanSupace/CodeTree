package baekjoon_AL2;

import java.util.*;
import java.io.*;

public class N과M_5 {
	
	public static int N;
	public static int M;
	public static int arr[];
	public static int sol[];
	public static boolean visit[];
	
	static StringBuilder sb = new StringBuilder();


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st1.nextToken());
		
		M = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		sol = new int[N];
		
		arr = new int[M];
		
		visit = new boolean[N];
		
		for(int i=0; i<N; i++) {
			sol[i]=Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(sol);
		
		dfs(0);
		
		System.out.println(sb);
		
		
	}
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
				visit[i]= true;
				arr[depth]=sol[i];
				dfs(depth+1);
				visit[i]=false;
			}
		}
	}

}
