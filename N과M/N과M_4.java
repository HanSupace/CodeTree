package baekjoon_AL2;
import java.util.Scanner;
 
public class N과M_4 {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(1,0);
		System.out.print(sb);
 
	}
 
	public static void dfs(int at,int depth) {
		// 깊이가 M이랑 같아지면 출력후 return
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i,depth + 1);
		}
	}
 
}