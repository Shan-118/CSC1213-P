public class Ex_06{
	static void greetUser(String name){
		System.out.println("Hello,"+name+" Welcome!");
	}
	static int cube(int a){
		return a*a*a;
	}
	public static void main(String args[]){
		greetUser("Santhiya");
		int result=cube(3);
		System.out.println()
		System.out.println("Cube: "+result);
	} 
}