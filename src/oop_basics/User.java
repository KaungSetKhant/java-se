package oop_basics;

class Location
{
    String city;
    int no;

    Location(String c, int n)
    {
        this.city = c;
        this.no = n;
    }
}
public class User {
    int id;
    String name;

    Location location;

    User(int i, String name, Location location)
    {
        this.id = i;
        this.name = name;
        this.location = location;
    }

    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(location.city);
        System.out.println(location.no);
    }
    public static void main(String[] args) {
        Location location = new Location("Thingangyun",15);

        User user1 = new User(1,"KSK",location);

        user1.display();

    }
}
