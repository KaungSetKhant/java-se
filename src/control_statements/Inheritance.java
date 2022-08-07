package control_statements;
class B
{
    int b = 32;
}
public class Inheritance extends B {
    int a = 64;
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.b);

        Inheritance a = new Inheritance();
        System.out.println(a.a);
    }
}

//Inheritance
//1. Single
//2. Multilevel
//3. Herarchical