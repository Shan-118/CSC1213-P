import java.util.Scanner;
class DoWhile2 {
	
	public static void main(String args[]) {
		
		Scanner ob=new Scanner(System.in);
		char control=' ';
		int sum=0;
		
		do{
			System.out.println("Enter a number to find summation: ");
			int n=ob.nextInt();
			sum=sum+n;
			System.out.println("Do you want to continue: ");
			control=ob.next().charAt(0);
		}
		while(control=='y');
		System.out.println("Summation of the numbers: "+sum);
	}
}