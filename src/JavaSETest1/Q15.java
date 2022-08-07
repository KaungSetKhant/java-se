package JavaSETest1;

public class Q15 {
    public static void main(String[] args) {
        int done[] = {21,2432,23,435,12,60};
        for (int i = 0; i < done.length; i++) {
            if (done[i] % 2 == 0)
            {
                System.out.println("This is even number " + done[i]);
            }
            else
            {
                System.out.println("This is odd number " + done[i]);
            }
        }
    }
}
