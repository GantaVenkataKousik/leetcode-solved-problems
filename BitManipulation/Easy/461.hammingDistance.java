class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x!=0 || y!=0){
            int p1=0,p2=0;
            if((x&1)==1)  p1++;
            if((y&1)==1)  p2++;
            if(p1!=p2)  count++;
            x>>=1;
            y>>=1;
        }
        return cnt;
    }
}
