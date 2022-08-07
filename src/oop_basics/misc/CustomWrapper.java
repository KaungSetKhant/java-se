package oop_basics.misc;

class Custom
{
    private int num;
    Custom(int num)
    {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
public class CustomWrapper {
    public static void main(String[] args) {

        Custom custom = new Custom(7);
        System.out.println(custom);

        System.out.println(custom.getClass().getName());//same energy

        System.out.println(new Custom(8).getClass().getName());//same energy

//        Object obj = new CustomWrapper();

    }
}
