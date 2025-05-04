package baekjoon_AL1;

import java.util.*;
import java.io.*;

public class RGB거리 {
	
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int red = 0;
		int green = 1;
		int blue = 2;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] Cost = new int[n][3];
		int[][] dp = new int[n][3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			Cost[i][red] = Integer.parseInt(st.nextToken());
			Cost[i][green] = Integer.parseInt(st.nextToken());
			Cost[i][blue] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][red] = Cost[0][red];
		dp[0][green] = Cost[0][green];
		dp[0][blue] = Cost[0][blue];
		
		for(int i=1;i<n;i++) {
			dp[i][red]+=Math.min(Cost[i-1][green], Cost[i-1][blue]);
		}
		
		
		
	}

}
