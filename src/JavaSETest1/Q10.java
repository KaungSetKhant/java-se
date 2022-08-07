package JavaSETest1;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int one[] = {5,4,1,8,6,9};
        System.out.println(Arrays.toString(one));
        System.out.println("This is array length = " + one.length);
        System.out.println();
        System.out.println("The Original Number is ");

        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + "\t");
        }

        int orders = 0;
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one.length; j++) {
                if (one[i] > one[j])
                {
                    orders = one[i];
                    one[i] = one[j];
                    one[j] = orders;
                }
            }
        }

        System.out.println();
        System.out.println("The Decreasing Order is ");

        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + "\t");
        }
    }
}
