public class Ex_05{
	static int sum(int a,int b){
		return a+b;
	}
	static double sum(double a,double b){
		return a+b;
	}
	public static void main(String args[]){
		int intResult=sum(5,10);
		double doubleResult=sum(3.5,2.5);
		
		System.out.println("Sum(int): "+intResult);
		System.out.println("Sum(double): "+doubleResult);
	}
}