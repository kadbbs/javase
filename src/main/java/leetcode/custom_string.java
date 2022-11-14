package leetcode;

import java.util.ArrayList;
import java.util.List;

public class custom_string {
    public static String customSortString(String order, String s) {

        String jie="";
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            for(int u=0;u<order.length();u++){
                if(s.charAt(i)==order.charAt(u)){
                    //jie=jie+order.charAt(u);
                    list.add(i);
                    list1.add(u);
                }

            }
        }
        for(int i=0;i<order.length();i++){
            for(int u=0;u<list1.size();u++){
                if(i==list1.get(u))
                    jie=jie+order.charAt(i);
            }

        }
        char[] chars=s.toCharArray();
        for(int i=0;i<jie.length();i++){
            chars[list.get(i)]=jie.charAt(i);

        }
        return String.valueOf(chars);

    }

    public static void main(String[] args) {
        String re=custom_string.customSortString("kqep","pekeq");
        System.out.println(re);
    }
}
