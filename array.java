package imp.javapractice;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		System.out.println("Enter the array size");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" array values");
		for(i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(i=0;i<n;i++) {
			System.out.printf("let the array is %d\n",a[i]);
		}
		scan.close();
	}


}


