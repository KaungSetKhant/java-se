package string;

import java.util.Scanner;

public class StringExtraMethod {
    public static void main(String[] args) {
        String talk = " Meeting You ";
        System.out.println(talk.toUpperCase());

        System.out.println(talk.length());

        System.out.println(talk.trim().length());//remove space
////////////////////////////////////////////////////////////////////

        System.out.println("Please Enter Your Email- ");

        String email = new Scanner(System.in).nextLine();
        if (email.endsWith("@gmail.com"))
        {
            System.out.println("Your email is " + email);
        }
        else
        {
            System.out.println("Incorrect email justified");
        }
///////////////////////////////////////////////////////////////////////////

        System.out.println("Please Enter Your Name- ");

        String name = new Scanner(System.in).nextLine();
        if (name.startsWith("U"))
        {
            System.out.println("Your name is " + name);
        }
        else if (name.startsWith("Daw"))
        {
            System.out.println("Your name is " + name);
        }
        else
        {
            System.out.println("Incorrect name justified");
        }
////////////////////////////////////////////////////////////////////

        String names = "Kaung Khant";
        System.out.println(names.charAt(6));
        System.out.println(names.indexOf("Khant"));

    }
}
