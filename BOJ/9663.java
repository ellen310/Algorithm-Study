import java.util.Scanner;

public class Main {
	static int n;
	static int[] arr;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		count=0;
		
		dfs(0);
		System.out.println(count);

	}
	
	public static void dfs(int depth) {
		
		if(depth==n) {
			count++;
			return;
		}
		for(int i=0;i<n;i++) {
			arr[depth]=i;
			if(ok(depth)) {
				dfs(depth+1); //����ġ�⿡ �Ȱɸ� �ֵ��� ���������� �Ѿ �� �ְ� ����
			}
		}
		
		
	}
	
	public static boolean ok(int depth) {
		for(int i=0;i<depth;i++) {
			if(arr[depth]==arr[i]) { //���� ������ �� / �ٸ� ���̵��� �� �� ������ġ�� �ִ°� �ִٸ�
				return false;
			}else if(Math.abs(depth-i)==Math.abs(arr[depth]-arr[i])) { //���ι����� ��==���ι����� �� -> �밢���� �ִ�.
				return false;
			}
		}
		return true;
	}

}
