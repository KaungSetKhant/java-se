package oop_basics;
class Foods
{
    int a = 34;
    void eat()
    {
        System.out.println("I eat the cake");
    }
}
public class P2 extends Foods {
    int a = 35;
   @Override
    void eat()
    {
        super.eat();//"super" keywork is work for parent class of "Foods".
        System.out.println(super.a);
//        System.out.println("I eat the noddle");//this method is work for P2 class
    }
    public static void main(String[] args) {
        P2 p2 = new P2();
        p2.eat();
        System.out.println(p2.a);
    }
}
