import java.util.Scanner;
class Loop_01 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scan.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			System.out.print(i+"  ");
		}
	}
}