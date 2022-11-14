package leetcode;

public class max_rep_string {
    public int maxRepeating(String sequence, String word) {
        int k=0;
        int re=0;
        int ban=0;
        int xiao=0;
        int yw=-2;
        int falg=0;
        int len=sequence.length();
        yw=sequence.indexOf(word);
        if(yw==-1){
            return 0;
        }
        //yw=yw+word.length();
        for(int u=0;u<len;u++){

            falg=0;
            for(int i=k ;i<len;i++){
//            for(int u=0;u<word.length();u++){
//                if(sequence.charAt(yw)==word.charAt(u)){
//
//                    if(u!=word.length()-1){
//                        yw++;
//                    }else {
//                        falg++;
//                    }
//                }
//            }
                if(sequence.charAt(i)==word.charAt(xiao)){

                    if(xiao==word.length()-1){
                        falg++;
                        ban=1;
                    }
                    if(ban==0){
                        xiao++;
                    }else if(ban==1){
                        ban=0;
                        xiao=0;
                    }

                }else {
                    ban=0;
                    xiao=0;
                    break;
                }

            }
            k++;
            ban=0;
            xiao=0;

            if(falg>re){
                re=falg;
            }

        }

        return re;

    }

    public static void main(String[] args) {
        max_rep_string max_rep_string=new max_rep_string();
        int re=max_rep_string.maxRepeating("aaaaa","aaa");
        System.out.println(re);


    }
}
