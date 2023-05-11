import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int aCount=sc.nextInt(); //a°³¼ö
		int[] aArray=new int[aCount];
		for(int i=0;i<aCount;i++) aArray[i]=sc.nextInt();
		
		Arrays.sort(aArray);
		System.out.println(aArray[0]*aArray[aCount-1]);

	}

}
