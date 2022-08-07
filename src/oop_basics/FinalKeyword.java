package oop_basics;

public class FinalKeyword {
    final int a;

    FinalKeyword(int a)
    {
        this.a = a;
    }
    public static void main(String[] args) {
      FinalKeyword fk = new FinalKeyword(5);
        System.out.println(fk.a);
    }
}
