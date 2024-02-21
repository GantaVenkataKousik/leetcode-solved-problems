class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while(left!=right && left>0){
            left>>=1;
            right>>=1;
            cnt++;
        }
        return (left<<cnt);
    }
}
