package JavaSETest1;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int kanes[] = {12,4,6,2,14,10,8};

        System.out.println(Arrays.toString(kanes));

        for (int i = 0; i < kanes.length; i++) {
            System.out.print(kanes[i] + "\t");
        }

        int order = 0;
        for (int i = 0; i < kanes.length; i++) {
            for (int j = 0; j < kanes.length; j++) {
                if (kanes[i] < kanes[j])
                {
                    order = kanes[i];
                    kanes[i] = kanes[j];
                    kanes[j] = order;
                }
            }
        }

        System.out.println();
        System.out.println("The ordering number is ");

        for (int i = 0; i < kanes.length; i++) {
            System.out.print(kanes[i] + "\t");
        }
    }
}
