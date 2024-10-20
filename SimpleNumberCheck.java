import java.util.Scanner;

public class SimpleNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is +ve");
        } else if (number < 0) {
            System.out.println("The number is -ve");
        } else {
            System.out.println("The number you put in is zero.");
        }

        scanner.close();
    }
}
