import java.util.Scanner;
class SwitchCase {
	public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Input Number: ");
		int day =ob.nextInt();
		
		switch(day){
			case 1: System.out.println("It is Monday.");
					break;
			case 2: System.out.println("It is Tuesday.");
					break;
			case 3: System.out.println("It is Wednesday.");
					break;	
			case 4: System.out.println("It is Thursday.");
					break;		
			case 5: System.out.println("It is Friday.");
					break;
			case 6: System.out.println("It is Saturday.");
					break;
			case 7: System.out.println("It is Sunday.");
					break;		
			default: System.out.println("Invalid day range.");
			
		}
	}
}
		