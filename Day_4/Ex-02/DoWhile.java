import java.util.Scanner;
class DoWhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char letter=' ';
		int sum=0;
		int count=0;
		int EvenCounter=0,OddCounter=0;
		int sumeven=0;
		
		do{
			System.out.println("Enter the Number to find the Summation : ");
			int n=sc.nextInt();
			if(n%2==0)
				EvenCounter=EvenCounter+1;
			else
				OddCounter=OddCounter+1;
			sum=sum+n;
			System.out.println("Do you want to Continue (Y/N) : ");
			letter=sc.next().charAt(0);
			
			
				
		}
		while(letter=='Y');
				System.out.println("Count the Even Numbers of User has Entered is: "+EvenCounter);
				System.out.println("Count the Odd Numbers of User has Entered is: "+OddCounter);
	}
}