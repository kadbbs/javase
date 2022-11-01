package leetcode;

import java.util.HashMap;
import java.util.Map;

public class romtoint {
    public int romanToInt(String s) {
        Map<String,Integer> romanmap=new HashMap<String,Integer>();
        romanmap.put("I",1);
        romanmap.put("V",5);
        romanmap.put("X",10);
        romanmap.put("L",50);
        romanmap.put("C",100);
        romanmap.put("D",500);
        romanmap.put("M",1000);
        char[] s_shu=s.toCharArray();
        String[] s_shuzu=new String[s_shu.length];
        for(int i=0;i<s_shu.length;i++){
            s_shuzu[i]=String.valueOf(s_shu[i]);
        }
        int re=0;
        if((s.length()==2)&&(romanmap.get(s_shuzu[0])<romanmap.get(s_shuzu[1]))){
            return romanmap.get(s_shuzu[1])-romanmap.get(s_shuzu[0]);
        }else {
            for (int i=0;i<(s_shuzu.length-1);i++){
//                System.out.println(romanmap.get(s_shuzu[i]));
//                if(s_shuzu[i]=="I"||s_shuzu[i]=="X"||s_shuzu[i]=="C"){
//                    if()
//                }
                if(romanmap.get(s_shuzu[i])<romanmap.get(s_shuzu[i+1])){
                    re=re-romanmap.get(s_shuzu[i]);
                }else{
                    re=re+romanmap.get(s_shuzu[i]);
                }


            }
            return re+romanmap.get(s_shuzu[s_shuzu.length-1]);
        }

    }

    public static void main(String[] args) {
        String s="IV";
        String s1="MCMXCIV";
        romtoint romtoint =new romtoint();
        int t=romtoint.romanToInt(s1);
        System.out.println(t);
    }
}
