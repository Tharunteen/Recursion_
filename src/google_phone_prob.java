import java.util.ArrayList;

public class google_phone_prob {
    public static void main(String[] args) {
        ArrayList<String> list=pad("","12");
        System.out.println(list);
    }
    static ArrayList<String> pad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<String>();
        int digit=up.charAt(0)-'0';
        for (int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
            ans.addAll(pad(p+ch,up.substring(1)));
        }
        return ans;
    }
}
