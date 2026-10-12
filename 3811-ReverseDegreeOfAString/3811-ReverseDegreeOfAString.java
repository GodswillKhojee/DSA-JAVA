// Last updated: 12/10/2026, 16:56:01
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length();i++)
        {
            int value = 'z' - s.charAt(i) +1;
            int position = i +1;
            sum += value * position;
        };
        return sum;
    }
}