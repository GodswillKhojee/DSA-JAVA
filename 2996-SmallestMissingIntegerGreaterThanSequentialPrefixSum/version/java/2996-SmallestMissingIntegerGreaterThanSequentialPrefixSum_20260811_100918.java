// Last updated: 11/08/2026, 10:09:18
/*
 * # Missing Integer
 * 
 * ## Problem
 * 
 * Find the smallest integer that is greater than or equal to the sum of the longest consecutive prefix of the array and does not exist in the array.
 * 
 * ## Approach
 * 
 * 1. Find the longest consecutive prefix and calculate its sum.
 * 2. Store all elements of the array in a `HashSet` for fast lookup.
 * 3. Starting from the calculated sum, keep increasing it while it exists in the set.
 * 4. Return the first number that is not present.
 * 
 * ## Example
 * 
 * ```text
 * nums = [1, 2, 3, 4, 5, 15, 16]
 * 
 * Consecutive prefix = [1, 2, 3, 4, 5]
 * Sum = 15
 * 
 * 15 exists → 16
 * 16 exists → 17
 * 
 * Answer = 17
 * ```
 * 
 * ## Complexity
 * 
 * * **Time:** O(n)
 * * **Space:** O(n)
 * 
 * ## Key Idea
 * 
 * `HashSet.contains()` provides average **O(1)** lookup, making it efficient to check whether the calculated sum already exists in the array.
*/

1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4        int idx = 1;
5        while(idx < nums.length && nums[idx] == nums[idx-1]+1) 
6        {
7            sum += nums[idx];
8            idx++;
9        }
10        HashSet<Integer> set = new HashSet<>();
11        for(int ele:nums) set.add(ele);
12        while(set.contains(sum)) sum++;        
13        
14        return sum;
15    }
16}