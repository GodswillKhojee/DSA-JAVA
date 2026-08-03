// Last updated: 03/08/2026, 21:13:37
class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        return Integer.bitCount(ans);
    }
}