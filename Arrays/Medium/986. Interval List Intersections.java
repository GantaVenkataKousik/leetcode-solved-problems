class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int[]> ans = new ArrayList<>();
        int i = 0 , j = 0 ;

        while(i<firstList.length && j<secondList.length){
            int[] a = firstList[i];
            int[] b = secondList[j];

            if(b[0]<=a[1] && b[0]>=a[0])
                ans.add(new int[]{b[0], Math.min(a[1], b[1])});
            else if(a[0]<=b[1] && a[0]>=b[0])
                ans.add(new int[]{a[0], Math.min(a[1], b[1])});

            if(a[1]<=b[1])i++;
            else j++;
        }

        int cnt = ans.size();

        int[][] res = new int[cnt][2];
        for(int k=0 ; k<cnt ; k++){
            res[k] = ans.get(k);
        }

        return res;
        
    }
}
