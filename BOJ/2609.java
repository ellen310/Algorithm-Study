import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		if(n1<n2) { //n1이 더 큰 상태로 설정(함수 사용을 위해)
			int tmp=n1;
			n1=n2;
			n2=tmp;
		}
		
		int gcd=euclid(n1,n2); //최대공약수
		int lcm=(n1*n2)/gcd; //최소공배수
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
	
	public static int euclid(int n1, int n2) { //유클리드 호제법 -> 최대공약수 구하기
		int n3;
		if(n2==0) return n1; //나머지가 0이면 b가 최대공약수
		else {
			n3=n1%n2;
			return euclid(n2,n3);
		}
	}
	
	

}
