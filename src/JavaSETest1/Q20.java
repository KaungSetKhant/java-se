package JavaSETest1;
interface Ones
{
    void sum();
}
interface  Twos extends Ones
{
    void calculate();
}
public class Q20 implements Twos{
    public static void main(String[] args) {
        Q20 q20 = new Q20();
        q20.sum();
        q20.calculate();
    }

    @Override
    public void sum() {
        System.out.println(5+5);
    }

    @Override
    public void calculate() {
        System.out.println(6+6);
    }
}
