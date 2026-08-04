// Last updated: 04/08/2026, 17:40:24
// simple gcd using recussion and finding largest and smallest element in an array
1class Solution {
2    public int gcd(int a, int b)
3    {
4        if(b==0) return a;
5        return gcd(b,a%b);
6    }
7    public int findGCD(int[] nums) {
8        Arrays.sort(nums);
9        int s = nums.length;
10        return gcd(nums[0],nums[s-1]);
11    }
12}