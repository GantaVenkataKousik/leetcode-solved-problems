class Solution {
    public int countSubstrings(String s) {
        int cnt = 0 , n  = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i=n-1 ; i>=0 ; i--){
            for(int j=i; j<n ; j++){
                if(i==j){
                    dp[i][j] = true;
                } 
                else if(i+1==j && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                }

                if(dp[i][j])cnt++;
            }
        }

        return cnt;
    }
}
