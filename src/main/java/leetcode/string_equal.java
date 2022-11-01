package leetcode;

import java.util.ArrayList;
import java.util.List;

public class string_equal {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        for(int i=0;i<word1.length;i++){
            str1=str1+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            str2=str2+word2[i];
        }

        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        String[] word1 = {"a", "bc"}, word2 = {"ab", "c"};
        string_equal string_equal=new string_equal();
        string_equal.arrayStringsAreEqual(word1,word2);
        List<Integer> list=new ArrayList<Integer>();
        String ss="jfiejfi";
        char[] s=ss.toCharArray();
    }

}
