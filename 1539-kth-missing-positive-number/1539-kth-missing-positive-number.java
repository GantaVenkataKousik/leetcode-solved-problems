class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0 , e = arr.length-1 , mid = 0;
        while(s<=e){
            mid = s + (e-s)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        //end will end up in step less than missing 
        //elements greater than ot equal to k
        return k+e+1;
        
    }
}