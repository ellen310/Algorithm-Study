import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); //Treeset�� �ߺ����ſ� ������ �ѹ��� ���ش�.
		for(int i=0;i<n;i++)
		treeSet.add(sc.nextInt());
		
		Iterator it = treeSet.iterator(); //hasNext, next ���� ���� ����
		
		while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
	}

}
