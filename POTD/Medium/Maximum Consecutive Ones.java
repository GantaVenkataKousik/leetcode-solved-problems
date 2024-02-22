import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		int cnt = 0;
		int i=0 , j=0 , maxOnes = 0;
		while(i<n){
			if(arr.get(i)!=1)cnt++;
			
					while(cnt>k && j<=i){
						if(arr.get(j)==0)cnt--;
						j++;
					}
					maxOnes = Math.max(i-j+1,maxOnes);
			i++;
		}
		maxOnes=Math.max(i-j,maxOnes);
		return maxOnes;
	}
}
