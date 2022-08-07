package oop_basics;
class A
{
    int a = 12;
}
class B extends A
{
    int b = 13;
}

public class Multilevel extends B {
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.a);
//
//        B b = new B();
//        System.out.println(b.b);
        Multilevel m = new Multilevel();
        System.out.println(m.a);
        System.out.println(m.b);
    }
}
