class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t==null)return false;
        if(s.length() != t.length())return false;
        int[] mp1 = new int[200];
        int[] mp2 = new int[200];
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(mp1[ch1]!=mp2[ch2])return false;
            mp1[ch1]=i+1;
            mp2[ch2]=i+1;
        }
        return true;
            
    }
}
