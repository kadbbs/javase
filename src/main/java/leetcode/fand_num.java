package leetcode;

public class fand_num {
    public int guessNumber(int n) {
        int left=1;
        int right=n+1;

        int centre=1+(n-1)/2;
        while(1==1){
            if(guess(centre)==0){
                return centre;

            }else if(guess(centre)==1){
                left=centre;
                centre=left+(right-left)/2;
            }else{
                right=centre;
                centre=left+(centre-left)/2;
            }
        }



    }
    public int guess(int num){
        int pick=2;
        if(num==pick){
            return 0;
        }else if(num>pick){
            return -1;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        fand_num fand_num=new fand_num();
        int re=fand_num.guessNumber(2);
        System.out.println(re);
    }
}
