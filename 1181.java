import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		sc.nextLine(); //nextInt후 nextLine을 하면 \n이 nextLine에 저장되니까 -> 한번 띄워줌
		
		String[] a=new String[n];
		for(int i=0;i<n;i++) a[i]=sc.nextLine();
	
		
		Arrays.sort(a, new Comparator<String>() {
			public int compare(String e1, String e2) {
				if(e1.length()==e2.length()) return e1.compareTo(e2); //길이가 같으면 사전순. compareTo는 첫자리부터 비교함. e1첫자리가 더 크면 양수반환(자리바꿈)
				else return e1.length()-e2.length();
			}
		});
		
		Set<String> set = new LinkedHashSet<String>(); //중복제거, 순서대로 데이터 관리하기 위해 사용
		for(String item:a) {
			set.add(item);
		}
		for(String item:set) {
			System.out.println(item);
		}
		
	}

}
