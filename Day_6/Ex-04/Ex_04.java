import java.util.Scanner;

class Ex_04 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int sum = 0;
        int max;
        int Marks[][] = new int[4][3];

        System.out.println("Enter the values of the array: ");

        // Input the array and calculate sum and max
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks[" + i + "][" + j + "]: ");
                Marks[i][j] = ob.nextInt();
                sum += Marks[i][j];
            }
        }

        max = Marks[0][0];

        // Find max value
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (Marks[i][j] > max) {
                    max = Marks[i][j];
                }
            }
        }

        System.out.println("Sum of the array: " + sum);
        System.out.println("Maximum of the array: " + max);
    }
}
