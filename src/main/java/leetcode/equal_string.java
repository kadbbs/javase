package leetcode;

public class equal_string {
    public boolean halvesAreAlike(String s) {
        boolean flag1=false;
        boolean flag2=false;
        int count1=0;
        int count2=0;

        char[] chars={'a','e','i','o','u','A','E','I','O','U'};
        int len=s.length()/2;
        String s1=s.substring(0,len);
        String s2=s.substring(len,s.length());
        for(int i=0;i<len;i++){
            for(int u=0;u<chars.length;u++){
                if(s1.charAt(i)==chars[u]){
                    flag1=true;
                    break;
                }
                if(s2.charAt(i)==chars[u]){
                    flag2=true;
                    break;
                }
            }
            if(flag1){
                count1++;
            }
            if(flag2){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        equal_string equal_string=new equal_string();
        equal_string.halvesAreAlike("textbook");
    }
}
