class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0 , ele = -1 , n = nums.length;
        for(int e : nums){
            if(cnt==0){
                ele = e;
                cnt = 1;
            }
            else{
                if(e == ele)cnt++;
                else cnt--;
            }
        }

        int actualCnt = 0;
        for(int e : nums){
            if(e == ele)actualCnt++;
        }
        return (actualCnt > (n/2))?ele:-1;
    }
}
