package leetcode;

import javax.print.attribute.standard.Finishings;

public class prefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        if(strs==null||strs.length==0){
            return "";
        }
        for (int i=1;i<strs.length;i++){
            prefix=longestCommonPrefix(prefix,strs[i]);
        }




        return prefix;
    }
    public String longestCommonPrefix(String str1,String str2){
        int length=Math.min(str1.length(),str2.length());
        int index=0;
        while (str1.charAt(index)==str2.charAt(index)){
            index++;
        }



        return str1.substring(0,index);
    }

    public static void main(String[] args) {
         
    }
}
