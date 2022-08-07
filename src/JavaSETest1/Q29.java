package JavaSETest1;

import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        int ouch[] = {12,21,32,22,42};
        System.out.println(Arrays.toString(ouch));

        for (int i = ouch.length - 1; i >= 0; i--) {
            System.out.print(ouch[i] + "\t");
        }
    }
}
