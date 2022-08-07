package string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {
        char greet[] = {'h','e','l','l','o'};

        String string = new String(greet);
        System.out.println(string);
        System.out.println(string.length());


        String str = "Hello World";
        System.out.println(str);

        String s = new String("Welcome to Golden Land");
        System.out.println(s);

        char ch [] = {'N','I','C','E'};
        String ss = new String(ch);
        System.out.println(ss);

    }
}

class StringCompare
{
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        System.out.println(str == str1);//same energy

        System.out.println(str.equals(str1));//same energy

        //String Compare
        String s1 = "abc";
        String s2 = "def";
        System.out.println(s1.compareTo(s2));
    }
}

class StringConcatenation
{
    public static void main(String[] args) {
        String fName = "Kaung";
        String lName = " Khant";

        System.out.println(fName.concat(lName));
/////////////////////////////////////////////////////////////////////////

        StringBuilder sbuilder = new StringBuilder("Hello");
        StringBuilder sbuilders = new StringBuilder(" Kaung Khant");

        StringBuilder result = sbuilder.append(sbuilders);
        System.out.println(result);
//////////////////////////////////////////////////////////////////////////

        String result1 = String.format("%s%s",fName,lName);
        System.out.println(result1);
//////////////////////////////////////////////////////////////////////////

        String result2 = String.join("-",fName,fName);
        System.out.println(result2);
//////////////////////////////////////////////////////////////////////////

        StringJoiner joiner = new StringJoiner("_");
        joiner.add("My");
        joiner.add("name");
        joiner.add("is");
        joiner.add(fName + "_" + fName);
        System.out.println(joiner);
////////////////////////////////////////////////////////////////////////////

        List<String> s = Arrays.asList("One","Two","Three");
        String ss = s.stream().collect(Collectors.joining("_"));
        System.out.println(ss);
    }
}
// String constant pool
/**
 * 3 ways of building String
 * -------------------------
 * 1. String str = "Hello World";
 *
 * 2. String s = new String("Welcome to Golden Land");
 *
 * 3.  char ch [] = {'N','I','C','E'};
 *     String ss = new String(ch);
 */

//String Compare
/**
 * 1. ==
 *
 * 2. obj.equals(obj2)
 *
 * 3. obj.compareTo(obj2)
 */

//String Concatenation (link string)
/**
 * 1. use "+" to link string
 *
 * 2. fName.concat(lName) use "concat" method
 *
 * 3. use "append" method
 *
 * 4. use "format" method
 *
 * 5. use "join" method
 *
 * 6. use "String Joiner" class and also use add() method
 *
 * 7. List<String> s = Arrays.asList("One","Two","Three");
 *    String ss = s.stream().collect(Collectors.joining("_"));
 *    System.out.println(ss);
 */