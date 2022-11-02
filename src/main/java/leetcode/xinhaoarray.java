package leetcode;

public class xinhaoarray {
        public int[] bestCoordinate(int[][] towers, int radius) {
            int p=0;
            int p1=0;
            int[] re={0,0};
//            int bx=0;
//            int by=0;
//            for(int i=0;i<towers.length;i++){
//                if(towers[i][0]>bx){
//                    bx=towers[i][0];
//                }
//            }
//            for(int i=0;i<towers.length;i++){
//                if(towers[i][1]>by){
//                    by=towers[i][1];
//                }
//            }
//            bx=bx+radius;
//            by=by+radius;
            int r2=radius*radius;
            for(int x=0;x<51;x++){
                for(int y =0;y<51;y++){
                    p=0;
//                    x=13;
//                    y=2;
                    for(int i=0;i<towers.length;i++){


                        double d=(towers[i][0]-x)*(towers[i][0]-x)+(towers[i][1]-y)*(towers[i][1]-y);
                        if(d<=r2)
                            //p=  (int)(p+towers[i][2]/(1+Math.sqrt(d)));
                            p += Math.floor(towers[i][2] / (1 + Math.sqrt(d)));
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
        int[][] towers2= {{9,44,29},{39,27,49},{43,16,0},{35,24,14},{50,16,19},{11,30,33},{29,28,46},{49,0,33},{48,15,27},{45,21,36},{12,16,27},{46,43,32},{17,42,37},{23,3,22},{15,24,15},{25,48,23},{12,6,29},{46,9,35},{13,36,42},{13,2,46},{20,6,31}};
        xinhaota xinhaota=new xinhaota();
        xinhaoarray xinhaoarray=new xinhaoarray();
        int[][] towers={{0,1,2},{2,1,2},{1,0,2},{1,2,2}};
        int[][] towers1= {{33,24,12},{5,34,12},{9,45,6},{28,12,12}};
        int []re=xinhaoarray.bestCoordinate(towers2,13);
        for(int a:re){
            System.out.println(a);
        }

    }


















}
