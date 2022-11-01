package leetcode;

public class add {
    public int[] twoSum(int[] nums, int target) {
        int[] re=new int[2];
        int a=-1;
        int b=-1;
        for(int i=0;i<(nums.length)-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int target_text=nums[i]+nums[j];
                if(target_text==target){
                    a=i;
                    b=j;
                    break;
                }else{
                    continue;
                }
            }
        }
        re[0]=a;
        re[1]=b;
        return re;
    }

    public static void main(String[] args) {
        int[] a={2,7,11,15};
        add add=new add();
        add.twoSum(a,9);
    }
}
