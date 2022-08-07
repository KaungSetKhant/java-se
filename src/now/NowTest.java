package now;

import java.util.Arrays;
import java.util.Scanner;

public class NowTest {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(number));
        System.out.println(number.length);

        for (int i : number) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println(number[4]);
        System.out.println("-------------------------------------------------");


        String name[] = {"Otaku","Weebs","Newbie","Mg","Daw"};
        System.out.println(Arrays.toString(name));
        System.out.println(name.length);

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
        }
        System.out.println();

        System.out.println(name[name.length -1]);
        System.out.println("-------------------------------------------------");


        char character[] = {'K','S','K','M','D'};
        System.out.println(Arrays.toString(character));
        System.out.println(character.length);

        for (int i = character.length - 1; i >= 0; i--) {
            System.out.print(character[i] + "\t");
        }
        System.out.println();
        System.out.println(character[2]);

        System.out.println("-------------------------------------------------");
        System.out.println();

        String fruit[] = new String[5];
        fruit[0] = "Apple";
        fruit[1] = "Orange";
        fruit[2] = "Grape";
        fruit[3] = "Watermelon";
        fruit[4] = "Sunkist";

        System.out.println(Arrays.toString(fruit));
        System.out.println(fruit.length);

        for (int i = 0; i < fruit.length; i++) {
            System.out.print(fruit[i] + "\t");
        }
        System.out.println();
        System.out.println();
        fruit[1] = "Banana";
        System.out.println(fruit[1]);


        System.out.println(Arrays.toString(fruit));
        for (String s : fruit) {
            System.out.print(s + "\t");
        }
    }
}

class NowTest1
{
    public static void main(String[] args) {
        int kane[][] =
                {
                        {2,4,6,8,10,12},
                        {1,3,5,7,9,11},
                        {1,2,3,4,5,6,7,8},
                        {21,22,34,56,78,12,342}
                };

        System.out.println(kane.length);
        System.out.println();


        for (int i = 0; i < kane.length; i++) {
            System.out.print(kane[i][i] + "\t");
        }

        for (int i = 0; i < kane.length; i++) {
            for (int j = 0; j < kane[i].length; j++) {
                System.out.print(kane[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.toString(kane[kane.length -1]));
    }
}

class NowTest2
{
    public static void main(String[] args) {
        int origin[] = {123,23,45,1,67,12};

        int copy[] = new int[origin.length];

        System.out.println(Arrays.toString(copy));
        System.out.println(copy.length);
        System.out.println("---------------------------------------");

        for (int i = 0; i < origin.length; i++) {
            copy[i] = origin[i];
            System.out.print(copy[i] + "\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(copy));
        System.out.println("---------------------------------------");

        int lar = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] > lar)
            {
                lar = copy[i];
            }
        }
        System.out.println("The largest number is " + lar);
        System.out.println("---------------------------------------");

        int small = 1;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] < small)
            {
                small = copy[i];
            }
        }
        System.out.println("The smallest number is " + small);
        System.out.println("---------------------------------------");


        for (int i = 0; i < copy.length; i++) {
            if (copy[i] % 2 == 0)
            {
                System.out.println("This is even number " + copy[i]);
            }
            else
            {
                System.out.println("This is odd number " + copy[i]);
            }
        }
        System.out.println("---------------------------------------");
    }
}

class NowTest3
{
    public static void main(String[] args) {
        int now[] = {12,23,53,1,23};
        int nows[] = new int[now.length];

        for (int i = 0; i < now.length; i++) {
            nows[i] = now[i];
            System.out.print(nows[i] + "\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(nows));
        System.out.println(nows.length);
        System.out.println("---------------------------------------");

        int value1 = 0;
        for (int i = 0; i < nows.length; i++) {
            for (int j = 0; j < nows.length; j++) {
                if (nows[i] > nows[j])
                {
                    value1 = nows[i];
                    nows[i] = nows[j];
                    nows[j] = value1;
                }
            }

        }

        System.out.println("The descending number is ");

        for (int i = 0; i < nows.length; i++) {
            System.out.print(nows[i] + "\t");
        }

        int value2 = 0;
        for (int i = 0; i < nows.length; i++) {
            for (int j = 0; j < nows.length; j++) {
                if (nows[i] < nows[j])
                {
                    value2 = nows[i];
                    nows[i] = nows[j];
                    nows[j] = value2;
                }
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("The ascending number is ");
        for (int i = 0; i < nows.length; i++) {
            System.out.print(nows[i] + "\t");
        }

        System.out.println();
        System.out.println("---------------------------------------");

        for (int i = 0; i < nows.length; i++) {
            nows[i] = nows[i] + 2;
            System.out.print(nows[i] + "\t");
        }
    }
}

class NowTest4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculation Now " + " = ");

        int number1 = scanner.nextInt();

        char operator = scanner.next().charAt(0);

        int number2 = scanner.nextInt();

        switch (operator)
        {
            case '+':
                int result = number1 + number2;
                System.out.println(number1 + "+" + number2 + " = " + result);
                break;

            case '-':
                int result1 = number1 - number2;
                System.out.println(number1 + "-" + number2 + " = " + result1);
                break;

            case '*':
                int result2 = number1 * number2;
                System.out.println(number1 + "*" + number2 + " = " + result2);
                break;

            case '/':
                int result3 = number1 / number2;
                System.out.println(number1 + "/" + number2 + " = " + result3);
                break;

            case '%':
                int result4 = number1 % number2;
                System.out.println(number1 + "%" + number2 + " = " + result4);
                break;

            default:
                break;

        }
    }
}

class NowTest5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculation of temperature " + " = ");

        double f = scan.nextDouble();

        char sign = scan.next().charAt(0);

        double c = scan.nextDouble();

        switch(sign)
        {
            case 'c':
                c=(f-32)*5/9;
                System.out.println("The temperature c is " + c + "`C");
                break;

            case 'f':
                f=((9*c)/5)+32;
                System.out.println("The temperature f is " + f + "`F");
                break;

            default:
                System.out.println("Invalid Temperature!");
                break;
        }
    }
}

class NowTest6
{
    public static void main(String[] args) {
      int date = 365;
      while (date % 4 == 0)
      {
          System.out.println(date + " - ");
          date++;
      }
        System.out.println("Today is duplicate day");


        int i,fact=3;
        int number=4;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);


        int n1=0,n2=1,n3,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        System.out.println();

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}