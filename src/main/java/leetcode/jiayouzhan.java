package leetcode;

public class jiayouzhan {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int you=0;
        int start=0;
        int flag=-1;
        int huan=0;
        int lian=0;
        for(int w=0;w<gas.length;w++){

            you=0;

            if(start==0){
                for(int i=start;i<gas.length;i++){
                    if((you+gas[i])>=cost[i]){
                        you+=gas[i]-cost[i];
                    }else {
                        start=i;
                        break;

                    }

                    if(i==(gas.length-1)){
                        flag=start;
                    }

                }




            }else{
                lian=0;
                for(int i=start;i<gas.length;i++){
                    if((you+gas[i])>=cost[i]){
                        you+=gas[i]-cost[i];
                    }else{
                        lian=1;
                        start=i;
                        break;
                    }




                }
                if(lian==0){
                    for(int i=0;i<start;i++){

                        if((you+gas[i])>=cost[i]){
                            you+=gas[i]-cost[i];
                        }else {
                            start=i;
                            break;
                        }
                        huan=start-1;

                        if(i==huan){
                            flag=start;
                            //break;
                            return start;
                        }

                    }

                }


//                for(int i=0;i<start;i++){
//
//                    if((you+gas[i])>cost[i]){
//                        you+=gas[i]-cost[i];
//                    }
//                    huan=start-1;
//
//                    if(i==huan){
//                        flag=1;
//                    }
//
//                }

            }


            start++;

        }

        return flag;

    }

    public static void main(String[] args) {
        jiayouzhan jiayouzhan=new jiayouzhan();
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,1,2};
        int[] a1={2,3,4};
        int[] b1={3,4,3};
        int[] a2={5,1,2,3,4};
        int[] b2={4,4,1,5,1};

        int re=jiayouzhan.canCompleteCircuit(a2,b2);
        System.out.println(re);

    }
}
