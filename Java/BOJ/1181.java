import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sc.nextLine(); //nextInt�� nextLine�� �ϸ� \n�� nextLine�� ����Ǵϱ� -> �ѹ� �����
		
		String[] a=new String[n];
		for(int i=0;i<n;i++) a[i]=sc.nextLine();
	
		
		Arrays.sort(a, new Comparator<String>() {
			public int compare(String e1, String e2) {
				if(e1.length()==e2.length()) return e1.compareTo(e2); //���̰� ������ ������. compareTo�� ù�ڸ����� ����. e1ù�ڸ��� �� ũ�� �����ȯ(�ڸ��ٲ�)
				else return e1.length()-e2.length();
			}
		});
		
		Set<String> set = new LinkedHashSet<String>(); //�ߺ�����, ������� ������ �����ϱ� ���� ���
		for(String item:a) {
			set.add(item);
		}
		for(String item:set) {
			System.out.println(item);
		}
		
	}

}
