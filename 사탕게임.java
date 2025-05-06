package baekjoon_AL2;

import java.util.*;
import java.io.*;


public class 사탕게임 {
	public static char[][] arr;
	
	public static int n;
	
	public static int max;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				swap(i,j,i,j+1);
				search();
				swap(i,j+1,i,j);
			}
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				swap(i,j,i+1,j);
				search();
				swap(i+1,j,i,j);
			}
		}
		
		System.out.println(max);
		

	}
	
	
	
	public static void swap(int x1, int y1, int x2, int y2) {
		char temp;
		temp = arr[x1][y1];
		arr[x1][y1] = arr[x2][y2];
		arr[x2][y2] = temp;
	}
	
	public static void search() {
		
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j=0; j<n-1; j++) {
				if(arr[i][j]==arr[i][j+1]) {
					count++;
					max = Math.max(max, count);
				}else {
					count = 1;
				}
			}
		}
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j=0; j<n-1; j++) {
				if(arr[j][i]==arr[j+1][i]) {
					count++;
					max = Math.max(max, count);
				}else {
					count = 1;
				}
			}
		}
		
	}

}
