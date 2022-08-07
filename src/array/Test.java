package array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       int num[] = {1,2,3,4,5,6,7,8};
       int copy[] = new int [num.length];

        for (int i = 0; i < num.length; i++) {
            copy [i] = num [i];
        }
        System.out.println(Arrays.toString(copy));

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "\t");
        }

        int largestNumber = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i]>largestNumber)
            {
                largestNumber = copy[i];
            }
        }
        System.out.println();
        System.out.println("The Largest Number is " +largestNumber);

        int samllestNumber = 2;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] < samllestNumber) {
                samllestNumber = copy[i];
            }
        }
        System.out.println("The Smallest Number is " + samllestNumber);


    }
}
