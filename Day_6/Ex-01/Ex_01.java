class Ex_01{
	public static void main(String args[]){
		int marks[][]=new int[2][2];      // Manual Method
		//int marks[][]={{75,90},{85,100}};  Direct Method
		marks[0][0]=75;
		marks[0][1]=90;
		marks[1][0]=85;
		marks[1][1]=100;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
			System.out.println("Marks["+i+"] ["+j+"] : "+marks[i][j]);
			}
		}
	}
}
