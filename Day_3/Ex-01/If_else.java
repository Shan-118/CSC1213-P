import java.util.Scanner;
class If_else {
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
	    System.out.println("Enter the integer:");
		int n=ob.nextInt();
		if(n>0)
		{
			System.out.println("Positive integer.");
		}
		else if(n==0)
		{
			System.out.println("Integer value is zero.");
		}
		else
		{
			System.out.println("Negative integer.");
		}
	}
}