import java.util.Scanner;

public class IT24100718Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");
        System.out.print("Enter Subject Mark 1: ");
        int mark1 = scanner.nextInt();
        System.out.print("Enter Subject Mark 2: ");
        int mark2 = scanner.nextInt();
        System.out.print("Enter Subject Mark 3: ");
        int mark3 = scanner.nextInt();
        System.out.print("Enter Subject Mark 4: ");
        int mark4 = scanner.nextInt();

        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        System.out.println("Average is: " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Overall Grade is: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Overall Grade is: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Overall Grade is: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }

        scanner.close();
    }
}