package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ice_cost {
    class Solution {
        public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
            int n=0;
            int m=0;
            int all_length=0;
            int jieguo=0;
            int liwai=0;
            List<Integer> all=new ArrayList<>();
            List<Integer> all_b=new ArrayList<>();
            for(n=0;n<baseCosts.length;n++){
                for(m=0;m<toppingCosts.length;m++){
                    all.add(baseCosts[n]);
                    all.add(baseCosts[n]+toppingCosts[m]);
                    all.add(baseCosts[n]+toppingCosts[m]*2);

                }

            }

            for(n=0;n<baseCosts.length;n++){
                for(m=0;m<toppingCosts.length;m++){
                    // for(liwai=0;liwai<toppingCosts.length;liwai++)
                    if(m>=1){
                        all.add(baseCosts[n]+toppingCosts[m]+toppingCosts[m-1]);
                    }if(m>=2){
                        all.add(baseCosts[n]+toppingCosts[m]+toppingCosts[m-2]);
                    }if(m>=3){
                        all.add(baseCosts[n]+toppingCosts[m]+toppingCosts[m-3]);
                    }if(m>=4){
                        all.add(baseCosts[n]+toppingCosts[m]+toppingCosts[m-4]);
                    }





                }

            }




            for(all_length=0;all_length<all.size();all_length++){
                for(jieguo=0;jieguo<all.size();jieguo++){
                    //(target-all.get(all_length)).abs()
                    if(target>=all.get(all_length)){
                        int a=target-all.get(all_length);
                        if(a==jieguo){
                            return all.get(all_length);
                        }else{
                            continue;
                        }


                    }else{
                        int b=all.get(all_length)-target;
                        if(b==jieguo){
                            return all.get(all_length);
                        }else{
                            continue;
                        }


                    }








                }


            }

            // for(all_length=0;all_length<all_b.size();all_length++){
            //     for(jieguo=0;jieguo<all_b.size();jieguo++){
            //         //(target-all.get(all_length)).abs()
            //         if(target>=all.get(all_length)){
            //             int a=target-all.get(all_length);
            //             if(a==jieguo){
            //                 return all.get(all_length);
            //             }else{
            //                 continue;
            //             }


            //         }else{
            //             int b=all.get(all_length)-target;
            //             if(b==jieguo){
            //                 return all.get(all_length);
            //             }else{
            //                 continue;
            //             }


            //         }

            //     }


            // }

















            return 0;
        }
    }
}
