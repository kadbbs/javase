package leetcode;

public class pingjun {
    public double average(int[] salary) {
        int add=0;
        for(int i=1;i<salary.length;i++){
            if(salary[i]<salary[i-1]){
                int tmp=salary[i];
                salary[i]=salary[i-1];
                salary[i-1]=tmp;
            }
        }
        for(int i=salary.length-2;i>0;i--){
            if(salary[i]<salary[i-1]){
                int tmp=salary[i];
                salary[i]=salary[i-1];
                salary[i-1]=tmp;
            }
        }
        for(int i=1;i<salary.length-1;i++){
            add=add+salary[i];
        }
        return add/(salary.length-2);
    }

    public static void main(String[] args) {
        int[] sal={4000,3000,1000,2000};
        pingjun pingjun=new pingjun();
        double re=pingjun.average(sal);
        System.out.println(re);
    }
}
