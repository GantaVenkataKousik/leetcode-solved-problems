class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for(int num : nums)sum += num;
        for(int i=nums.length-1 ; i>=2 ; i--){
            sum -= nums[i];
            if(sum > nuams[i])return sum+nums[i];
        }
        return -1;
    }
}
