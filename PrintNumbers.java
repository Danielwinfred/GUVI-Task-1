public class PrintNumbers {
    public static void main(String[] args)
    {
        System.out.println("Using the for loop to print the nos:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Using the while loop to print the nos:");
        int j = 10;
        while (j <= 50) {
            System.out.print(j + " ");
            j++;
        }
    }
}
