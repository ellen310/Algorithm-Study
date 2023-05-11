import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		if(n1<n2) { //n1�� �� ū ���·� ����(�Լ� ����� ����)
			int tmp=n1;
			n1=n2;
			n2=tmp;
		}
		
		int gcd=euclid(n1,n2); //�ִ�����
		int lcm=(n1*n2)/gcd; //�ּҰ����
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
	
	public static int euclid(int n1, int n2) { //��Ŭ���� ȣ���� -> �ִ����� ���ϱ�
		int n3;
		if(n2==0) return n1; //�������� 0�̸� b�� �ִ�����
		else {
			n3=n1%n2;
			return euclid(n2,n3);
		}
	}
	
	

}
