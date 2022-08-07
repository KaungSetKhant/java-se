package JavaSETest1;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int largest[] = {23,24,12,78,62};

        System.out.println(Arrays.toString(largest));

        for (int i = 0; i < largest.length; i++) {
            System.out.print(largest[i] + "\t");
        }

        int lar = 0;
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] > lar)
            {
                lar = largest[i];
            }
        }
        System.out.println();
        System.out.println("The largest number is " + lar);
    }
}
