class Solution {
    private boolean isVowel(char ch){
        return ((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'));
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int half = n/2,cnt = 0;
        char ch;
        for(int i=0 ; i<half ; i++){
            ch = s.charAt(i);
            if(isVowel(ch)){
                cnt++;
            }
        }
        for(int i=half ; i< n ; i++){
            ch = s.charAt(i);
            if(isVowel(ch)){
                cnt--;
                if(cnt<0)return false;
            }
        }
        return cnt==0;
    }
}
