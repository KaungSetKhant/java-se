package JavaSETest1;
class Number
{
    int num1 = 12;
}
class Kane extends Number
{
    int num2 = 13;
}
public class Q17 extends Kane{
    public static void main(String[] args) {
        Q17 q17 = new Q17();
        System.out.println(q17.num1);
        System.out.println(q17.num2);
    }


}
