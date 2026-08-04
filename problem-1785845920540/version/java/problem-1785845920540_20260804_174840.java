// Last updated: 04/08/2026, 17:48:40
1class Solution {
2    public int commonFactors(int a, int b) {
3        int n = Math.min(a,b);
4        int count = 0;
5        for(int i = 1; i <= n;i++)
6        {
7            if(a%i == 0 && b%i == 0) count++;
8        }
9        return count;
10    }
11}