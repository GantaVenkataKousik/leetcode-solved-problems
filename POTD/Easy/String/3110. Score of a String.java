
class Solution {
    public int scoreOfString(String s) {
        int[] ans = new int[1];
        int n = s.length();
        for(int i=0 ; i<n-1 ; i++){
            ans[0] += Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0'));
        }
        return ans[0];
    }
}
