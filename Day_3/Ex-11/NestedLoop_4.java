public class NestedLoop_4 {
	public static void main(String args[]) {
		
		//outler loop
		for(int i=1;i<=3;i++) {
			
			//inner loop
			for(int j=1;j<=3;j++) {
				
				if(i==2 && j==2) {
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
	}
}