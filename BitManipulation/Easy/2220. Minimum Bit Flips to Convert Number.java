class Solution {
    public int minBitFlips(int start, int goal) {
        int res = start ^ goal;
        return Integer.bitCount(res);
    }
}
