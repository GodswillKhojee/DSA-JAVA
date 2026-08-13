// Last updated: 13/08/2026, 17:23:56
/*
 * used monotonic stack for this 
 * maintained a min value for thrid element
 * then finding the middle element for 132 pattern
*/

class Solution {
    public boolean find132pattern(int[] nums) {
        // i < j < k
        // nums[i] < nums[k] < nums[j]
       if(nums.length<3) return false;
       Stack<Integer> st = new Stack<>();
       int min = Integer.MIN_VALUE;
       for(int i = nums.length-1;i>=0;i--)
       {
            if(nums[i] < min ) return true;

            while(!st.isEmpty() && nums[i]> st.peek()) min = st.pop();
            st.push(nums[i]);
       }
       return false;
    }
}