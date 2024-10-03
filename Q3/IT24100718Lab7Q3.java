import java.util.Scanner;

public class IT24100718Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = 0.05;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discountAmount = totalBill * discount;
                double amountToPay = totalBill - discountAmount;
                System.out.println("Discount is: " + discountAmount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); 
        }

        scanner.close();
    }
}