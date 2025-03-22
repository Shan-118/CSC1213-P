public class Casting {
	
	//Main driver method
	public static void main(String arg[]) {
		
		//define int variable
		int num=5004;
		
		//type casting int to double
		double doublenum=(double)num;
		System.out.println("The value of "+num+" after converting to double is "+doublenum);
		
		//type casting double to int
		int num1=(int)doublenum;
		System.out.println("The value of "+doublenum+" after converting to int is "+num1);
	}
}