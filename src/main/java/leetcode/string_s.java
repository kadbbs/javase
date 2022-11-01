package leetcode;

public class string_s {
    public int magicalString(int n) {
        if(n<4){
            return 1;
        }
        int count=0;
        int[] s=new int[n];
        s[0]=1;
        s[1]=2;
        s[2]=2;
        int zu=2;
        for(int i=3;i<n;i++){
            if(s[zu]==2){
//                s[i]=s[i-1];
                if(s[i-1]==1){
                    s[i]=2;
                    s[i+1]=2;
                    i++;
                }else if(s[i-1]==2){
                    s[i]=1;
                    s[i+1]=1;
                    i++;
                }

            }else if(s[zu]==1){
                if(s[i-1]==1){
                    s[i]=2;

                }else if(s[i-1]==2){
                    s[i]=1;

                }

//                s[i]=~s[i-1];
            }
            zu++;
        }
        for(int i=0;i<n;i++){
            if(s[i]==1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        string_s string_s=new string_s();
        int re=string_s.magicalString(689899892);
        System.out.println(re);

    }

}
