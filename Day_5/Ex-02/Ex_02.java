import java.util.Scanner;
public class Ex_02 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[10];	
	
	System.out.println("Enter the 10 Elements: ");
	for(int i=0;i<10;i++){
		
		num[i]=sc.nextInt();
	}
	System.out.println("................................................................");
	String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	for(String day:days) {
		System.out.println(day+"\t");
}
}
}