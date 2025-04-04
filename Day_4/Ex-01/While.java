import java.util.Scanner;
class While {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to find the Summation: ");
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while (i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Summation of Numbers from 0 to "+(i-1)+" : "+sum);
	}
}