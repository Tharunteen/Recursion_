import java.util.Scanner;

public class excess_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int l1 = a.length();
        int l2 = b.length();
        int c = 0;
        if (l2 > l1) c = l2;
        if (l1 > l2) c = l1;
        if (l1 == l2) c = l1;
        int d = 0;
        for (int i = 0; i < c; i++) {
            char k = a.charAt(i);
            char j = b.charAt(i);
            d = i;
            while (k != j) {
                break;
            }
        }
        if (l2 > l1) System.out.print(b.charAt(d));
        else System.out.println(a.charAt(d));
    }
}
