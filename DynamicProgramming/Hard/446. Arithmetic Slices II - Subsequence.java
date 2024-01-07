class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        Map<Long,ArrayList<Integer>> mp = new HashMap<>();
          int n = nums.length,sum=0;
        for(int i=0 ; i<n ; i++){
            long ele = nums[i];
            if(!mp.containsKey(ele)){
                mp.put(ele,new ArrayList<>());
            }
            mp.get(ele).add(i);
        }
      
        int[][] dp = new int[n][n];

        for(int i=1 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                Long diff = 2L*nums[i]-nums[j];
                if(mp.containsKey(diff)){
                    for(int k : mp.get(diff)){
                        if(k<i){
                            dp[i][j] += dp[k][i]+1;
                        }
                        else{
                            break;
                        }
                    }
                    
                }
                sum += dp[i][j];
            }
        }

        return sum;
    }
}
