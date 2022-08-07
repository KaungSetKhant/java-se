package string;

import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String text = "Greeting KSK";
        String result = text.substring(0);
        System.out.println(result);

        String result1 = text.substring(0,8);
        System.out.println(result1);

        String result2 = text.substring(9,12);
        System.out.println(result2);
//////////////////////////////////////////////////////
        String words = "Hello, KSK";
        String word [] = words.split("\\,");
        System.out.println(Arrays.toString(word));
    }
}


/**
 * 1. substring
 *
 * 2. split (need regular expression)
 */