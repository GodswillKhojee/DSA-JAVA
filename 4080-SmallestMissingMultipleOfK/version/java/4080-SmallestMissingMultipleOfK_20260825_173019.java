// Last updated: 25/08/2026, 17:30:19
/*
 * made a hashSet then added all the value of the nums
 * then making an infinite loop which only stops when the value in the hashset does not contains and it will return that value
*/

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i = 1; ;i++)
        {
            if(!set.contains(i*k)) return i*k;
        }
        // return -1;
    }
}