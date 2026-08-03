// Last updated: 03/08/2026, 21:15:52
class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n>0 && (n & (n-1))==0){
        return true;
       }
       return false;
    }
}