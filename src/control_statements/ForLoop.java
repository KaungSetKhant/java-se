package control_statements;

import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {
        String names[] = {"Kaung Set Khant","Kaung Khant","Kaung Set","Kaung Kaung"};
        for(int i=0; i<names.length; i++)
        {
            System.out.println(names[i].toUpperCase());
            System.out.println(names[i].toLowerCase());
        }

        for (String name : names)
        {
            System.out.println(name);
        }

        for (String name : names)
        {
            System.out.println(name);
        }

        for(int a=1; a<5; a++)
        {
            System.out.println(a);
        }

        String text[]={"Hello","World","Greeting","Morning"};
        System.out.println(Arrays.toString(text)+"\n"+"\t");


        int num[]= {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(num)+"\n");

        char character[]= {'K','S','K'};
        System.out.println(Arrays.toString(character)+"\n");

        double decimal[]= {1.2,1.3,2.2,2.3};
        System.out.println(Arrays.toString(decimal)+"\n");

        for (int i=0; i<num.length; i++)
        {
            num[i]=num[i]+2;
            System.out.println(num[i]);
        }

        for (int i = num.length - 1; i >= 0; i--)
        {
            System.out.println("\t" +  num[i]);
        }

        int form[][]=
                {
                        {1,2,3,4,5,6,7},
                        {2,4,6,8,10,12},
                        {1,3,5,7,9,11,13}
                };
        System.out.println(form[2][5] +"\n" );

        for (int i = 0; i < form.length; i++)
        {
            System.out.println(form[i][i]);
        }

        for (int i = 0; i < form.length; i++)
        {
            for (int i1 = 0; i1 < form[i].length; i1++)
            {
                System.out.print(form[i][i1] + "\t");
            }
            System.out.println("\n");
        }

    }
}
//create

//Syntax for "For Loop"

//array name.length (for lopping unknown array amounts)

/**
 *
 *for(3 statements){}
 * First statement-initialization
 * Second statement-condition
 * Third statement-count or loop
 */

//array name.for i <==shortcut for array looping
//array name.for r <==shortcut for array looping