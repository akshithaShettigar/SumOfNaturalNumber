//Sum of n natural Number without using methods
import java.util.Scanner;
public class SumNatural {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		System.out.print("Sum Result:");
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			System.out.print("\t"+sum);
		}

	}
}

