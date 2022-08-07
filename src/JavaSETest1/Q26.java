package JavaSETest1;

public class Q26 {
    public static void main(String[] args) {
        int number1=1,number2=2,number3,count=12;
        System.out.print(number1+" "+number2);
        System.out.println();

        for (int i = 3; i < count; i++) {
            number3 = number1 * number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
