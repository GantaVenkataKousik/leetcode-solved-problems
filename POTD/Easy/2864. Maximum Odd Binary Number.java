class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt0 =0 , cnt1 = 0 , n = s.length();
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == '1')cnt1++;
            else cnt0++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("1".repeat(cnt1-1));
        sb.append("0".repeat(cnt0));
        sb.append("1");
        return sb.toString();
    }
}
