import java.util.Scanner;

public class Ex_03 {
    public static void main(String args[]) {
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Num[" + (i + 1) + "]: ");
            num[i] = sc.nextInt();
        }

        int max, min;
        max = num[0];
        min = num[0];

        for (int i = 0; i < 5; i++) {
            if (num[i] > max) {
                max = num[i]; 
            }
            if (num[i] < min) {
                min = num[i]; 
            }
        }

        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
    }
}