import java.util.Scanner;
class ArrayEx_02 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array: ");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the Element"+(i+1)+" : ");
			numbers[i]=sc.nextInt();
			
		}
		System.out.println();
		System.out.println("Elements  of the Array: ");
		for(int number:numbers) {
			System.out.print(number+"/t");
		}
		
	}
}