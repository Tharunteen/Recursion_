import java.util.*;
public class steps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ((a % b) == 0) {
            System.out.println(a / b);
        } else {
            System.out.println((a / b) + (a%b));
        }
    }
}
