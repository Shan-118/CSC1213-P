class Operators {
	public static void main(String[] args){
		int x=20,y=5;
		
		//Unary Operators
		System.out.println("Decrementing: "+(x--));
		System.out.println("After Decrementing:"+(--x));
		System.out.println("Incrementing: "+(y++));
		System.out.println("After Incrementing: "+(++y));
		System.out.println();
		
		//Logical Operators
		System.out.println("x&&y : "+((x==y)&&(x!=y))); //logical and
		System.out.println("x||y : "+((x!=y)||(x>y))); //logical or
		System.out.println("!(xy) : "+(x>y)); //logical not
		System.out.println();
		
		//Relational Operators
		System.out.println("x==y : "+(x==y));//equal to
		System.out.println("x!=y : "+(x!=y));//not equal to
		System.out.println("x>y : "+(x>y));//grater than
		System.out.println("x<y : "+(x<y));//less than
		System.out.println();
		
		//Assignment Operators
		int z=25;
		System.out.println("z=x+y : "+(z=x+y));
		System.out.println("z-=x : "+(z-=x));
		System.out.println("z+=x : "+(z+=x));
		System.out.println("z*=x : "+(z*=x));
		System.out.println("z/=x : "+(z/=x));
		System.out.println("z%=x : "+(z%=x));
		System.out.println();
		
		//Ternary Operations
		String result;
		result=(x<18)? "You are selected" : "You are not selected";
		System.out.println(result);
	}
}
		
		