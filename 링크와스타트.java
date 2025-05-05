package baekjoon_AL2;

import java.util.*;
import java.io.*;

public class 링크와스타트 {
	
	public static int map[][];
	public static int N;
	public static int t;
	public static boolean[] visit;
	public static int min;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		min = Integer.MAX_VALUE;
		map = new int[N][N];
		visit = new boolean[N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(t=1; t<N; t++) {
			dfs(0,0);
		}
		
		System.out.println(min);	
		
		

	}
	
	public static void dfs(int at, int depth) {
		if(depth==t) {
			diff();
			return;
		}
		
		for(int i=at; i<N; i++) {
			if(!visit[i]) {
				visit[i]=true;
				dfs(i+1, depth+1);
				visit[i]=false;
			}
		}
	}
	
	public static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(visit[i] && visit[j]) {
					team_start +=map[i][j]+map[j][i];
				}else if(!visit[i] && !visit[j]) {
					team_link += map[i][j] + map[j][i];
				}

			}
			
		}
		int val = Math.abs(team_start-team_link);
		min = Math.min(min, val);
		if(val==0) {
			System.out.println(val);				
			System.exit(0);
			
		}
		
	}

}
