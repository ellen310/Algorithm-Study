import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] score=new int[n+1]; //계단별 점수
		int[] total=new int[n+1]; //점수 합
		
		score[0]=0;
		for(int i=1;i<=n;i++) {
			score[i]=sc.nextInt();
		}
		
		
		total[0]=0;
		total[1]=score[1];
		if(n>=2) {
			total[2]=score[1]+score[2];
			for(int i=3;i<=n;i++){
				total[i]=max(score[i-1]+total[i-3]+score[i], total[i-2]+score[i]);
			}
		}
		System.out.println(total[n]);
	}
	
	
	public static int max(int a, int b) {
		return (a>=b)?a:b;
	}
}
