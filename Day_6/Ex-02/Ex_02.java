// Write the program to store and find the sum of the all elements in array

class Ex_02{
	public static void main(String args[]){
		
		int Marks[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		
		for(int i=0;i<3;i++){
			int sum=0;
			for(int j=0;j<4;j++){

				System.out.println("Marks["+i+"] ["+j+"] : "+Marks[i][j]);
				sum=sum+Marks[i][j];
				
			}
			
			System.out.println(" ");
		    System.out.println("Student marks is: "+sum);
		   
		}
		
		
	}
}
