class Solution {

    public int minSteps(String s, String t) {
       
       int[] ch1 = new int[26];
       int[] ch2 = new int[26];
       for(char ch : s.toCharArray()){
           ch1[ch-'a']++;
       }
       for(char ch : t.toCharArray()){
           ch2[ch-'a']++;
       }
       int ans = 0;
       for(int i=0 ; i<26 ;i++){
           ans += Math.abs(ch1[i]-ch2[i]);
       }
       return ans/2;
    }
}
