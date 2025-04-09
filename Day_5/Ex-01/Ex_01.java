import java.util.Scanner;
public class Ex_01 {
	public static void main(String args []) {
		int sum=0;
		int Numbers[]=new int[5];
		
		System.out.println("Enter the 5 integers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			System.out.println("Numbers["+(i+1)+"]: ");
		    Numbers[i]=sc.nextInt();
			sum=sum+Numbers[i];
		}
		System.out.println("Sum: "+sum);
	}
}