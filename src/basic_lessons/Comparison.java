package basic_lessons;

public class Comparison
{
    public static void main(String[] args) {
        int a=5;
        int b=6;
        boolean c=a<b;
        System.out.println(c);
        boolean d=a>b;
        System.out.println(d);
        boolean e=a<b & a>b;
        System.out.println(e);
        boolean f=a>b | a<b;
        System.out.println(f);
        boolean g=a<b && a>b;
        System.out.println(g);
        boolean h=a>b || a<b;
        System.out.println(h);
        int aa=7;
        int bb=8;
        boolean i=aa<bb == aa>bb;
        System.out.println(i);
        boolean j=aa<bb != aa>bb;
        System.out.println(j);
        boolean k=aa<=bb | aa>=bb;
        System.out.println(k);
    }
}
