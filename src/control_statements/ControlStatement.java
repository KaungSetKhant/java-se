package control_statements;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);//building method
        System.out.print("Enter Your Name "+ "=");

        String userInput = scanner.nextLine();//method is starting actually work
        userInput = userInput.toUpperCase();
        System.out.println(userInput);

        System.out.print("Enter Your Age "+ "=");
        int ageInt = scanner.nextInt();
        ageInt = ageInt+1;
        System.out.println(ageInt);

        if (ageInt==21)
        {
           System.out.println("Your age is equal to " + ageInt);
        }

        if (ageInt<=21)
        {
            System.out.println("Your age is match " + ageInt);
        }
        else
        {
            System.out.println("Your age doesn't match!");
        }

        if (ageInt==21)
        {
            System.out.println("Age validation is " + ageInt);
        }
        else if (ageInt<21)
        {
            System.out.println("Duration of younger age is " + ageInt);
        }
        else if (ageInt==22)
        {
            System.out.println("Can't involve");
        }
        else
        {
            System.out.println("Something Wrong!");
        }


        switch(ageInt)
        {
            case 21:
                System.out.println("Age is " + ageInt);
                break;
            case 18:
                System.out.println("Younger age is "+ ageInt);
                break;
            case 22:
                System.out.println("Can't involve " + ageInt);
                break;
            case 23:
                System.out.println("Please try again");
                break;
        }

        int number = 0;
        while(number<=10)
        {
            System.out.print("\t" + "-" + number + "-");
            number++;
        }

        int numbers = 10;
        do
        {
           System.out.print("\t" + numbers);
            numbers++;
        }while (numbers<20);
    }
}


//java is building with object or everything is java

/**
 * if <== if(condition){implementation with output}
 *
 * if-else <== if(condition){implementation with output} else{implementation with output}
 *
 * if-else-if <== if(condition){implementation with output}<== else if(condition){implementation with output}else{implementation with output}
 *
 * switch <== switch(expression<-means not solid)case value or condition:{implementation with output}break;<=need to code break
 *
 * while <==while(condition){implementation with output and unary}
 *
 * do while <==do{implementation with output and unary}while(condition)
 *
 * for i (straight looping)
 * for r (reverse looping)
 * for or for each (each of looping)
 */

//System.out.println(output); (user output)
//Scanner scanner= new Scanner(System.in); (help user input)

//Scanner object is searching for methods (example-home agency)

//scanner.nextLine() that is used for wanted text from user

//scanner.nextInt() that is used for wanted number from user

//String(datatype) userInput(variable)<==(show user input into string or text) = scanner(obj).nextLine()(method);<==(helps user input)
//userInput(variable) = userInput.toUpperCase();<==(change user input style example text is uppercase)
//System.out.println(userInput);