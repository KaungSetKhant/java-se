package array;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int num[] = {1,2,22,3,5,7,10};
        int numbers[] = new int[num.length];

        System.out.println("The original number");
        for (int i = 0; i < num.length; i++) {
            numbers[i] = num[i];
            System.out.print(numbers[i] + "\t");
        }
        System.out.println("\n");
        System.out.println("The ascending number");

        int valueNow = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j]<numbers[i])
                {
                    valueNow = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = valueNow;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        ///////////////////////////////////////
        int order[] = {21,3,7,5,1,2,30};
        int orders[] = new int[order.length];

        System.out.println("\n");
        System.out.println("The original number");
        for (int i = 0; i < order.length; i++) {
            orders[i] = order[i];
            System.out.print(orders[i] + "\t");

        }
        System.out.println("\n");
        System.out.println("The descending number");

        int nowValues = 0;
        for (int i = 0; i < orders.length; i++) {
            for (int j = i+1; j < orders.length; j++) {
                if (orders[i]<orders[j]){
                    nowValues = orders[i];
                    orders[i] = orders[j];
                    orders[j] = nowValues;
                }
            }
        }
        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i] + "\t");
        }

    }
}
