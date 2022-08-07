package oop_basics.misc;

class Customs
{
    int num;
    public Customs(int i) {
        num = i;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
public class CustomWrappers {
    public static void main(String[] args) {
        Customs customs = new Customs(3);
        System.out.println(customs);
//        System.out.println(customs.getClass().getName().length());
    }
}
