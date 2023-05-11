import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		Queue q= new LinkedList();
		for(int i=1;i<=n;i++) {
			q.offer(i);
		}
		Queue q2=new LinkedList(); //������ ���� ť
		
		while(!q.isEmpty()) { //ť�� ������� ������
			for(int i=0;i<k-1;i++) { //k��°�� �ƴϸ� �ڷ� �ѱ�
				q.offer(q.poll());
			}
			q2.offer(q.poll()); //q���� k��°���� ���
		}
		
		System.out.print("<");
		for(int i=0;i<n-1;i++) {
			System.out.print(q2.poll()+", ");
		}
		System.out.print(q2.poll()+">");
	}

}
