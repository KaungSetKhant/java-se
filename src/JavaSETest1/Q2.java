package JavaSETest1;

public class Q2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("The original number of a is " + a);
        System.out.println("The original number of b is " + b);

        System.out.println();

        a = b;
        b = b - 1;

        System.out.println("The swap number of a is " + a);
        System.out.println("The swap number of b is " + b);
    }
}
