package JavaSETest1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator " + " = ");

        int num1 = scan.nextInt();

        char op = scan.next().charAt(0);

        int num2 = scan.nextInt();

        switch(op)
        {
            case '+':
                int rel = num1 + num2;
                System.out.println("The result is " + num1 + "+" + num2 + " = " + rel);
                break;

            case '-':
                int rel1 = num1 - num2;
                System.out.println("The result is " + num1 + "-" + num2 + " = " + rel1);
                break;

            case '*':
                int rel2 = num1 * num2;
                System.out.println("The result is " + num1 + "*" + num2 + " = " + rel2);
                break;

            case '/':
                int rel3 = num1 / num2;
                System.out.println("The result is " + num1 + "/" + num2 + " = " + rel3);
                break;

            case '%':
                int rel4 = num1 % num2;
                System.out.println("The result is " + num1 + "%" + num2 + " = " + rel4);
                break;

            default:
                break;
        }
    }
}
