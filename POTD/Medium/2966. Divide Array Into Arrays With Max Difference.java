class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int numOfGroups = n / 3;
        int[][] ans = new int[numOfGroups][3];
        int grpIdx = 0;
        for(int i=0 ; i<n ; i+=3){
            if(i+2 < n && nums[i+2]-nums[i]<=k){
                ans[grpIdx][0] = nums[i];
                ans[grpIdx][1] = nums[i+1];
                ans[grpIdx][2] = nums[i+2];
                grpIdx++;
            }
            else{
                return new int[0][0];
            }
        }
        return ans;
    }
}
