package leetcode;

import java.util.ArrayList;
import java.util.List;

public class axis_num {
    public int reachNumber(int target) {
//        int reality = 0;
//        //int i = 1;
        target=Math.abs(target);
        int re=0;
        int front=0;
        int foot=1;
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<target*2;i++){
            foot=i+front;
            list.add(foot);
            front=foot;
            if(target<=front){
                break;
            }
        }
        if(list.get(list.size()-1)==target){
            return list.size()-1;
        }else {
            int cha=target-list.get(list.size()-2);
             re=2*cha+(list.size()-2);
        }




        return re;

    }


    public static int reachNum(int target) {
        if (target < 0) target = -target;
        int k = (int) Math.sqrt(2 * target), dist = k * (k + 1) / 2;
        while (dist < target || (dist - target) % 2 == 1) {
            k++;
            dist = k * (k + 1) / 2;
        }
        return k;
    }


    public static void main(String[] args) {
//        axis_num axis_num=new axis_num();
//        int re=axis_num.reachNumber(3);
//        System.out.println(re);
        int re=axis_num.reachNum(4);
        System.out.println(re);

    }

//    target=Math.abs(target);
//    int re=0;
//    int front=0;
//    int foot=1;
//    List<Integer> list=new ArrayList<Integer>();
//        for (int i=0;i<target*2;i++){
//        foot=i+front;
//        list.add(foot);
//        front=foot;
//        if(target<=front){
//            break;
//        }
//    }
//        if(list.get(list.size()-1)==target||(list.get(list.size()-1)-target)%2==0){
//        return list.size()-1;
//    }else {
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//
//        return re;

}
