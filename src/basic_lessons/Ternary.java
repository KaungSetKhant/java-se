package basic_lessons;

public class Ternary {
    public static void main(String[] args) {
        String message=(10>5)? "Right" : "Wrong";
        System.out.println(message);

        int mes=(10>5)? 10:5;
        System.out.println(mes);

        boolean ss=(10>5)? true:false;
        System.out.println(ss);
    }
}
