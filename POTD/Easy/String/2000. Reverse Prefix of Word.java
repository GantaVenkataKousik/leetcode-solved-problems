class Solution {
    public String reversePrefix(String word, char ch) {
        int endIndex = 0;
        
        int n = word.length();

        while(endIndex<n && word.charAt(endIndex) != ch)endIndex++;

        if(endIndex==n)return word;

        StringBuilder sb = new StringBuilder(word.substring(0,endIndex+1)).reverse();
        sb.append(word.substring(endIndex+1));

        return sb.toString();

    }
}
