import java.util.Scanner;
class UserInput {
	public static void main(String arg[]) {
	
	String fname,lname,regNo;
	int marks,age;
	
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Enter your first name : ");
	fname=sc.nextLine();
	
	System.out.print("Enter your last name : ");
	lname=sc.next();
	
	System.out.print("Enter your marks : ");
	marks=sc.nextInt();
	
	System.out.print("Enter your Registration no : ");
	regNo=sc.next();
	
	System.out.print("Enter your Age : ");
	age=sc.nextInt();
	
	System.out.print("Enter your Sex : ");
	char sex=sc.next().charAt(0);
	
	System.out.print("Enter your mobile no : ");
	long MobileNo=sc.nextLong();
	
	System.out.print("Enter your GPA : ");
	double GPA=sc.nextDouble();
	
	System.out.println();
	System.out.println("Fullname : "+fname+" "+lname+"\n"+"Marks is: "+marks+"\n"+"Registration no : "+regNo+"\n"+"Age : "+age+"\n"+"Sex : "+sex+"\n"+"Mobile No: "+MobileNo+"\n"+"Enter your GPA : "+GPA);
	
	}
}
	