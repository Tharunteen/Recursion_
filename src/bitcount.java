import java.lang.reflect.Array;
import java.util.*;
public class bitcount {
    public static void main(String[] args) {
        int a=5;
        bitcount(a);
        bin(a);
        String b="657";
        //string to integer
        int c=Integer.valueOf(b);
        //Arrays.
        //System.out.println(Integer.reverse(89));
        System.out.println(Integer.parseInt(b)+1);
        //string to char
        char[] n=b.toCharArray();
//        int[] l={1,2,3,4,100,200,60};
//        System.out.println(Arrays.stream(l).);
        for (char k : n) {

            System.out.println(k);
        }
    }
    //to count no of 1 bits in binary form
    public static void bitcount(int n){
        System.out.println("No of one Bit in the given number is "+Integer.bitCount(n));
    }
    //to represent a decimal in Binary Format
    public static void bin(int n){
        System.out.println("Binary Represntation "+Integer.toBinaryString(n));
    }
}
