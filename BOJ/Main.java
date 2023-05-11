import java.util.Arrays;
import java.util.Scanner;

public class Main { //내장함수 X

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nArray=new int[n+1];
		for(int i=0;i<n;i++) {
			nArray[i+1]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] mArray=new int[m+1];
		for(int i=0;i<m;i++) {
			mArray[i+1]=sc.nextInt();
		}
		
		Arrays.sort(nArray); //nArray를 오름차순 정렬
		
		for(int i=1;i<=m;i++) { //m의 요소들을 각각 한번씩 체크,출력
			System.out.println(binarySearch(nArray, mArray, n, m, i));
		}
		
	}
	
	public static int binarySearch(int[] nArray, int[] mArray, int n, int m, int i) {
		int mid=0, first=1, last=n;
		while(first<=last) { //탐색
				mid=(first+last)/2;
				if(nArray[mid]==mArray[i]) return 1;
				else if(nArray[mid]>mArray[i]) last=mid-1;
				else if(nArray[mid]<mArray[i]) first=mid+1;
		}
		return 0;
	}

}

