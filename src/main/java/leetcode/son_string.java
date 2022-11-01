package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class son_string {
    public int lengthOfLongestSubstring(String s) {
        List<Integer> list = new ArrayList<Integer>();
        char[] ss=s.toCharArray();
        int count=1;
        boolean flag=true;
        int p=0;
        int q=1;
        for(int g=1;g<ss.length;g++){
            for(int i=q;i<ss.length;i++){
                for(int u=p;u<i;u++){
                    //ss[i]!=ss[u];

                    if(ss[i]!=ss[u]){
                        flag=true;
                    }else{
                        flag=false;
                        break;
                    }

                }
//                p=i;
                if(flag){
                    count++;
                    list.add(count);
                }else{
                    list.add(count);
                    count=1;

                    //p=i;
                    break;



                }


            }
            q++;
            p=q-1;
            count=1;

        }

        return Collections.max(list);
    }

    public static void main(String[] args) {
        String s="dvdf";
        son_string son_string=new son_string();
        int re=son_string.lengthOfLongestSubstring(s);
        System.out.println(re);
    }
}
