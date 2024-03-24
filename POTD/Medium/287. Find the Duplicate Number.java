class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i<n ; i++){
            if(nums[i]<0){
                if(nums[(nums[i]*-1)-1]<0)return nums[i]*-1;
                nums[(nums[i]*-1) - 1 ] *= -1;
            }
            else{
                if(nums[nums[i]-1]<0)return nums[i];
                nums[nums[i]-1] *= -1;
            }
            
        }
        return -1;
    }
}
