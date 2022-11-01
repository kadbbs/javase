package leetcode;

public class fand_target_to_nums {
    public int searchInsert(int[] nums, int target) {
        boolean flag=false;
        int tar=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){

                return i;

            }

            if(i!=nums.length-1){
                if(target>nums[i]&&target<=nums[i+1]){
                    tar=i+1;
                    flag=true;
                    break;
                }

            }else{
                if(nums[i]<target){
                    return nums.length;
                }
            }


        }
        if(flag){
            return tar;
        }
        return -2;

    }

    public static void main(String[] args) {
        fand_target_to_nums fand_target_to_nums=new fand_target_to_nums();
        int[] nums={1,3,5,6};
        int a=fand_target_to_nums.searchInsert(nums,7);
        System.out.println(a);
    }
}
