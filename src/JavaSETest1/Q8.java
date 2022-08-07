package JavaSETest1;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int gah[][] =
                {
                        {1,2,3,4,5},
                        {5,4,3,2,1},
                        {7,8,9,1,5,7,7},
                };

        //System.out.println(Arrays.toString(gah));

        for (int i = 0; i < gah.length; i++) {
            for (int j = 0; j < gah[i].length; j++) {
                System.out.print(gah[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
