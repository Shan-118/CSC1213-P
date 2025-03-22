import java.util.Scanner;

class PowerValue {
	
	public static void main(String args[]) {
		
		Scanner ob=new Scanner (System.in);
		
		System.out.println ("Input the side length of values:");
		
		double val=ob.nextDouble();
		
		System.out.printf("Square: %.2f\n",val*val);
		
		System.out.printf("Cube: %.2f\n",val*val*val);
		
System.out.printf("Fourth power: %.2f\n",Math.pow(val,4));
		
	}
}
		