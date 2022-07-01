package imp.javapractice;
import java.util.Scanner;
public class ArraySize {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,k=0;
		System.out.println("Enter the Array Size");
		n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		     k++;
		}
		for(int i=0;i<n;i++) {
			System.out.println("length os the array is"+k);
		}

	}

}
