package leetcode;

public class goal {
    public String interpret(String command) {
        String re="";

        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    re=re+"o";
                    i++;
                }else {
                    re=re+"al";
                    i=i+3;
                }
            }else if(command.charAt(i)=='G'){
                re=re+"G";
            }
        }
        return re;
    }
}
