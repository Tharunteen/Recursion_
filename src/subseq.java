import java.util.ArrayList;

public class subseq {
        public static void main(String[] args) {
            System.out.println(subq("","abc"));
        }

        public static void subseqq(String a,String b) {
            if (b.isEmpty()) {
                System.out.println(a);
                return;
            }
            char c = b.charAt(0);
            subseqq(a + c, b.substring(1));
            subseqq(a, b.substring(1));
        }

    public static ArrayList<String> subq(String a, String b) {
            if(b.isEmpty()){
                ArrayList<String> list =new ArrayList<String>();
                list.add(a);
                return list;
            }
            char c=b.charAt(0);
            ArrayList<String> left=subq(a + c, b.substring(1));
            ArrayList<String> right=subq(a, b.substring(1));
            left.addAll(right);
            return left;

    }
}
