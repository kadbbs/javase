package leetcode;

public class reversal {
    public void reverseString(char[] s) {
        int front=0;
        int rear=s.length-1;
        int flag=-1;
        while(flag!=1&&flag!=2){
            char tmp=s[front];
            s[front]=s[rear];
            s[rear]=tmp;
            flag=rear-front;
            front++;
            rear--;

        }

    }

    public static void main(String[] args) {
        reversal reversal=new reversal();
        char[] s={'\"'};
        reversal.reverseString(s);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
