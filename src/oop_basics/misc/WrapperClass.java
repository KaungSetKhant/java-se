package oop_basics.misc;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 12;
        String message = "Hello";

        Integer integer = a;
        System.out.println(integer.getClass().getName());

//        First Way
//        System.out.println(integer.toString());
//        System.out.println(integer.toString().length());

//        Second Way
        String str = integer.toString();
        System.out.println(str);
        System.out.println(str.length());
    }
}
//auto boxing
class Trial
{
    public static void main(String[] args) {
        int num = 40;
        Integer num1 = num;
//        System.out.println(num1);

        System.out.println(num1.getClass().getName());
        System.out.println(num1.toString());
        System.out.println(num1.toString().length());

        String s = num1.toString();
        System.out.println(s);
        System.out.println(s.length());

    }
}
//unboxing with change String to Integer
class Trials
{
    public static void main(String[] args) {
        String phno = "778082444";

        System.out.println(phno.getClass().getName());

        Integer one = Integer.valueOf(phno);//Change String to Integer
        System.out.println(one);


        Integer two = Integer.parseInt(phno);//Change String to Integer
        System.out.println(two);

        int numbers = two;
        System.out.println(numbers);

        String no = "09778082444";
        String str = no;
        System.out.println(str);
    }
}
//Mixing autoboxing and unboxing
class One
{
    public static void main(String[] args) {
       int kane = 21;
       Integer k = kane;

       System.out.println(k.getClass().getName());
       System.out.println(k.toString());
       System.out.println(k.toString().length());

       String s = k.toString();
       System.out.println(s);
       System.out.println(s.length());

       /////////////////////////////////////////////////

       String greet = "1234567";
//       String ss = greet;
//
//       System.out.println(ss.getClass().getName());
//       System.out.println(ss.toString());
//       System.out.println(ss.toString().length());

       Integer in = Integer.valueOf(greet);
       System.out.println(in);

       Integer ins = Integer.parseInt(greet);
       System.out.println(ins);

       int number = ins;
       System.out.println(number);
    }
}

/**
 * Knowing Facts for Wrapper Class
 * --------------------------------
 * Change primitive data types to object that's called "auto boxing".
 *
 * Change object to primitive data types that's called "unboxing"
 */
