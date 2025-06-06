package baekjoon_AL2;

import java.util.*;

public class N과M_1 {
	
	public static boolean[] visit;
	
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		visit = new boolean[N];
		
		arr = new int[M];
		
		
		dfs(N,M,0);
		
	}
	
	public static void dfs(int N, int M, int depth) {
		if(M==depth) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(N,M,depth+1);
				visit[i] = false;
			}
		}
	}

}
