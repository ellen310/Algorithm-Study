import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		
		arr[0]=0; arr[1]=0;
		for(int i=2;i<=n;i++) {
			arr[i]=i;
		}
		
		for(int i=2;i<=n;i++) { //에라토스테네스의 체
			for(int j=2;i*j<=n;j++) {
				arr[i*j]=0;
			}
		}
		
		for(int i=m;i<=n;i++) {
			if(arr[i]!=0) System.out.println(arr[i]);
		}
		
	}

}
