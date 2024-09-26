import java.util.*;
public class Nearest_element {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if((a%b)<(b+1)/2){
            System.out.println(a-(a%b));
        }
        else{
           System.out.println(a+b-(a%b));
        }
    }
}
