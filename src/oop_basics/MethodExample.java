package oop_basics;

public class MethodExample
{
    void eat()
    {
        System.out.println("I am eating");
    }//method creating or method declaration
    int sum()
    {
        int a = 3;
        int b = 4;
        int c = a+b;
        System.out.println("other eating");
        return c;
    }//method creating or method declaration

    String name()
    {
        return "Kaung Set Khant";
    }
    public static void main(String[] args)
    {
       MethodExample obj = new MethodExample();
       obj.eat();//recall method
       obj.sum();//recall method

        System.out.println(obj.name());
        System.out.println(obj.sum());
//        System.out.println(obj.name());

    }
}
