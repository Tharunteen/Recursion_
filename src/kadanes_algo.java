import java.io.PrintStream;
import java.util.*;
public class kadanes_algo {
    public static void main(String[] args) {
        int[] arr={1,-2,3,5,6,-8,9};
        int msum=0;
        int csum=0;
        for(int i=0;i<arr.length;i++){
            csum+=arr[i];
            if(csum>msum) msum=csum;
            if(csum<0) csum=0;
        }
        System.out.println(msum);
    }
}
