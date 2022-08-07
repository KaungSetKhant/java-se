package oop_basics;

abstract class  AB
{
    abstract void sum();
}
public class Abstract extends AB {

    @Override
    void sum()
    {
        System.out.println(3+3);
    }
}

class AC extends AB
{

    void sum() {
        System.out.println(2+2);
    }
}
class AD
{
    public static void main(String[] args) {
        Abstract ab = new Abstract();
        ab.sum();
        AC ac = new AC();
        ac.sum();

    }
}