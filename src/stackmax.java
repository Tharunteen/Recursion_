import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class stackmax {
    public static void main(String[] args) {
        int[] arr={4,5,2,25};
        int[] b=new int[arr.length];
        int n=arr.length;
        Stack<Integer> s=new Stack<Integer>();
        s.push(arr[n-1]);
        b[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int c=arr[i];
            if(c<s.peek()){
                //c=s.peek();
                b[i]=s.peek();
            }
            else{
                while (s.size()>0 && s.peek()<=c){
                s.pop();}
            }
            b[i]=s.size()>0 ? s.peek():-1;
            s.push(c);
        }
        System.out.println(Arrays.toString(b));
    }
}
