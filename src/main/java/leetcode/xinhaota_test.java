package leetcode;

public class xinhaota_test {
    public static void main(String[] args) {
        int[][] towers={{0,1,2},{2,1,2},{1,0,2},{1,2,2}};
        int xmin = 0, xmax = 0, ymin = 0, ymax = 0;
        for(int[] t: towers){
            xmin = Math.min(xmin, t[0]);
            xmax = Math.max(xmax, t[0]);
            ymin = Math.min(ymin, t[1]);
            ymax = Math.max(ymax, t[1]);
        }
        System.out.println(xmin);
        System.out.println(xmax);
        System.out.println(ymin);
        System.out.println(ymax);

    }
}
