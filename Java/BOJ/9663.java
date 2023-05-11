import java.util.Scanner;

public class Main {
	static int n;
	static int[] arr;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		count=0;
		
		dfs(0);
		System.out.println(count);

	}
	
	public static void dfs(int depth) {
		
		if(depth==n) {
			count++;
			return;
		}
		for(int i=0;i<n;i++) {
			arr[depth]=i;
			if(ok(depth)) {
				dfs(depth+1); //가지치기에 안걸린 애들은 다음행으로 넘어갈 수 있게 해줌
			}
		}
		
		
	}
	
	public static boolean ok(int depth) {
		for(int i=0;i<depth;i++) {
			if(arr[depth]==arr[i]) { //현재 깊이의 열 / 다른 깊이들의 열 중 같은위치에 있는게 있다면
				return false;
			}else if(Math.abs(depth-i)==Math.abs(arr[depth]-arr[i])) { //가로방향의 차==세로방향의 차 -> 대각선에 있다.
				return false;
			}
		}
		return true;
	}

}
