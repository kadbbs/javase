package leetcode;

public class Domino {
    static final int MOD = 1000000007;
    public static int numTilings(int n) {


        int[][] f=new int[n+1][2];
        f[0][0]=1;
        f[0][1]=0;
        f[1][0]=1;
        f[1][1]=2;
        for(int i=0;i<n+1;i++){
                if(i>=2){
                    f[i][0] = f[i-1][0] + f[i-2][0] + f[i-2][1];
                    f[i][1] = f[i-1][0]*2 + f[i-1][1];
                }


        }
        return f[n][0]%MOD;
    }

    public static void main(String[] args) {
        int re=Domino.numTilings(30);
        System.out.println(re);
    }
}
