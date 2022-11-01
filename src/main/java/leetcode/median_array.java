package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class median_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();

        // if(nums1.length>=nums2.length){
        //     for(int i=0;i<nums1.length;i++){
        //         if(nums1[1]>)
        //     }


        // }
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list);

        if (list.size() % 2 == 0) {
            double median = list.get((list.size() / 2) - 1) + list.get((list.size() / 2));
            return median / 2;
        } else {
            return list.get((list.size() - 1)/2);
        }


    }


    public static void main(String[] args) {
        int[] a={1,2},b={3,4};
        median_array median_array=new median_array();
        double re=median_array.findMedianSortedArrays(a,b);
        System.out.println(re);
        boolean flag=true;
        flag=false;
    }
}
