package oop_basics;

public class M3
{
    void show(int a)//<---parameter or variable
    {
        System.out.println(a);
    }

    void sum(int a, int b)//<---parameter or variable
    {
        System.out.println(a+b);
    }

    String display(String s)//<---parameter or variable
    {
        return s;
    }
    String name(String firstname, String lastname)//<---parameter or variable
    {
        return firstname + lastname;
    }
    String think(String fruit)
    {
        return fruit;
    }
    public static void main(String[] args)
    {
        M3 obj = new M3();
        obj.show(2);//<---arguments
        obj.sum(1,2);//<---arguments
        System.out.println(obj.display("KSK"));//<---arguments
        System.out.println(obj.display("Name is " + "Kaung Set Khant"));
        System.out.println(obj.name("First Name is " + "Kaung","\n" + "Last Name is " + "Khant"));
        System.out.println(obj.think("I want to eat " + "Mango"));

       //obj.name("Kaung","Khant");

    }
}

//static, no build object or method
//no-static or datatypes, build object or method
//if used "return" types, need to use "sout"
//if used "sout", need to use "objectname.method()"