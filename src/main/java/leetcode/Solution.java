package leetcode;

public class Solution {
    public int closestCost(int[] b, int[] to, int t) {
        int ans = b[0];
        int abs = Math.abs(b[0]-t);
        int bn = b.length;
        int ton = to.length;

        for(int i=0; i<bn; i++)//选定一种基料
        {
            for(int j=0; j<Math.pow(3, ton); j++)//以三进制的方式遍历每一种可能的配料搭配方案
            {
                int index = ton-1;
                int price = b[i];
                int num = j;

                while(num>0)
                {
                    price += (num%3)*to[index--];
                    num /= 3;
                }

                if(Math.abs(price-t) < abs)
                {
                    abs = Math.abs(price-t);
                    ans = price;
                }
                else if(Math.abs(price-t) == abs)
                    if(price < ans)
                        ans = price;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,7};
        int[] b={3,4};
        Solution solution=new Solution();
        int ans=solution.closestCost(a,b,10);
        System.out.println(ans);

    }
}
