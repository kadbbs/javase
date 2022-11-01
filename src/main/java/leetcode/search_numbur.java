package leetcode;

import java.util.ArrayList;
import java.util.List;

public class search_numbur {
//    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//
//        int index=-1;
//        String t="type";
//        String c="color";
//        String n="name";
//        if(ruleKey.equals(t)){
//            index=0;
//        }else if(ruleKey.equals(c)){
//            index=1;
//        }else if(ruleKey.equals(n)){
//            index=2;
//        }
//
////        int res = 0;
////        for (List<String> item : items) {
////            if (item.get(index).equals(ruleValue)) {
////                res++;
////            }
////        }
////        return res;
//    }


    public static void main(String[] args) {
        int index=-1;
        String t="type";
        String c="color";
        String n="name";
        String ruleKey="color";
        if(ruleKey.equals(t)){
            index=0;
        }else if(ruleKey.equals(c)){
            index=1;
        }else if(ruleKey.equals(n)){
            index=2;
        }
        System.out.println(index);

    }
}
