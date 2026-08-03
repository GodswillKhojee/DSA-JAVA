// Last updated: 03/08/2026, 21:13:50
class Solution {
    public int gcd(int a, int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s = nums.length;
        return gcd(nums[0],nums[s-1]);
    }
}