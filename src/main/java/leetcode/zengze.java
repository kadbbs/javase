package leetcode;

public class zengze {
    public boolean isMatch(String s, String p) {

        int length=s.length()-p.length();
        String bu="";
        for(int i=0;i<length;i++){
            bu+="*";
        }
        int index_x=p.indexOf("*");
        if(length!=0&&index_x==-1){
            return false;
        }
        //改造p使字符串相等
        p=p.substring(0,index_x)+bu+p.substring(index_x,p.length());
        int a=p.length();
        int b=s.length();
        //当没有.的时候
        if(p.indexOf(".")==-1){
            char x_front_char=p.charAt(index_x-1);
            p=p.substring(0,index_x-1);

        }


        for(int i=0;i<s.length();i++){
            if(p.charAt(i)=='.'){
                p=s.charAt(0)+p.substring(1,p.length());
            }
            if(s.charAt(i)==p.charAt(i)){

            }else {

            }

        }
            return true;
    }

    public static void main(String[] args) {
        zengze zengze=new zengze();
        zengze.isMatch("aaefgwefawfwaf",  "a*");
    }
}
