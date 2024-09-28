import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {

//        ArrayList<String> ans=permutationList("","abc");
//        System.out.println(ans);
        permutations("","abc");

    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }
    public static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static int permutationscount(String p,String up){
        if(up.isEmpty()){
         return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count+=permutationscount(f+ch+s,up.substring(1));
        }
        return count;
    }
    }
