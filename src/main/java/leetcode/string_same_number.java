package leetcode;

public class string_same_number {
    public int countConsistentStrings(String allowed, String[] words) {
        char words_char='1';
        int ban_char=0;
        boolean flag=false;
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int u=0;u<words[i].length();u++){
                words_char=words[i].charAt(u);
                ban_char=allowed.indexOf(words_char);
                if(ban_char==-1){
                    flag=true;
                    break;
                }

            }
            if(!flag){
                flag=false;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        string_same_number string_same_number=new string_same_number();
        String[] words={"ad","bd","aaab","baa","badab"};
        int re=string_same_number.countConsistentStrings("ab",words);
        System.out.println(re);
    }
}
