package oop_basics;
class ATMCard
{
    int id;
    String name;
    double amount;

    String bankname1;

    static String bankname = "AYA";
    ATMCard(int i, String n, double a, String b)
    {
        this.id = i;
        this.name = n;
        this.amount = a;
       this.bankname1 =b;
    }

    void addAmount(double d)
    {
        this.amount += d;
    }
    void withdraw(double w)
    {
        if (this.amount>w)
        {
            this.amount -= w;
        }
        else
        {
            System.out.println("Your amount doesn't match");
        }

    }
    void showAmount()
    {
        System.out.println(this.amount);
    }


}
public class ATM {
    public static void main(String[] args) {
        ATMCard card = new ATMCard(001,"Deposit",10000.00,"KBZ");
        System.out.println(card.id);
        System.out.println(card.name);
        System.out.println(card.amount);
        System.out.println(card.bankname1);

        card.addAmount(200000.00);
        //System.out.println(card.amount);

        card.withdraw(1000.00);
        //System.out.println(card.withdraw);

        card.showAmount();

        ATMCard card1 = new ATMCard(001,"Deposit",10000.00,"KBZ");
        System.out.println(card1.id);
        System.out.println(card1.name);
        System.out.println(card1.amount);
        System.out.println(card1.bankname);

        card1.addAmount(200000.00);
        //System.out.println(card.amount);

        card1.withdraw(1000.00);
        //System.out.println(card.withdraw);

        card1.showAmount();
    }
}
