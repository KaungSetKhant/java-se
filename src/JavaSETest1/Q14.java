package JavaSETest1;

public class Q14 {
    public static void main(String[] args) {
        int now[] = {1,2,3,4,5,6,7};

        for (int i = 0; i < now.length; i++) {
            now[i] += now[i];
            System.out.print(now[i] + "\t");
        }
    }
}
