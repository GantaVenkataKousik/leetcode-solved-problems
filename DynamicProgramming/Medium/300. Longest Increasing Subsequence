class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ,ans = 1;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1 ; i<n ; i++){
            int len = 0;
            for(int j=0 ; j<i ; j++){
                if(nums[j] < nums[i]){
                    len = Math.max(len,dp[j]);
                }
            }
            dp[i] = 1+len;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
