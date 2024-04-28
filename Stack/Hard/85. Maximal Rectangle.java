class Solution {
    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] =  0;
        st.push(0);
        right[n-1] = n-1;

        for(int i=1 ; i<n ; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = 0;
            }
            else{
                left[i] = st.peek()+1;
            }
            st.push(i);
        }
        st = new Stack<>();
        st.push(n-1);
        for(int i=n-2 ; i>=0 ; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n-1;
            }
            else{
                right[i] = st.peek()-1;
            }
            st.push(i);
        }
        
        int maxRecArea = 0,recArea = 0;
        for(int i=0 ; i<n  ; i++){
            recArea = right[i] -  left[i] + 1;
            recArea *= heights[i];
            maxRecArea = Math.max(maxRecArea,recArea);
        }
        return maxRecArea;
    }

    public int maximalRectangle(char[][] matrix) {
        int m = matrix[0].length , n = matrix.length;
        int[] col = new int[m];

        int maxArea = 0 , area = 0;

        for(int i=0 ; i< m ; i++){
            col[i] = (matrix[0][i] == '1')?1:0;
            area = largestRectangleArea(col);
            maxArea = Math.max(area,maxArea);
        }

        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == '1' && matrix[i][j] == matrix[i-1][j]){
                    col[j] += 1;
                }
                else if(matrix[i][j] == '1'){
                    col[j] = 1;
                }
                else{
                    col[j] = 0;
                }
            }

            area = largestRectangleArea(col);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
