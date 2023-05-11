import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); //Treeset은 중복제거와 정렬을 한번에 해준다.
		for(int i=0;i<n;i++)
		treeSet.add(sc.nextInt());
		
		Iterator it = treeSet.iterator(); //hasNext, next 등을 쓰기 위해
		
		while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
	}

}
