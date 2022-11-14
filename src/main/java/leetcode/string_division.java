package leetcode;

import java.util.ArrayList;
import java.util.List;

public class string_division {
    public static boolean splitArraySameAverage(int[] nums) {
        float av=0;
        int len=0;
        float re=0;
//        int front=0;
//        float[] front_array=new float[nums.length];
        for(int i=0;i<nums.length;i++){
            av=av+nums[i];
        }
        av=av/nums.length;
        if(nums.length%2==0){
            len=nums.length;
        }else{
            len=(nums.length-1);
        }
        List<List<Integer>>list=subsets(nums);

        for(int i=0;i<list.size();i++){
            for(int u=0;u<list.get(i).size();u++){
                re=re+list.get(i).get(u);
            }
            if(re/list.get(i).size()==av){
                return true;
            }else {
                re=0;
            }


        }
//        for(int i=1;i<=len/2;i++){
//
//                for(int p=0;p<len-i+1;p++){
//                    for(int u=p;u<i+p;u++){
////                        re=re+nums[u];
////                        if(i>1){
////                            re=re+nums[u];
////                        }
////                        for(int t=0;t<len;t++){
////                            re=nums[i-1]+nums[p+1];
////                        }
////                        for(int r=0;r<len;r++){//前面的数字
////                            front=front+
////                        }
//                        for(int t=i-1;t<len;t++){
//                            re=front_array[u]+nums[u];
//                            if(re/(p+1)==av){
//                                return true;
//                            }else {
//                                front_array[t]=re;
//                                re=0;
//                            }
//                        }
//
//
//                    }
////                    if(re/(p+1)==av){
////                        return true;
////                    }else {
////                        re=0;
////                    }
//                }
//
//        }
        return false;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<List<Integer>>();
        for(int i=1;i<=Math.pow(2, nums.length)-2;i++) {
            List<Integer> list = new ArrayList<Integer>();
            String a = Integer.toBinaryString(i); //转化为二进制
            for(int j=0;j<a.length();j++) {
                char c = a.charAt(j); //取到String中的每个字符
                if(c == '1') list.add(nums[nums.length-a.length()+j]); //把对应位置为1的数字放入集合
            }
            sets.add(list);
        }
        return sets;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        boolean re=string_division.splitArraySameAverage(nums);
        System.out.println(re);
    }
}
