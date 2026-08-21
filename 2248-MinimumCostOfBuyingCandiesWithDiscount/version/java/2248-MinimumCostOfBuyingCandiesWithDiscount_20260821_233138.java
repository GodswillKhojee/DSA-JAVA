// Last updated: 21/08/2026, 23:31:38
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int cnt = 0;

        for(int i = cost.length-1;i>=0;i--)
        {
            if(cnt == 2)
            {
                cnt = 0;
                continue;
            }
            else {
                sum+=cost[i];
                cnt++;
            }
        }
        return sum;
    }
}