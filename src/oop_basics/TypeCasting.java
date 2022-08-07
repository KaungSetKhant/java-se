package oop_basics;

class Casting
{
    int num1 = 50;
    void child()
    {
        System.out.println("Parent Class");
    }
}
public class TypeCasting extends Casting {
    int num1 = 70;
    void child()
    {
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        int a = 12;
        double b = a;//widening casting or upcasting (from lower to higher)
        int c = (int) b;//narrowing casting or down casting (from higher to lower)

        //Simple Form
        TypeCasting typeCasting = new TypeCasting();
        Casting casting = typeCasting;// widening casting or upcasting

        casting.child();
        System.out.println(casting.num1);

        TypeCasting type = (TypeCasting) casting;// narrowing casting or down casting


    }
}
/**
 * Overriding can override only method not include variable or value
 */