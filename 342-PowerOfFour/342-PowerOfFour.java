// Last updated: 03/08/2026, 21:15:14
class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n == 1) return true;
        if(n == 0) return false;
        if(n%4 != 0) return false;
        return isPowerOfFour(n/4);
    }
}