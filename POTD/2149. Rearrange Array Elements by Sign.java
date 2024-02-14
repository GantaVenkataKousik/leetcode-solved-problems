class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i=0  , j = 1;
        for(int ele : arr){
            if(ele<0){
                ans[j] = ele;
                j+=2;
            }
            else{
                ans[i] = ele;
                i+=2;
            }
        }
        return ans;
    }
}
