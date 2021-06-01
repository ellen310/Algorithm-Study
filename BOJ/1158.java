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
		Queue q2=new LinkedList(); //순열을 담을 큐
		
		while(!q.isEmpty()) { //큐가 비어있지 않으면
			for(int i=0;i<k-1;i++) { //k번째가 아니면 뒤로 넘김
				q.offer(q.poll());
			}
			q2.offer(q.poll()); //q에서 k번째마다 기록
		}
		
		System.out.print("<");
		for(int i=0;i<n-1;i++) {
			System.out.print(q2.poll()+", ");
		}
		System.out.print(q2.poll()+">");
	}

}
