package JavaSETest1;
interface Origin
{
    void sum();
}
interface Copy
{
    void calculate();
}

public class Q21 implements Origin,Copy
{
    public static void main(String[] args) {
        Q21 q21 = new Q21();
        q21.sum();
        q21.calculate();
    }

    @Override
    public void sum() {
        System.out.println(3+3);
    }

    @Override
    public void calculate() {
        System.out.println(3-2);
    }
}
