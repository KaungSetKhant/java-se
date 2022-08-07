package JavaSETest1;
abstract class One
{
   abstract void sum();
}

public class Q28 extends One {
    public static void main(String[] args) {

    }

    @Override
    void sum() {
        System.out.println(12+2);
    }
}

class Two
{
    public static void main(String[] args) {
        Q28 q = new Q28();
        q.sum();
    }
}
