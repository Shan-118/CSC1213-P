import java.util.Scanner;
class IfElse {
	public static void main(String arg[]) {
		Scanner ob = new Scanner (System.in);
		System.out.println("Enter an Integer: ");
		int num = ob.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}