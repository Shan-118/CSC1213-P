public class Loop_03 {
	public static void main(String args[]) {
		//using for loop
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}