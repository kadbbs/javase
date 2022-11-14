package leetcode;

public class shui {
    public int maxArea(int[] height) {
        int re = 0;
        int area = 0;
        int front = 0;
        int foot = height.length - 1;
        for (int i = 0; i < height.length; i++) {
            area = (foot - front) * (Math.min(height[front], height[foot]));
            if (front >= foot) {
                foot--;
            } else {
                front++;
            }

            if (area > re) {
                re = area;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int[] a={2,3,4,5,18,17,6};
        shui shui=new shui();
        int re=shui.maxArea(a);
        System.out.println(re);

    }

}
