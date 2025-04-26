// Write the program store the value and find the max of each row of the array 
//Get the input from the user array find the total and max

class Ex_03{
	public static void main(String args[]){
		int Marks[][]={{54,2,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for(int i=0;i<4;i++){
			
			int max=Marks[i][0];
			
			for(int j=0;j<3;j++){
				
				System.out.println("Marks["+i+"] ["+j+"] : "+Marks[i][j]);
				if(max<Marks[i][j]){
					max=Marks[i][j];
				}
			}
			System.out.println("Maximum marks is: "+max);
			System.out.println(" ");
		}
	}
}