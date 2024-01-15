class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];

        int n = matches.length;
        for(int i=0 ; i<n ; i++){
            int won = matches[i][0];
            int loss = matches[i][1];
            if(losses[won] == 0){
                losses[won] = -1;
            }
            if(losses[loss] == -1){
                losses[loss] = 1;
            }
            else{
                losses[loss]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss= new ArrayList<>();

        for(int i=0 ; i<100001 ; i++){
            if(losses[i]==-1){
                zeroLoss.add(i);
            }   
            else if(losses[i] == 1){
                oneLoss.add(i);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        ans.add(zeroLoss);
        ans.add(oneLoss);

        return ans;
    }
}
