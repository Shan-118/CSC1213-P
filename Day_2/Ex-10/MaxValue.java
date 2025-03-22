import java.util.Scanner;

class MaxValue {
	public static void main(String args[]) {
		Scanner ob=new Scanner (System.in);
		
		System.out.print("Enter the first integer: ");
		int num1=ob.nextInt();
		System.out.println("The first value is : "+num1);
		
		System.out.print("Enter the second integer: ");
		int num2=ob.nextInt();
		System.out.println("The second value is : "+num2);
		
		if(num1>num2)
		{
			System.out.println("The maximum number is : num1"+num1);
		}
		else
		{
			System.out.println("The maximum number is : num2"+num2);
		}
	}
}
		
		