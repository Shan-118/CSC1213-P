import java.util.Scanner;
class Switch_Case2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		char letter=sc.next().charAt(0);
		
		switch(letter) 
		{
			case 'a': case 'e': case 'i': case 'o': case 'u': 
			case 'A': case 'E': case 'I': case 'O': case 'U': 
			System.out.println(letter + " is a vowel.");
			break;
			default: 
			System.out.println(letter + "is not a vowel.");
		}
	}
}
		