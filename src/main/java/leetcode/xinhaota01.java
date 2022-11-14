package leetcode;

public class xinhaota01 {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int p=0;
        int p1=0;
        int[] re={0,0};
        int bx=0;
        int by=0;
        int sss=0;
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
        // bx=51;
        // by=51;
        int r2=radius*radius;

        for(int x=0;x<bx;x++){
            for(int y =0;y<by;y++){
                p=0;
                // for(int i=0;i<towers.length;i++){

                //     int d=(towers[i][0]-x)*(towers[i][0]-x)+(towers[i][1]-y)*(towers[i][1]-y);

                //    // p=  (int)(p+towers[i][2]/(1+Math.sqrt(d)));
                //     // if(d>ra){
                //     //     sss=0;
                //     // }else{
                //     //     double dd=Math.sqrt(d);
                //     //     //p=(int)(p+towers[i][2]/(1+dd));

                //     //     p=sss+(int)Math.floor(towers[i][2] / (1 + dd));
                //     //     sss=p;
                //     // }

                //     // double dd=Math.sqrt(d);
                //     // p=sss+(int)Math.floor(towers[i][2] / (1 + dd));
                //     // sss=p;



                //     //int dis2 = (t[0] - x) * (t[0] - x) + (t[1] - y) * (t[1] - y);


                //     double dd=Math.sqrt(d);
                //     if(d <= r2)p += Math.floor(towers[i][2] / (1 + dd));

                // }







                for(int[] t: towers){
                    int dis2 = (t[0] - x) * (t[0] - x) + (t[1] - y) * (t[1] - y);
                    if(dis2 <= r2)p += Math.floor(t[2] / (1 + Math.sqrt(dis2)));
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
        xinhaota01 xinhaota01=new xinhaota01();
        int[][] towers={{0,1,2},{2,1,2},{1,0,2},{1,2,2}};
        int[][] towers1= {{33,24,12},{5,34,12},{9,45,6},{28,12,12}};
        int []re=xinhaota01.bestCoordinate(towers1,2);
        for(int a:re){
            System.out.println(a);
        }
    }
}
