package oop_basics;

class Bike
{
    String name;
    int price;

    String name1;
    Bike(String name, int price, String name1)//Parameter Constructor
    {
        this.name = name;
        this.price=price;
        this.name1=name1;

        System.out.println("Hello");
        System.out.println("$");
        System.out.println("Nice to");
    }
}
public class Constructor {
    public static void main(String[] args) {
        //new Bike();
        Bike bike = new Bike("Mercedes",10000000,"Meet You");
        System.out.println(bike.name);
        System.out.println(bike.price);
        System.out.println(bike.name1);
    }
}

//Default Constructor
//Parameter Constructor