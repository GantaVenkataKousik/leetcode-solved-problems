class Solution {
    public int countSegments(String s) {
        int i=0 , n = s.length(); 
        if(s.equals(""))return 0;
        int segmentCnt = 0;
        boolean anyCharacterOccurred = false;
        while(i<n){
            if(s.charAt(i)==' '){
                if(anyCharacterOccurred)segmentCnt++;
                while(i<n && s.charAt(i) == ' ')i++;
            }
            else{
                if(!anyCharacterOccurred){
                    anyCharacterOccurred = !anyCharacterOccurred;
                }
                i++;
            }
        }
        if(s.charAt(n-1)!=' ')segmentCnt++;
        return segmentCnt;
    }
}
