import java.util.Scanner;
class Divisor {
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int num=ob.nextInt();
		System.out.print("The value is : "+num);
		System.out.println();
		
		if((num%7==0)&&(num%5==0))
		{
			System.out.println("The number is divisible by 7 and 5: ");
		}
		else
		{
			System.out.println("The number is not divisible by 7 and 5: ");
		}
	}
}
		