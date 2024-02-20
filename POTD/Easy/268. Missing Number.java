class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i=1 ; i<=nums.length ; i++){
            xor ^= i;
        }
        for(int num : nums){
            xor ^= num;
        }
        return xor;
    }
}+
