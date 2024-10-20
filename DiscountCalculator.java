import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double amount = scanner.nextDouble();
        double discount = 0;

        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.1;
        } else if (amount > 1000) {
            discount = amount * 0.2;
        }

        double finalAmount = amount - discount;
        System.out.println("Final payable amount: " + finalAmount);
    }
}
