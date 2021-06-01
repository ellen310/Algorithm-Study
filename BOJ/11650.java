import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int[][] xy=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++)
				xy[i][j]=sc.nextInt();  
		}
		
		Arrays.sort(xy, new Comparator<int[]>() {
			public int compare(int[] e1, int[] e2) { //첫째줄과 둘째줄, 둘째줄과 셋째줄..
				if(e1[0]==e2[0]) return e1[1]-e2[1]; //첫째줄의x(=0)와 둘째줄의 x가 같다면 y로(=1) 정렬
				else return e1[0]-e2[0]; //첫째줄의 x와 둘째줄의 x가 다르다면 정렬
			}
		});
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(xy[i][j]+" ");  
			}
			System.out.println();	
		}
		
	}

}
