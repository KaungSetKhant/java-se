package JavaSETest1;

public class Q1 {
    public static void main(String[] args) {
        int i,fact = 3;
        int num = 5;

        for (int  i1= 1; i1 <=num; i1++) {
            fact = fact * i1;
        }
        System.out.println("The factorial number of " + num + " is " + " = " + fact);
    }
}
