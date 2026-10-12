// Last updated: 12/10/2026, 16:56:25
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int cnt = 0;

        for(int i = cost.length-1;i>=0;i--)
        {
            cnt++;
            if(cnt%3!=0) sum+=cost[i];
        }
        return sum;
    }
}