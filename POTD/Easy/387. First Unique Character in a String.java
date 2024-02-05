class Solution {
    public int firstUniqChar(String s) {
        int space[] = new int[26];

        char ch ;

        for(char ch : s.toCharArray()){
            space[ch-'a']++;
        }

        for(int i=0 ; i<s.length() ; i++){
            ch = s.charAt(i);
            if(space[ch-'a']==1)return i;
        }
        return -1;
    }
}
