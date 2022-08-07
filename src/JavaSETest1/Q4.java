package JavaSETest1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Calculation Now " + " = ");

        int kane = scanner.nextInt();


        if (kane % 2 == 0)
        {
            System.out.println("This is even number ");
        }
        else if (kane % 2 == 1)
        {
            System.out.println("This is odd number");
        }
        else
        {
            System.out.println("Please Try Again!");
        }
    }
}
