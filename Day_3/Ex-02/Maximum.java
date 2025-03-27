import java.util.Scanner;
class Maximum {
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the three integers: ");
		
		int num1=ob.nextInt();
		int num2=ob.nextInt();
		int num3=ob.nextInt();
		
		int max=num1;
		
			if(num2>max)
			{
				max=num2;
			}
			else if(num3>max)
			{
				max=num3;
			}
			else
			{
				max=num1;
			}
		System.out.println("Maximum number is: "+max);
	}
}
		
		
		 