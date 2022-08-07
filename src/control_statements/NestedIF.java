package control_statements;

import java.util.Arrays;
import java.util.Scanner;

public class NestedIF {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age " + " = ");
        int age = scan.nextInt();

        if (age<=21)
        {
            if (age==21)
            {
                System.out.println("Your Welcome");
            }
            else if (age<=20)
            {
                System.out.println("Your Age is acceptable " + age + " years old");
            }
        }
        else
        {
            System.out.println("Something Wrong");
        }
    }
}
