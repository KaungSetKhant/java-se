package array;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        int [] numbers = {1,3,5,7,9};
        System.out.println(Arrays.toString(numbers));

        String [] name = {"Kaung Set Khant","Kaung Khant","Kaung Set"};
        System.out.println(Arrays.toString(name));

        char [] one = {'K','S','K'};
        System.out.println(Arrays.toString(one));

        System.out.println(numbers.length);
        System.out.println(numbers[4]);
        System.out.println(numbers[2]);

        System.out.println(name[name.length -3]);//reverse counting array(example-array no 0 1 2 (0=3,1=2,2=1))

        name[1] = "James";//data adding
        System.out.println(name[name.length -2]);//reverse counting array(example-array no 0 1 2 (0=3,1=2,2=1))

        System.out.println(name.length);//counting array no

        String colors[] = new String[3];//array building or array declaration
        System.out.println(colors[0]);//null status
        colors[0] ="Red";//data adding
        System.out.println(colors[0]);

        colors[1] ="Blue";
        System.out.println(colors[1]);
        colors[2] ="Green";
        System.out.println(colors[2]);

        System.out.println(colors.length);


    }
}

//[]=array
//int[]number={1,23,2,455,7};//array declaration with integer
//String[] name={"Kaung Set Khant","Kaun Khant"};//array declaration with String
//@12315lb//hash code sample.

//DataType arrayName[] = {};
//DataType arrayName[] = new int[5];