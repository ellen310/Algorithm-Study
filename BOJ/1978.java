import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] array=new int[t];
		int count=0;
		int i,j;
		
		for(i=0 ; i<t ; i++) {
			array[i]=sc.nextInt();
		}
		
		for(int num : array) {
			if(num==1) continue;
			else if(num==2) count++;
			else {
				j=2;
				while(j<num) {
					if(num%j==0) {
						break;
					}else {
						j++;
					}
					if(j==num) count++;
				}
			}
		}
		
		System.out.println(count);

	}
	
}
