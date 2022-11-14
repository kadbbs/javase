package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jiahao {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        List<Integer> list=new ArrayList<Integer>();
        int min=0;
        int min_x=0;
        boolean falg=false;
        int[][] zuobiao=new int[n][n];

        for(int i=0;i<mines.length;i++){

            zuobiao[mines[i][0]][mines[i][1]]=1;

        }
        if(n==1){
            if(mines.length!=1){
                return 1;
            }else {
                return 0;
            }
        }
        if(n==2){
            if(mines.length!=4){
                return 1;
            }else {
                return 0;
            }
        }


        for(int i=1;i<n-1;i++){
            for (int u=1;u<n-1;u++){
                min=Math.min(i,u);
                min=Math.min(n-i-1,min);
                min=Math.min(min,n-u-1);
                falg=false;
                if(zuobiao[i][u]==1){
                    falg=true;
                    continue;
                }

                for(int p=1;p<min+1;p++){
                    if(zuobiao[i][u+p]==1){
                        falg=true;
                        break;
                    }
                    if(zuobiao[i][u-p]==1){
                        falg=true;
                        break;
                    }
                    if(zuobiao[i+p][u]==1){
                        falg=true;
                        break;
                    }
                    if(zuobiao[i-p][u]==1){
                        falg=true;
                        break;
                    }
                    //list.add(p+1);
                    if(p>min_x){
                        min_x=p;
                        falg=false;
                    }
                }
//                if(!falg){
//                    return min+1;
//                }
//                if(min>min_x&&!falg){
//                    min_x=min;
//                    falg=false;
//                }


            }
        }

//        if(true){
//            return min_x+1;
//        }

        //Collections.sort(list);
//        if(list.size()!=0){
//            return list.get(list.size()-1);
//        }
        if(min_x!=0){
            return min_x+1;
        }
        if(n>=3){
            for(int i=3;i<n+1;i++){
                if(mines.length!=i*i){
                    return 1;
                }else {
                    return 0;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        jiahao jiahao=new jiahao();
        int[][] mines={{1,0},{1,4},{2,4},{3,2},{4,0},{4,3}};
        int[][] mi={{0,0},{0,1},{0,2},{0,4},{0,5},{0,8},{0,9},{1,0},{1,1},{1,3},{1,5},{1,6},{1,7},{1,9},{2,0},{2,1},{2,2},{2,4},{2,5},{2,6},{2,7},{2,8},{3,0},{3,1},{3,2},{3,4},{3,5},{3,7},{3,8},{4,0},{4,1},{4,2},{4,4},{4,8},{4,9},{5,0},{5,1},{5,2},{5,3},{5,4},{5,6},{5,8},{5,9},{6,0},{6,1},{6,2},{6,3},{6,5},{6,7},{6,8},{6,9},{7,0},{7,1},{7,6},{7,7},{7,8},{7,9},{8,0},{8,1},{8,2},{8,5},{8,9},{9,1},{9,3},{9,4},{9,5},{9,6},{9,8}};
        int re=jiahao.orderOfLargestPlusSign(5,mines);
        System.out.println(re);
    }
}





















//        for(int i=0;i<n-2;i++){
//            int centre=n/2;
//             for(int u=1;u<centre+1;u++){
//                 for(int y=0;y<centre;y++){
//                     zuobiao[y][0]=centre;
//                     zuobiao[y][1]=centre+u;
//                 }
//                 for(int y=centre;y<2*centre;y++){
//                     zuobiao[y][0]=centre;
//                     zuobiao[y][1]=centre-u;
//                 }
//                 for(int y=2*centre;y<3*centre;y++){
//                     zuobiao[y][0]=centre+u;
//                     zuobiao[y][1]=centre;
//                 }
//                 for(int y=3*centre;y<4*centre;y++){
//                     zuobiao[y][0]=centre-u;
//                     zuobiao[y][1]=centre;
//                 }
//
//             }
//             zuobiao[4*centre][0]=centre;
//            zuobiao[4*centre][1]=centre;
//
//        }
