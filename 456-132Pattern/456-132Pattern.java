// Last updated: 18/08/2026, 20:28:45
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