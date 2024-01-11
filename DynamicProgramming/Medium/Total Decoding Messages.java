

//User function Template for Java

class Solution
{
    
    static int mod = (int)1e9+7;
    
    private static int noOfWays(String s,int index,int[] dp){
        if(index == s.length())return 1;

        if(dp[index] != -1)return dp[index];

        int res = 0;
        if(s.charAt(index) != '0')
            res = (res%mod + noOfWays(s,index+1,dp)%mod)%mod;
        if(index<s.length()-1 && (s.charAt(index)=='1' || s.charAt(index)=='2' && s.charAt(index+1)<='6'))
            res = (res%mod +  noOfWays(s,index+2,dp)%mod)%mod;
        
        dp[index] = res%mod;
        return res;
    }
    
    public int CountWays(String s){
        int n = s.length();
        int[] dp = new int[n];
        for(int i=0 ; i<n  ; i++){
            dp[i] = -1;
        }
        return noOfWays(s,0,dp);
    }
}
