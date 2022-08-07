package JavaSETest1;

public class Q27 {
    public static void main(String[] args) {
        int number1=0,number2=1,number3,count=12;
        System.out.print(number1+" "+number2);
        System.out.println();

        for (int i = 2; i < count; i++) {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
