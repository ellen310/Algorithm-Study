import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] result;
	static int n;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			n=sc.nextInt();
			if(n==0) break;
			arr=new int[n];
			result=new boolean[n];
			
			for(int i=0;i<n;i++) arr[i]=sc.nextInt();
			
			DFS(0,0);
			System.out.println();
		}
	}
	
	public static void DFS(int start, int depth) {
		if(depth==6) {
			print();
		}else {
			for(int i=start;i<n;i++) {
				result[i]=true;
				DFS(i+1,depth+1);
				result[i]=false;
			}
		}
	}
	
	public static void print() {
		for(int i=0;i<n;i++) {
			if(result[i]==true) System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
