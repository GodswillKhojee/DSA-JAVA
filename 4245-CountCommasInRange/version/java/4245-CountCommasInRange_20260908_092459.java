// Last updated: 08/09/2026, 09:24:59
class Solution {
    public int countCommas(int n) {
        int nSize = Integer.toString(n).length();
        if(nSize<4) return 0;
        return n-1000+1;

    }
}