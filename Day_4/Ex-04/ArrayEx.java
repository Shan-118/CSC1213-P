class ArrayEx {
	public static void main(String args[]) {
		int num[]=new int[10];
		num[0]=12;
		num[1]=18;
		num[2]=21;
		num[3]=43;
		num[4]=74;
		num[5]=91;
		num[6]=39;
		num[7]=61;
		num[8]=35;
		num[9]=17;
		
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]+"\t");
		}
		System.out.println("*****************************************************");
		int num2[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<num2.length;i++){
		System.out.println(num2[i]+"\t");	
		
		}
	System.out.println("*****************************************************");
	String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	for(String day:days) {
		System.out.println(day+"\t");
	}
 }
}