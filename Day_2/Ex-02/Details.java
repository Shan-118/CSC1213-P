class Details {
	public static void main(String arg[]) {
		String Name,Address,DoB,Sex;
		int Age;
		
		Name=arg[0];
		Address=arg[1];
		DoB=arg[2];
		Sex=arg[3];
		Age=Integer.parseInt(arg[4]);
		
		System.out.println("Name : "+Name+"\n"+"Address : "+Address+"\n"+"DoB : "+DoB+"\n"+"Sex : "+Sex+"\n"+"Age : "+Age);
		System.out.println();
		
		int a=10;
		int b=a+Age;
		System.out.println("Age is :"+b);
	}
}