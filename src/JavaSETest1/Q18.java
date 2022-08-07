package JavaSETest1;
class Oh
{
    int num2 = 13;
}
class Ho extends Oh
{
    int num3 = 15;
}
public class Q18 extends Oh {
    public static void main(String[] args) {
        Q18 q18 = new Q18();
        System.out.println(q18.num2);

        Ho ho = new Ho();
        System.out.println(ho.num3);
        System.out.println(ho.num2);
    }
}
