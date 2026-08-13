// Last updated: 13/08/2026, 20:26:12
/*
 * here we used stack for storing the index of an array
 * then two arrays nextSmall and prevSmall
 * from there we calculated the heights and width and the maxArea
*/

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int [] prevSmall = new int[n];
        for(int i = 0; i < n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()] > heights[i]) st.pop();
            if(st.isEmpty()) prevSmall[i] = -1;
            else prevSmall[i] = st.peek();

            st.push(i);
        }
        st.clear();

        int[] nextSmall = new int[n];
        for(int i = n-1;i>=0; i--)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            if(st.isEmpty()) nextSmall[i] = n;
            else nextSmall[i] = st.peek();

            st.push(i);
        }
        int maxArea = 0;
        for(int i = 0; i < n;i++)
        {
            int width = nextSmall[i] - prevSmall[i] -1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}