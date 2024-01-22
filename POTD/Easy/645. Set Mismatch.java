class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0 , n = nums.length;
        for(int i=1 ; i<=n ; i++){
            xor ^= i;
            xor ^= nums[i-1];
        }

        int setBit = (xor & ~(xor-1));

        
        int one = 0 , zero = 0;

        for(int ele : nums){
            if((ele & setBit) ==0){
                zero ^= ele;
            }
            else{
                one ^= ele;
            }
        }


        for(int i=1 ; i<=n ; i++){
            if((i & setBit) ==0){
                zero ^= i;
            }
            else{
                one ^= i;
            }
        }

        int cnt = 0;
        for(int ele : nums){
            if(ele == zero)cnt++;
        }
        if(cnt==2)return new int[]{zero,one};
    
        return new int[]{one,zero};
    }

}
