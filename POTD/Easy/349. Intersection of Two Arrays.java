class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n  =nums1.length , m = nums2.length;
		ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int i=0 ; i<n ; i++){
            st.add(nums1[i]);
        }
        for(int i=0 ; i<m ; i++){
            if(st.contains(nums2[i])){
                ans.add(nums2[i]);
            }
            
                st.remove(nums2[i]);
        }
        int[] res = new int[ans.size()];
        
        for(int i=0 ; i<ans.size() ; i++){
            res[i] = ans.get(i);
        }
		return res;
    }
}
