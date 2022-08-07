package JavaSETest1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Schedule is here! " + " = ");

        String date = sc.nextLine();


        switch(date)
        {
            case "Monday":
                System.out.println("You have to go work " + date);
                break;

            case "Tuesday":
                System.out.println("Today is dating " + date);
                break;

            case "Wednesday":
                System.out.println("Today is survey " + date);
                break;

            case "Thursday":
                System.out.println("Today is marketing " + date);
                break;

            case "Friday":
                System.out.println("Today is presentation " + date);
                break;

            case "Saturday":
                System.out.println("Today is cleaning " + date);
                break;

            case "Sunday":
                System.out.println("Today is super " + date);
                break;

            default:
                break;
        }
    }
}
