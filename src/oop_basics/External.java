package oop_basics;

//import java.text.DateFormat;
//import java.util.Arrays;
import java.util.Scanner;

public class External {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Your Number "+ "=");

        int num = scanner.nextInt();
        System.out.println(num);


        if (num % 2 == 0)
        {
            System.out.println("Your number is even number " + num);
        }
        else
        {
            System.out.println("Your number is odd number " + num);
        }

///////////////////////////////////////////////////////////////////////////////////
        Scanner scan = new Scanner(System.in);
        System.out.print("Calculation Now! " + "=" + "\t");

        int num1 = scan.nextInt();
        char operator = scan.next().charAt(0);
        int num2 = scan.nextInt();

        switch(operator)
        {
            case '+':
                int result = num1 + num2;
                System.out.print("The result is " + num1 + " + " + num2 + " = " + result + "\t");
                break;

            case '-':
                int result1 = num1 - num2;
                System.out.print("The result is " + num1 + " - " + num2 + " = " + result1 + "\t");
                break;

            case '*':
                int result2 = num1 * num2;
                System.out.print("The result is " + num1 + " * " + num2 + " = " + result2 + "\t");
                break;

            case '/':
                int result3 = num1 / num2;
                System.out.print("The result is " + num1 + " / " + num2 + " = " + result3 + "\t");
                break;

            case '%':
                int result4 = num1 % num2;
                System.out.print("The result is " + num1 + " % " + num2 + " = " + result4 + "\t");
                break;

            default:
                System.out.println("Try again");
                break;
        }
/////////////////////////////////////////////////////////////////////////////////////
        Scanner temp = new Scanner(System.in);
        System.out.println("Calculation of Temperature " + " = ");

        double f = temp.nextDouble();

        char temperature = temp.next().charAt(0);

        double c = temp.nextDouble();

        switch(temperature)
        {
            case 'f':
                c=(f-32)*5/9;
                System.out.println("Today temperature is " + c + "`C");
                break;

            case 'c':
                f=((9*c)/5)+32;
                System.out.println("Today temperature is " + f + "`F");
                break;

            default:

                break;
        }
//////////////////////////////////////////////////////////////////////////////////
        Scanner day = new Scanner(System.in);
        System.out.print("Weekends " + " = " + "\t");
        System.out.println("Invalid Temperature!");
//       int date = day.nextInt();

        int date = 1;
        while(date<29)
        {
           System.out.print(date + "-");
            date++;
        }
        System.out.println("\n" + "Today is Duplicate Day " + date + " days.");
    }
}

//        double f,c;
//        Scanner temp = new Scanner(System.in);
//        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
//        int ch=temp.nextInt();
//        switch(ch)
//        {
//            case 1:  System.out.println("Enter  Fahrenheit temperature");
//                f=temp.nextDouble();
//                c=(f-32)*5/9;
//                System.out.println("Celsius temperature is = "+c);
//                break;
//            case 2:  System.out.println("Enter  Celsius temperature");
//                c=temp.nextDouble();
//                f=((9*c)/5)+32;
//                System.out.println("Fahrenheit temperature is = "+f);
//                break;
//            default:  System.out.println("Invalid Choice");
//        }

