package JavaSETest1;

import java.util.Arrays;

public class Q30 {
    public static void main(String[] args) {
        int ouch[] = {12,21,32,22,42};
        System.out.println(Arrays.toString(ouch));

        for (int i : ouch) {
            System.out.print(i + "\t");
        }
    }
}
