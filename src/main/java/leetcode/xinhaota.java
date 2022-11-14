package leetcode;

import static java.lang.Math.sqrt;

public class xinhaota {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int p=0;
        int p1=0;
        int[] re={0,0};
        int bx=0;
        int by=0;
        for(int i=0;i<towers.length;i++){
            if(towers[i][0]>bx){
                bx=towers[i][0];
            }
        }
        for(int i=0;i<towers.length;i++){
            if(towers[i][1]>by){
                by=towers[i][0];
            }
        }
        bx=bx+radius;
        by=by+radius;
        int r2=radius*radius;
        for(int x=0;x<by;x++){
            for(int y =0;y<bx;y++){
                p=0;
//                x=28;
//                y=12;
                for(int i=0;i<towers.length;i++){


                    double d=(towers[i][0]-x)*(towers[i][0]-x)+(towers[i][1]-y)*(towers[i][1]-y);
                    if(d<r2)
                    p=  (int)(p+towers[i][2]/(1+sqrt(d)));
                }
                if(p>p1){
                    p1=p;
                    re[0]=x;
                    re[1]=y;

                }

            }

        }
        return re;

    }

    public static void main(String[] args) {
        xinhaota xinhaota=new xinhaota();
        int[][] towers={{0,1,2},{2,1,2},{1,0,2},{1,2,2}};
        int[][] towers1= {{33,24,12},{5,34,12},{9,45,6},{28,12,12}};
        int []re=xinhaota.bestCoordinate(towers1,2);
        for(int a:re){
            System.out.println(a);
        }

    }
}
